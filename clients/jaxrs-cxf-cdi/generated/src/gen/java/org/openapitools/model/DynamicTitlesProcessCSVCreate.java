package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create operation model.")
public class DynamicTitlesProcessCSVCreate   {
  
  private String requestId;

  /**
   * The request_id returned from the GET uploads endpoint.
   **/
  public DynamicTitlesProcessCSVCreate requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The request_id returned from the GET uploads endpoint.")
  @JsonProperty("request_id")
  @NotNull
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate = (DynamicTitlesProcessCSVCreate) o;
    return Objects.equals(this.requestId, dynamicTitlesProcessCSVCreate.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicTitlesProcessCSVCreate {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

