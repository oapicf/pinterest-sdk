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
import org.openapitools.client.model.Keyword;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class KeywordError {
  
  @SerializedName("data")
  private Keyword data = null;
  @SerializedName("error_messages")
  private List<String> errorMessages = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Keyword getData() {
    return data;
  }
  public void setData(Keyword data) {
    this.data = data;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getErrorMessages() {
    return errorMessages;
  }
  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordError keywordError = (KeywordError) o;
    return (this.data == null ? keywordError.data == null : this.data.equals(keywordError.data)) &&
        (this.errorMessages == null ? keywordError.errorMessages == null : this.errorMessages.equals(keywordError.errorMessages));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.data == null ? 0: this.data.hashCode());
    result = 31 * result + (this.errorMessages == null ? 0: this.errorMessages.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordError {\n");
    
    sb.append("  data: ").append(data).append("\n");
    sb.append("  errorMessages: ").append(errorMessages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
