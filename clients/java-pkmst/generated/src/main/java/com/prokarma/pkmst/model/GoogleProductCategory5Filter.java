package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CatalogsProductGroupMultipleStringListCriteria;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GoogleProductCategory5Filter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-08T00:31:47.777767Z[Etc/UTC]")
public class GoogleProductCategory5Filter   {
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  public GoogleProductCategory5Filter GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

   /**
   * Get GOOGLE_PRODUCT_CATEGORY_5
   * @return GOOGLE_PRODUCT_CATEGORY_5
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

