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



@JsonTypeName("GoogleProductCategory5Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class GoogleProductCategory5Filter   {
  
  private @Valid CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5;

  /**
   **/
  public GoogleProductCategory5Filter GOOGLE_PRODUCT_CATEGORY_5(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_5) {
    this.GOOGLE_PRODUCT_CATEGORY_5 = GOOGLE_PRODUCT_CATEGORY_5;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return GOOGLE_PRODUCT_CATEGORY_5;
  }

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_5")
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

