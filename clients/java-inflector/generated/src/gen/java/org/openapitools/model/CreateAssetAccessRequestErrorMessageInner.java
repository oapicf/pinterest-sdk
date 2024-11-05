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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestErrorMessageInner   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("messages")
  private List<String> messages = null;

  /**
   * Error code associated with the error in requesting asset access.
   **/
  public CreateAssetAccessRequestErrorMessageInner code(Integer code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(example = "2932", value = "Error code associated with the error in requesting asset access.")
  @JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  /**
   **/
  public CreateAssetAccessRequestErrorMessageInner messages(List<String> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(example = "[\"Invalid asset id: 549760723247\",\"Invalid asset id: 546760723248\"]", value = "")
  @JsonProperty("messages")
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
    return Objects.equals(code, createAssetAccessRequestErrorMessageInner.code) &&
        Objects.equals(messages, createAssetAccessRequestErrorMessageInner.messages);
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

