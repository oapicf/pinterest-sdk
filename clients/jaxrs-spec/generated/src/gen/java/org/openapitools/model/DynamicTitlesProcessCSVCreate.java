package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("DynamicTitlesProcessCSVCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DynamicTitlesProcessCSVCreate   {
  private String requestId;

  public DynamicTitlesProcessCSVCreate() {
  }

  @JsonCreator
  public DynamicTitlesProcessCSVCreate(
    @JsonProperty(required = true, value = "request_id") String requestId
  ) {
    this.requestId = requestId;
  }

  /**
   * The request_id returned from the GET uploads endpoint.
   **/
  public DynamicTitlesProcessCSVCreate requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The request_id returned from the GET uploads endpoint.")
  @JsonProperty(required = true, value = "request_id")
  @NotNull public String getRequestId() {
    return requestId;
  }

  @JsonProperty(required = true, value = "request_id")
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
