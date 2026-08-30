package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinterestProductCategoriesFilter   {
  
  private CatalogsProductGroupMultiplePinterestProductCategoryCriteria PINTEREST_PRODUCT_CATEGORIES;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
  @NotNull
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

