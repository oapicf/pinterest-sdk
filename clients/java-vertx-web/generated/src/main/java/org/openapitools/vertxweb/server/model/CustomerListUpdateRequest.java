package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Exception;
import org.openapitools.vertxweb.server.model.UserListOperationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListUpdateRequest   {
  
  private String records;
  private UserListOperationType operationType;
  private Exception exceptions;

  public CustomerListUpdateRequest () {

  }

  public CustomerListUpdateRequest (String records, UserListOperationType operationType, Exception exceptions) {
    this.records = records;
    this.operationType = operationType;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
  }

    
  @JsonProperty("operation_type")
  public UserListOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

    
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
    return Objects.equals(records, customerListUpdateRequest.records) &&
        Objects.equals(operationType, customerListUpdateRequest.operationType) &&
        Objects.equals(exceptions, customerListUpdateRequest.exceptions);
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
