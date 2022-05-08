package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-08T00:27:15.493537Z[Etc/UTC]")
public class CurrencyFilter   {
  @JsonProperty("CURRENCY")
  private CatalogsProductGroupCurrencyCriteria CURRENCY;

  /**
   **/
  public CurrencyFilter CURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CURRENCY")
  public CatalogsProductGroupCurrencyCriteria getCURRENCY() {
    return CURRENCY;
  }
  public void setCURRENCY(CatalogsProductGroupCurrencyCriteria CURRENCY) {
    this.CURRENCY = CURRENCY;
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
    return Objects.equals(CURRENCY, currencyFilter.CURRENCY);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

