package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LabelErrorData;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LabelError   {
  @JsonProperty("data")
  private LabelErrorData data;

  @JsonProperty("error_messages")
  private List<String> errorMessages = null;

  /**
   **/
  public LabelError data(LabelErrorData data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("data")
  public LabelErrorData getData() {
    return data;
  }
  public void setData(LabelErrorData data) {
    this.data = data;
  }

  /**
   **/
  public LabelError errorMessages(List<String> errorMessages) {
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
    LabelError labelError = (LabelError) o;
    return Objects.equals(data, labelError.data) &&
        Objects.equals(errorMessages, labelError.errorMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errorMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelError {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

