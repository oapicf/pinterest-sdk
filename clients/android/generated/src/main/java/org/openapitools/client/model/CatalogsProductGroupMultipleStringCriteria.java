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

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CatalogsProductGroupMultipleStringCriteria {
  
  @SerializedName("values")
  private List<String> values = null;
  @SerializedName("negated")
  private Boolean negated = false;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getNegated() {
    return negated;
  }
  public void setNegated(Boolean negated) {
    this.negated = negated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsProductGroupMultipleStringCriteria catalogsProductGroupMultipleStringCriteria = (CatalogsProductGroupMultipleStringCriteria) o;
    return (this.values == null ? catalogsProductGroupMultipleStringCriteria.values == null : this.values.equals(catalogsProductGroupMultipleStringCriteria.values)) &&
        (this.negated == null ? catalogsProductGroupMultipleStringCriteria.negated == null : this.negated.equals(catalogsProductGroupMultipleStringCriteria.negated));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.values == null ? 0: this.values.hashCode());
    result = 31 * result + (this.negated == null ? 0: this.negated.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductGroupMultipleStringCriteria {\n");
    
    sb.append("  values: ").append(values).append("\n");
    sb.append("  negated: ").append(negated).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}