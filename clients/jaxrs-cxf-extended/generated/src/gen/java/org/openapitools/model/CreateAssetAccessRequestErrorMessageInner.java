package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssetAccessRequestErrorMessageInner  {
  
 /**
  * Error code associated with the error in requesting asset access.
  */
  @ApiModelProperty(example = "2932", value = "Error code associated with the error in requesting asset access.")
  private Integer code;

  @ApiModelProperty(example = "[\"Invalid asset id: 549760723247\",\"Invalid asset id: 546760723248\"]", value = "")
  private List<String> messages = new ArrayList<>();
 /**
  * Error code associated with the error in requesting asset access.
  * @return code
  */
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public CreateAssetAccessRequestErrorMessageInner code(Integer code) {
    this.code = code;
    return this;
  }

 /**
  * Get messages
  * @return messages
  */
  @JsonProperty("messages")
  public List<String> getMessages() {
    return messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
 public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
  public CreateAssetAccessRequestErrorMessageInner messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Adds a new item to the <code>messages</code> list.
   */
  public CreateAssetAccessRequestErrorMessageInner addMessagesItem(String messagesItem) {
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
    CreateAssetAccessRequestErrorMessageInner createAssetAccessRequestErrorMessageInner = (CreateAssetAccessRequestErrorMessageInner) o;
    return Objects.equals(this.code, createAssetAccessRequestErrorMessageInner.code) &&
        Objects.equals(this.messages, createAssetAccessRequestErrorMessageInner.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestErrorMessageInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

