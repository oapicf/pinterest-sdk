package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.Currency;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PromotionTemplateValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class PromotionTemplateValue {

  private @Nullable BigDecimal amount;

  private @Nullable Currency currencyCode;

  private @Nullable String customText;

  private @Nullable BigDecimal percent;

  public PromotionTemplateValue amount(@Nullable BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Numeric value.
   * @return amount
   */
  @Valid 
  @Schema(name = "amount", example = "100", description = "Numeric value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("amount")
  public @Nullable BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(@Nullable BigDecimal amount) {
    this.amount = amount;
  }

  public PromotionTemplateValue currencyCode(@Nullable Currency currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * Get currencyCode
   * @return currencyCode
   */
  @Valid 
  @Schema(name = "currency_code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_code")
  public @Nullable Currency getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(@Nullable Currency currencyCode) {
    this.currencyCode = currencyCode;
  }

  public PromotionTemplateValue customText(@Nullable String customText) {
    this.customText = customText;
    return this;
  }

  /**
   * Custom text.
   * @return customText
   */
  
  @Schema(name = "custom_text", example = "My promotion", description = "Custom text.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_text")
  public @Nullable String getCustomText() {
    return customText;
  }

  public void setCustomText(@Nullable String customText) {
    this.customText = customText;
  }

  public PromotionTemplateValue percent(@Nullable BigDecimal percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Percent value.
   * @return percent
   */
  @Valid 
  @Schema(name = "percent", example = "10", description = "Percent value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  public @Nullable BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(@Nullable BigDecimal percent) {
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

