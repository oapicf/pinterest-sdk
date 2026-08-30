package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.BudgetType;
import org.openapitools.model.PacingDeliveryType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupCreateRequestAllOf1  {
  
 /**
  * Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.")
  private Boolean autoTargetingEnabled;

 /**
  * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  */
  @ApiModelProperty(value = "<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.")
  @Valid
  private BigDecimal bidMultiplier;

  @ApiModelProperty(value = "")
  @Valid
  private BudgetType budgetType;

  @ApiModelProperty(value = "")
  @Valid
  private PacingDeliveryType pacingDeliveryType;
 /**
  * Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;.
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public AdGroupCreateRequestAllOf1 autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;.
  * minimum: 0
  * maximum: 10
  * @return bidMultiplier
  */
  @JsonProperty("bid_multiplier")
 @DecimalMin("0") @DecimalMax("10")  public BigDecimal getBidMultiplier() {
    return bidMultiplier;
  }

  /**
   * Sets the <code>bidMultiplier</code> property.
   */
 public void setBidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
  }

  /**
   * Sets the <code>bidMultiplier</code> property.
   */
  public AdGroupCreateRequestAllOf1 bidMultiplier(BigDecimal bidMultiplier) {
    this.bidMultiplier = bidMultiplier;
    return this;
  }

 /**
  * Get budgetType
  * @return budgetType
  */
  @JsonProperty("budget_type")
  public BudgetType getBudgetType() {
    return budgetType;
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
 public void setBudgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
  }

  /**
   * Sets the <code>budgetType</code> property.
   */
  public AdGroupCreateRequestAllOf1 budgetType(BudgetType budgetType) {
    this.budgetType = budgetType;
    return this;
  }

 /**
  * Get pacingDeliveryType
  * @return pacingDeliveryType
  */
  @JsonProperty("pacing_delivery_type")
  public PacingDeliveryType getPacingDeliveryType() {
    return pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
 public void setPacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
  }

  /**
   * Sets the <code>pacingDeliveryType</code> property.
   */
  public AdGroupCreateRequestAllOf1 pacingDeliveryType(PacingDeliveryType pacingDeliveryType) {
    this.pacingDeliveryType = pacingDeliveryType;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCreateRequestAllOf1 adGroupCreateRequestAllOf1 = (AdGroupCreateRequestAllOf1) o;
    return Objects.equals(this.autoTargetingEnabled, adGroupCreateRequestAllOf1.autoTargetingEnabled) &&
        Objects.equals(this.bidMultiplier, adGroupCreateRequestAllOf1.bidMultiplier) &&
        Objects.equals(this.budgetType, adGroupCreateRequestAllOf1.budgetType) &&
        Objects.equals(this.pacingDeliveryType, adGroupCreateRequestAllOf1.pacingDeliveryType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoTargetingEnabled, bidMultiplier, budgetType, pacingDeliveryType);
  }

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

