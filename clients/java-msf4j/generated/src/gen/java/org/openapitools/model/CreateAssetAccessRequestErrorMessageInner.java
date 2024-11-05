package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CreateAssetAccessRequestErrorMessageInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestErrorMessageInner   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("messages")
  private List<String> messages = null;

  public CreateAssetAccessRequestErrorMessageInner code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Error code associated with the error in requesting asset access.
   * @return code
  **/
  @ApiModelProperty(example = "2932", value = "Error code associated with the error in requesting asset access.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public CreateAssetAccessRequestErrorMessageInner messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  public CreateAssetAccessRequestErrorMessageInner addMessagesItem(String messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @ApiModelProperty(example = "[\"Invalid asset id: 549760723247\",\"Invalid asset id: 546760723248\"]", value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

