import java.io.*;
import java.util.*;

class total { 
  public static void main(String[] args) throws Exception{
  int ch;
  int total;
  int temp;
  int s=0;
  int[] all={0};
  int[] all2={0};
  int card=0;
  int[] tcards=new int[200];
    Player p = new Player();
	Computer c = new Computer();
	Deck d = new Deck();
  while(true)
  {
     Scanner type = new Scanner(System.in);
     System.out.print("1)�}�l�C��.-1)���}:");
     ch = type.nextInt();
      if(ch==1)
	  {
	        card=0;
	        System.out.print("�п�J���a�m�W:");
		    InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(is);
            p.pname = in.readLine();		
            System.out.print("�п�ܭn�V�J�X�ƵP(1~3��):");
            d.countd = type.nextInt();
			total=d.countd*52;
			for(int i=0;i<total;i++)
			{
			    d.cards[i]=i;
				tcards[i]=0;
			}
			while(true)
			{
			    all[0]=0;
				all2[0]=0;
			    p.pcardnum=0;
				c.ccardnum=0;
			    for(int i=0;i<100;i++)
				{
			        p.pcards[i]=0;
					c.ccards[i]=0;
				}
				System.out.print("�ϥαi��:"+card+"�����i��:"+total+"\n");
			    if(total-card<15)
				{
				    System.out.print("�Ѿl�i�ƹL�� �������P�ҥH�������}�C�����s���!\n");
					break;
				}
			    System.out.print("���a���P:\n");
			    if(card==total)
			    {
			         System.out.print("�S���P�o!\n");
				     break;
			    }
			    for(int i=0;;i++)
			    {
			       temp=(int)(Math.random()*total);
			       if(tcards[temp]!=-1)
			       {
			          tcards[temp]=-1;
			          p.pcards[p.pcardnum]=temp;
				      p.pcardnum++;
					  card++;
			       }
			       if(p.pcardnum==2)
			          break;
			       if(card==total)
			       {
			           System.out.print("�S���P�o2!\n");
				       break;
			       }
			    }
			    if(total!=0)
			    {
			        p.pcardnum=2;
			        Print(p.pcards,p.pcardnum,all);
			    }
				while(true)
				{
					if(all[0]>21)
					{
					   System.out.print("���a�z�I�o!\n");
					   break;
					}
				    System.out.print("�O�_�n�P:1)�O2)�_");
					ch = type.nextInt();
					if(ch==1)
					{
					   while(true)
					   {
				           temp=(int)(Math.random()*total);
			               if(tcards[temp]!=-1)
			               {
			                  tcards[temp]=-1;
			                  p.pcards[p.pcardnum]=temp;
				              p.pcardnum++;
					          card++;
							  break;
			               }
			               if(card==total)
			               {
			                   System.out.print("�S���P�o!\n");
				               break;
			               }
					   }
					   Print(p.pcards,p.pcardnum,all);
				    }
					else if(ch==2)
					{
					   break;
					}
				}
				System.out.print("���a���P:\n");
			    while(true)
				{
                    if(all2[0]>21)
					{
					   System.out.print("���a�z�I�o!\n");
					   break;
					}
					while(true)
					{
				       temp=(int)(Math.random()*total);
			           if(tcards[temp]!=-1)
			           {
			              tcards[temp]=-1;
			              c.ccards[c.ccardnum]=temp;
						  c.ccardnum++;
					      card++;
						  break;
			           }
			           if(card==total)
			           {
			               System.out.print("�S���P�o!\n");
				           break;
			           }
					 }
					   Print(c.ccards,c.ccardnum,all2);
				    if(all2[0]>21)
					{
					   System.out.print("���a�z�I�o!\n");
					   break;
					}
					if(all2[0]>16)
					{
					   break;
					}
				}
				if(all[0]<22&&all2[0]<22)
				{
				    if(all[0]>all2[0])
				        System.out.print(p.pname+"���a�ӧQ!\n");
				    else if(all[0]<all2[0])
				        System.out.print("���a�ӧQ!\n");
				    else if(all[0]==all2[0])
				        System.out.print("����!\n");
				}
				
				if(all[0]>21&&all2[0]>21)
				{
				    System.out.print("���a�ӧQ!\n");
				}
				else if(all2[0]>21)
                {
				    System.out.print("���a�ӧQ!\n");
                }
				else if(all[0]>21)
                {
				    System.out.print("���a�ӧQ!\n");
                }					
	            System.out.print("�O�_�~��C��:1)�O2)�_");
				ch = type.nextInt();
				if(ch==1)
				{
				    System.out.print("�}�l�s���@��~\n");
					s=0;
				}
				else if(ch==2)
				    break;
		   }			
	  }
	  else if(ch==-1)
	  {
	      break;
	  }
	  else 
	  {
	     System.out.print("error!\n");
	  }
  }
  }
   public static void Print(int[] a,int num,int[] t) 
   {
     int tem=0;
     t[0]=0;
     for(int i=0;i<num;i++)
	 {
	    while(true)
		{
	       if(a[i]>51)
	          a[i]=a[i]-51;
		   else
		      break;
		}
		if(a[i]%4==0)
		   System.out.print("����");
		else if(a[i]%4==1)
		   System.out.print("���");
		else if(a[i]%4==2)
		   System.out.print("����");
		else if(a[i]%4==3)
		   System.out.print("�®�");
		
		System.out.print(" ");
		if(a[i]/4+1==1){
		   System.out.print("1");
		   t[0]+=11;
		   tem++;
		}
		else if(a[i]/4+1==2){
		   System.out.print("2");
		   t[0]+=2;
		}
		else if(a[i]/4+1==3){
		   System.out.print("3");
		   t[0]+=3;
		}
		else if(a[i]/4+1==4){
	       System.out.print("4");
		   t[0]+=4;
		}
		else if(a[i]/4+1==5){
		   System.out.print("5");
		   t[0]+=5;
		}
		else if(a[i]/4+1==6){
		   System.out.print("6");
		   t[0]+=6;
		}
		else if(a[i]/4+1==7){
		   System.out.print("7");
		   t[0]+=7;
		}
		else if(a[i]/4+1==8){
		   System.out.print("8");
		   t[0]+=8;
		}
		else if(a[i]/4+1==9){
		   System.out.print("9");
		   t[0]+=9;
		}
		else if(a[i]/4+1==10){
		   System.out.print("10");
		   t[0]+=10;
		}
		else if(a[i]/4+1==11){
		   System.out.print("11");
		   t[0]+=10;
		}
		else if(a[i]/4+1==12){
		   System.out.print("12");
		   t[0]+=10;
		}
		else if(a[i]/4+1==13){
		   System.out.print("13");
		   t[0]+=10;
		}
		System.out.print("\n");	
	 }
	 while(tem>0)
	 {
	    if(t[0]>21)
		{
	       tem--;
		   t[0]=t[0]-10;
		}
		if(t[0]<22)
		   break;
	 }
	  System.out.print("total:"+t[0]+"�I\n");
   }
}
class Player {
 String pname;
 int[] pcards=new int[100];
 int pcardnum=0;
}
class Computer{
 int[] ccards=new int[100];
 int ccardnum=0;
}
class Deck{
  int countd=0;
  int[] cards=new int[200];
}