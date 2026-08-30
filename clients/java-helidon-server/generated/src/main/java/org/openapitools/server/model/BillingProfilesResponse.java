package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BillingProfileCardType;
import org.openapitools.server.model.BillingProfilePaymentMethodBrand;
import org.openapitools.server.model.BillingProfileStatus;
import org.openapitools.server.model.BillingType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BillingProfilesResponse   {

    private String advertiserId;
    private BillingType billingType;
    private BillingProfileCardType cardType;
    private String id;
    private BillingProfilePaymentMethodBrand paymentMethodBrand;
    private BillingProfileStatus status;

    /**
     * Default constructor.
     */
    public BillingProfilesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BillingProfilesResponse.
     *
     * @param advertiserId Advertiser ID of the billing.
     * @param billingType Billing type of the advertiser
     * @param cardType Type of the card.
     * @param id Billing ID.
     * @param paymentMethodBrand Brand of the payment method.
     * @param status Status of the billing.
     */
    public BillingProfilesResponse(
        String advertiserId, 
        BillingType billingType, 
        BillingProfileCardType cardType, 
        String id, 
        BillingProfilePaymentMethodBrand paymentMethodBrand, 
        BillingProfileStatus status
    ) {
        this.advertiserId = advertiserId;
        this.billingType = billingType;
        this.cardType = cardType;
        this.id = id;
        this.paymentMethodBrand = paymentMethodBrand;
        this.status = status;
    }



    /**
     * Advertiser ID of the billing.
     * @return advertiserId
     */
    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    /**
     * Billing type of the advertiser
     * @return billingType
     */
    public BillingType getBillingType() {
        return billingType;
    }

    public void setBillingType(BillingType billingType) {
        this.billingType = billingType;
    }

    /**
     * Type of the card.
     * @return cardType
     */
    public BillingProfileCardType getCardType() {
        return cardType;
    }

    public void setCardType(BillingProfileCardType cardType) {
        this.cardType = cardType;
    }

    /**
     * Billing ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Brand of the payment method.
     * @return paymentMethodBrand
     */
    public BillingProfilePaymentMethodBrand getPaymentMethodBrand() {
        return paymentMethodBrand;
    }

    public void setPaymentMethodBrand(BillingProfilePaymentMethodBrand paymentMethodBrand) {
        this.paymentMethodBrand = paymentMethodBrand;
    }

    /**
     * Status of the billing.
     * @return status
     */
    public BillingProfileStatus getStatus() {
        return status;
    }

    public void setStatus(BillingProfileStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingProfilesResponse {\n");
        
        sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
        sb.append("    billingType: ").append(toIndentedString(billingType)).append("\n");
        sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    paymentMethodBrand: ").append(toIndentedString(paymentMethodBrand)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

