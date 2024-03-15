package apimodels;

import apimodels.Exception;
import apimodels.UserListOperationType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomerListUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUpdateRequest   {
  @JsonProperty("records")
  @NotNull

  private String records;

  @JsonProperty("operation_type")
  @NotNull
@Valid

  private UserListOperationType operationType;

  @JsonProperty("exceptions")
  @Valid

  private Exception exceptions;

  public CustomerListUpdateRequest records(String records) {
    this.records = records;
    return this;
  }

   /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  **/
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public CustomerListUpdateRequest operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  public UserListOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  public CustomerListUpdateRequest exceptions(Exception exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Get exceptions
   * @return exceptions
  **/
  public Exception getExceptions() {
    return exceptions;
  }

  public void setExceptions(Exception exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListUpdateRequest customerListUpdateRequest = (CustomerListUpdateRequest) o;
    return Objects.equals(records, customerListUpdateRequest.records) &&
        Objects.equals(operationType, customerListUpdateRequest.operationType) &&
        Objects.equals(exceptions, customerListUpdateRequest.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, operationType, exceptions);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUpdateRequest {\n");
    
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

