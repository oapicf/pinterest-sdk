package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.Currency;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotionTemplateValue   {
  
  private BigDecimal amount;
  private Currency currencyCode;
  private String customText;
  private BigDecimal percent;

  public PromotionTemplateValue () {

  }

  public PromotionTemplateValue (BigDecimal amount, Currency currencyCode, String customText, BigDecimal percent) {
    this.amount = amount;
    this.currencyCode = currencyCode;
    this.customText = customText;
    this.percent = percent;
  }

    
  @JsonProperty("amount")
  public BigDecimal getAmount() {
    return amount;
  }
  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

    
  @JsonProperty("currency_code")
  public Currency getCurrencyCode() {
    return currencyCode;
  }
  public void setCurrencyCode(Currency currencyCode) {
    this.currencyCode = currencyCode;
  }

    
  @JsonProperty("custom_text")
  public String getCustomText() {
    return customText;
  }
  public void setCustomText(String customText) {
    this.customText = customText;
  }

    
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
