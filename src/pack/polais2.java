package pack;



	import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

	public class polais2 {
		
		
		static  char[] tab={'*','/','-','+','^'};
		static char[] tab1={'*','/','^'};
		static  char[] tab2={'-','+'};

		public static void main(String[] args) {

			   Scanner sc = new Scanner(System.in);
			   String s ;
			   s=sc.next();
			   Stack p = new Stack();
			   String l ="";
			   String r="";
		   
			   for (int i = 0; i <s.length(); i++) {
				   
				   
				
				if((l+s.charAt(i)).equals("(")){p.push(s.charAt(i));}
					   
					                         
				   if((l+s.charAt(i)).equals(")")){
					   
					     while(!(l+p.peek()).equals("(")){r=r+p.peek();p.pop();}
					     p.pop();
				   }
			   
				   
	  if(isOper(l+s.charAt(i))){
					  
					          if(isOperPri(l+s.charAt(i))){ p.push(s.charAt(i));}
					                        	
					    	  if(!isOperPri(l+s.charAt(i))){
					    	                                 if(!p.isEmpty()&&(isOperPri(l+p.peek())))
					    	                                 	{       r=r+p.peek();
					    	                                	 		p.pop();
					    	                                	 		p.push(s.charAt(i));}
					    	  
					    	                                    else   {p.push(s.charAt(i));}
					    	                                		
					    	  													}
	                           }
					      
	   if(!isOper(l+s.charAt(i))&&!(l+s.charAt(i)).equals("(")&&!(l+s.charAt(i)).equals(")"))
	      {r=r+s.charAt(i);}
					  
	  }
			
			
			 while(!p.isEmpty()){	r=r+p.peek();
			   						p.pop();
			   					}
				 
			System.out.println(r);
	
			
	}//fin_main
		
	
		
		public static Boolean isOper(String c){ String h="";
	    for (int i = 0; i<tab.length ; i++) { 
		                  if(c.equals(h+tab[i])){return true;}
	   	         }
		           return false;
				}

	    public static Boolean isOperPri(String c){ String h="";
		 for (int i = 0; i < tab1.length; i++) {
						if(c.equals(h+tab1[i])){return true;}
					     }
	                return false; 
					}
		
	}



