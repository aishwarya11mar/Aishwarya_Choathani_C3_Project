import java.time.LocalTime;

public class Main {
    public static void main(String args[]) throws restaurantNotFoundException {
        Restaurant res = new Restaurant("Amelie's cafe","pune", LocalTime.parse("10:30:00"),LocalTime.parse("13:30:00"));
        //System.out.println(res.isRestaurantOpen());
        //System.out.println(res.getMenu());
        RestaurantService resservice= new RestaurantService();
        resservice.addRestaurant("Amelie's cafe","pune", LocalTime.parse("10:30:00"),LocalTime.parse("13:30:00"));
        resservice.addRestaurant("b","pune", LocalTime.parse("10:30:00"),LocalTime.parse("13:30:00"));
        System.out.println(resservice.findRestaurantByName("c"));
    }
}
