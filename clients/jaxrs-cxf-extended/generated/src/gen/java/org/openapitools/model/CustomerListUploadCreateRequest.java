package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListUploadCreateRequest  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private UserListOperationType operation;

 /**
  * Number of parts to upload the file in.
  */
  @ApiModelProperty(example = "2", required = true, value = "Number of parts to upload the file in.")
  private Integer totalParts;
 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public UserListOperationType getOperation() {
    return operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CustomerListUploadCreateRequest operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Number of parts to upload the file in.
  * minimum: 1
  * maximum: 10
  * @return totalParts
  */
  @JsonProperty("total_parts")
  @NotNull
 @Min(1) @Max(10)  public Integer getTotalParts() {
    return totalParts;
  }

  /**
   * Sets the <code>totalParts</code> property.
   */
 public void setTotalParts(Integer totalParts) {
    this.totalParts = totalParts;
  }

  /**
   * Sets the <code>totalParts</code> property.
   */
  public CustomerListUploadCreateRequest totalParts(Integer totalParts) {
    this.totalParts = totalParts;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

