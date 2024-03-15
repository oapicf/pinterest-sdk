package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GoogleProductCategory5Filter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;
 /**
   * Get GOOGLE_PRODUCT_CATEGORY_5
   * @return GOOGLE_PRODUCT_CATEGORY_5
  **/
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
  }

  public GoogleProductCategory5Filter GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
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
    GoogleProductCategory5Filter googleProductCategory5Filter = (GoogleProductCategory5Filter) o;
    return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_5, googleProductCategory5Filter.GOOGLE_PRODUCT_CATEGORY_5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory5Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_5: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_5)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

