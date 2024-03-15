package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CurrencyFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupCurrencyCriteria CURRENCY;
 /**
  * Get CURRENCY
  * @return CURRENCY
  */
  @JsonProperty("CURRENCY")
  @NotNull
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }

  /**
   * Sets the <code>CURRENCY</code> property.
   */
 public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
  }

  /**
   * Sets the <code>CURRENCY</code> property.
   */
  public CurrencyFilter CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
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
    CurrencyFilter currencyFilter = (CurrencyFilter) o;
    return Objects.equals(this.CURRENCY, currencyFilter.CURRENCY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CURRENCY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrencyFilter {\n");
    
    sb.append("    CURRENCY: ").append(toIndentedString(CURRENCY)).append("\n");
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

