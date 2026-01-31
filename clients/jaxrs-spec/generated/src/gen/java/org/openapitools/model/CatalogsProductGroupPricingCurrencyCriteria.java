package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("catalogs_product_group_pricing_currency_criteria")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CatalogsProductGroupPricingCurrencyCriteria   {
  private NonNullableCatalogsCurrency currency;
  private Boolean negated = false;
  public enum OperatorEnum {

    GREATER_THAN(String.valueOf("GREATER_THAN")), GREATER_THAN_OR_EQUALS(String.valueOf("GREATER_THAN_OR_EQUALS")), LESS_THAN(String.valueOf("LESS_THAN")), LESS_THAN_OR_EQUALS(String.valueOf("LESS_THAN_OR_EQUALS"));


    private String value;

    OperatorEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static OperatorEnum fromString(String s) {
        for (OperatorEnum b : OperatorEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static OperatorEnum fromValue(String value) {
        for (OperatorEnum b : OperatorEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private OperatorEnum operator;
  private BigDecimal value;

  public CatalogsProductGroupPricingCurrencyCriteria() {
  }

  @JsonCreator
  public CatalogsProductGroupPricingCurrencyCriteria(
    @JsonProperty(required = true, value = "currency") NonNullableCatalogsCurrency currency,
    @JsonProperty(required = true, value = "operator") OperatorEnum operator,
    @JsonProperty(required = true, value = "value") BigDecimal value
  ) {
    this.currency = currency;
    this.operator = operator;
    this.value = value;
  }

  /**
   **/
  public CatalogsProductGroupPricingCurrencyCriteria currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "currency")
  @NotNull public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }

  @JsonProperty(required = true, value = "currency")
  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }

  /**
   **/
  public CatalogsProductGroupPricingCurrencyCriteria negated(Boolean negated) {
    this.negated = negated;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("negated")
  public Boolean getNegated() {
    return negated;
  }

  @JsonProperty("negated")
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }

  /**
   **/
  public CatalogsProductGroupPricingCurrencyCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operator")
  @NotNull public OperatorEnum getOperator() {
    return operator;
  }

  @JsonProperty(required = true, value = "operator")
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  /**
   * minimum: 0
   **/
  public CatalogsProductGroupPricingCurrencyCriteria value(BigDecimal value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "value")
  @NotNull @Valid  @DecimalMin("0")public BigDecimal getValue() {
    return value;
  }

  @JsonProperty(required = true, value = "value")
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
    CatalogsProductGroupPricingCurrencyCriteria catalogsProductGroupPricingCurrencyCriteria = (CatalogsProductGroupPricingCurrencyCriteria) o;
    return Objects.equals(this.currency, catalogsProductGroupPricingCurrencyCriteria.currency) &&
        Objects.equals(this.negated, catalogsProductGroupPricingCurrencyCriteria.negated) &&
        Objects.equals(this.operator, catalogsProductGroupPricingCurrencyCriteria.operator) &&
        Objects.equals(this.value, catalogsProductGroupPricingCurrencyCriteria.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, negated, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupPricingCurrencyCriteria {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

