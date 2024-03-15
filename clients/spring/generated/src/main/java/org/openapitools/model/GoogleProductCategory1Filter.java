package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoogleProductCategory1Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GoogleProductCategory1Filter {

  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1;

  public GoogleProductCategory1Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoogleProductCategory1Filter(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  public GoogleProductCategory1Filter GOOGLE_PRODUCT_CATEGORY_1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_1
   * @return GOOGLE_PRODUCT_CATEGORY_1
  */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_1")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY1() {
    return GOOGLE_PRODUCT_CATEGORY_1;
  }

  public void setGOOGLEPRODUCTCATEGORY1(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_1) {
    this.GOOGLE_PRODUCT_CATEGORY_1 = GOOGLE_PRODUCT_CATEGORY_1;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory1Filter googleProductCategory1Filter = (GoogleProductCategory1Filter) o;
    return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_1, googleProductCategory1Filter.GOOGLE_PRODUCT_CATEGORY_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory1Filter {\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_1: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_1)).append("\n");
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

