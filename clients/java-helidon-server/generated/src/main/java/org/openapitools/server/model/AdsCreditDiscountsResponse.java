package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdsCreditDiscountType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdsCreditDiscountsResponse   {

    private Boolean active;
    private String advertiserId;
    private String discountCurrency;
    private BigDecimal discountInMicroCurrency;
    private AdsCreditDiscountType discountType;
    private BigDecimal remainingDiscountInMicroCurrency;
    private String title;

    /**
     * Default constructor.
     */
    public AdsCreditDiscountsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsCreditDiscountsResponse.
     *
     * @param active True if the offer code is currently active.
     * @param advertiserId Advertiser ID the offer was applied to.
     * @param discountCurrency Currency value for the discount.
     * @param discountInMicroCurrency The discount applied in the offer&#39;s currency value.
     * @param discountType The type of discount of this credit
     * @param remainingDiscountInMicroCurrency The credits left to spend.
     * @param title Human readable title of the offer code.
     */
    public AdsCreditDiscountsResponse(
        Boolean active, 
        String advertiserId, 
        String discountCurrency, 
        BigDecimal discountInMicroCurrency, 
        AdsCreditDiscountType discountType, 
        BigDecimal remainingDiscountInMicroCurrency, 
        String title
    ) {
        this.active = active;
        this.advertiserId = advertiserId;
        this.discountCurrency = discountCurrency;
        this.discountInMicroCurrency = discountInMicroCurrency;
        this.discountType = discountType;
        this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
        this.title = title;
    }



    /**
     * True if the offer code is currently active.
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * Advertiser ID the offer was applied to.
     * @return advertiserId
     */
    public String getAdvertiserId() {
        return advertiserId;
    }

    public void setAdvertiserId(String advertiserId) {
        this.advertiserId = advertiserId;
    }

    /**
     * Currency value for the discount.
     * @return discountCurrency
     */
    public String getDiscountCurrency() {
        return discountCurrency;
    }

    public void setDiscountCurrency(String discountCurrency) {
        this.discountCurrency = discountCurrency;
    }

    /**
     * The discount applied in the offer's currency value.
     * @return discountInMicroCurrency
     */
    public BigDecimal getDiscountInMicroCurrency() {
        return discountInMicroCurrency;
    }

    public void setDiscountInMicroCurrency(BigDecimal discountInMicroCurrency) {
        this.discountInMicroCurrency = discountInMicroCurrency;
    }

    /**
     * The type of discount of this credit
     * @return discountType
     */
    public AdsCreditDiscountType getDiscountType() {
        return discountType;
    }

    public void setDiscountType(AdsCreditDiscountType discountType) {
        this.discountType = discountType;
    }

    /**
     * The credits left to spend.
     * @return remainingDiscountInMicroCurrency
     */
    public BigDecimal getRemainingDiscountInMicroCurrency() {
        return remainingDiscountInMicroCurrency;
    }

    public void setRemainingDiscountInMicroCurrency(BigDecimal remainingDiscountInMicroCurrency) {
        this.remainingDiscountInMicroCurrency = remainingDiscountInMicroCurrency;
    }

    /**
     * Human readable title of the offer code.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsCreditDiscountsResponse {\n");
        
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
        sb.append("    discountCurrency: ").append(toIndentedString(discountCurrency)).append("\n");
        sb.append("    discountInMicroCurrency: ").append(toIndentedString(discountInMicroCurrency)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    remainingDiscountInMicroCurrency: ").append(toIndentedString(remainingDiscountInMicroCurrency)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

