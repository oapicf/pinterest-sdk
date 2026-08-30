package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Bid floor request and response model.
 */
public class BidFloor   {

    private List<Integer> bidFloors = new ArrayList<>();
    private String type = "bidfloor";

    /**
     * Default constructor.
     */
    public BidFloor() {
    // JSON-B / Jackson
    }

    /**
     * Create BidFloor.
     *
     * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000]
     * @param type Always the string &#39;bidfloor&#39;.
     */
    public BidFloor(
        List<Integer> bidFloors, 
        String type
    ) {
        this.bidFloors = bidFloors;
        this.type = type;
    }



    /**
     * A list of bid floors in micro currency. For example, [100000, 200000]
     * @return bidFloors
     */
    public List<Integer> getBidFloors() {
        return bidFloors;
    }

    public void setBidFloors(List<Integer> bidFloors) {
        this.bidFloors = bidFloors;
    }

    /**
     * Always the string 'bidfloor'.
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BidFloor {\n");
        
        sb.append("    bidFloors: ").append(toIndentedString(bidFloors)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

