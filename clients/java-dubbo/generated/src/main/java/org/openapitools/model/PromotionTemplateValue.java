package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.Currency;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PromotionTemplateValue implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Numeric value.
   */
  @JsonProperty("amount")
  private BigDecimal amount;

  @JsonProperty("currency_code")
  private Currency currencyCode;

  /**
   * Custom text.
   */
  @JsonProperty("custom_text")
  private String customText;

  /**
   * Percent value.
   */
  @JsonProperty("percent")
  private BigDecimal percent;

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
   * 
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
