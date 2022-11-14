package fooddelivery.domain;

import fooddelivery.domain.Delivered;
import fooddelivery.RiderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Delivery_table")
@Data

public class Delivery  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String orderId;

    @PostPersist
    public void onPostPersist(){


        Delivered delivered = new Delivered(this);
        delivered.publishAfterCommit();

    }

    public static DeliveryRepository repository(){
        DeliveryRepository deliveryRepository = RiderApplication.applicationContext.getBean(DeliveryRepository.class);
        return deliveryRepository;
    }



    public void pickFood(){
        FoodPicked foodPicked = new FoodPicked(this);
        foodPicked.publishAfterCommit();

    }

    public static void copyOrderInfo(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }
    public static void updateStatus(CookingFinished cookingFinished){

        /** Example 1:  new item 
        Delivery delivery = new Delivery();
        repository().save(delivery);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookingFinished.get???()).ifPresent(delivery->{
            
            delivery // do something
            repository().save(delivery);


         });
        */

        
    }


}
