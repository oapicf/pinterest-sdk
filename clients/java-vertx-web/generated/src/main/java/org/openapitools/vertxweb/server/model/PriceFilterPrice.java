package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.vertxweb.server.model.NonNullableCatalogsCurrency;
import org.openapitools.vertxweb.server.model.NumericFilterOperatorType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PriceFilterPrice   {
  
  private NonNullableCatalogsCurrency currency;
  private Boolean negated;
  private NumericFilterOperatorType operator;
  private BigDecimal value;

  public PriceFilterPrice () {

  }

  public PriceFilterPrice (NonNullableCatalogsCurrency currency, Boolean negated, NumericFilterOperatorType operator, BigDecimal value) {
    this.currency = currency;
    this.negated = negated;
    this.operator = operator;
    this.value = value;
  }

    
  @JsonProperty("currency")
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }
  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

    
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

    
  @JsonProperty("operator")
  public NumericFilterOperatorType getOperator() {
    return operator;
  }
  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

    
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
    return Objects.equals(currency, priceFilterPrice.currency) &&
        Objects.equals(negated, priceFilterPrice.negated) &&
        Objects.equals(operator, priceFilterPrice.operator) &&
        Objects.equals(value, priceFilterPrice.value);
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
