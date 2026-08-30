package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CustomerListRecordRow;
import org.openapitools.vertxweb.server.model.UserListOperationType;

/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListUpdateWithRequiredBody   {
  
  private UserListOperationType operationType;
  private String records;
  private List<CustomerListRecordRow> recordsV2 = new ArrayList<>();

  public CustomerListUpdateWithRequiredBody () {

  }

  public CustomerListUpdateWithRequiredBody (UserListOperationType operationType, String records, List<CustomerListRecordRow> recordsV2) {
    this.operationType = operationType;
    this.records = records;
    this.recordsV2 = recordsV2;
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

    
  @JsonProperty("records_v2")
  public List<CustomerListRecordRow> getRecordsV2() {
    return recordsV2;
  }
  public void setRecordsV2(List<CustomerListRecordRow> recordsV2) {
    this.recordsV2 = recordsV2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody = (CustomerListUpdateWithRequiredBody) o;
    return Objects.equals(operationType, customerListUpdateWithRequiredBody.operationType) &&
        Objects.equals(records, customerListUpdateWithRequiredBody.records) &&
        Objects.equals(recordsV2, customerListUpdateWithRequiredBody.recordsV2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationType, records, recordsV2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUpdateWithRequiredBody {\n");
    
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    recordsV2: ").append(toIndentedString(recordsV2)).append("\n");
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
