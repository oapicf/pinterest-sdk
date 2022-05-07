package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupPricingCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MaxPriceFilter   {
  
  private CatalogsProductGroupPricingCriteria MAX_PRICE;

  public MaxPriceFilter () {

  }

  public MaxPriceFilter (CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }

    
  @JsonProperty("MAX_PRICE")
  public CatalogsProductGroupPricingCriteria getMAXPRICE() {
    return MAX_PRICE;
  }
  public void setMAXPRICE(CatalogsProductGroupPricingCriteria MAX_PRICE) {
    this.MAX_PRICE = MAX_PRICE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxPriceFilter maxPriceFilter = (MaxPriceFilter) o;
    return Objects.equals(MAX_PRICE, maxPriceFilter.MAX_PRICE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(MAX_PRICE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxPriceFilter {\n");
    
    sb.append("    MAX_PRICE: ").append(toIndentedString(MAX_PRICE)).append("\n");
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
