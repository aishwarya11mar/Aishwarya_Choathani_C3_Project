import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
    //Restaurant res = new Restaurant(name, location, openingTime, closingTime);

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException{
        //Restaurant res = new Restaurant(name, location, openingTime, closingTime);
        addRestaurant("Amelie's cafe","pune", LocalTime.parse("10:30:00"),LocalTime.parse("13:30:00"));
        for(Restaurant restaurant : restaurants){
            if(restaurant.getName().equals(restaurantName)){
                return restaurant;
            }
        }


        throw new restaurantNotFoundException("Not found");
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {

        return restaurants;
    }
}
