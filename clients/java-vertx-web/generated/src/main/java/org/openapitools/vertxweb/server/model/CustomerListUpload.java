package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ErrorDetail;
import org.openapitools.vertxweb.server.model.RecordCounts;
import org.openapitools.vertxweb.server.model.UserListOperationType;
import org.openapitools.vertxweb.server.model.WorkloadState;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerListUpload   {
  
  private String adAccountId;
  private Integer creationTime;
  private String customerListId;
  private List<ErrorDetail> errorCounts;
  private String id;
  private UserListOperationType operation;
  private RecordCounts recordCounts;
  private WorkloadState state;
  private Integer updatedTime;

  public CustomerListUpload () {

  }

  public CustomerListUpload (String adAccountId, Integer creationTime, String customerListId, List<ErrorDetail> errorCounts, String id, UserListOperationType operation, RecordCounts recordCounts, WorkloadState state, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.creationTime = creationTime;
    this.customerListId = customerListId;
    this.errorCounts = errorCounts;
    this.id = id;
    this.operation = operation;
    this.recordCounts = recordCounts;
    this.state = state;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("creation_time")
  public Integer getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

    
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

    
  @JsonProperty("error_counts")
  public List<ErrorDetail> getErrorCounts() {
    return errorCounts;
  }
  public void setErrorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("operation")
  public UserListOperationType getOperation() {
    return operation;
  }
  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

    
  @JsonProperty("record_counts")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }
  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

    
  @JsonProperty("state")
  public WorkloadState getState() {
    return state;
  }
  public void setState(WorkloadState state) {
    this.state = state;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerListUpload customerListUpload = (CustomerListUpload) o;
    return Objects.equals(adAccountId, customerListUpload.adAccountId) &&
        Objects.equals(creationTime, customerListUpload.creationTime) &&
        Objects.equals(customerListId, customerListUpload.customerListId) &&
        Objects.equals(errorCounts, customerListUpload.errorCounts) &&
        Objects.equals(id, customerListUpload.id) &&
        Objects.equals(operation, customerListUpload.operation) &&
        Objects.equals(recordCounts, customerListUpload.recordCounts) &&
        Objects.equals(state, customerListUpload.state) &&
        Objects.equals(updatedTime, customerListUpload.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, creationTime, customerListId, errorCounts, id, operation, recordCounts, state, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUpload {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    customerListId: ").append(toIndentedString(customerListId)).append("\n");
    sb.append("    errorCounts: ").append(toIndentedString(errorCounts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    recordCounts: ").append(toIndentedString(recordCounts)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
