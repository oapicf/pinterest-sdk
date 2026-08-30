package apimodels;

import apimodels.UserListOperationType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomerListUploadCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUploadCreateRequest   {
  @JsonProperty("operation")
  @NotNull
@Valid

  private UserListOperationType operation;

  @JsonProperty("total_parts")
  @NotNull
@Min(1)
@Max(10)

  private Integer totalParts;

  public CustomerListUploadCreateRequest operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

