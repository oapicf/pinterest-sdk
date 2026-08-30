package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NumericFilterOperatorType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PriceFilterPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("currency")
  private NonNullableCatalogsCurrency currency;

  @JsonProperty("negated")
  private Boolean negated;

  @JsonProperty("operator")
  private NumericFilterOperatorType operator;

  @JsonProperty("value")
  private BigDecimal value;

  /**
   * 
   * @return currency
   */
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   * 
   * @return negated
   */
  public Boolean getNegated() {
    return negated;
  }

  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   * 
   * @return operator
   */
  public NumericFilterOperatorType getOperator() {
    return operator;
  }

  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  /**
   * 
   * @return value
   */
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
