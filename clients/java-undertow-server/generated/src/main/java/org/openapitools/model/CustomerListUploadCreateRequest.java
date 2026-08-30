/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserListOperationType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateRequest   {
  
  private UserListOperationType operation;
  private Integer totalParts;

  /**
   */
  public CustomerListUploadCreateRequest operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public UserListOperationType getOperation() {
    return operation;
  }
  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   * Number of parts to upload the file in.
   * minimum: 1
   * maximum: 10
   */
  public CustomerListUploadCreateRequest totalParts(Integer totalParts) {
    this.totalParts = totalParts;
    return this;
  }

  
  @ApiModelProperty(example = "2", required = true, value = "Number of parts to upload the file in.")
  @JsonProperty("total_parts")
  public Integer getTotalParts() {
    return totalParts;
  }
  public void setTotalParts(Integer totalParts) {
    this.totalParts = totalParts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListUploadCreateRequest customerListUploadCreateRequest = (CustomerListUploadCreateRequest) o;
    return Objects.equals(operation, customerListUploadCreateRequest.operation) &&
        Objects.equals(totalParts, customerListUploadCreateRequest.totalParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, totalParts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUploadCreateRequest {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    totalParts: ").append(toIndentedString(totalParts)).append("\n");
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

