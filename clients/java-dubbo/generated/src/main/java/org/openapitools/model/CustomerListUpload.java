package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.WorkloadState;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomerListUpload implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Advertiser ID.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * Customer List Upload creation_time. Epoch (seconds).
   */
  @JsonProperty("creation_time")
  private Integer creationTime;

  /**
   * ID of the customer list associated with this upload.
   */
  @JsonProperty("customer_list_id")
  private String customerListId;

  /**
   * Error counts by error code
   */
  @JsonProperty("error_counts")
  private List<ErrorDetail> errorCounts;

  /**
   * Customer List Upload ID.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("operation")
  private UserListOperationType operation;

  /**
   * Record processing counts
   */
  @JsonProperty("record_counts")
  private RecordCounts recordCounts;

  @JsonProperty("state")
  private WorkloadState state;

  /**
   * Customer List Upload updated_time. Epoch (seconds).
   */
  @JsonProperty("updated_time")
  private Integer updatedTime;

  /**
   * Advertiser ID.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Customer List Upload creation_time. Epoch (seconds).
   * @return creationTime
   */
  public Integer getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * ID of the customer list associated with this upload.
   * @return customerListId
   */
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * Error counts by error code
   * @return errorCounts
   */
  public List<ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  /**
   * Customer List Upload ID.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return operation
   */
  public UserListOperationType getOperation() {
    return operation;
  }

  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   * Record processing counts
   * @return recordCounts
   */
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  /**
   * 
   * @return state
   */
  public WorkloadState getState() {
    return state;
  }

  public void setState(WorkloadState state) {
    this.state = state;
  }

  /**
   * Customer List Upload updated_time. Epoch (seconds).
   * @return updatedTime
   */
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
    return Objects.equals(this.adAccountId, customerListUpload.adAccountId) &&
        Objects.equals(this.creationTime, customerListUpload.creationTime) &&
        Objects.equals(this.customerListId, customerListUpload.customerListId) &&
        Objects.equals(this.errorCounts, customerListUpload.errorCounts) &&
        Objects.equals(this.id, customerListUpload.id) &&
        Objects.equals(this.operation, customerListUpload.operation) &&
        Objects.equals(this.recordCounts, customerListUpload.recordCounts) &&
        Objects.equals(this.state, customerListUpload.state) &&
        Objects.equals(this.updatedTime, customerListUpload.updatedTime);
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
