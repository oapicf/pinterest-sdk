package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringListCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GoogleProductCategory2Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class GoogleProductCategory2Filter   {
  
  private @Valid CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2;

  /**
   **/
  public GoogleProductCategory2Filter GOOGLE_PRODUCT_CATEGORY_2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY2() {
    return GOOGLE_PRODUCT_CATEGORY_2;
  }

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_2")
  public void setGOOGLEPRODUCTCATEGORY2(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_2) {
    this.GOOGLE_PRODUCT_CATEGORY_2 = GOOGLE_PRODUCT_CATEGORY_2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProductCategory2Filter googleProductCategory2Filter = (GoogleProductCategory2Filter) o;
    return Objects.equals(this.GOOGLE_PRODUCT_CATEGORY_2, googleProductCategory2Filter.GOOGLE_PRODUCT_CATEGORY_2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GOOGLE_PRODUCT_CATEGORY_2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory2Filter {\n");
    
    sb.append("    GOOGLE_PRODUCT_CATEGORY_2: ").append(toIndentedString(GOOGLE_PRODUCT_CATEGORY_2)).append("\n");
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

