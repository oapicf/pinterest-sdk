package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Exception;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CustomerListUpdateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2025-05-10T05:40:54.952063144Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class CustomerListUpdateRequest   {
  private String records;
  private UserListOperationType operationType;
  private Exception exceptions;

  public CustomerListUpdateRequest() {
  }

  @JsonCreator
  public CustomerListUpdateRequest(
    @JsonProperty(required = true, value = "records") String records,
    @JsonProperty(required = true, value = "operation_type") UserListOperationType operationType
  ) {
    this.records = records;
    this.operationType = operationType;
  }

  /**
   * Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.
   **/
  public CustomerListUpdateRequest records(String records) {
    this.records = records;
    return this;
  }

  
  @ApiModelProperty(example = "email2@pinterest.com,email6@pinterest.com,", required = true, value = "Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5.")
  @JsonProperty(required = true, value = "records")
  @NotNull public String getRecords() {
    return records;
  }

  @JsonProperty(required = true, value = "records")
  public void setRecords(String records) {
    this.records = records;
  }

  /**
   **/
  public CustomerListUpdateRequest operationType(UserListOperationType operationType) {
    this.operationType = operationType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation_type")
  @NotNull public UserListOperationType getOperationType() {
    return operationType;
  }

  @JsonProperty(required = true, value = "operation_type")
  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

  /**
   **/
  public CustomerListUpdateRequest exceptions(Exception exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exceptions")
  @Valid public Exception getExceptions() {
    return exceptions;
  }

  @JsonProperty("exceptions")
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

