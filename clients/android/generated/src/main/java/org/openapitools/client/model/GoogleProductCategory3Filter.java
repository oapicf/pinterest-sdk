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
public class GoogleProductCategory3Filter {
  
  @SerializedName("GOOGLE_PRODUCT_CATEGORY_3")
  private CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY3 = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY3() {
    return gOOGLEPRODUCTCATEGORY3;
  }
  public void setGOOGLEPRODUCTCATEGORY3(CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY3) {
    this.gOOGLEPRODUCTCATEGORY3 = gOOGLEPRODUCTCATEGORY3;
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
    return (this.gOOGLEPRODUCTCATEGORY3 == null ? googleProductCategory3Filter.gOOGLEPRODUCTCATEGORY3 == null : this.gOOGLEPRODUCTCATEGORY3.equals(googleProductCategory3Filter.gOOGLEPRODUCTCATEGORY3));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.gOOGLEPRODUCTCATEGORY3 == null ? 0: this.gOOGLEPRODUCTCATEGORY3.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory3Filter {\n");
    
    sb.append("  gOOGLEPRODUCTCATEGORY3: ").append(gOOGLEPRODUCTCATEGORY3).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
