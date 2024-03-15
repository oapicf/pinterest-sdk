package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductGroupPricingCurrencyCriteria   {
  /**
   * Gets or Sets operator
   */
  public enum OperatorEnum {
    GREATER_THAN("GREATER_THAN"),
    
    GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
    
    LESS_THAN("LESS_THAN"),
    
    LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("operator")
  private OperatorEnum operator;

  @JsonProperty("value")
  private BigDecimal value;

  @JsonProperty("currency")
  private NonNullableCatalogsCurrency currency;

  @JsonProperty("negated")
  private Boolean negated = false;

  /**
   **/
  public CatalogsProductGroupPricingCurrencyCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
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
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }

  /**
   **/
  public CatalogsProductGroupPricingCurrencyCriteria currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("currency")
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }
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
  public void setNegated(Boolean negated) {
    this.negated = negated;
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
    return Objects.equals(operator, catalogsProductGroupPricingCurrencyCriteria.operator) &&
        Objects.equals(value, catalogsProductGroupPricingCurrencyCriteria.value) &&
        Objects.equals(currency, catalogsProductGroupPricingCurrencyCriteria.currency) &&
        Objects.equals(negated, catalogsProductGroupPricingCurrencyCriteria.negated);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

