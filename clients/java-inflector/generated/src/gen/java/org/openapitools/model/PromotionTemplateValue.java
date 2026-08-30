package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PromotionTemplateValue   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency_code")
  private Currency currencyCode;

  @JsonProperty("custom_text")
  private String customText;

  @JsonProperty("percent")
  private BigDecimal percent;

  /**
   * Numeric value.
   **/
  public PromotionTemplateValue amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Numeric value.")
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  /**
   **/
  public PromotionTemplateValue currencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currency_code")
  public Currency getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }

  /**
   * Custom text.
   **/
  public PromotionTemplateValue customText(String customText) {
    this.customText = customText;
    return this;
  }

  
  @ApiModelProperty(example = "My promotion", value = "Custom text.")
  @JsonProperty("custom_text")
  public String getCustomText() {
    return customText;
  }
  public void setCustomText(String customText) {
    this.customText = customText;
  }

  /**
   * Percent value.
   **/
  public PromotionTemplateValue percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "Percent value.")
  @JsonProperty("percent")
  public BigDecimal getPercent() {
    return percent;
  }
  public void setPercent(BigDecimal percent) {
    this.percent = percent;
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
    return Objects.equals(amount, promotionTemplateValue.amount) &&
        Objects.equals(currencyCode, promotionTemplateValue.currencyCode) &&
        Objects.equals(customText, promotionTemplateValue.customText) &&
        Objects.equals(percent, promotionTemplateValue.percent);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

