package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class CookingFinished extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String status;
    private String foodId;
    private String orderId;
    private Object options;
    private String storeId;
}


