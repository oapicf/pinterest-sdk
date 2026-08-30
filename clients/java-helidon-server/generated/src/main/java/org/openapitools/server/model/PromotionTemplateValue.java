package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.Currency;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PromotionTemplateValue   {

    private BigDecimal amount;
    private Currency currencyCode;
    private String customText;
    private BigDecimal percent;

    /**
     * Default constructor.
     */
    public PromotionTemplateValue() {
    // JSON-B / Jackson
    }

    /**
     * Create PromotionTemplateValue.
     *
     * @param amount Numeric value.
     * @param currencyCode currencyCode
     * @param customText Custom text.
     * @param percent Percent value.
     */
    public PromotionTemplateValue(
        BigDecimal amount, 
        Currency currencyCode, 
        String customText, 
        BigDecimal percent
    ) {
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.customText = customText;
        this.percent = percent;
    }



    /**
     * Numeric value.
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * Get currencyCode
     * @return currencyCode
     */
    public Currency getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(Currency currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Custom text.
     * @return customText
     */
    public String getCustomText() {
        return customText;
    }

    public void setCustomText(String customText) {
        this.customText = customText;
    }

    /**
     * Percent value.
     * @return percent
     */
    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromotionTemplateValue {\n");
        
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
        sb.append("    customText: ").append(toIndentedString(customText)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

