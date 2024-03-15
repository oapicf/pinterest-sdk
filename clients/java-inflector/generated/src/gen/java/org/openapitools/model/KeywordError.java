package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Keyword;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class KeywordError   {
  @JsonProperty("data")
  private Keyword data;

  @JsonProperty("error_messages")
  private List<String> errorMessages = null;

  /**
   **/
  public KeywordError data(Keyword data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public Keyword getData() {
    return data;
  }
  public void setData(Keyword data) {
    this.data = data;
  }

  /**
   **/
  public KeywordError errorMessages(List<String> errorMessages) {
    this.errorMessages = errorMessages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("error_messages")
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
    return Objects.equals(data, keywordError.data) &&
        Objects.equals(errorMessages, keywordError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordError {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
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

