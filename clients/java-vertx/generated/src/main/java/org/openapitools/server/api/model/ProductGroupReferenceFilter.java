package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductGroupReferenceFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

  public ProductGroupReferenceFilter () {

  }

  public ProductGroupReferenceFilter (CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }

    
  @JsonProperty("PRODUCT_GROUP")
  public CatalogsProductGroupMultipleStringCriteria getPRODUCTGROUP() {
    return PRODUCT_GROUP;
  }
  public void setPRODUCTGROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductGroupReferenceFilter productGroupReferenceFilter = (ProductGroupReferenceFilter) o;
    return Objects.equals(PRODUCT_GROUP, productGroupReferenceFilter.PRODUCT_GROUP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_GROUP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupReferenceFilter {\n");
    
    sb.append("    PRODUCT_GROUP: ").append(toIndentedString(PRODUCT_GROUP)).append("\n");
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
