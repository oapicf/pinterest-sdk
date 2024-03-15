package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsProductGroupPricingCurrencyCriteria  {
  
public enum OperatorEnum {

    @JsonProperty("GREATER_THAN") GREATER_THAN(String.valueOf("GREATER_THAN")),
    @JsonProperty("GREATER_THAN_OR_EQUALS") GREATER_THAN_OR_EQUALS(String.valueOf("GREATER_THAN_OR_EQUALS")),
    @JsonProperty("LESS_THAN") LESS_THAN(String.valueOf("LESS_THAN")),
    @JsonProperty("LESS_THAN_OR_EQUALS") LESS_THAN_OR_EQUALS(String.valueOf("LESS_THAN_OR_EQUALS"));

    private String value;

    OperatorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
        for (OperatorEnum b : OperatorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private OperatorEnum operator;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private BigDecimal value;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private NonNullableCatalogsCurrency currency;

  @ApiModelProperty(value = "")
  private Boolean negated = false;
 /**
  * Get operator
  * @return operator
  */
  @JsonProperty("operator")
  @NotNull
  public String getOperator() {
    return operator == null ? null : operator.value();
  }

  /**
   * Sets the <code>operator</code> property.
   */
 public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * Sets the <code>operator</code> property.
   */
  public CatalogsProductGroupPricingCurrencyCriteria operator(OperatorEnum operator) {
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
  public CatalogsProductGroupPricingCurrencyCriteria value(BigDecimal value) {
    this.value = value;
    return this;
  }

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
  public CatalogsProductGroupPricingCurrencyCriteria currency(NonNullableCatalogsCurrency currency) {
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
  public CatalogsProductGroupPricingCurrencyCriteria negated(Boolean negated) {
    this.negated = negated;
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
    CatalogsProductGroupPricingCurrencyCriteria catalogsProductGroupPricingCurrencyCriteria = (CatalogsProductGroupPricingCurrencyCriteria) o;
    return Objects.equals(this.operator, catalogsProductGroupPricingCurrencyCriteria.operator) &&
        Objects.equals(this.value, catalogsProductGroupPricingCurrencyCriteria.value) &&
        Objects.equals(this.currency, catalogsProductGroupPricingCurrencyCriteria.currency) &&
        Objects.equals(this.negated, catalogsProductGroupPricingCurrencyCriteria.negated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, value, currency, negated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCurrencyCriteria {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    negated: ").append(toIndentedString(negated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

