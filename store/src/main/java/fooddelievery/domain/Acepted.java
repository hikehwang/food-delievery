package fooddelievery.domain;

import fooddelievery.domain.*;
import fooddelievery.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Acepted extends AbstractEvent {

    private Long id;
    private String orderId;
    private String storeId;
    private String menuId;
    private Integer qty;
    private String status;
    private String address;

    public Acepted(StoreOrder aggregate){
        super(aggregate);
    }
    public Acepted(){
        super();
    }
}
