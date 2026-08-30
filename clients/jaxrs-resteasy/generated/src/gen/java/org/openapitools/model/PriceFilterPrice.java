package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NumericFilterOperatorType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PriceFilterPrice   {
  
  private NonNullableCatalogsCurrency currency;
  private Boolean negated;
  private NumericFilterOperatorType operator;
  private BigDecimal value;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  @NotNull
  @Valid
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }
  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operator")
  @NotNull
  @Valid
  public NumericFilterOperatorType getOperator() {
    return operator;
  }
  public void setOperator(NumericFilterOperatorType operator) {
    this.operator = operator;
  }

  /**
   * minimum: 0
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("value")
  @NotNull
 @DecimalMin("0")  @Valid
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

