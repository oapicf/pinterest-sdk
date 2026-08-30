package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinterestProductCategoriesFilter  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;
 /**
   * Get PINTEREST_PRODUCT_CATEGORIES
   * @return PINTEREST_PRODUCT_CATEGORIES
  **/
  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  @NotNull
  public CatalogsProductGroupMultiplePinterestProductCategoryCriteria getPINTERESTPRODUCTCATEGORIES() {
    return PINTEREST_PRODUCT_CATEGORIES;
  }

  public void setPINTERESTPRODUCTCATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
  }

  public PinterestProductCategoriesFilter PINTEREST_PRODUCT_CATEGORIES(CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES) {
    this.PINTEREST_PRODUCT_CATEGORIES = PINTEREST_PRODUCT_CATEGORIES;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

