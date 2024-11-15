
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance () {
        if ((this.day+1) > 30) {
            this.day = 1;
            if ((this.month+1) > 12) {
                this.month = 1;
                this.year++;
                return;
            }
            this.month++;
        }
        this.day++;
    }
    
    public void advance(int howManyDays) {
         if ((this.day+howManyDays) > 30) {
            this.day = howManyDays % 30;
            if ((this.month+1) > 12) {
                this.month = 1;
                this.year++;
                return;
            }
            this.month++;
        }
        this.day++;
    }
    
    public SimpleDate afterNumberOfDays (int days) {
         SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        for (int i = 0; i < days; i++) {
            newDate.advance();
        }
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
