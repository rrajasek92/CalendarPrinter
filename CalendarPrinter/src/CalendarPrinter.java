import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
public class CalendarPrinter {
				public static void main (String[] args){
					int month, year, week, d=1;
					Scanner keyboard=new Scanner(System.in);
				    Calendar cal = Calendar.getInstance();
				    Date date=new Date();
					System.out.println("Enter Month:");
					month=keyboard.nextInt();
					month--;
					System.out.println("Enter Year: ");
					year=keyboard.nextInt();
					date.setMonth(month);
					date.setYear(year);
					cal.set(Calendar.MONTH, month);
					cal.set(Calendar.YEAR, year);
				    cal.set(Calendar.DAY_OF_MONTH, 1); 
				    week= cal.get(Calendar.DAY_OF_WEEK);
				    int dash=week-1;
				    System.out.printf("\t"+"%20tB"+"\n", date);
				    System.out.println("\nS\tM\tT\tW\tT\tF\tS");
				    for (int i=0;i<dash;i++){
				    System.out.print("-\t");
				    d++;
				    }
					
			
						
						for(int i=1;i<=cal.getActualMaximum(Calendar.DAY_OF_MONTH);i++)
						{
							System.out.print(i+"\t");
							d++;
							if(d>7)
							{
								System.out.println("\n");
								d=1;
							}
							
						}
						
}
}
