package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCancelled extends AbstractEvent {

    private Long id;
    private String foodId;
    private String options;
    private String address;
    private String customerId;
    private List<String> options;
    private String storeId;

    public OrderCancelled(Order aggregate){
        super(aggregate);
    }
    public OrderCancelled(){
        super();
    }
}
