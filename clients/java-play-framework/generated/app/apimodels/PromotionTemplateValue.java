package apimodels;

import apimodels.Currency;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PromotionTemplateValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PromotionTemplateValue   {
  @JsonProperty("amount")
  @Valid

  private BigDecimal amount;

  @JsonProperty("currency_code")
  @Valid

  private Currency currencyCode;

  @JsonProperty("custom_text")
  
  private String customText;

  @JsonProperty("percent")
  @Valid

  private BigDecimal percent;

  public PromotionTemplateValue amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Numeric value.
   * @return amount
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

