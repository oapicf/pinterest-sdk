package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserListOperationType;

/**
 * CustomerListUploadCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateRequest   {
  @JsonProperty("operation")
  private UserListOperationType operation;

  @JsonProperty("total_parts")
  private Integer totalParts;

  public CustomerListUploadCreateRequest operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @ApiModelProperty(required = true, value = "")
  public UserListOperationType getOperation() {
    return operation;
  }

  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  public CustomerListUploadCreateRequest totalParts(Integer totalParts) {
    this.totalParts = totalParts;
    return this;
  }

   /**
   * Number of parts to upload the file in.
   * minimum: 1
   * maximum: 10
   * @return totalParts
  **/
  @ApiModelProperty(example = "2", required = true, value = "Number of parts to upload the file in.")
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
    return Objects.equals(this.operation, customerListUploadCreateRequest.operation) &&
        Objects.equals(this.totalParts, customerListUploadCreateRequest.totalParts);
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

