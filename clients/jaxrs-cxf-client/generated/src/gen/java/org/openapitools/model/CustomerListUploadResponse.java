package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerListUploadResponse  {
  
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

  @ApiModelProperty(value = "")

  private RecordCounts recordCounts;

public enum StateEnum {

NOT_STARTED(String.valueOf("NOT_STARTED")), RUNNING(String.valueOf("RUNNING")), PAUSED(String.valueOf("PAUSED")), SUCCEEDED(String.valueOf("SUCCEEDED")), FAILED(String.valueOf("FAILED"));


    private String value;

    StateEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
        for (StateEnum b : StateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Workload processing state
  */
  @ApiModelProperty(example = "RUNNING", required = true, value = "Workload processing state")

  private StateEnum state;

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

  public CustomerListUploadResponse adAccountId(String adAccountId) {
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

  public CustomerListUploadResponse creationTime(Integer creationTime) {
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

  public CustomerListUploadResponse customerListId(String customerListId) {
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

  public CustomerListUploadResponse errorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  public CustomerListUploadResponse addErrorCountsItem(ErrorDetail errorCountsItem) {
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

  public CustomerListUploadResponse id(String id) {
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

  public CustomerListUploadResponse operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

 /**
   * Get recordCounts
   * @return recordCounts
  **/
  @JsonProperty("record_counts")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  public CustomerListUploadResponse recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

 /**
   * Workload processing state
   * @return state
  **/
  @JsonProperty("state")
  public String getState() {
    if (state == null) {
      return null;
    }
    return state.value();
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CustomerListUploadResponse state(StateEnum state) {
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

  public CustomerListUploadResponse updatedTime(Integer updatedTime) {
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
    CustomerListUploadResponse customerListUploadResponse = (CustomerListUploadResponse) o;
    return Objects.equals(this.adAccountId, customerListUploadResponse.adAccountId) &&
        Objects.equals(this.creationTime, customerListUploadResponse.creationTime) &&
        Objects.equals(this.customerListId, customerListUploadResponse.customerListId) &&
        Objects.equals(this.errorCounts, customerListUploadResponse.errorCounts) &&
        Objects.equals(this.id, customerListUploadResponse.id) &&
        Objects.equals(this.operation, customerListUploadResponse.operation) &&
        Objects.equals(this.recordCounts, customerListUploadResponse.recordCounts) &&
        Objects.equals(this.state, customerListUploadResponse.state) &&
        Objects.equals(this.updatedTime, customerListUploadResponse.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, creationTime, customerListId, errorCounts, id, operation, recordCounts, state, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerListUploadResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

