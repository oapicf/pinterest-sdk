package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.NonNullableCatalogsCurrency;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsProductGroupPricingCurrencyCriteria   {
  


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
      return value;
    }
  }

  private OperatorEnum operator;
  private BigDecimal value;
  private NonNullableCatalogsCurrency currency;
  private Boolean negated = false;

  public CatalogsProductGroupPricingCurrencyCriteria () {

  }

  public CatalogsProductGroupPricingCurrencyCriteria (OperatorEnum operator, BigDecimal value, NonNullableCatalogsCurrency currency, Boolean negated) {
    this.operator = operator;
    this.value = value;
    this.currency = currency;
    this.negated = negated;
  }

    
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

    
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
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
