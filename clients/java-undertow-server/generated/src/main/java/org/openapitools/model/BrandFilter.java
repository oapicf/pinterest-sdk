/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BrandFilter   {
  
  private CatalogsProductGroupMultipleStringCriteria BRAND;

  /**
   */
  public BrandFilter BRAND(CatalogsProductGroupMultipleStringCriteria BRAND) {
    this.BRAND = BRAND;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("BRAND")
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
    return Objects.equals(BRAND, brandFilter.BRAND);
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
