package com.mycompany.riddlersgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class RiddlersGame extends javax.swing.JFrame {
    
    private Timer timer;
    private int timeLeft = 15;
    private int currentQuestionIndex = 0;
    private int score = 100; 
    private int lives = 5; 
    private int remainingQuestions = 10; 
    private List<Question> currentQuestions;
    private boolean correctAnswer = false;
   

    private List<Question> easyQuestions;
    private List<Question> averageQuestions;
    private List<Question> difficultQuestions;
    
     public RiddlersGame() {
         
        initComponents();
        initializeQuestions();
        currentQuestions = easyQuestions; 
        startTimer();
        displayNextRiddle(easyQuestions);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /* create arrayList<> of easyQuestions averageQuestions and difficultQuestions. add new Question (riddle,answer) ,new String[]{choices}, new String[]{hint1, hint2 and imagepath}
    shuffle each Question*/
    private void initializeQuestions() {
        easyQuestions = new ArrayList<>();
        easyQuestions.add(new Question("<html><center>Tumingin ka sa akin, ang makikita mo'y ikaw din.</center></html>", "Salamin", new String[]{"Salamin", "Bintana", "Larawan", "Tubig"}, new String[]{"<html><center>Ito ay isang bagay na kadalasang ginagamit upang tingnan ang iyong sarili at magayos bago lumabas ng bahay.</center></html>", "<html><center>Sa iyong ________, makikita mo ang tunay na anyo mo.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Salamin.jpg"}));
        easyQuestions.add(new Question("<html><center>Kung kailan ko pinatay ay saka nagtagal ang buhay.</center></html>", "Kandila", new String[]{"Kandila", "Kahoy", "Ilaw", "Panahon"},new String[]{"<html><center>Ito ay ilaw na naglalayag sa hangin at nagbibigay-liwanag sa dilim.</center></html>", "<html><center>Sa paglipas ng gabi, ang __ ay nagbibigay-liwanag sa aming tahanan, nagpapaalala sa akin na may pag-asa sa kabila ng kadiliman ng mundo.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Kandila.jpg"}));
        easyQuestions.add(new Question("<html><center>Itapon mo kahit saan, babalik sa pinanggalingan.</center></html>", "Yo-yo", new String[]{"Yo-yo", "Hangin", "Anino", "Bato"},new String[]{"<html><center> Ito ay isang laruan na kadalasang ginagamit ng mga bata at may kakayahan na bumalik sa kamay ng gumagamit.</center></html>", "<html><center>Ang __ ay isang popular na laruan na maaaring itapon kahit saan, subalit babalik ito sa pinanggalingan kapag itinulak nang tama.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Yo-yo.jpg"}));
        easyQuestions.add(new Question("<html><center>Lumabas, pumasok, dala-dala ay panggapos.</center></html>", "Karayom", new String[]{"Karayom", "Kuwintas", "Zipper", "Sipit"},new String[]{"<html><center>Ginagamit ito upang mag-ayos ng mga butas sa damit.</center></html>", "<html><center>Sa paggawa ng damit, mahalaga ang ________ upang maayos na maitali ang mga punit.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Karayom.jpg"}));
        easyQuestions.add(new Question("<html><center>Ang alaga kong hugis bilog, barya-barya ang laman-loob.</center></html>", "Alkansya", new String[]{"Alkansya", "Bola", "Pitaka", "Baso"},new String[]{"<html><center>Ito ay isang bagay na maaaring gamitin upang mag-ipon ng pera.</center></html>", "<html><center>Sa _________ mo itatago ang perang nais mong ipunin para sa iyong pangarap.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Alkansya.jpg"}));
        easyQuestions.add(new Question("<html><center>Hindi hayop, hindi tao, pumupulupot sa tiyan mo.</center></html>", "Sinturon", new String[]{"Sinturon", "Hula Hoop", "Damit", "Pabango"},new String[]{"<html><center>Ito ay isang bagay na ginagamit mo sa iyong pantalon kapag maluwang.</center></html>", "<html><center>Ang ______ ay ginagamit mo sa iyong katawan upang pumigil sa iyong damit na mahulog.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Sinturon.jpg"}));
        easyQuestions.add(new Question("<html><center>May apat na binti ngunit hindi makalakad.</center></html>", "Lamesa", new String[]{"Lamesa", "Kama", "Bangko", "Litrato"},new String[]{"<html><center> Ito ay isang bagay na madalas gamitin sa pagkain at nagsisilbing lugar para sa paglalagay ng mga bagay.</center></html>", "<html><center>Sa hapag-kainan, doon mo matatagpuan ang ______.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Lamesa.jpg"}));
        easyQuestions.add(new Question("<html><center>Mataas kung nakaupo, mababa kung nakatayo.</center></html>", "Aso", new String[]{"Aso", "Eroplano", "Bintana", "Silya"},new String[]{"<html><center>Isang uri ng hayop na kilala bilang kaibigan ng tao at masipag na bantay ng bahay.</center></html>", "<html><center>Ang ___ ay tumatahol kapag may dumaraang ibang tao sa tapat ng bahay.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Aso.jpg"}));
        easyQuestions.add(new Question("<html><center>Dugtong-dugtong, Nagkakarugtong, tanikalang humuhugong.</center></html>", "Tren", new String[]{"Tren", "Tulay", "Kadena", "Tali"},new String[]{"<html><center> Ito ay isang sasakyan na bumibiyahe sa mga riles at nagdadala ng mga pasahero mula isang lugar papunta sa isa pang lugar.</center></html>", "<html><center>Sumasakay ako sa _______ upang makarating sa iba't ibang lugar.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Tren.jpg"}));
        easyQuestions.add(new Question("<html><center>Araw-araw nabubuhay, taon-taon namamatay.</center></html>", "Kalendaryo", new String[]{"Kalendaryo", "Buwan", "Araw", "Oras"},new String[]{"<html><center>Ito ay isang kagamitang pang-araw-araw na nagpapakita ng mga petsa at mga pagdiriwang.</center></html>", "<html><center> Ang ___ ay isang mahalagang kagamitang pang-araw-araw na ginagamit para magtala ng mga nakaraang at darating na mga pangyayari.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Kalendaryo.jpg"}));
        easyQuestions.add(new Question("<html><center>Palda ni Santa Maria, ang kulay ay iba-iba.</center></html>", "Bahaghari", new String[]{"Bahaghari", "Kapa", "Lapis", "Kwintas"},new String[]{"<html><center> Ito ay nagpapakita ng mga kulay sa kalangitan pagkatapos ng ulan.</center></html>", "<html><center>Matapos ang malakas na ulan, nakita namin ang ________ sa langit.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Bahaghari.jpg"}));
        easyQuestions.add(new Question("<html><center>Heto na si Buboy, bubulong-bulong.</center></html>", "Bubuyog", new String[]{"Bubuyog", "Hangin", "Ulan", "Dahon"},new String[]{"<html><center> Ito ay karaniwang  makikita sa mga bulaklak, halaman at puno kung saan ito ay nag hahanap ng nektar bilang pagkain.</center></html>", "<html><center>Ang ______ay isang uri ng insekto na kilala sa kanyang maliit na katawan at  pakpak.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Bubuyog.jpg"}));
        easyQuestions.add(new Question("<html><center>Pagbali-baliktarin man din, may butas parin.</center></html>", "Donut", new String[]{"Donut", "Timba", "Palanggana", "Tasa"},new String[]{"<html><center>Ito ay isang pagkain na may butas sa gitna at madalas kainin bilang meryenda.</center></html>", "<html><center>Sa hapon, tuwing kami'y nagpupunta sa mall, palaging __________ ang binibili ng aking kapatid.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Donut.jpg"}));
        easyQuestions.add(new Question("<html><center>Bulaklak muna ang dapat gawin, bago mo ito kainin.</center></html>", "Saging", new String[]{"Saging", "Pinipig", "Bibingka", "Puto"},new String[]{"<html><center>Ito ay isang pagkain na karaniwang kinakain bilang panghimagas.</center></html>", "<html><center>Ang ________ ay isa sa mga paboritong prutas ng marami dahil sa tamis nito at maraming sangkap na pandagdag sa kalusugan.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Saging.jpg"}));
        easyQuestions.add(new Question("<html><center>May paa'y walang baywang, may likod walang tiyan.</center></html>", "Silya", new String[]{"Silya", "Lamesa", "kama", "Paro-paro"},new String[]{"<html><center> Ito ay may ibat ibang mga uri at anyo, kabilang ang mga gawa sa kahoy , bakal, plastic, at maaring may iba't ibang disensyo o kulay.</center></html>", "<html><center>Ang __ ay isang gamit  o kasangkapan  na ginagamit para sa pag-upo o pag papahinga ng tao.</center></html>", "D:\\HintsImagesRiddlers\\Easy_Upuan.jpg"}));
        easyQuestions.add(new Question("<html><center>Isang prinsesa, nakaupo sa tasa</center></html>", "Bert", new String[]{"Bert", "Neon", "Reynard", "Ronald"},new String[]{"<html><center> Ito ay may pinakamabuting puso at busilak na kalooban. </center></html>", "<html><center>_e_t</center></html>", "\"C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Pictures\\20221002_190433_0000.png\""}));
        
        
        averageQuestions = new ArrayList<>();
        averageQuestions.add(new Question("<html><center>Malaking tahanan, hindi tinitirhan.</center></html>", "Simbahan", new String[]{"Simbahan", "Eskwelahan", "Libingan", "Museo"},new String[]{"<html><center>Ito ay isang lugar na madalas puntahan ng mga tao para sa panalangin at pagsamba.</center></html>", "<html><center>Sa araw ng Linggo, ang pamilya ay pumunta sa _____ upang magsimba at magdasal.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Simbahan.jpg"}));
        averageQuestions.add(new Question("<html><center>Binatak ko ang isa, tatlo pa ang sumama.</center></html>", "Panyo", new String[]{"Panyo", "Damit", "Sumbrero", "Sapatos"},new String[]{"<html><center>Ito ay ginagamit sa tuwing pinag-papawisan</center></html>", "<html><center>Kumuha ka ng _____ at punasan mo iyang pawis mo!</center></html>", "D:\\HintsImagesRiddlers\\Ave_Panyo.jpg"}));
        averageQuestions.add(new Question("<html><center>Bulak na bibitin-bitin, di puwedeng balutin.</center></html>", "Ulap", new String[]{"Ulap", "Bulak", "Dahon", "Kanin"},new String[]{"<html><center>Ito ay isang bagay na makikita sa langit na kadalasang kulay puti.</center></html>", "<html><center>Ang ____ ay tila malambot na bulak na makikita sa kalangitan.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Ulap.jpg"}));
        averageQuestions.add(new Question("<html><center>Isang hukbong sundalo, dikit-dikit ang mga ulo.</center></html>", "Walis", new String[]{"Walis", "Posporo", "Ipil-ipil", "Manga"},new String[]{"<html><center>Ginagamit ito sa paglilinis ng sahig.</center></html>", "<html><center>Sa bahay, ang ginamit ni Nanay upang linisin ang sahig ay ang _____.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Walis.jpg"}));
        averageQuestions.add(new Question("<html><center>Maliit at malaki, iisa ang sinasabi.</center></html>", "Relo", new String[]{"Relo", "Bibig", "Kamay", "Salamin"},new String[]{"<html><center>Ito ay isang bagay na madalas nating tingnan upang malaman ang oras.</center></html>", "<html><center>Tuwing umaga, tinitingnan ko ang aking ________ upang malaman ang tamang oras.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Relo.jpg"}));
        averageQuestions.add(new Question("<html><center>Bagama't nakatakip, ay nasisilip.</center></html>", "Salamin", new String[]{"Salamin", "Mata", "Pinto", "Bintana"},new String[]{"<html><center>Ginagamit ito upang protektahan ang mata sa tirik na araw.</center></html>", "<html><center>Gumagamit si Lydia ng _____ salamin dahil malabo na ang kanyang mata.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Salamin.jpg"}));
        averageQuestions.add(new Question("<html><center>Sa buhatan ay may silbi, sa igiban ay walang sinabi.</center></html>", "Basket", new String[]{"Basket", "Bag", "Batya", "Sako"},new String[]{"<html><center>Ginagamit ito sa pag-aani ng mga prutas at gulay.</center></html>", "<html><center>Ang mga magsasaka ay gumagamit ng _____ para sa kanilang ani.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Basket.jpg"}));
        averageQuestions.add(new Question("<html><center>Pinilit na mabili, saka ipinambigti.</center></html>", "Kurbata", new String[]{"Kurbata", "Panyo", "Lubid", "Kahoy"},new String[]{"<html><center>Ito ay isang pambansang kasuotan na karaniwang sinusuot sa mga opisyal na okasyon.</center></html>", "<html><center>Si Juan ay nagdesisyon na bilhin ang kanyang sarili ng ________ upang maging maayos ang kanyang pananamit.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Kurbata.jpg"}));
        averageQuestions.add(new Question("<html><center>Isang uhay na palay, sikip sa buong bahay.</center></html>", "Lampara", new String[]{"Lampara", "Bumbilya", "Kama", "Silya"},new String[]{"<html><center>Ginagamit ito sa gabi upang magbigay-liwanag sa paligid.</center></html>", "<html><center>Sa dilim ng gabi, ang ____ ay nagbibigay liwanag sa aming tahanan.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Lampara.jpg"}));
        averageQuestions.add(new Question("<html><center>Katawan nito'y hinihiwa-hiwa kaya ikaw ay lumuluha.</center></html>", "Sibuyas", new String[]{"Sibuyas", "Bawang", "Luya", "Sili"},new String[]{"<html><center>Ito ay isang gulay na mayroong maraming balat at may malalim na kulay na maaaring magpaiyak kapag hininiwa.</center></html>", "<html><center>Huwag mong kalimutan na bumili ng ___ sa tindahan para sa ulam ngayong gabi.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Sibuyas.jpg"}));
        averageQuestions.add(new Question("<html><center>Ang anak ay nakaupo na, ang ina'y gumagapang pa.</center></html>", "Kalabasa", new String[]{"Kalabasa", "Kangkong", "Kandila", "Ahas"},new String[]{"<html><center>Ito ay mahalagang sangkap sa mga lutuin tulad ng pinakbet at inihahandang panghimagas.</center></html>", "<html><center>Madalas na itinatanim ang _____ sa mga bakuran at taniman, at karaniwang inaani ito tuwing panahon ng tag-lamig.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Kalabasa.jpg"}));
        averageQuestions.add(new Question("<html><center>Nakatago na, nababasa pa.</center></html>", "Dila", new String[]{"Dila", "Tenga", "Ngipion", "Mata"},new String[]{"<html><center>Ito ay isang bahagi ng katawan na matatagpuan sa loob ng bibig at ginagamit sa pagsalita,pagtikim,at pag lunok ng pagkain.</center></html>", "<html><center>Ang ____ ang nag-papakilos sa proseso ng pag sasalita.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Dila.jpg"}));
        averageQuestions.add(new Question("<html><center>Tag-ulan o tag-araw, hanggang tuhod ang salawal.</center></html>", "Manok", new String[]{"Manok", "Palda", "Kalapati", "Buntis"},new String[]{"<html><center>Ito ay gumagawa ng malakas na ingay tuwing umaga sa probinsiya.</center></html>", "<html><center>Si nanay ay pumunta sa palengke para  bumili ng _____ pang tinola.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Manok.jpg"}));
        averageQuestions.add(new Question("<html><center>Narito na si Katoto, may dala-dalang kubo.</center></html>", "Pagong", new String[]{"Pagong", "Alimango", "Isda", "Hipon"},new String[]{"<html><center>Ito ay kilala sa kanyang mabagal na pagkilos at karaniwang matatagpuan sa mga tropikal na lugar at malalaking lawa.</center></html>", "<html><center>Ang ______ ay mabagal maglakad ngunit matiyaga at matatag.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Pagong.jpg"}));
        averageQuestions.add(new Question("<html><center>Bahay ni Ka Huli, haligi'y bali-bali. Ang bubong ay kawali.</center></html>", "Alimango", new String[]{"Alimango", "Pusit", "Pagong", "Hipon"},new String[]{"<html><center>Ito ay karaniwang matatagpuan sa mga tubig-tabang at sa ilalim ng bato.</center></html>", "<html><center>Sa ilalim ng mga batuhan, madalas may makikitang mga ______ na umaakyat paitaas.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Alimango.jpg"}));
        averageQuestions.add(new Question("<html><center>Kung tawagin nila’y “santo” hindi naman milagroso.</center></html>", "Santol", new String[]{"Santol", "Palaka", "Kuwintas", "Simbahan"},new String[]{"<html><center>Ang prutas na ito ay bilog at matamis at meron itong malalaking buto.</center></html>", "<html><center>Ang ____ay isang prutas na may  malambot na balat at matatagpuan ito sa bukid o sa bakuran.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Santol.jpg"}));
        averageQuestions.add(new Question("<html><center>Nang sumipot sa maliwanag, kulubot na ang balat.</center></html>", "Ampalaya", new String[]{"Ampalaya", "Singkamas", "Manga", "Buko"},new String[]{"<html><center>Ito ay may buto sa loob at nagiging pula ito kapag nahihinog na at maaring gamitin bilang binhi para sa pagtatanim.</center></html>", "<html><center>Ang __ ay isang gulay na may mapait na lasa.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Ampalaya.jpg"}));
        averageQuestions.add(new Question("<html><center>May puno walang bunga, may dahon walang sanga.</center></html>", "Sandok", new String[]{"Sandok", "Tsinelas", "Kutsara", "Tinidor"},new String[]{"<html><center>ito ay isang kagamitan sa kusina na karaniwang ginagamit pang luto.</center></html>", "<html><center>Ginagamit ang ____ sa pag luluto at pag halo ng pagkain at gawa ito sa stainless steel o kahoy.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Sandok.jpg"}));
        averageQuestions.add(new Question("<html><center>Isa ang pasukan, tatlo ang labasan.</center></html>", "Kamiseta", new String[]{"Kamiseta", "Panyo", "Tela", "Sumbrero"},new String[]{"<html><center>Ito ay madalas ding pang regalo sa mga okasyon dahil pwede ito sa lahat mapa babae o lalaki.</center></html>", "<html><center>Ang ____ ay karaniwang may ibat ibang uri, pambabae at pang lalaki ito ay ginagamit sa pang araw-araw.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Kamiseta.jpg"}));
        averageQuestions.add(new Question("<html><center>Malambot na parang ulap, kasama ko sa pangangarap.</center></html>", "Unan", new String[]{"Unan", "Kumot", "Kama", "Bulak"},new String[]{"<html><center>Ito ay malambot at makapal, kadalasang ginagamit ito sa pag tulog.</center></html>", "<html><center>Ang _____ ay isang mahalang gamit sa pag tulog at itoy nilalagay sa ilalim ng ulo upang mag bigay suporta at kaginhawaan sa pag tulog.</center></html>", "D:\\HintsImagesRiddlers\\Ave_Unan.jpg"}));

        difficultQuestions = new ArrayList<>();
        difficultQuestions.add(new Question("<html><center>Urong-sulong, panay ang lamon, urong-sulong, lumalamon.</center></html>", "Lagari", new String[]{"Lagari", "Kutsilyo", "Alon", "Hangin"}, new String[]{"<html><center>Ginagamit ito sa paggawa ng butas sa kahoy.</center></html>", "<html><center>Ang __ ay ginagamit upang putulin ang mga sanga ng puno.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Lagari.jpg"}));
        difficultQuestions.add(new Question("<html><center>Lumalakad walang paa, tumatangis walang mata.</center></html>", "Bolpen", new String[]{"Bolpen", "Ilog", "Paniki", "Krayola"},new String[]{"<html><center>Ito ay isang bagay na ginagamit upang magsulat sa papel.</center></html>", "<html><center>Sa pag-aaral, mahalaga ang paggamit ng _____ upang maging malinaw ang ating mga tala at pagsasanay.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Bolpen.jpg"}));
        difficultQuestions.add(new Question("<html><center>Sa umaga'y nagtataboy, sa gabi ay nag-aampon.</center></html>", "Bahay", new String[]{"Bahay", "Simbahan", "Kulungan", "Opisina"},new String[]{"<html><center>Ito ay isang bagay na ginagamit ng tao upang pagtabuyan o pagtakpan ang kanilang katawan sa araw at sa gabi ay maaaring magsilbing proteksyon laban sa lamig.</center></html>", "Sa pag-uwi niya sa probinsya, si Juan ay natutulog sa __ ng kanyang kaibigan upang magkaroon ng masigla at komportableng tulugan.v","D:\\HintsImagesRiddlers\\Diff_Bahay.jpg"}));
        difficultQuestions.add(new Question("<html><center>Nagsabog ako ng binlid, pagka-umaga ay napalis.</center></html>", "Bituin", new String[]{"Bituin", "Luya", "Palay", "Bumbilya"},new String[]{"<html><center>Ito ay maaaring makita sa gabi at nagbibigay liwanag sa langit.</center></html>", "<html><center>Sa dilim ng gabi, ang ___ ay nagbibigay liwanag sa kalangitan.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Bituin.jpg"}));
        difficultQuestions.add(new Question("<html><center>Lupa, tubig at kalawakan, tirahan ng sangkatauhan.</center></html>", "Mundo", new String[]{"Mundo", "Bahay", "Mansyon", "Lupa"},new String[]{"<html><center>Ito ay ang pinakamalawak na tanawin na maaaring tinitirhan ng mga tao.</center></html>", "<html><center>Ang __ ay ang pinakamahalagang likas na yaman na dapat nating pangalagaan at ingatan.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Mundo.jpg"}));
        difficultQuestions.add(new Question("<html><center>Nang umalis ay lumilipad, nang dumating ay umuusad.</center></html>", "Ulan", new String[]{"Ulan", "Ibon", "Saranggola", "Hangin"},new String[]{"<html><center>Ito ay isang likas na pangyayari sa kalikasan.</center></html>", "<html><center>Kapag _________, maraming tanim ang sumasaya sa bukirin.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Ulan.jpg"}));
        difficultQuestions.add(new Question("<html><center>Isang pamalo, punong-puno ng ginto.</center></html>", "Mais", new String[]{"Mais", "Pinya", "Araw", "Kandila"},new String[]{"<html><center>Ito ay isang bagay na karaniwang makikita sa bukid at may magaspang na balat.</center></html>", "<html><center>Sa bukid, ang palay ay tumutubo sa malawakang taniman, at kapag ito'y hinog na, ang ____ ay punung-puno ng ginto.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Mais.jpg"}));
        difficultQuestions.add(new Question("<html><center>Nanganak ang aswang, sa tuktok dumaan.</center></html>", "Saging", new String[]{"Saging", "Niyog", "Mangga", "Pakwan"},new String[]{"<html><center>Ito ay ginagamit din ang mga dahon nito bilang alternatibong lalagyan sa pagluluto o pag babalot ng pagkain.</center></html>", "<html><center>Ang ________ ay may kakayahan ring mag bigay ng ibat ibang produkto tulad ng abaka na ginagamit sa panggawa ng tela.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Saging.jpg"}));
        difficultQuestions.add(new Question("<html><center>Isda ko sa Maribeles, nasa loob ang kaliskis.</center></html>", "Sili", new String[]{"Sili", "Kamatis", "Isda", "Pakwan"},new String[]{"<html><center>Ang sili ay isang uri ng halamang may kulay na berde o pula na maanghang na lasa kapag kinain.</center></html>", "<html><center>Sa pagluluto ng sinigang, kailangan ng _____ para maging masarap at maanghang ang sabaw.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Sili.jpg"}));
        difficultQuestions.add(new Question("<html><center>Hawakan mo't naririto, hanapin mo't wala ito.</center></html>", "Tainga", new String[]{"Tainga", "Mata", "Multo", "Hangin"},new String[]{"<html><center>Ang bagay na ito ay nasa katawan ng tao at ginagamit para makarinig ng tunog.</center></html>", "<html><center>Sa bawat pag-ikot ng ulo, ang ______ ay nakikisabay din.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Tenga.jpg"}));
        difficultQuestions.add(new Question("<html><center>Dalawang bolang sinulid abot hanggang langit.</center></html>", "Mata", new String[]{"Mata", "Tenga", "Salamin", "Barya"},new String[]{"<html><center>Ito ay matatagpuan sa mukha ng isang tao at ginagamit upang makakita ng paligid.</center></html>", "<html><center>Sa tuwing ako'y nagmamasid, sa aking mga _____ makikita ang ganda ng langit.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Mata.jpg"}));
        difficultQuestions.add(new Question("<html><center>May ulo'y walang buhok, may tiyan walang pusod.</center></html>", "Palaka", new String[]{"Palaka", "Buwaya", "Ahas", "Aso"},new String[]{"<html><center>Ito ay hayop na karaniwang makikita sa paligid ng mga lawa, ilog, at iba pang lugar na may tubig.</center></html>", "<html><center>Ang ______ ay mayroong malaking mata at mataas tumalon.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Palaka.jpg"}));
        difficultQuestions.add(new Question("<html><center>Kinatog ko ang bangka, nagsilapit ang mga isda.</center></html>", "Kampana", new String[]{"Kampana", "Mikropono", "Drum", "Tiyan"},new String[]{"<html><center>Ito ay matatagpuan loob ng simbahan na tumutunog tuwing Linggo.</center></html>", "<html><center>Sa simbahan, tuwing gabi, maririnig ang malakas na tunog ng _____ na nagpapahiwatig ng oras ng panalangin.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Kampana.jpg"}));
        difficultQuestions.add(new Question("<html><center>Kung mahiga ay patagilid, kung nakatayo ay patiwarik.</center></html>", "Kutsilyo", new String[]{"Kutsilyo", "Bangka", "Gunting", "Lapis"},new String[]{"<html><center>Ito ay matalim at  ginagamit sa pag hiwa o pag putol ng mga karne at isda.</center></html>", "<html><center>Sa pagluluto, mahalaga ang _____ para sa paghiwa ng mga sangkap.</center></html>", "D:\\HintsImagesRiddlers\\Diff_Kutsilyo.jpg"}));
            
       
        Collections.shuffle(easyQuestions);
        Collections.shuffle(averageQuestions);
        Collections.shuffle(difficultQuestions);
    }

    private void startTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                if (timeLeft >= 0) {
                    timerLabel.setText("" + timeLeft);
                } else {
                    timer.stop();
                    //open the Timesup page, decrement lives, remove answer button listener and update UI
                    TimesUp timesUp = new TimesUp(RiddlersGame.this);
                    timesUp.setLocationRelativeTo(RiddlersGame.this);
                    timesUp.setVisible(true);
                    decrementLives();
                    removeAnswerButtonListeners();
                    updateUI();
                }
            }
        });
        timer.start();
    }


    private void displayNextRiddle(List<Question> questions) {
        if (remainingQuestions > 0) {
            timerLabel.setText("" + timeLeft);
            displayRiddleAndOptions(questions);
        } else {
            moveToNextLevel(); // Move to the next level if all questions are answered
        }
    }

    private void displayRiddleAndOptions(List<Question> questions) {
        Question question = questions.get(currentQuestionIndex);
        riddleLabel.setText(question.getQuestion());
        String[] choices = question.getChoices();
        List<String> shuffledChoices = new ArrayList<>(List.of(choices));
        Collections.shuffle(shuffledChoices);
        answerButton1.setText(shuffledChoices.get(0));
        answerButton2.setText(shuffledChoices.get(1));
        answerButton3.setText(shuffledChoices.get(2));
        answerButton4.setText(shuffledChoices.get(3));

        // Set up ActionListener for answer buttons
        answerButton1.addActionListener(new AnswerButtonListener(shuffledChoices.get(0), questions));
        answerButton2.addActionListener(new AnswerButtonListener(shuffledChoices.get(1), questions));
        answerButton3.addActionListener(new AnswerButtonListener(shuffledChoices.get(2), questions));
        answerButton4.addActionListener(new AnswerButtonListener(shuffledChoices.get(3), questions));
    }

    void moveToNextQuestion() {
        currentQuestionIndex++;
        

        if (lives == 0) {
           gameOverPrompt();
        } else {
        resetTimer();
        resumeTimer();
        displayNextRiddle(currentQuestions);         
        }        
    }
    
    
    void moveToNextLevel() {
    if (remainingQuestions == 0) {
        if (currentQuestions == easyQuestions) {
            // Move to the average level
            currentQuestions = averageQuestions;
            remainingQuestions = 15;
            stopTimer();
            System.out.println("AverageLevel");
            SurpassedEasyLevel surpassedEasyLevel = new SurpassedEasyLevel(this);
            surpassedEasyLevel.setLocationRelativeTo(this);
            surpassedEasyLevel.setVisible(true);
        } else if (currentQuestions == averageQuestions) {
            
            currentQuestions = difficultQuestions;
            remainingQuestions = 10;
            stopTimer();
            System.out.println("DifficultLevel");
            SurpassedAverageLevel surpassedAverageLevel = new SurpassedAverageLevel(this);
            surpassedAverageLevel.setLocationRelativeTo(this);
            surpassedAverageLevel.setVisible(true);
        } else {
            timer.stop();
            FinishedGame finishedgame = new FinishedGame(this);
            finishedgame.setLocationRelativeTo(this);
            finishedgame.setVisible(true);
            resetGame();
            dispose();
        }
        currentQuestionIndex = 0; // Reset question index
        displayNextRiddle(currentQuestions); // Display next question
    } else {
        // Continue with the current level
        displayNextRiddle(currentQuestions);
    }
}
    public void resumeTimer() {
    timer.start();
    }
    
    public void stopTimer() {
    timer.stop();
    }
    
    public void resetTimer() {
        timeLeft = 15;
        timerLabel.setText("" + timeLeft);
    }
    
    public void resetLives(){
        lives = 5;
        heartsLabel.setText("" + lives);
    }
    
    
    
    
    
    /* reset the Game by stopping timer, reset the game variables currentQuestionIndex to 0, score to 15, lives to 5, remaining question to 10
    re-initialize the question by initializeQuestion method. Move to first Level by currentQuestions = easyQuestions; remainingQuestions = easyQuestions.size(); 
    Update the UI by using the updateUI method and displayNextRiddle(currentQuestions);*/
    public void resetGame() {
        System.out.println("Resetting Game!");
        // Stop the timer
        timer.stop();

        // Reset the game variables
        currentQuestionIndex = 0;
        score = 15;
        lives = 5;
        remainingQuestions = 10;

        // Re-initialize the questions
        initializeQuestions();

        // Move to the first level
        currentQuestions = easyQuestions;
        remainingQuestions = easyQuestions.size();

        // Update the UI
        updateUI();

        // Display the first riddle
        displayNextRiddle(currentQuestions);
    }
    
    
    
    

    public void updateLivesLabel() {
        heartsLabel.setText(Integer.toString(lives));
    }
    
    public void decrementLives() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                lives--;
                if (lives <= 0) {
                    // Stop the game
                    gameOverPrompt();
                } else {
                    updateUI();
                }
            }
        });
    }
    
    public void updateScore(int points) {
        score += points;
        coinsLabel.setText(Integer.toString(score));
    }
    
    /*Evaluating answer, if the currentQuestionIndex is less than question.size(), 
    */
    private void evaluateAnswer(String selectedAnswer, List<Question> questions) {
    // Check if there are questions left
    if (currentQuestionIndex < questions.size()) {
        Question question = questions.get(currentQuestionIndex);

        if (selectedAnswer.equals(question.getAnswer())) {
            // Create and display the Correct frame
            timer.stop();
            Correct correctFrame = new Correct(this);
            correctFrame.setLocationRelativeTo(this);
            correctFrame.setVisible(true);
            remainingQuestions--;
            // Calculate score based on the level of the current question
            int earnedPoints = calculateScore(questions.get(currentQuestionIndex));
            correctFrame.setEarnedPoints(earnedPoints);
            correctFrame.setEarnedPoints(earnedPoints);
            System.out.println("Correct!");
            playSound("D:\\correctsoundfx.wav");
            
            removeAnswerButtonListeners();
        } else {
            timer.stop();
            Incorrect incorrectFrame = new Incorrect(this, lives);
            incorrectFrame.setVisible(true);
            System.out.println("Incorrect!");
            playSound("D:\\incorrectsoundfx.wav");
            removeAnswerButtonListeners();
        }

        updateUI(); 
        
    } else {
        gameOverPrompt();
    }
}
    //Remove Answer Button Listener to not double the input for the next question 
    public void removeAnswerButtonListeners() { 
    answerButton1.removeActionListener(answerButton1.getActionListeners()[0]);
    answerButton2.removeActionListener(answerButton2.getActionListeners()[0]);
    answerButton3.removeActionListener(answerButton3.getActionListeners()[0]);
    answerButton4.removeActionListener(answerButton4.getActionListeners()[0]);
}   
    
    private void gameOverPrompt() {
        timer.stop();
        GameOver gameOver = new GameOver(this);
        gameOver.setLocationRelativeTo(this);
        gameOver.setVisible(true);
        resetGame();
        dispose();
}

    private void updateUI() {
        coinsLabel.setText(Integer.toString(score)); // Update the point label by setText the coinsLabel to score, Int to String
        heartsLabel.setText(Integer.toString(lives)); // Update the lives label by setText the heartsLabel to Lives, Int to String
    }

    private int calculateScore(Question question) {
    if (currentQuestions == easyQuestions) {
        return 2; //2 points for easy questions
    } else if (currentQuestions == averageQuestions) {
        return 5; //5 points for average questions
    } else {
        return 10; //10 points for difficult questions
    }
}

    public void setLives(int lives) {
        this.lives = lives;
    }
    
    // ActionListener for answer buttons
    private class AnswerButtonListener implements ActionListener {
        private String selectedAnswer;
        private List<Question> questions;
        private Clip correctAudio;
        private Clip incorrectAudio;
        private boolean correctAnswer;

        public AnswerButtonListener(String answer, List<Question> questions) {
            this.selectedAnswer = answer;
            this.questions = questions;
            
            
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            evaluateAnswer(selectedAnswer, questions);
        }
    }
    
    public void playSound(String soundFilePath) {
    try {
        File soundFile = new File(soundFilePath);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
        Clip soundClip = AudioSystem.getClip();
        soundClip.open(audioStream);
        soundClip.start();
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        ex.printStackTrace();
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        coinsLabel = new javax.swing.JLabel();
        heartsLabel = new javax.swing.JLabel();
        riddleLabel = new javax.swing.JLabel();
        answerButton2 = new javax.swing.JButton();
        answerButton1 = new javax.swing.JButton();
        answerButton3 = new javax.swing.JButton();
        answerButton4 = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        hintButton = new javax.swing.JButton();
        timerLabel = new javax.swing.JLabel();
        backgroundPanel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(678, 477));
        setPreferredSize(new java.awt.Dimension(693, 518));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setPreferredSize(new java.awt.Dimension(678, 477));
        jPanel1.setLayout(null);

        coinsLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        coinsLabel.setForeground(new java.awt.Color(255, 255, 0));
        coinsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        coinsLabel.setText("100");
        jPanel1.add(coinsLabel);
        coinsLabel.setBounds(450, 10, 110, 40);

        heartsLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        heartsLabel.setForeground(new java.awt.Color(255, 255, 0));
        heartsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heartsLabel.setText("5");
        jPanel1.add(heartsLabel);
        heartsLabel.setBounds(570, 10, 100, 40);

        riddleLabel.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        riddleLabel.setForeground(new java.awt.Color(102, 51, 0));
        riddleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riddleLabel.setText("Guess the riddle!");
        riddleLabel.setToolTipText("");
        jPanel1.add(riddleLabel);
        riddleLabel.setBounds(60, 110, 570, 110);

        answerButton2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        answerButton2.setForeground(new java.awt.Color(255, 255, 0));
        answerButton2.setText("123");
        answerButton2.setBorder(null);
        answerButton2.setBorderPainted(false);
        buttonGroup1.add(answerButton2);
        answerButton2.setContentAreaFilled(false);
        answerButton2.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(answerButton2);
        answerButton2.setBounds(90, 330, 240, 60);

        answerButton1.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        answerButton1.setForeground(new java.awt.Color(255, 255, 0));
        answerButton1.setText("123");
        answerButton1.setBorder(null);
        answerButton1.setBorderPainted(false);
        buttonGroup1.add(answerButton1);
        answerButton1.setContentAreaFilled(false);
        jPanel1.add(answerButton1);
        answerButton1.setBounds(80, 250, 260, 70);

        answerButton3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        answerButton3.setForeground(new java.awt.Color(255, 255, 0));
        answerButton3.setText("123");
        answerButton3.setBorder(null);
        answerButton3.setBorderPainted(false);
        buttonGroup1.add(answerButton3);
        answerButton3.setContentAreaFilled(false);
        answerButton3.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(answerButton3);
        answerButton3.setBounds(340, 250, 250, 70);

        answerButton4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        answerButton4.setForeground(new java.awt.Color(255, 255, 0));
        answerButton4.setText("123");
        answerButton4.setBorder(null);
        answerButton4.setBorderPainted(false);
        buttonGroup1.add(answerButton4);
        answerButton4.setContentAreaFilled(false);
        answerButton4.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(answerButton4);
        answerButton4.setBounds(340, 320, 250, 80);

        homeButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\homebutton.png")); // NOI18N
        homeButton.setBorder(null);
        homeButton.setBorderPainted(false);
        homeButton.setContentAreaFilled(false);
        homeButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\homebutton dark.png")); // NOI18N
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(homeButton);
        homeButton.setBounds(10, 10, 40, 40);

        hintButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\HintButton.png")); // NOI18N
        hintButton.setBorder(null);
        hintButton.setBorderPainted(false);
        hintButton.setContentAreaFilled(false);
        hintButton.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\HintButtonDark.png")); // NOI18N
        hintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintButtonActionPerformed(evt);
            }
        });
        jPanel1.add(hintButton);
        hintButton.setBounds(250, 400, 180, 80);

        timerLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        timerLabel.setForeground(new java.awt.Color(255, 255, 0));
        timerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timerLabel.setText("15");
        timerLabel.setToolTipText("");
        jPanel1.add(timerLabel);
        timerLabel.setBounds(270, 50, 140, 50);

        backgroundPanel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel Esperanza\\OneDrive - DEPED REGION 1\\Documents\\NetBeansProjects\\RiddlersGame\\src\\main\\java\\images\\PLAYPAGE (2).jpg")); // NOI18N
        jPanel1.add(backgroundPanel);
        backgroundPanel.setBounds(0, -40, 750, 560);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        playSound("D:\\Button sound.wav");
        HomePage homePage = new HomePage();
        resetGame();
        removeAnswerButtonListeners();
        homePage.setVisible(true);
        stopTimer();
        dispose(); 
    }//GEN-LAST:event_homeButtonActionPerformed
        /* Check if the user has 20 coins for the hint,deduct 20 coins from the score and update UI to reflect the deducted coins, display the hint by getting the current question index
        Question currentQuestion = currentQuestions.get(currentQuestionIndex); , get the hint and the image hint, String[] hints = currentQuestion.getHints();, String imagePath = currentQuestion.getHint3ImagePath();
        and open the Hintpage... but If the user doesn't have enough coins, open the Insufficient Fund Page*/
    
    private void hintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintButtonActionPerformed
        playSound("D:\\Button sound.wav");
        
        
        if (score >= 20) {
            score -= 20;                  
            coinsLabel.setText(Integer.toString(score));
            stopTimer();
            
            Question currentQuestion = currentQuestions.get(currentQuestionIndex);
            String[] hints = currentQuestion.getHints();
            String imagePath = currentQuestion.getHint3ImagePath();
            HintPage hintPage = new HintPage(hints, imagePath);
            hintPage.setVisible(true);
            
        } else {
            
            InsufficientFund insufficientFund = new InsufficientFund();
            insufficientFund.setLocationRelativeTo(this);
            insufficientFund.setVisible(true);
        }
    }//GEN-LAST:event_hintButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RiddlersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiddlersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiddlersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiddlersGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePage homepage = new HomePage();
                homepage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerButton1;
    private javax.swing.JButton answerButton2;
    private javax.swing.JButton answerButton3;
    private javax.swing.JButton answerButton4;
    private javax.swing.JLabel backgroundPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel coinsLabel;
    private javax.swing.JLabel heartsLabel;
    private javax.swing.JButton hintButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel riddleLabel;
    private javax.swing.JLabel timerLabel;
    // End of variables declaration//GEN-END:variables

    public class Question {
        private String question;
        private String answer;
        private String[] choices;
        private String[] hints; 

        public Question(String question, String answer, String[] choices, String[] hints) {
        this.question = question;
        this.answer = answer;
        this.choices = choices;
        this.hints = hints;     
        }
        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }

        public String[] getChoices() {
            return choices;
        }
        
        // Getter method for hints array
        public String[] getHints() {
            return hints;
        }
        
        public String getHint3ImagePath() {
            return hints[2];
        }
    
    }
}