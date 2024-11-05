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
 * GoogleProductCategory4Filter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class GoogleProductCategory4Filter {

  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  public GoogleProductCategory4Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoogleProductCategory4Filter(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  public GoogleProductCategory4Filter GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  /**
   * Get GOOGLE_PRODUCT_CATEGORY_4
   * @return GOOGLE_PRODUCT_CATEGORY_4
   */
  @NotNull @Valid 
  @Schema(name = "GOOGLE_PRODUCT_CATEGORY_4", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory4Filter googleProductCategory4Filter = (GoogleProductCategory4Filter) o;
    return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_4, googleProductCategory4Filter.GOOGLE_PRODUCT_CATEGORY_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory4Filter {\n");
    sb.append("    GOOGLE_PRODUCT_CATEGORY_4: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_4)).append("\n");
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

