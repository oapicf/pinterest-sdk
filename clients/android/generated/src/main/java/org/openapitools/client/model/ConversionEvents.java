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

import java.util.*;
import org.openapitools.client.model.ConversionEventsDataInner;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A list of events (one or more) encapsulated by a data object.
 **/
@ApiModel(description = "A list of events (one or more) encapsulated by a data object.")
public class ConversionEvents {
  
  @SerializedName("data")
  private List<ConversionEventsDataInner> data = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<ConversionEventsDataInner> getData() {
    return data;
  }
  public void setData(List<ConversionEventsDataInner> data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEvents conversionEvents = (ConversionEvents) o;
    return (this.data == null ? conversionEvents.data == null : this.data.equals(conversionEvents.data));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEvents {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
