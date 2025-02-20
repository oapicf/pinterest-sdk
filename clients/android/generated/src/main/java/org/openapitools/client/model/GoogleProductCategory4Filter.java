/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.CatalogsProductGroupMultipleStringListCriteria;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class GoogleProductCategory4Filter {
  
  @SerializedName("GOOGLE_PRODUCT_CATEGORY_4")
  private CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY4 = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY4() {
    return gOOGLEPRODUCTCATEGORY4;
  }
  public void setGOOGLEPRODUCTCATEGORY4(CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY4) {
    this.gOOGLEPRODUCTCATEGORY4 = gOOGLEPRODUCTCATEGORY4;
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
    return (this.gOOGLEPRODUCTCATEGORY4 == null ? googleProductCategory4Filter.gOOGLEPRODUCTCATEGORY4 == null : this.gOOGLEPRODUCTCATEGORY4.equals(googleProductCategory4Filter.gOOGLEPRODUCTCATEGORY4));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.gOOGLEPRODUCTCATEGORY4 == null ? 0: this.gOOGLEPRODUCTCATEGORY4.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory4Filter {\n");
    
    sb.append("  gOOGLEPRODUCTCATEGORY4: ").append(gOOGLEPRODUCTCATEGORY4).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
