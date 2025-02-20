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

import org.openapitools.client.model.CatalogsProductGroupMultipleStringCriteria;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CustomLabel4Filter {
  
  @SerializedName("CUSTOM_LABEL_4")
  private CatalogsProductGroupMultipleStringCriteria cUSTOMLABEL4 = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return cUSTOMLABEL4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria cUSTOMLABEL4) {
    this.cUSTOMLABEL4 = cUSTOMLABEL4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel4Filter customLabel4Filter = (CustomLabel4Filter) o;
    return (this.cUSTOMLABEL4 == null ? customLabel4Filter.cUSTOMLABEL4 == null : this.cUSTOMLABEL4.equals(customLabel4Filter.cUSTOMLABEL4));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.cUSTOMLABEL4 == null ? 0: this.cUSTOMLABEL4.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel4Filter {\n");
    
    sb.append("  cUSTOMLABEL4: ").append(cUSTOMLABEL4).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
