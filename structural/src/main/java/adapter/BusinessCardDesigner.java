package adapter;

import java.util.StringJoiner;

public class BusinessCardDesigner {

    public String designCard(Customer customer) {
        StringJoiner customerInfo = new StringJoiner(" || ");

        customerInfo
                .add(customer.getName())
                .add(customer.getDesignation())
                .add(customer.getAddress());

        return customerInfo.toString();
    }
}
