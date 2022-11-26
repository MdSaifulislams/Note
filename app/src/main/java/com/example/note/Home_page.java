package com.example.note;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.note.databinding.HomePageBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Locale;

public class Home_page extends AppCompatActivity {

   HomePageBinding binding;

   ArrayList<String> array_list;
   ArrayList<country_data> country_array_list;
   View view;



@Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      binding = HomePageBinding.inflate(getLayoutInflater());
      setContentView(binding.getRoot());


//      array list start

      array_list = new ArrayList<>();

      array_list.add("Saiful");
      array_list.add("Apon");
      array_list.add("asif");
      array_list.add("Safayet");
      array_list.add("Saife");

country_array_list = new ArrayList<>();

   String s = array_list.get(0).toLowerCase(Locale.ROOT);
      String sa = String.valueOf(array_list.get(0).indexOf(1));





   country_data();




//      array list end


      note_adapter note_adapter = new note_adapter(country_array_list, Home_page.this);

      binding.homeShowNote.setAdapter(note_adapter);


 }


 public  void country_data (){

   country_array_list = new ArrayList<>();

    country_array_list.add(new country_data("Afghanistan","	38,928,346	","	652,860	","https://flagpedia.net/data/flags/h80/af.webp"));
    country_array_list.add(new country_data("Albania","	2,877,797","	27,400	","https://flagpedia.net/data/flags/h80/al.webp"));
    country_array_list.add(new country_data("Algeria","	43,851,044	","	2,381,740	","https://flagpedia.net/data/flags/h80/dz.webp"));
    country_array_list.add(new country_data("Andorra","	77,265	","	470	","https://flagpedia.net/data/flags/h80/ad.webp"));
    country_array_list.add(new country_data("Angola","	32,866,272	","	1,246,700	","https://flagpedia.net/data/flags/h80/ao.webp"));
    country_array_list.add(new country_data("Antigua and Barbuda","	97,929	","	440	","https://flagpedia.net/data/flags/h80/ag.webp"));
    country_array_list.add(new country_data("Argentina","	45,195,774	","	2,736,690	","https://flagpedia.net/data/flags/h80/ar.webp"));
    country_array_list.add(new country_data("Armenia","	2,963,243	","	28,470	","https://flagpedia.net/data/flags/h80/am.webp"));
    country_array_list.add(new country_data("Australia","	25,499,884	","	7,682,300	","https://flagpedia.net/data/flags/h80/au.webp"));
    country_array_list.add(new country_data("Austria","	9,006,398	","	82,409	","https://flagpedia.net/data/flags/h80/at.webp"));
    country_array_list.add(new country_data("Azerbaijan","	10,139,177	","	82,658	","https://flagpedia.net/data/flags/h80/az.webp"));
    country_array_list.add(new country_data("Bahamas","	393,244	","	10,010	","https://flagpedia.net/data/flags/h80/bs.webp"));
    country_array_list.add(new country_data("Bahrain","	1,701,575	","	760	","https://flagpedia.net/data/flags/h80/bh.webp"));
    country_array_list.add(new country_data("Bangladesh","	164,689,383	","	130,170	","https://flagpedia.net/data/flags/h80/bd.webp"));
    country_array_list.add(new country_data("Barbados","	287,375	","	430	","https://flagpedia.net/data/flags/h80/bb.webp"));
    country_array_list.add(new country_data("Belarus","	9,449,323	","	202,910	","https://flagpedia.net/data/flags/h80/by.webp"));
    country_array_list.add(new country_data("Belgium","	11,589,623	","	30,280	","https://flagpedia.net/data/flags/h80/be.webp"));
    country_array_list.add(new country_data("Belize","	397,628	","	22,810	","https://flagpedia.net/data/flags/h80/bz.webp"));
    country_array_list.add(new country_data("Benin","	12,123,200	","	112,760	","https://flagpedia.net/data/flags/h80/bj.webp"));
    country_array_list.add(new country_data("Bhutan","	771,608	","	38,117	","https://flagpedia.net/data/flags/h80/bt.webp"));
    country_array_list.add(new country_data("Bolivia","	11,673,021	","	1,083,300	","https://flagpedia.net/data/flags/h80/bo.webp"));
    country_array_list.add(new country_data("Bosnia and Herzegovina","	3,280,819	","	51,000	","https://flagpedia.net/data/flags/h80/ba.webp"));
    country_array_list.add(new country_data("Botswana","	2,351,627	","	566,730	","https://flagpedia.net/data/flags/h80/bw.webp"));
    country_array_list.add(new country_data("Brazil","	212,559,417	","	8,358,140	","https://flagpedia.net/data/flags/h80/br.webp"));
    country_array_list.add(new country_data("Brunei","	437,479	","	5,270	","https://flagpedia.net/data/flags/h80/bn.webp"));
    country_array_list.add(new country_data("Bulgaria","	6,948,445	","	108,560	","https://flagpedia.net/data/flags/h80/bg.webp"));
    country_array_list.add(new country_data("Burkina Faso","	20,903,273	","	273,600	","https://flagpedia.net/data/flags/h80/bf.webp"));
    country_array_list.add(new country_data("Burundi","	11,890,784	","	25,680	","https://flagpedia.net/data/flags/h80/bi.webp"));
    country_array_list.add(new country_data("Côte d'Ivoire","	26,378,274	","	318,000	","https://www.countryflags.com/wp-content/uploads/cote-d-ivoire-flag-png-large.png"));
    country_array_list.add(new country_data("Cape Verde","	555,987	","	4,030	","https://flagpedia.net/data/flags/h80/cv.webp"));
    country_array_list.add(new country_data("Cambodia","	16,718,965	","	176,520	","https://flagpedia.net/data/flags/h80/kh.webp"));
    country_array_list.add(new country_data("Cameroon","	26,545,863	","	472,710	","https://flagpedia.net/data/flags/h80/cm.webp"));
    country_array_list.add(new country_data("Canada","	37,742,154	","	9,093,510	","https://flagpedia.net/data/flags/h80/ca.webp"));
    country_array_list.add(new country_data("Central African Republic","	4,829,767	","	622,980	","https://flagpedia.net/data/flags/h80/cf.webp"));
    country_array_list.add(new country_data("Chad","	16,425,864	","	1,259,200	","https://flagpedia.net/data/flags/h80/td.webp"));
    country_array_list.add(new country_data("Chile","	19,116,201	","	743,532	","https://flagpedia.net/data/flags/h80/cl.webp"));
    country_array_list.add(new country_data("China","	1,439,323,776	","	9,388,211	","https://flagpedia.net/data/flags/h80/cn.webp"));
    country_array_list.add(new country_data("Colombia","	50,882,891	","	1,109,500	","https://flagpedia.net/data/flags/h80/co.webp"));
    country_array_list.add(new country_data("Comoros","	869,601	","	1,861	","https://flagpedia.net/data/flags/h80/km.webp"));
    country_array_list.add(new country_data("Congo (Congo-Brazzaville)","	5,518,087	","	341,500	","https://flagpedia.net/data/flags/h80/cg.webp"));
    country_array_list.add(new country_data("Costa Rica","	5,094,118	","	51,060	","https://flagpedia.net/data/flags/h80/cr.webp"));
    country_array_list.add(new country_data("Croatia","	4,105,267	","	55,960	","https://flagpedia.net/data/flags/h80/hr.webp"));
    country_array_list.add(new country_data("Cuba","	11,326,616	","	106,440	","https://flagpedia.net/data/flags/h80/cu.webp"));
    country_array_list.add(new country_data("Cyprus","	1,207,359	","	9,240	","https://flagpedia.net/data/flags/h80/cy.webp"));
    country_array_list.add(new country_data("Czech Republic","	10,708,981	","	77,240	","https://flagpedia.net/data/flags/h80/cz.webp"));
    country_array_list.add(new country_data("Congo","	89,561,403	","	2,267,050	","https://upload.wikimedia.org/wikipedia/commons/thumb/6/6f/Flag_of_the_Democratic_Republic_of_the_Congo.svg/1280px-Flag_of_the_Democratic_Republic_of_the_Congo.svg.png"));
    country_array_list.add(new country_data("Denmark","	5,792,202	","	42,430	","https://flagpedia.net/data/flags/h80/dk.webp"));
    country_array_list.add(new country_data("Djibouti","	988,000	","	23,180	","https://flagpedia.net/data/flags/h80/dj.webp"));
    country_array_list.add(new country_data("Dominica","	71,986	","	750	","https://flagpedia.net/data/flags/h80/dm.webp"));
    country_array_list.add(new country_data("Dominican Republic","	10,847,910	","	48,320	","https://flagpedia.net/data/flags/h80/do.webp"));
    country_array_list.add(new country_data("Ecuador","	17,643,054	","	248,360	","https://flagpedia.net/data/flags/h80/ec.webp"));
    country_array_list.add(new country_data("Egypt","	102,334,404	","	995,450	","https://flagpedia.net/data/flags/h80/eg.webp"));
    country_array_list.add(new country_data("El Salvador","	6,486,205	","	20,720	","https://flagpedia.net/data/flags/h80/sv.webp"));
    country_array_list.add(new country_data("Equatorial Guinea","	1,402,985	","	28,050	","https://flagpedia.net/data/flags/h80/gq.webp"));
    country_array_list.add(new country_data("Eritrea","	3,546,421	","	101,000	","https://flagpedia.net/data/flags/h80/er.webp"));
    country_array_list.add(new country_data("Estonia","	1,326,535	","	42,390	","https://flagpedia.net/data/flags/h80/ee.webp"));
    country_array_list.add(new country_data("Eswatini ","	1,160,164	","	17,200	","https://flagpedia.net/data/flags/h80/sz.webp"));
    country_array_list.add(new country_data("Ethiopia","	114,963,588	","	1,000,000	","https://flagpedia.net/data/flags/h80/et.webp"));
    country_array_list.add(new country_data("Fiji","	896,445	","	18,270	","https://flagpedia.net/data/flags/h80/fj.webp"));
    country_array_list.add(new country_data("Finland","	5,540,720	","	303,890	","https://flagpedia.net/data/flags/h80/fi.webp"));
    country_array_list.add(new country_data("France","	65,273,511	","	547,557	","https://flagpedia.net/data/flags/h80/fr.webp"));
    country_array_list.add(new country_data("Gabon","	2,225,734	","	257,670	","https://flagpedia.net/data/flags/h80/ga.webp"));
    country_array_list.add(new country_data("Gambia","	2,416,668	","	10,120	","https://flagpedia.net/data/flags/h80/gm.webp"));
    country_array_list.add(new country_data("Georgia","	3,989,167	","	69,490	","https://flagpedia.net/data/flags/h80/ge.webp"));
    country_array_list.add(new country_data("Germany","	83,783,942	","	348,560	","https://flagpedia.net/data/flags/h80/de.webp"));
    country_array_list.add(new country_data("Ghana","	31,072,940	","	227,540	","https://flagpedia.net/data/flags/h80/gh.webp"));
    country_array_list.add(new country_data("Greece","	10,423,054	","	128,900	","https://flagpedia.net/data/flags/h80/gr.webp"));
    country_array_list.add(new country_data("Grenada","	112,523	","	340	","https://flagpedia.net/data/flags/h80/gd.webp"));
    country_array_list.add(new country_data("Guatemala","	17,915,568	","	107,160	","https://flagpedia.net/data/flags/h80/gt.webp"));
    country_array_list.add(new country_data("Guinea","	13,132,795	","	245,720	","https://flagpedia.net/data/flags/h80/gn.webp"));
    country_array_list.add(new country_data("Guinea-Bissau","	1,968,001	","	28,120	","https://flagpedia.net/data/flags/h80/gw.webp"));
    country_array_list.add(new country_data("Guyana","	786,552	","	196,850	","https://flagpedia.net/data/flags/h80/gy.webp"));
    country_array_list.add(new country_data("Haiti","	11,402,528	","	27,560	","https://flagpedia.net/data/flags/h80/ht.webp"));
    country_array_list.add(new country_data("Holy See","	801	","	0	","https://upload.wikimedia.org/wikipedia/commons/thumb/0/00/Flag_of_the_Vatican_City.svg/800px-Flag_of_the_Vatican_City.svg.png"));
    country_array_list.add(new country_data("Honduras","	9,904,607	","	111,890	","https://flagpedia.net/data/flags/h80/hn.webp"));
    country_array_list.add(new country_data("Hungary","	9,660,351	","	90,530	","https://flagpedia.net/data/flags/h80/hu.webp"));
    country_array_list.add(new country_data("Iceland","	341,243	","	100,250	","https://flagpedia.net/data/flags/h80/is.webp"));
    country_array_list.add(new country_data("India","	0	","	2,973,190	","https://flagpedia.net/data/flags/h80/in.webp"));
    country_array_list.add(new country_data("Indonesia","	273,523,615	","	1,811,570	","https://flagpedia.net/data/flags/h80/id.webp"));
    country_array_list.add(new country_data("Iran","	83,992,949	","	1,628,550	","https://flagpedia.net/data/flags/h80/ir.webp"));
    country_array_list.add(new country_data("Iraq","	40,222,493	","	434,320	","https://flagpedia.net/data/flags/h80/iq.webp"));
    country_array_list.add(new country_data("Ireland","	4,937,786	","	68,890	","https://flagpedia.net/data/flags/h80/ie.webp"));
    country_array_list.add(new country_data("Italy","	60,461,826	","	294,140	","https://flagpedia.net/data/flags/h80/it.webp"));
    country_array_list.add(new country_data("Jamaica","	2,961,167	","	10,830	","https://flagpedia.net/data/flags/h80/jm.webp"));
    country_array_list.add(new country_data("Japan","	126,476,461	","	364,555	","https://flagpedia.net/data/flags/h80/jp.webp"));
    country_array_list.add(new country_data("Jordan","	10,203,134	","	88,780	","https://flagpedia.net/data/flags/h80/jo.webp"));
    country_array_list.add(new country_data("Kazakhstan","	18,776,707	","	2,699,700	","https://flagpedia.net/data/flags/h80/kz.webp"));
    country_array_list.add(new country_data("Kenya","	53,771,296	","	569,140	","https://flagpedia.net/data/flags/h80/ke.webp"));
    country_array_list.add(new country_data("Kiribati","	119,449	","	810	","https://flagpedia.net/data/flags/h80/ki.webp"));
    country_array_list.add(new country_data("Kuwait","	4,270,571	","	17,820	","https://flagpedia.net/data/flags/h80/kw.webp"));
    country_array_list.add(new country_data("Kyrgyzstan","	6,524,195	","	191,800	","https://flagpedia.net/data/flags/h80/kg.webp"));
    country_array_list.add(new country_data("Laos","	7,275,560	","	230,800	","https://flagpedia.net/data/flags/h80/la.webp"));
    country_array_list.add(new country_data("Latvia","	1,886,198	","	62,200	","https://flagpedia.net/data/flags/h80/lv.webp"));
    country_array_list.add(new country_data("Lebanon","	6,825,445	","	10,230	","https://flagpedia.net/data/flags/h80/lb.webp"));
    country_array_list.add(new country_data("Lesotho","	2,142,249	","	30,360	","https://flagpedia.net/data/flags/h80/ls.webp"));
    country_array_list.add(new country_data("Liberia","	5,057,681	","	96,320	","https://flagpedia.net/data/flags/h80/lr.webp"));
    country_array_list.add(new country_data("Libya","	6,871,292	","	1,759,540	","https://flagpedia.net/data/flags/h80/ly.webp"));
    country_array_list.add(new country_data("Liechtenstein","	38,128	","	160	","https://flagpedia.net/data/flags/h80/li.webp"));
    country_array_list.add(new country_data("Lithuania","	2,722,289	","	62,674	","https://flagpedia.net/data/flags/h80/lt.webp"));
    country_array_list.add(new country_data("Luxembourg","	625,978	","	2,590	","https://flagpedia.net/data/flags/h80/lu.webp"));
    country_array_list.add(new country_data("Madagascar","	27,691,018	","	581,795	","https://flagpedia.net/data/flags/h80/mg.webp"));
    country_array_list.add(new country_data("Malawi","	19,129,952	","	94,280	","https://flagpedia.net/data/flags/h80/mw.webp"));
    country_array_list.add(new country_data("Malaysia","	32,365,999	","	328,550	","https://flagpedia.net/data/flags/h80/my.webp"));
    country_array_list.add(new country_data("Maldives","	540,544	","	300	","https://flagpedia.net/data/flags/h80/mv.webp"));
    country_array_list.add(new country_data("Mali","	20,250,833	","	1,220,190	","https://flagpedia.net/data/flags/h80/ml.webp"));
    country_array_list.add(new country_data("Malta","	441,543	","	320	","https://flagpedia.net/data/flags/h80/mt.webp"));
    country_array_list.add(new country_data("Marshall Islands","	59,190	","	180	","https://flagpedia.net/data/flags/h80/mh.webp"));
    country_array_list.add(new country_data("Mauritania","	4,649,658	","	1,030,700	","https://flagpedia.net/data/flags/h80/mr.webp"));
    country_array_list.add(new country_data("Mauritius","	1,271,768	","	2,030	","https://flagpedia.net/data/flags/h80/mu.webp"));
    country_array_list.add(new country_data("Mexico","	128,932,753	","	1,943,950	","https://flagpedia.net/data/flags/h80/mx.webp"));
    country_array_list.add(new country_data("Micronesia","	548,914	","	700	","https://flagpedia.net/data/flags/h80/fm.webp"));
    country_array_list.add(new country_data("Moldova","	4,033,963	","	32,850	","https://flagpedia.net/data/flags/h80/md.webp"));
    country_array_list.add(new country_data("Monaco","	39,242	","	1	","https://flagpedia.net/data/flags/h80/mc.webp"));
    country_array_list.add(new country_data("Mongolia","	3,278,290	","	1,553,560	","https://flagpedia.net/data/flags/h80/mn.webp"));
    country_array_list.add(new country_data("Montenegro","	628,066	","	13,450	","https://flagpedia.net/data/flags/h80/me.webp"));
    country_array_list.add(new country_data("Morocco","	36,910,560	","	446,300	","https://flagpedia.net/data/flags/h80/ma.webp"));
    country_array_list.add(new country_data("Mozambique","	31,255,435	","	786,380	","https://flagpedia.net/data/flags/h80/mz.webp"));
    country_array_list.add(new country_data("Myanmar","	54,409,800	","	653,290	","https://flagpedia.net/data/flags/h80/mm.webp"));
    country_array_list.add(new country_data("Namibia","	2,540,905	","	823,290	","https://flagpedia.net/data/flags/h80/na.webp"));
    country_array_list.add(new country_data("Nauru","	10,824	","	20	","https://flagpedia.net/data/flags/h80/nr.webp"));
    country_array_list.add(new country_data("Nepal","	29,136,808	","	143,350	","https://flagpedia.net/data/flags/h80/np.webp"));
    country_array_list.add(new country_data("Netherlands","	17,134,872	","	33,720	","https://flagpedia.net/data/flags/h80/nl.webp"));
    country_array_list.add(new country_data("New Zealand","	4,822,233	","	263,310	","https://flagpedia.net/data/flags/h80/nz.webp"));
    country_array_list.add(new country_data("Nicaragua","	6,624,554	","	120,340	","https://flagpedia.net/data/flags/h80/ni.webp"));
    country_array_list.add(new country_data("Niger","	24,206,644	","	1,266,700	","https://flagpedia.net/data/flags/h80/ne.webp"));
    country_array_list.add(new country_data("Nigeria","	206,139,589	","	910,770	","https://flagpedia.net/data/flags/h80/ng.webp"));
    country_array_list.add(new country_data("North Korea","	25,778,816	","	120,410	","https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Flag_of_North_Korea.svg/1920px-Flag_of_North_Korea.svg.png"));
    country_array_list.add(new country_data("North Macedonia","	2,083,374	","	25,220	","https://flagpedia.net/data/flags/h80/mk.webp"));
    country_array_list.add(new country_data("Norway","	5,421,241	","	365,268	","https://flagpedia.net/data/flags/h80/no.webp"));
    country_array_list.add(new country_data("Oman","	5,106,626	","	309,500	","https://flagpedia.net/data/flags/h80/om.webp"));
    country_array_list.add(new country_data("Pakistan","	220,892,340	","	770,880	","https://flagpedia.net/data/flags/h80/pk.webp"));
    country_array_list.add(new country_data("Palau","	18,094	","	460	","https://flagpedia.net/data/flags/h80/pw.webp"));
    country_array_list.add(new country_data("Palestine State","	5,101,414	","	6,020	","https://flagpedia.net/data/flags/h80/ps.webp"));
    country_array_list.add(new country_data("Panama","	4,314,767	","	74,340	","https://flagpedia.net/data/flags/h80/pa.webp"));
    country_array_list.add(new country_data("Papua New Guinea","	8,947,024	","	452,860	","https://flagpedia.net/data/flags/h80/pg.webp"));
    country_array_list.add(new country_data("Paraguay","	7,132,538	","	397,300	","https://flagpedia.net/data/flags/h80/py.webp"));
    country_array_list.add(new country_data("Peru","	32,971,854	","	1,280,000	","https://flagpedia.net/data/flags/h80/pe.webp"));
    country_array_list.add(new country_data("Philippines","	109,581,078	","	298,170	","https://flagpedia.net/data/flags/h80/ph.webp"));
    country_array_list.add(new country_data("Poland","	37,846,611	","	306,230	","https://flagpedia.net/data/flags/h80/pl.webp"));
    country_array_list.add(new country_data("Portugal","	10,196,709	","	91,590	","https://flagpedia.net/data/flags/h80/pt.webp"));
    country_array_list.add(new country_data("Qatar","	2,881,053	","	11,610	","https://flagpedia.net/data/flags/h80/qa.webp"));
    country_array_list.add(new country_data("Romania","	19,237,691	","	230,170	","https://flagpedia.net/data/flags/h80/ro.webp"));
    country_array_list.add(new country_data("Russia","	145,934,462	","	16,376,870	","https://flagpedia.net/data/flags/h80/ru.webp"));
    country_array_list.add(new country_data("Rwanda","	12,952,218	","	24,670	","https://flagpedia.net/data/flags/h80/rw.webp"));
    country_array_list.add(new country_data("Saint Kitts and Nevis","	53,199	","	260	","https://flagpedia.net/data/flags/h80/kn.webp"));
    country_array_list.add(new country_data("Saint Lucia","	183,627	","	610	","https://flagpedia.net/data/flags/h80/lc.webp"));
    country_array_list.add(new country_data("Saint Vincent and the Grenadines","	110,940	","	390	","https://flagpedia.net/data/flags/h80/vc.webp"));
    country_array_list.add(new country_data("Samoa","	198,414	","	2,830	","https://flagpedia.net/data/flags/h80/ws.webp"));
    country_array_list.add(new country_data("San Marino","	33,931	","	60	","https://flagpedia.net/data/flags/h80/sm.webp"));
    country_array_list.add(new country_data("Sao Tome and Principe","	219,159	","	960	","https://flagpedia.net/data/flags/h80/st.webp"));
    country_array_list.add(new country_data("Saudi Arabia","	34,813,871	","	2,149,690	","https://flagpedia.net/data/flags/h80/sa.webp"));
    country_array_list.add(new country_data("Senegal","	16,743,927	","	192,530	","https://flagpedia.net/data/flags/h80/sn.webp"));
    country_array_list.add(new country_data("Serbia","	8,737,371	","	87,460	","https://flagpedia.net/data/flags/h80/rs.webp"));
    country_array_list.add(new country_data("Seychelles","	98,347	","	460	","https://flagpedia.net/data/flags/h80/sc.webp"));
    country_array_list.add(new country_data("Sierra Leone","	7,976,983	","	72,180	","https://flagpedia.net/data/flags/h80/sl.webp"));
    country_array_list.add(new country_data("Singapore","	5,850,342	","	700	","https://flagpedia.net/data/flags/h80/sg.webp"));
    country_array_list.add(new country_data("Slovakia","	5,459,642	","	48,088	","https://flagpedia.net/data/flags/h80/sk.webp"));
    country_array_list.add(new country_data("Slovenia","	2,078,938	","	20,140	","https://flagpedia.net/data/flags/h80/si.webp"));
    country_array_list.add(new country_data("Solomon Islands","	686,884	","	27,990	","https://flagpedia.net/data/flags/h80/sb.webp"));
    country_array_list.add(new country_data("Somalia","	15,893,222	","	627,340	","https://flagpedia.net/data/flags/h80/so.webp"));
    country_array_list.add(new country_data("South Africa","	59,308,690	","	1,213,090	","https://flagpedia.net/data/flags/h80/za.webp"));
    country_array_list.add(new country_data("South Korea","	51,269,185	","	97,230	","https://upload.wikimedia.org/wikipedia/commons/thumb/0/09/Flag_of_South_Korea.svg/188px-Flag_of_South_Korea.svg.png"));
    country_array_list.add(new country_data("South Sudan","	11,193,725	","	610,952	","https://flagpedia.net/data/flags/h80/ss.webp"));
    country_array_list.add(new country_data("Spain","	46,754,778	","	498,800	","https://flagpedia.net/data/flags/h80/es.webp"));
    country_array_list.add(new country_data("Sri Lanka","	21,413,249	","	62,710	","https://flagpedia.net/data/flags/h80/lk.webp"));
    country_array_list.add(new country_data("Sudan","	43,849,260	","	1,765,048	","https://flagpedia.net/data/flags/h80/sd.webp"));
    country_array_list.add(new country_data("Suriname","	586,632	","	156,000	","https://flagpedia.net/data/flags/h80/sr.webp"));
    country_array_list.add(new country_data("Sweden","	10,099,265	","	410,340	","https://flagpedia.net/data/flags/h80/se.webp"));
    country_array_list.add(new country_data("Switzerland","	8,654,622	","	39,516	","https://flagpedia.net/data/flags/h80/ch.webp"));
    country_array_list.add(new country_data("Syria","	17,500,658	","	183,630	","https://flagpedia.net/data/flags/h80/sy.webp"));
    country_array_list.add(new country_data("Tajikistan","	9,537,645	","	139,960	","https://flagpedia.net/data/flags/h80/tj.webp"));
    country_array_list.add(new country_data("Tanzania","	59,734,218	","	885,800	","https://flagpedia.net/data/flags/h80/tz.webp"));
    country_array_list.add(new country_data("Thailand","	69,799,978	","	510,890	","https://flagpedia.net/data/flags/h80/th.webp"));
    country_array_list.add(new country_data("Timor-Leste","	1,318,445	","	14,870	","https://flagpedia.net/data/flags/h80/tl.webp"));
    country_array_list.add(new country_data("Togo","	8,278,724	","	54,390	","https://flagpedia.net/data/flags/h80/tg.webp"));
    country_array_list.add(new country_data("Tonga","	105,695	","	720	","https://flagpedia.net/data/flags/h80/to.webp"));
    country_array_list.add(new country_data("Trinidad and Tobago","	1,399,488	","	5,130	","https://flagpedia.net/data/flags/h80/tt.webp"));
    country_array_list.add(new country_data("Tunisia","	11,818,619	","	155,360	","https://flagpedia.net/data/flags/h80/tn.webp"));
    country_array_list.add(new country_data("Turkey","	84,339,067	","	769,630	","https://flagpedia.net/data/flags/h80/tr.webp"));
    country_array_list.add(new country_data("Turkmenistan","	6,031,200	","	469,930	","https://flagpedia.net/data/flags/h80/tm.webp"));
    country_array_list.add(new country_data("Tuvalu","	11,792	","	30	","https://flagpedia.net/data/flags/h80/tv.webp"));
    country_array_list.add(new country_data("Uganda","	45,741,007	","	199,810	","https://flagpedia.net/data/flags/h80/ug.webp"));
    country_array_list.add(new country_data("Ukraine","	43,733,762	","	579,320	","https://flagpedia.net/data/flags/h80/ua.webp"));
    country_array_list.add(new country_data("United Arab Emirates","	9,890,402	","	83,600	","https://flagpedia.net/data/flags/h80/ae.webp"));
    country_array_list.add(new country_data("United Kingdom","	67,886,011	","	241,930	","https://flagpedia.net/data/flags/h80/gb.webp"));
    country_array_list.add(new country_data("United States of America","	331,002,651	","	9,147,420	","https://flagpedia.net/data/flags/h80/us.webp"));
    country_array_list.add(new country_data("Uruguay","	3,473,730	","	175,020	","https://flagpedia.net/data/flags/h80/uy.webp"));
    country_array_list.add(new country_data("Uzbekistan","	33,469,203	","	425,400	","https://flagpedia.net/data/flags/h80/uz.webp"));
    country_array_list.add(new country_data("Vanuatu","	307,145	","	12,190	","https://flagpedia.net/data/flags/h80/vu.webp"));
    country_array_list.add(new country_data("Venezuela","	28,435,940	","	882,050	","https://flagpedia.net/data/flags/h80/ve.webp"));
    country_array_list.add(new country_data("Vietnam","	97,338,579	","	310,070	","https://flagpedia.net/data/flags/h80/vn.webp"));
    country_array_list.add(new country_data("Yemen","	29,825,964	","	527,970	","https://flagpedia.net/data/flags/h80/ye.webp"));
    country_array_list.add(new country_data("Zambia","	18,383,955	","	743,390	","https://flagpedia.net/data/flags/h80/zm.webp"));
    country_array_list.add(new country_data("Zimbabwe","	14,862,924	","	386,850	","https://flagpedia.net/data/flags/h80/zw.webp"));
 }

}