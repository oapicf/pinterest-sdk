package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class PinterestProductCategoriesFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

  /**
   * 
   * @return PINTEREST_PRODUCT_CATEGORIES
   */
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
    return PINTEREST_PRODUCT_CATEGORIES;
  }

  public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinterestProductCategoriesFilter pinterestProductCategoriesFilter = (PinterestProductCategoriesFilter) o;
    return Objects.equals(this.PINTEREST_PRODUCT_CATEGORIES, pinterestProductCategoriesFilter.PINTEREST_PRODUCT_CATEGORIES);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PINTEREST_PRODUCT_CATEGORIES);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinterestProductCategoriesFilter {\n");
    
    sb.append("    PINTEREST_PRODUCT_CATEGORIES: ").append(toIndentedString(PINTEREST_PRODUCT_CATEGORIES)).append("\n");
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
