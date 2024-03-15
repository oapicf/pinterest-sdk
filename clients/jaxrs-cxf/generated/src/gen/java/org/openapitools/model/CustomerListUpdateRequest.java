package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Exception;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListUpdateRequest  {
  
  @ApiModelProperty(example = "email2@pinterest.com,email6@pinterest.com,", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
 /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
  **/
  private String records;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private UserListOperationType operationType;

  @ApiModelProperty(value = "")
  @Valid
  private Exception exceptions;
 /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  **/
  @JsonProperty("records")
  @NotNull
  public String getRecords() {
    return records;
  }

  public void setRecords(String records) {
    this.records = records;
  }

  public CustomerListUpdateRequest records(String records) {
    this.records = records;
    return this;
  }

 /**
   * Get operationType
   * @return operationType
  **/
  @JsonProperty("operation_type")
  @NotNull
  public UserListOperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  public CustomerListUpdateRequest operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

 /**
   * Get exceptions
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public Exception getExceptions() {
    return exceptions;
  }

  public void setExceptions(Exception exceptions) {
    this.exceptions = exceptions;
  }

  public CustomerListUpdateRequest exceptions(Exception exceptions) {
    this.exceptions = exceptions;
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
    CustomerListUpdateRequest customerListUpdateRequest = (CustomerListUpdateRequest) o;
    return Objects.equals(this.records, customerListUpdateRequest.records) &&
        Objects.equals(this.operationType, customerListUpdateRequest.operationType) &&
        Objects.equals(this.exceptions, customerListUpdateRequest.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, operationType, exceptions);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

