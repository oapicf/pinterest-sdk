/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
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
public class GoogleProductCategory5Filter {
  
  @SerializedName("GOOGLE_PRODUCT_CATEGORY_5")
  private CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY5 = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringListCriteria getGOOGLEPRODUCTCATEGORY5() {
    return gOOGLEPRODUCTCATEGORY5;
  }
  public void setGOOGLEPRODUCTCATEGORY5(CatalogsProductGroupMultipleStringListCriteria gOOGLEPRODUCTCATEGORY5) {
    this.gOOGLEPRODUCTCATEGORY5 = gOOGLEPRODUCTCATEGORY5;
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
    return (this.gOOGLEPRODUCTCATEGORY5 == null ? googleProductCategory5Filter.gOOGLEPRODUCTCATEGORY5 == null : this.gOOGLEPRODUCTCATEGORY5.equals(googleProductCategory5Filter.gOOGLEPRODUCTCATEGORY5));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.gOOGLEPRODUCTCATEGORY5 == null ? 0: this.gOOGLEPRODUCTCATEGORY5.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProductCategory5Filter {\n");
    
    sb.append("  gOOGLEPRODUCTCATEGORY5: ").append(gOOGLEPRODUCTCATEGORY5).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}