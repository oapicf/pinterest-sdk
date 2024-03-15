package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BulkDownloadResponse  {
  
 /**
  * ID of the bulk request.
  */
  @ApiModelProperty(example = "2680059592705", value = "ID of the bulk request.")
  private String requestId;
 /**
  * ID of the bulk request.
  * @return requestId
  */
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
 public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   */
  public BulkDownloadResponse requestId(String requestId) {
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
    BulkDownloadResponse bulkDownloadResponse = (BulkDownloadResponse) o;
    return Objects.equals(this.requestId, bulkDownloadResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadResponse {\n");
    
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

