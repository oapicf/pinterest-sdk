package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * ID of the bulk request.
 **/
@ApiModel(description="ID of the bulk request.")

public class BulkUpsertResponse  {
  
  @ApiModelProperty(example = "549763856477-1660864560-1407e16a-c586-4add-94df-d0b160bec0ff, 549763856477-1660864560-d0b160bec0ff", value = "")
  private String requestId;
 /**
   * Get requestId
   * @return requestId
  **/
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public BulkUpsertResponse requestId(String requestId) {
    this.requestId = requestId;
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
    BulkUpsertResponse bulkUpsertResponse = (BulkUpsertResponse) o;
    return Objects.equals(this.requestId, bulkUpsertResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkUpsertResponse {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

