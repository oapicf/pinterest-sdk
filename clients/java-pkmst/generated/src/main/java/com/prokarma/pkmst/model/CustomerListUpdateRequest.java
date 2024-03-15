package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Exception;
import com.prokarma.pkmst.model.UserListOperationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CustomerListUpdateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerListUpdateRequest   {
  @JsonProperty("records")
  private String records;

  @JsonProperty("operation_type")
  private UserListOperationType operationType;

  @JsonProperty("exceptions")
  private Exception exceptions;

  public CustomerListUpdateRequest records(String records) {
    this.records = records;
    return this;
  }

   /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   * @return records
  **/
  @ApiModelProperty(example = "email2@pinterest.com,email6@pinterest.com,", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(value = "")
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

