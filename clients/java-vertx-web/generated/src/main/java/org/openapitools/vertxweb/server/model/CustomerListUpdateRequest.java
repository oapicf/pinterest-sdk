package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.UserListOperationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListUpdateRequest   {
  
  private UserListOperationType operationType;
  private String records;

  public CustomerListUpdateRequest () {

  }

  public CustomerListUpdateRequest (UserListOperationType operationType, String records) {
    this.operationType = operationType;
    this.records = records;
  }

    
  @JsonProperty("operation_type")
  public UserListOperationType getOperationType() {
    return operationType;
  }
  public void setOperationType(UserListOperationType operationType) {
    this.operationType = operationType;
  }

    
  @JsonProperty("records")
  public String getRecords() {
    return records;
  }
  public void setRecords(String records) {
    this.records = records;
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
    return Objects.equals(operationType, customerListUpdateRequest.operationType) &&
        Objects.equals(records, customerListUpdateRequest.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUpdateRequest {\n");
    
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
