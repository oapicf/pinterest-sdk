package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PromotionTemplateValue  {
  
 /**
  * Numeric value.
  */
  @ApiModelProperty(example = "100", value = "Numeric value.")
  @Valid
  private BigDecimal amount;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currencyCode;

 /**
  * Custom text.
  */
  @ApiModelProperty(example = "My promotion", value = "Custom text.")
  private String customText;

 /**
  * Percent value.
  */
  @ApiModelProperty(example = "10", value = "Percent value.")
  @Valid
  private BigDecimal percent;
 /**
  * Numeric value.
  * @return amount
  */
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
 public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   * Sets the <code>amount</code> property.
   */
  public PromotionTemplateValue amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

 /**
  * Get currencyCode
  * @return currencyCode
  */
  @JsonProperty("currency_code")
  public Currency getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Sets the <code>currencyCode</code> property.
   */
 public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Sets the <code>currencyCode</code> property.
   */
  public PromotionTemplateValue currencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

 /**
  * Custom text.
  * @return customText
  */
  @JsonProperty("custom_text")
  public String getCustomText() {
    return customText;
  }

  /**
   * Sets the <code>customText</code> property.
   */
 public void setCustomText(String customText) {
    this.customText = customText;
  }

  /**
   * Sets the <code>customText</code> property.
   */
  public PromotionTemplateValue customText(String customText) {
    this.customText = customText;
    return this;
  }

 /**
  * Percent value.
  * @return percent
  */
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
 public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
  public PromotionTemplateValue percent(BigDecimal percent) {
    this.percent = percent;
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
    PromotionTemplateValue promotionTemplateValue = (PromotionTemplateValue) o;
    return Objects.equals(this.amount, promotionTemplateValue.amount) &&
        Objects.equals(this.currencyCode, promotionTemplateValue.currencyCode) &&
        Objects.equals(this.customText, promotionTemplateValue.customText) &&
        Objects.equals(this.percent, promotionTemplateValue.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCode, customText, percent);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

