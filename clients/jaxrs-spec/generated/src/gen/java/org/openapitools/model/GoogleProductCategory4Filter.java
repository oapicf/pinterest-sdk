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



@JsonTypeName("GoogleProductCategory4Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class GoogleProductCategory4Filter   {
  
  private @Valid CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4;

  /**
   **/
  public GoogleProductCategory4Filter GOOGLE_PRODUCT_CATEGORY_4(CatalogsProductGroupMultipleStringListCriteria GOOGLE_PRODUCT_CATEGORY_4) {
    this.GOOGLE_PRODUCT_CATEGORY_4 = GOOGLE_PRODUCT_CATEGORY_4;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
  @NotNull
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return GOOGLE_PRODUCT_CATEGORY_4;
  }

  @JsonProperty("GOOGLE_PRODUCT_CATEGORY_4")
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

