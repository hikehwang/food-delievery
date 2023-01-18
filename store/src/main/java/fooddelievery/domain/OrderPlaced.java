package fooddelievery.domain;

import fooddelievery.domain.*;
import fooddelievery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String userId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;
}


