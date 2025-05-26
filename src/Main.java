public class Main {

    public static void main(String[] args) {
        String typeOfDay;
        String day = "j";

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                typeOfDay = "Робочий день";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Вихідний";
                break;
            default:
                typeOfDay = "Невірне значення";
        }

        System.out.println(typeOfDay);
    }
}
