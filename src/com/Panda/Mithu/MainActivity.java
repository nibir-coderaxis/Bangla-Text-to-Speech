//copyright @Sanjoy Dutta and Muhammad Hozaifa
// Email: dsanjoy58@live.com

package com.Panda.Mithu;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import java.io.IOException;
import java.security.PublicKey;
import java.lang.*;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity {

	//public MainActivity m;
		// TODO Auto-generated constructor stub


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public MediaPlayer player;
	public AssetFileDescriptor afd;
	public int flag;
	public int flag2=0;
	public int flag3=0;
	public int base_audio_flag=0;
	public int offset_audio_flag=0;
	long start=0;
	long end=0;


	//public string arr[][]={ 'বাসনা' ,'কামনা'};

	public void play(MediaPlayer player,AssetFileDescriptor afd,int base_audio_flag,int offset_audio_flag,long start,long end){


		int int_id=base_audio_flag+offset_audio_flag;
   		String audio_id = String.valueOf(int_id);
   		//System.out.println(audio_id);


		 player.reset();
		try{
			afd = getAssets().openFd(audio_id+".mp3");
		 player.setDataSource(afd.getFileDescriptor(),afd.getStartOffset()+start,afd.getLength()-end);

		  player.prepare();
		}
		 catch (IOException e)
         {
				// TODO Auto-generated catch block
				e.printStackTrace();
         }

		    player.start();

		    try {
				Thread.sleep(270);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	public void toasttest()
	{
		Toast.makeText(getApplicationContext(), "Audio Stream is not available in this Version", Toast.LENGTH_SHORT).show();
	}

	public int end_pronounce(String str1){


		 if(str1.equals("া")||str1.equals("আ"))
    	 {

			 return 1;

    	 }
    	 else  if(str1.equals("ি")||str1.equals("ই"))
    	 {
    		 return 2;

    	 }
    	 else  if(str1.equals("ী")||str1.equals("ঈ"))
    	 {

    		 return 3;

    	 }
    	 else  if(str1.equals("ু")||str1.equals("উ"))
    	 {

    		 return 4;
    	 }
    	 else  if(str1.equals("ূ")||str1.equals("ঊ"))
    	 {
    		 return 5;

    	 }

    	 else  if(str1.equals("ৃ")||str1.equals("ঋ"))
    	 {
    		 return 6;

    	 }
    	 else  if(str1.equals("ে")||str1.equals("এ"))
    	 {
    		 return 7;

    	 }
    	 else  if(str1.equals("ৈ")||str1.equals("ঐ"))
    	 {
    		 return 8;

    	 }
    	 else  if(str1.equals("ো")||str1.equals("ও"))
    	 {

    		 return 9;

    	 }
    	 else  if(str1.equals("ৌ")||str1.equals("ঔ"))
    	 {
    		 return 10;

    	 }


		return 0;

	}

	public int audio_selection(int base_audio_flag,int index,int strlen, String texStringt1 )
	{

		   	 if(index<strlen-1){
		   	start=0;
		   	end=(long)0.09;

		   		char  character2=texStringt1.charAt(index+1);
		       	 char[]character3={character2};
		       	 String str = new String(character3);
		       	 // Module 1
		       	 if(str.equals("া") )//কা
		       	 {
		       		offset_audio_flag=0;

		       	 	this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
					    index++;

		       	 }
		       	 else if(str.equals("ি"))
		       	 {
		       		offset_audio_flag=1;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
					    index++;

		       	 }
		       	 else if(str.equals("ী"))
		       	 {
		       		offset_audio_flag=1;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ু"))
		       	 {
		       		offset_audio_flag=2;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ূ"))
		       	 {
		       		offset_audio_flag=2;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ৃ"))
		       	 {
		       		offset_audio_flag=3;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ে"))
		       	 {
		       		offset_audio_flag=4;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ৈ"))
		       	 {
		       		offset_audio_flag=5;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ো"))
		       	 {
		       		offset_audio_flag=6;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("ৌ"))
		       	 {
		       		offset_audio_flag=7;
		       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
						    index++;

		       	 }
		       	 else if(str.equals("্"))
		       	 {
		       		/* afd = getAssets().openFd("58.mp3");	 this.play(player,afd); */
		       		// this.toasttest();

		       		char character11=texStringt1.charAt(index-1);
				    	 char[]character12={character11};
				    	 String str12 = new String(character12);
				    	 flag= this.end_pronounce(str12);
				    	 if(flag==1)
				    	 {
				    		 offset_audio_flag=9;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
				    	 }
				    	 else if(flag==2)
				    	 {
				    		 offset_audio_flag=10;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==3)
				    	 {
				    		 offset_audio_flag=10;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==4)
				    	 {
				    		 offset_audio_flag=11;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==5)
				    	 {
				    		 offset_audio_flag=11;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==6)
				    	 {
				    		 offset_audio_flag=15;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==7)
				    	 {
				    		 offset_audio_flag=12;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==8)
				    	 {
				    		 offset_audio_flag=13;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==9||flag==0)
				    	 {
				    		 offset_audio_flag=14;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }
				    	 else if(flag==10)
				    	 {
				    		 offset_audio_flag=14;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

				    	 }

				    	 flag3=1;
		 				  index++;

		       	 }

		       	 else
		       	 {
		       		//ককাক ট
		       		 //রসিক এর ইক আর কাকলি এর ক উচ্চারণের জন্য এখানে যখন রসিক ঢ় কাকলি এর পর স্পেস বা অন্য শব্দ থাকবে                   21

		       		     if(index!=0)
		       			 {
		       		    	 char character4=texStringt1.charAt(index-1);
		       		    	 char[]character5={character4};
		       		    	 String str1 = new String(character5);

		       		    	flag= this.end_pronounce(str1);
		       		    	if(index+2<strlen){
		       		    	char ch4=texStringt1.charAt(index+2);
		       		    	 char[]ch5={ch4};
		       		    	 String str5 = new String(ch5);
		       		    	 flag2=this.end_pronounce(str5) ;

		       		    	}


		       		    	 if(flag==1)
		       		    	 {
		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6)	//কাকলি এর ক উচ্চারণ
		       		    		 {

		       		    			 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		   		    		 else{
		   		    			offset_audio_flag=9;start=(long)0.15; end=0;
		   			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }

		       		    	 }
		       		    	 else  if(flag==2)
		       		    	 {
		       		    		 	if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    		 	 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
				            				 flag2=0;
		       		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=10;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    	 }

		       		    	 }
		       		    	 else  if(flag==3)
		       		    	 {


		       		    		 	if(flag2==2||flag2==3||flag2==1|| flag2==4||flag2==5||flag2==6){

		       		    		 	 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
				            				 flag2=0;
		       		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=10;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    	 }
		       		    	 }
		       		    	 else  if(flag==4)
		       		    	 {

		       		    		 if(flag2==2||flag2==3|| flag2==4||flag2==1||flag2==5||flag2==6){

		       		    			 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=11;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else  if(flag==5)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=11;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }

		       		    	 else  if(flag==6)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=15;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else  if(flag==7)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			 offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=12;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else  if(flag==8)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			offset_audio_flag=16;
						       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=13;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else  if(flag==9)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			offset_audio_flag=16;
						       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=14;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else  if(flag==10)
		       		    	 {

		       		    		 if(flag2==2||flag2==1||flag2==3|| flag2==4||flag2==5||flag2==6){

		       		    			offset_audio_flag=16;
						       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag2=0;
		   		    		 	}
		       		    		 else{
		       		    			offset_audio_flag=14;start=(long)0.15; end=0;
		       			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    		 }

		       		    	 }
		       		    	 else				//22
		           			 {
		       		    		 if(str1.equals(" ")||flag3==1)//ক ক ক
		       		    		 {
		       		    			offset_audio_flag=16;
						       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
			            				 flag3=0;
		       		    		 }
		       		    		 else     //23
		       		    		 {
		       		    			 char character6=texStringt1.charAt(index+1);
		       		    			 char[]character7={character6};
		       		    			 String str2 = new String(character7);
		       		    			 if(str2.equals(" "))//বক প
		       		    			 {
		       		    				offset_audio_flag=14;
		       				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    			 }
		       		    			 else
		       		    			 {
		       		    				offset_audio_flag=16;
							       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       		    			 }
		       		    		 }
		           			 }


		       			 }
		       			 else
		       			 {

		       				offset_audio_flag=16;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       			 }

		       	 }
		   	 }

		   	 else{
		   	//শুধু রসিক ইনপুট দিলে এবং শব্দের পর স্পেস না থাকলে ইক উচ্চারণের জন্য         //ইক

		   		    if(index!=0)
		   			 {
		   		    	 char character4=texStringt1.charAt(index-1);
		   		    	 char[]character5={character4};
		   		    	 String str1 = new String(character5);

		   		    	flag= this.end_pronounce(str1);

		   		    	 if(flag==1)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=9;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==2)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=10;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==3)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=10;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==4)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=11;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==5)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=11;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }

		   		    	 else  if(flag==6)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=15;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==7)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=12;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==8)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=13;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==9)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=14;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else  if(flag==10)
		   		    	 {
		   		    		start=(long)0.15; end=0;
		   		    		offset_audio_flag=14;
				       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);

		   		    	 }
		   		    	 else
		       			 {
		   		    		 char cha8=texStringt1.charAt(index-1);
		       		    	 char[]cha9={cha8};
		       		    	 String str11 = new String(cha9);
		   		    		 if(str11.equals(" ")||flag3==1){
		   		    			offset_audio_flag=16;
					       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		       				 flag3=0;
		   		    		 }
		   		    		 else
		   		    		 {start=(long)0.15; end=0;
		   		    			offset_audio_flag=14;
		   			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		   		    		 }
		       			 }


		   			 }
		   			 else
		   			 {//first only ক

		   				offset_audio_flag=16;
			       		this.play(player,afd,this.base_audio_flag,offset_audio_flag,start,end);
		   			 }


		   	 }


				return index;


	}


	public int select_ko(int index,int strlen,String texStringt1)
	{
   	 // character2=texStringt1.charAt(index+1);
   	 //char[]character3={character2};
   	 //String str = new String(character3);
		base_audio_flag=50;

		return audio_selection(base_audio_flag, index, strlen, texStringt1);

	}


	public int select_kho(int index,int strlen,String texStringt1){

base_audio_flag=70;

		return audio_selection(base_audio_flag, index, strlen, texStringt1);




	}

	public int select_go(int index,int strlen,String texStringt1){

base_audio_flag=90;

		return audio_selection(base_audio_flag, index, strlen, texStringt1);
	}

