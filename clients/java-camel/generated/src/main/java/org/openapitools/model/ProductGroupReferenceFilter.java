package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductGroupReferenceFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ProductGroupReferenceFilter {

  private CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP;

  public ProductGroupReferenceFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductGroupReferenceFilter(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
  }

  public ProductGroupReferenceFilter PRODUCT_GROUP(CatalogsProductGroupMultipleStringCriteria PRODUCT_GROUP) {
    this.PRODUCT_GROUP = PRODUCT_GROUP;
    return this;
  }

  /**
   * Get PRODUCT_GROUP
   * @return PRODUCT_GROUP
   */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_GROUP", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.PRODUCT_GROUP, productGroupReferenceFilter.PRODUCT_GROUP);
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

