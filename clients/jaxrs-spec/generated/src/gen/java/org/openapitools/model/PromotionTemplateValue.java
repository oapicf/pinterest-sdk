package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("PromotionTemplateValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionTemplateValue   {
  private BigDecimal amount;
  private Currency currencyCode;
  private String customText;
  private BigDecimal percent;

  public PromotionTemplateValue() {
  }

  /**
   * Numeric value.
   **/
  public PromotionTemplateValue amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  
  @ApiModelProperty(example = "100", value = "Numeric value.")
  @JsonProperty("amount")
  @Valid public BigDecimal getAmount() {
    return amount;
  }

  @JsonProperty("amount")
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

  @JsonProperty("currency_code")
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

  @JsonProperty("custom_text")
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
  @Valid public BigDecimal getPercent() {
    return percent;
  }

  @JsonProperty("percent")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

