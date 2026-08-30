package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AssetAccessRequestError  {
  
 /**
  * Error code associated with the error in requesting asset access.
  */
  @ApiModelProperty(value = "Error code associated with the error in requesting asset access.")

  private Integer code;

  @ApiModelProperty(value = "")

  private List<String> messages = new ArrayList<>();
 /**
   * Error code associated with the error in requesting asset access.
   * @return code
  **/
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public AssetAccessRequestError code(Integer code) {
    this.code = code;
    return this;
  }

 /**
   * Get messages
   * @return messages
  **/
  @JsonProperty("messages")
  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public AssetAccessRequestError messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public AssetAccessRequestError addMessagesItem(String messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetAccessRequestError assetAccessRequestError = (AssetAccessRequestError) o;
    return Objects.equals(this.code, assetAccessRequestError.code) &&
        Objects.equals(this.messages, assetAccessRequestError.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetAccessRequestError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

