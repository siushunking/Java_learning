public class Robot {
    private String name;
    private int yearMade;
  
        public void setName(String name){
            this.name = name;
        }

        public Integer getYear() {
            return this.yearMade;
        }

        public void setYearMade(Integer year){
            if(year <= 0 ){
                System.out.println("YearMade cannot be negative");
            }else if(year > 2023 ) {
                System.out.println("YearMade cannot be bigger than 2023");
            }else{
                this.yearMade = year;
            }
        }

        public String getName() {
            return this.name;
        }

    
}
