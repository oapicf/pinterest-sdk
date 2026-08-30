package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ad entities to get in bulk request.
 */
@ApiModel(description="Ad entities to get in bulk request.")

public class BulkDownload  {
  
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
   * <br><em>N.B. <code>requestId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  /**
   * Sets the <code>requestId</code> property.
   * <br><em>N.B. <code>requestId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public BulkDownload requestId(String requestId) {
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
    BulkDownload bulkDownload = (BulkDownload) o;
    return Objects.equals(this.requestId, bulkDownload.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownload {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

