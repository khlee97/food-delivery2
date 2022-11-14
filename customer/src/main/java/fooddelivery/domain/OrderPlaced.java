package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String address;
    private String foodId;
    private String options;
    private String customerId;
    private List<String> options;
    private String storeId;
}
