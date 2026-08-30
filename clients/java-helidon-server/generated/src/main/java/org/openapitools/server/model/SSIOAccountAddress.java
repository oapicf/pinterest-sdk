package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Salesforce address information.
 */
public class SSIOAccountAddress   {

    private String addressId;
    private String display;
    private String orderLegalEntity;
    private String purpose;

    /**
     * Default constructor.
     */
    public SSIOAccountAddress() {
    // JSON-B / Jackson
    }

    /**
     * Create SSIOAccountAddress.
     *
     * @param addressId Salesforce id for address
     * @param display Address display
     * @param orderLegalEntity Legal entity for this insertion order
     * @param purpose Purpose for which the address is used, usually Billing or Businness
     */
    public SSIOAccountAddress(
        String addressId, 
        String display, 
        String orderLegalEntity, 
        String purpose
    ) {
        this.addressId = addressId;
        this.display = display;
        this.orderLegalEntity = orderLegalEntity;
        this.purpose = purpose;
    }



    /**
     * Salesforce id for address
     * @return addressId
     */
    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    /**
     * Address display
     * @return display
     */
    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Legal entity for this insertion order
     * @return orderLegalEntity
     */
    public String getOrderLegalEntity() {
        return orderLegalEntity;
    }

    public void setOrderLegalEntity(String orderLegalEntity) {
        this.orderLegalEntity = orderLegalEntity;
    }

    /**
     * Purpose for which the address is used, usually Billing or Businness
     * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SSIOAccountAddress {\n");
        
        sb.append("    addressId: ").append(toIndentedString(addressId)).append("\n");
        sb.append("    display: ").append(toIndentedString(display)).append("\n");
        sb.append("    orderLegalEntity: ").append(toIndentedString(orderLegalEntity)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