public int select_gho(int index,int strlen,String texStringt1){

	base_audio_flag=110;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
	}

public int select_ong(int index,int strlen,String texStringt1){
	base_audio_flag=130;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_cho(int index,int strlen,String texStringt1){

	base_audio_flag=150;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_chho(int index,int strlen,String texStringt1){

	base_audio_flag=170;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_jo(int index,int strlen,String texStringt1){

	base_audio_flag=190;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_jho(int index,int strlen,String texStringt1){

	base_audio_flag=210;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_to(int index,int strlen,String texStringt1){

	base_audio_flag=230;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_thho(int index,int strlen,String texStringt1){

	base_audio_flag=250;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}
public int select_do(int index,int strlen,String texStringt1){

	base_audio_flag=270;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_dho(int index,int strlen,String texStringt1){

	base_audio_flag=290;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_no(int index,int strlen,String texStringt1){

	base_audio_flag=310;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_ta(int index,int strlen,String texStringt1){

	base_audio_flag=330;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_tho(int index,int strlen,String texStringt1){

	base_audio_flag=350;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}



public int select_pa(int index,int strlen,String texStringt1){

	base_audio_flag=410;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_pha(int index,int strlen,String texStringt1){

	base_audio_flag=430;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_ba(int index,int strlen,String texStringt1){

	base_audio_flag=450;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}

public int select_bha(int index,int strlen,String texStringt1){

	base_audio_flag=470;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_ma(int index,int strlen,String texStringt1){

	base_audio_flag=490;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);}


public int select_ra(int index,int strlen,String texStringt1){

	base_audio_flag=510;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_oae(int index,int strlen,String texStringt1){

	base_audio_flag=530;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_la(int index,int strlen,String texStringt1){

	base_audio_flag=550;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_ha(int index,int strlen,String texStringt1){

	base_audio_flag=570;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}


public int select_sa(int index,int strlen,String texStringt1){

	base_audio_flag=590;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}



public int select_dhho(int index,int strlen,String texStringt1){

	base_audio_flag=390;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}
public int select_da(int index,int strlen,String texStringt1){

	base_audio_flag=370;

	return audio_selection(base_audio_flag, index, strlen, texStringt1);
}



	 public void onBtnClicked(View v)
	    {
		 start=0;
		   	end=(long)0.09;
	        if(v.getId() == R.id.my_btn){
	            //handle the click here

	        	 EditText textview=(EditText)this.findViewById(R.id.textView9);
	             String texStringt1 = textview.getText().toString();


	             int strlen=texStringt1.length();
	             int index=0;
	            // int id2=0;
	         //    TextView texttest=(TextView)this.findViewById(R.id.textView14);
	          //   String string_text=texttest.getText().toString();
	          //   String c = "\u0995"+"\u09A5"+"া"; /*unicode assign*/
	                player = new MediaPlayer();

	              while(index<strlen){

	            	 base_audio_flag=0;

	                char character2=texStringt1.charAt(index);
	            	 char[]character={character2};
	            	 String texStringt = new String(character);


	             if(texStringt.equals("ঁ"))//text view er string ke compare
	            	 System.out.println("Match:  "+"\u0981");

	             else if(texStringt.equals("ং"))
	            	 System.out.println("Match:  "+"\u0982");
	             else if(texStringt.equals("ঃ"))
	            	 System.out.println("Match:  "+"\u0983");
	             else if(texStringt.equals("\u0984"))
	             	 System.out.println("Match:  "+"\u0984");
	             else if(texStringt.equals("অ")){

	            	 offset_audio_flag=1;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

					 System.out.println("Match:  "+"\u0985");
					 }




	             else if(texStringt.equals("আ")){

	            	 offset_audio_flag=2;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);
	             	 System.out.println("Match:  "+"\u0986");

	             }
	             else if(texStringt.equals("ই")){
	            	 offset_audio_flag=3;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0987");

	             }
	             else if(texStringt.equals("ঈ")){
	            	 offset_audio_flag=3;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0988");

	             }
	             else if(texStringt.equals("উ")){
	            	 offset_audio_flag=4;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0989");

	             }
	             else if(texStringt.equals("ঊ")){

	            	 offset_audio_flag=4;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u098A");

	             }
	             else if(texStringt.equals("ঋ")){
	            	 offset_audio_flag=5;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);
					 System.out.println("Match:  "+"\u098B");


	             }
	             else if(texStringt.equals("\u098C")){

	            	 System.out.println("Match:  "+"\u098C");

	             }

	             else if(texStringt.equals("এ")){
	            	 offset_audio_flag=6;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);
	             	 System.out.println("Match:  "+"\u098F");

	             }
	             else if(texStringt.equals("ঐ")){
	            	 offset_audio_flag=7;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0990");

	             }
	             else if(texStringt.equals("ও")){
	            	 offset_audio_flag=9;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0993");

	             }
	             else if(texStringt.equals("ঔ")){
	            	 offset_audio_flag=9;

			       	 	this.play(player,afd,base_audio_flag,offset_audio_flag,start,end);

	            	 System.out.println("Match:  "+"\u0994");

	             }
	             else if(texStringt.equals("ক")){

	            	index= this.select_ko(index, strlen, texStringt1);
	             }



	             else if(texStringt.equals("খ")){

	            	 index= this.select_kho(index, strlen, texStringt1);

	            	 }
	             else if(texStringt.equals("গ")){

	            	 index= this.select_go(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ঘ")){

	            	 index= this.select_gho(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ঙ")){
	            	 index= this.select_ong(index, strlen, texStringt1);
	            	 }


	             else if(texStringt.equals("চ")){

	            	 index= this.select_cho(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ছ")){


	            	 index= this.select_chho(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("জ")){

	            	 index= this.select_jo(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ঝ")){

	            	 index= this.select_jho(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ঞ")){




	             }
	             else if(texStringt.equals("ট")){

	            	 index= this.select_to(index, strlen, texStringt1);
	            	 }
	             else if(texStringt.equals("ঠ")){

	            	 index= this.select_thho(index, strlen, texStringt1);
	            	 }
	             else if(texStringt.equals("ড")){

	            	 index= this.select_do(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ঢ")){
	            	 index= this.select_dho(index, strlen, texStringt1);

	             }

	             else if(texStringt.equals("ণ"))
	             {

	            	 index= this.select_no(index, strlen, texStringt1);

	             }

	             else if(texStringt.equals("ত"))
	             {
	            	 index= this.select_ta(index, strlen, texStringt1);
	             }

	             else if(texStringt.equals("থ")){

	            	 index= this.select_tho(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("দ")){
	            	 index= this.select_da(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ধ")){//28

	            	 index= this.select_dhho(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ন")){
	            	 index= this.select_no(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("প")){//30

	            	 index= this.select_pa(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ফ")){//31

	            	 index= this.select_pha(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ব")){
	            	 //32
	            	 index= this.select_ba(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ভ")){
	            	 //33
	            	 index= this.select_bha(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ম")){
	            	 //34
	            	 index= this.select_ma(index, strlen, texStringt1);


	             }
	             else if(texStringt.equals("য")){
	            	 index= this.select_jo(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("র")){
	            	//35
	            	 index= this.select_ra(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ল")){
	            	//36
	            	 index= this.select_la(index, strlen, texStringt1);
	            	 }




	             else if(texStringt.equals("শ")){
	            	//37
	            	 index= this.select_sa(index, strlen, texStringt1);

	             }
	             else if(texStringt.equals("ষ")){
	            	 //37
	            	 index= this.select_sa(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("স")){
	            	 //37
	            	 index= this.select_sa(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("হ")){//38
	            	 index= this.select_ha(index, strlen, texStringt1);
	             }

	             else if(texStringt.equals("ড়")){

	            	 index= this.select_ra(index, strlen, texStringt1);
	             }
	             else if(texStringt.equals("ঢ়")){
	            	 index= this.select_ra(index, strlen, texStringt1);
	             }

	             else if(texStringt.equals("য়")){//39
	            	 index= this.select_oae(index, strlen, texStringt1);
	             }


	             else if(texStringt.equals(" ")||texStringt.equals("।")||texStringt.equals(",")){


					    try {
							Thread.sleep(600);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	            	 System.out.println("Match:  "+"space");}


	             else
	            	 {System.out.println(texStringt+"    not matched  ");}

	            index++;

	              }





	     }
	    }



	}



