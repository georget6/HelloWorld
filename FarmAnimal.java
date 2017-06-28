package farmanimals;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class FarmAnimal {
	private int id;
	private String name;
	private Date bornOn;
	
	public long getAgeInMonths() {
		
		@SuppressWarnings("deprecation")
		LocalDate birthdate = LocalDate.of(bornOn.getYear()+1900, bornOn.getMonth()+1, bornOn.getDate());
		LocalDate now = LocalDate.now();
		System.out.println("..."+birthdate);
		System.out.println(now);
		long months = ChronoUnit.MONTHS.between(birthdate, now);
		return months;
	}

	public FarmAnimal(){
		bornOn = new Date();
		//Calendar cal = Calendar.getInstance();
        //cal.setTime(bornOn);
	}
	public Date getBornOn() {
		return bornOn;
	}

	public void setBornOn(Date bornOn) {
		this.bornOn = bornOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
}
