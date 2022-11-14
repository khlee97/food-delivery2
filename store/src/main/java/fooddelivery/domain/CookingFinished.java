package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;

    public CookingFinished(FoodCooking aggregate){
        super(aggregate);
    }
    public CookingFinished(){
        super();
    }
}
