package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NumericFilterOperatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PriceFilterPrice  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableCatalogsCurrency currency;

  @ApiModelProperty(value = "")
  private Boolean negated;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NumericFilterOperatorType operator;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal value;
 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  @NotNull
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public PriceFilterPrice currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * Get negated
  * @return negated
  */
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
 public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   * Sets the <code>negated</code> property.
   */
  public PriceFilterPrice negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

 /**
  * Get operator
  * @return operator
  */
  @JsonProperty("operator")
  @NotNull
  public NumericFilterOperatorType getOperator() {
    return operator;
  }

  /**
   * Sets the <code>operator</code> property.
   */
 public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  /**
   * Sets the <code>operator</code> property.
   */
  public PriceFilterPrice operator(NumericFilterOperatorType operator) {
    this.operator = operator;
    return this;
  }

 /**
  * Get value
  * minimum: 0
  * @return value
  */
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0")  public BigDecimal getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public PriceFilterPrice value(BigDecimal value) {
    this.value = value;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

