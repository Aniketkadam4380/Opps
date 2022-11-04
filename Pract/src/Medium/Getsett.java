package Medium;

 class Exampleee {
	private int id;
	private String name;
		
		
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int i) {
		this.id=i;
	}
	public void setName(String n) {
		this.name=n;
	}
public class GetSett{
 public static void main(String args[]) {
			Exampleee ex=new Exampleee();
			ex.setId(43);
			ex.setName("Aniket");
			System.out.println("Id:"+ex.getId());
			System.out.println("Name:"+ex.getName());
			
		}
		
	}
	}

