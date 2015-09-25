public class ReaderArray{

	public void mainList(int a) {
		String list[] = {"","Mascot","Roslynne","Kate","Kpano","Tsatsu","Mustapha"
							,"Yinka","Jumba","Yeboah", "Kayode","Edmond","Chidi"
							,"Chidi","Bubu","Maxwell","Opeyemi","Julius","Law"
							,"Bernard","Tabitha","Patience","Eric","Samuel"
							,"Nana","Nyawira","Mary","Oluwasegun","Mukeli"
							,"Amanze","Ibukun","Paul","Chiamaka"}		
	}

	public String cardA() {
		String positionA[];
		for (int i=1;i<=16 ;i++) {
		positionA[i-1] = list[2*i-1];	
		}
	}
	public String cardB() {
		String[] positionB = {list[2],list[3],list[6],list[7],list[10],list[11],list[14],
							  list[15],list[18],list[19],list[22],list[23],list[26],
							  list[27],list[30],list[31]}
	}

	public String cardC() {
		String[] positionC = {list[4],list[5],list[6],list[7],list[12],list[13],list[14],
							  list[15],list[20],list[21],list[22],list[23],list[28],
							  list[30],list[31],list[0]}
	}

	public String cardD() {
		String[] positionD = {list[8],list[9],list[10],list[11],list[12],list[13],list[14],
							  list[15],list[24],list[25],list[26],list[27],list[28],
							  list[29],list[30],list[31]}
	}
	
	public String cardE() {
		String[] positionE = {list[16],list[17],list[18],list[19],list[20],list[21],list[22],
							  list[23],list[24],list[25],list[26],list[27],list[28],
							  list[29],list[30],list[31]}
	}

	
	public static void main(String[] args) {
		
	}
}