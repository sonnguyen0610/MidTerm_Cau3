public class Cau3 {
    public boolean checkMonth(int month){
        if(month>0 &&month<13){
            return true;
        }
        return false;
    }
    public void printDayInMonth(int month){
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12: //tháng có 31 ngày
                System.out.println(" Have 31 day in month");
                break;
            case 4, 6, 9, 11:// tháng có 30 ngày
                System.out.println(" Have 30 day in month");
                break;
            case 2:
                System.out.println(" Have 28 or 29 day in month");
                break;
            default:
                System.out.println("Month invalid");
        }
    }
}
