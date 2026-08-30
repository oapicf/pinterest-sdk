package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.BudgetType;
import org.openapitools.server.model.PacingDeliveryType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdGroupCreateRequestAllOf1   {

    private Boolean autoTargetingEnabled;
    private BigDecimal bidMultiplier;
    private BudgetType budgetType;
    private PacingDeliveryType pacingDeliveryType;

    /**
     * Default constructor.
     */
    public AdGroupCreateRequestAllOf1() {
    // JSON-B / Jackson
    }

    /**
     * Create AdGroupCreateRequestAllOf1.
     *
     * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.
     * @param bidMultiplier &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
     * @param budgetType budgetType
     * @param pacingDeliveryType pacingDeliveryType
     */
    public AdGroupCreateRequestAllOf1(
        Boolean autoTargetingEnabled, 
        BigDecimal bidMultiplier, 
        BudgetType budgetType, 
        PacingDeliveryType pacingDeliveryType
    ) {
        this.autoTargetingEnabled = autoTargetingEnabled;
        this.bidMultiplier = bidMultiplier;
        this.budgetType = budgetType;
        this.pacingDeliveryType = pacingDeliveryType;
    }



    /**
     * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
     * @return autoTargetingEnabled
     */
    public Boolean getAutoTargetingEnabled() {
        return autoTargetingEnabled;
    }

    public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
        this.autoTargetingEnabled = autoTargetingEnabled;
    }

    /**
     * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
     * minimum: 0
     * maximum: 10
     * @return bidMultiplier
     */
    public BigDecimal getBidMultiplier() {
        return bidMultiplier;
    }

    public void setBidMultiplier(BigDecimal bidMultiplier) {
        this.bidMultiplier = bidMultiplier;
    }

    /**
     * Get budgetType
     * @return budgetType
     */
    public BudgetType getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetType budgetType) {
        this.budgetType = budgetType;
    }

    /**
     * Get pacingDeliveryType
     * @return pacingDeliveryType
     */
    public PacingDeliveryType getPacingDeliveryType() {
        return pacingDeliveryType;
    }

    public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
        this.pacingDeliveryType = pacingDeliveryType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdGroupCreateRequestAllOf1 {\n");
        
        sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
        sb.append("    bidMultiplier: ").append(toIndentedString(bidMultiplier)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    pacingDeliveryType: ").append(toIndentedString(pacingDeliveryType)).append("\n");
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

