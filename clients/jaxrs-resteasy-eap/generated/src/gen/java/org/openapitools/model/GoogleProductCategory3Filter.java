package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-08T00:33:44.584572Z[Etc/UTC]")
public class GoogleProductCategory3Filter   {
  

  private CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_3")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return GOOGLE_PRODUCT_CATEGORY_3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_3) {
    this.GOOGLE_PRODUCT_CATEGORY_3 = GOOGLE_PRODUCT_CATEGORY_3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory3Filter googleProductCategory3Filter = (GoogleProductCategory3Filter) o;
    return Objects.equals(GOOGLE_PRODUCT_CATEGORY_3, googleProductCategory3Filter.GOOGLE_PRODUCT_CATEGORY_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory3Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_3: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_3)).append("\n");
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

