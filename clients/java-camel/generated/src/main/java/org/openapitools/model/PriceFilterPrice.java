package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NumericFilterOperatorType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PriceFilterPrice
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PriceFilterPrice {

  private NonNullableCatalogsCurrency currency;

  private Boolean negated;

  private NumericFilterOperatorType operator;

  private BigDecimal value;

  public PriceFilterPrice() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PriceFilterPrice(NonNullableCatalogsCurrency currency, NumericFilterOperatorType operator, BigDecimal value) {
    this.currency = currency;
    this.operator = operator;
    this.value = value;
  }

  public PriceFilterPrice currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @NotNull @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("currency")
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  public PriceFilterPrice negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  /**
   * Get negated
   * @return negated
   */
  
  @Schema(name = "negated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  public PriceFilterPrice operator(NumericFilterOperatorType operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
   */
  @NotNull @Valid 
  @Schema(name = "operator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operator")
  public NumericFilterOperatorType getOperator() {
    return operator;
  }

  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  public PriceFilterPrice value(BigDecimal value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * minimum: 0
   * @return value
   */
  @NotNull @Valid @DecimalMin(value = "0") 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceFilterPrice priceFilterPrice = (PriceFilterPrice) o;
    return Objects.equals(this.currency, priceFilterPrice.currency) &&
        Objects.equals(this.negated, priceFilterPrice.negated) &&
        Objects.equals(this.operator, priceFilterPrice.operator) &&
        Objects.equals(this.value, priceFilterPrice.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, negated, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceFilterPrice {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

