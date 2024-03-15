package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Exception;
import org.openapitools.model.UserListOperationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomerListUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerListUpdateRequest {

  private String records;

  private UserListOperationType operationType;

  private Exception exceptions;

  public CustomerListUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListUpdateRequest(String records, UserListOperationType operationType) {
    this.records = records;
    this.operationType = operationType;
  }

  public CustomerListUpdateRequest records(String records) {
    this.records = records;
    return this;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  */
  @NotNull 
  @Schema(name = "records", example = "email2@pinterest.com,email6@pinterest.com,", description = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("records")
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
  */
  @NotNull @Valid 
  @Schema(name = "operation_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation_type")
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
  */
  @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

