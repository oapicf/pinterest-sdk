package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.WorkloadState;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListUpload  {
  
 /**
  * Advertiser ID.
  */
  @ApiModelProperty(example = "9876543210", required = true, value = "Advertiser ID.")

  private String adAccountId;

 /**
  * Customer List Upload creation_time. Epoch (seconds).
  */
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload creation_time. Epoch (seconds).")

  private Integer creationTime;

 /**
  * ID of the customer list associated with this upload.
  */
  @ApiModelProperty(example = "59854745824", required = true, value = "ID of the customer list associated with this upload.")

  private String customerListId;

 /**
  * Error counts by error code
  */
  @ApiModelProperty(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", value = "Error counts by error code")

  private List<ErrorDetail> errorCounts;

 /**
  * Customer List Upload ID.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "Customer List Upload ID.")

  private String id;

  @ApiModelProperty(required = true, value = "")

  private UserListOperationType operation;

 /**
  * Record processing counts
  */
  @ApiModelProperty(value = "Record processing counts")

  private RecordCounts recordCounts;

  @ApiModelProperty(example = "RUNNING", required = true, value = "")

  private WorkloadState state;

 /**
  * Customer List Upload updated_time. Epoch (seconds).
  */
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload updated_time. Epoch (seconds).")

  private Integer updatedTime;
 /**
   * Advertiser ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerListUpload adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Customer List Upload creation_time. Epoch (seconds).
   * @return creationTime
  **/
  @JsonProperty("creation_time")
  public Integer getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  public CustomerListUpload creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

 /**
   * ID of the customer list associated with this upload.
   * @return customerListId
  **/
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  public CustomerListUpload customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

 /**
   * Error counts by error code
   * @return errorCounts
  **/
  @JsonProperty("error_counts")
  public List<ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUpload errorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  public CustomerListUpload addErrorCountsItem(ErrorDetail errorCountsItem) {
    this.errorCounts.add(errorCountsItem);
    return this;
  }

 /**
   * Customer List Upload ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerListUpload id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get operation
   * @return operation
  **/
  @JsonProperty("operation")
  public UserListOperationType getOperation() {
    return operation;
  }

  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  public CustomerListUpload operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Record processing counts
   * @return recordCounts
  **/
  @JsonProperty("record_counts")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  public CustomerListUpload recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

 /**
   * Get state
   * @return state
  **/
  @JsonProperty("state")
  public WorkloadState getState() {
    return state;
  }

  public void setState(WorkloadState state) {
    this.state = state;
  }

  public CustomerListUpload state(WorkloadState state) {
    this.state = state;
    return this;
  }

 /**
   * Customer List Upload updated_time. Epoch (seconds).
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CustomerListUpload updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

