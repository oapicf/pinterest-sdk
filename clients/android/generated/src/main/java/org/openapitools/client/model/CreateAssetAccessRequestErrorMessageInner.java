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
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class CreateAssetAccessRequestErrorMessageInner {
  
  @SerializedName("code")
  private Integer code = null;
  @SerializedName("messages")
  private List<String> messages = null;

  /**
   * Error code associated with the error in requesting asset access.
   **/
  @ApiModelProperty(value = "Error code associated with the error in requesting asset access.")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<String> getMessages() {
    return messages;
  }
  public void setMessages(List<String> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestErrorMessageInner createAssetAccessRequestErrorMessageInner = (CreateAssetAccessRequestErrorMessageInner) o;
    return (this.code == null ? createAssetAccessRequestErrorMessageInner.code == null : this.code.equals(createAssetAccessRequestErrorMessageInner.code)) &&
        (this.messages == null ? createAssetAccessRequestErrorMessageInner.messages == null : this.messages.equals(createAssetAccessRequestErrorMessageInner.messages));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.code == null ? 0: this.code.hashCode());
    result = 31 * result + (this.messages == null ? 0: this.messages.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestErrorMessageInner {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  messages: ").append(messages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
