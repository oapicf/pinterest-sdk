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
 * ProductType4Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-01T12:06:55.503075Z[Etc/UTC]")
public class ProductType4Filter   {

  @JsonProperty("PRODUCT_TYPE_4")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4;

  public ProductType4Filter PRODUCT_TYPE_4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_4
   * @return PRODUCT_TYPE_4
  */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_4", required = true)
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE4() {
    return PRODUCT_TYPE_4;
  }

  public void setPRODUCTTYPE4(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_4) {
    this.PRODUCT_TYPE_4 = PRODUCT_TYPE_4;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType4Filter productType4Filter = (ProductType4Filter) o;
    return Objects.equals(this.PRODUCT_TYPE_4, productType4Filter.PRODUCT_TYPE_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType4Filter {\n");
    sb.append("    PRODUCT_TYPE_4: ").append(toIndentedString(PRODUCT_TYPE_4)).append("\n");
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

