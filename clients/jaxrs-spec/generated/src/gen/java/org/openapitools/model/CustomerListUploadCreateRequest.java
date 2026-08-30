package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CustomerListUploadCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUploadCreateRequest   {
  private UserListOperationType operation;
  private Integer totalParts;

  public CustomerListUploadCreateRequest() {
  }

  @JsonCreator
  public CustomerListUploadCreateRequest(
    @JsonProperty(required = true, value = "operation") UserListOperationType operation,
    @JsonProperty(required = true, value = "total_parts") Integer totalParts
  ) {
    this.operation = operation;
    this.totalParts = totalParts;
  }

  /**
   **/
  public CustomerListUploadCreateRequest operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public UserListOperationType getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   * Number of parts to upload the file in.
   * minimum: 1
   * maximum: 10
   **/
  public CustomerListUploadCreateRequest totalParts(Integer totalParts) {
    this.totalParts = totalParts;
    return this;
  }

  
  @ApiModelProperty(example = "2", required = true, value = "Number of parts to upload the file in.")
  @JsonProperty(required = true, value = "total_parts")
  @NotNull  @Min(1) @Max(10)public Integer getTotalParts() {
    return totalParts;
  }

  @JsonProperty(required = true, value = "total_parts")
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
