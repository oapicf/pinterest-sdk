package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupMultipleStringListCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductType1Filter   {
  
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1;

  public ProductType1Filter () {

  }

  public ProductType1Filter (CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }

    
  @JsonProperty("PRODUCT_TYPE_1")
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE1() {
    return PRODUCT_TYPE_1;
  }
  public void setPRODUCTTYPE1(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_1) {
    this.PRODUCT_TYPE_1 = PRODUCT_TYPE_1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType1Filter productType1Filter = (ProductType1Filter) o;
    return Objects.equals(PRODUCT_TYPE_1, productType1Filter.PRODUCT_TYPE_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType1Filter {\n");
    
    sb.append("    PRODUCT_TYPE_1: ").append(toIndentedString(PRODUCT_TYPE_1)).append("\n");
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
