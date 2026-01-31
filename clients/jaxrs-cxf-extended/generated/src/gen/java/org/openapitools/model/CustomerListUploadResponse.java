package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private List<@Valid ErrorDetail> errorCounts;

 /**
  * Customer List Upload ID.
  */
  @ApiModelProperty(example = "1234567890", required = true, value = "Customer List Upload ID.")
  private String id;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private UserListOperationType operation;

  @ApiModelProperty(value = "")
  @Valid
  private RecordCounts recordCounts;

public enum StateEnum {

    @JsonProperty("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")),
    @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")),
    @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")),
    @JsonProperty("SUCCEEDED") SUCCEEDED(String.valueOf("SUCCEEDED")),
    @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));

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
  */
  @JsonProperty("ad_account_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public CustomerListUploadResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Customer List Upload creation_time. Epoch (seconds).
  * @return creationTime
  */
  @JsonProperty("creation_time")
  @NotNull
  public Integer getCreationTime() {
    return creationTime;
  }

  /**
   * Sets the <code>creationTime</code> property.
   */
 public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * Sets the <code>creationTime</code> property.
   */
  public CustomerListUploadResponse creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

 /**
  * ID of the customer list associated with this upload.
  * @return customerListId
  */
  @JsonProperty("customer_list_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }

  /**
   * Sets the <code>customerListId</code> property.
   */
 public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * Sets the <code>customerListId</code> property.
   */
  public CustomerListUploadResponse customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

 /**
  * Error counts by error code
  * @return errorCounts
  */
  @JsonProperty("error_counts")
  public List<@Valid ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  /**
   * Sets the <code>errorCounts</code> property.
   */
 public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  /**
   * Sets the <code>errorCounts</code> property.
   */
  public CustomerListUploadResponse errorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  /**
   * Adds a new item to the <code>errorCounts</code> list.
   */
  public CustomerListUploadResponse addErrorCountsItem(ErrorDetail errorCountsItem) {
    this.errorCounts.add(errorCountsItem);
    return this;
  }

 /**
  * Customer List Upload ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CustomerListUploadResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get operation
  * @return operation
  */
  @JsonProperty("operation")
  @NotNull
  public UserListOperationType getOperation() {
    return operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
 public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   * Sets the <code>operation</code> property.
   */
  public CustomerListUploadResponse operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

 /**
  * Get recordCounts
  * @return recordCounts
  */
  @JsonProperty("record_counts")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  /**
   * Sets the <code>recordCounts</code> property.
   */
 public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  /**
   * Sets the <code>recordCounts</code> property.
   */
  public CustomerListUploadResponse recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

 /**
  * Workload processing state
  * @return state
  */
  @JsonProperty("state")
  @NotNull
  public String getState() {
    return state == null ? null : state.value();
  }

  /**
   * Sets the <code>state</code> property.
   */
 public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Sets the <code>state</code> property.
   */
  public CustomerListUploadResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

 /**
  * Customer List Upload updated_time. Epoch (seconds).
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  @NotNull
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
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

