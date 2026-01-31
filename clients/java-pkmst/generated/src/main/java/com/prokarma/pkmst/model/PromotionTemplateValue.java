package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * PromotionTemplateValue
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionTemplateValue   {
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency_code")
  private Currency currencyCode;

  @JsonProperty("custom_text")
  private String customText;

  @JsonProperty("percent")
  private BigDecimal percent;

  public PromotionTemplateValue amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Numeric value.
   * @return amount
   */
  @ApiModelProperty(example = "100", value = "Numeric value.")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public PromotionTemplateValue currencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @ApiModelProperty(value = "")
  public Currency getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PromotionTemplateValue customText(String customText) {
    this.customText = customText;
    return this;
  }

  /**
   * Custom text.
   * @return customText
   */
  @ApiModelProperty(example = "My promotion", value = "Custom text.")
  public String getCustomText() {
    return customText;
  }

  public void setCustomText(String customText) {
    this.customText = customText;
  }

  public PromotionTemplateValue percent(BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Percent value.
   * @return percent
   */
  @ApiModelProperty(example = "10", value = "Percent value.")
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

