package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleStringCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BrandFilter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BrandFilter   {
  @JsonProperty("BRAND")
  private CatalogsProductGroupMultipleStringCriteria BRAND;

  public BrandFilter BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  /**
   * Get BRAND
   * @return BRAND
   */
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getBRAND() {
    return BRAND;
  }

  public void setBRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFilter brandFilter = (BrandFilter) o;
    return Objects.equals(this.BRAND, brandFilter.BRAND);
  }

  @Override
  public int hashCode() {
    return Objects.hash(BRAND);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFilter {\n");
    
    sb.append("    BRAND: ").append(toIndentedString(BRAND)).append("\n");
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

