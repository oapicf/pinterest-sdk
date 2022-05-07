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
 * ProductType2Filter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class ProductType2Filter   {

  @JsonProperty("PRODUCT_TYPE_2")
  private CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2;

  public ProductType2Filter PRODUCT_TYPE_2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
    return this;
  }

  /**
   * Get PRODUCT_TYPE_2
   * @return PRODUCT_TYPE_2
  */
  @NotNull @Valid 
  @Schema(name = "PRODUCT_TYPE_2", required = true)
  public CatalogsProductGroupMultipleStringListCriteria getPRODUCTTYPE2() {
    return PRODUCT_TYPE_2;
  }

  public void setPRODUCTTYPE2(CatalogsProductGroupMultipleStringListCriteria PRODUCT_TYPE_2) {
    this.PRODUCT_TYPE_2 = PRODUCT_TYPE_2;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductType2Filter productType2Filter = (ProductType2Filter) o;
    return Objects.equals(this.PRODUCT_TYPE_2, productType2Filter.PRODUCT_TYPE_2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PRODUCT_TYPE_2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductType2Filter {\n");
    sb.append("    PRODUCT_TYPE_2: ").append(toIndentedString(PRODUCT_TYPE_2)).append("\n");
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

