package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ErrorDetail;
import com.prokarma.pkmst.model.RecordCounts;
import com.prokarma.pkmst.model.UserListOperationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CustomerListUploadResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CustomerListUploadResponse   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("creation_time")
  private Integer creationTime;

  @JsonProperty("customer_list_id")
  private String customerListId;

  @JsonProperty("error_counts")
  
  private List<ErrorDetail> errorCounts = null;

  @JsonProperty("id")
  private String id;

  @JsonProperty("operation")
  private UserListOperationType operation;

  @JsonProperty("record_counts")
  private RecordCounts recordCounts;

  /**
   * Workload processing state
   */
  public enum StateEnum {
    NOT_STARTED("NOT_STARTED"),
    
    RUNNING("RUNNING"),
    
    PAUSED("PAUSED"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("state")
  private StateEnum state;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  public CustomerListUploadResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID.
   * @return adAccountId
   */
  @ApiModelProperty(example = "9876543210", required = true, value = "Advertiser ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerListUploadResponse creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  /**
   * Customer List Upload creation_time. Epoch (seconds).
   * @return creationTime
   */
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload creation_time. Epoch (seconds).")
  public Integer getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  public CustomerListUploadResponse customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  /**
   * ID of the customer list associated with this upload.
   * @return customerListId
   */
  @ApiModelProperty(example = "59854745824", required = true, value = "ID of the customer list associated with this upload.")
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  public CustomerListUploadResponse errorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  public CustomerListUploadResponse addErrorCountsItem(ErrorDetail errorCountsItem) {
    if (this.errorCounts == null) {
      this.errorCounts = new ArrayList<>();
    }
    this.errorCounts.add(errorCountsItem);
    return this;
  }

  /**
   * Error counts by error code
   * @return errorCounts
   */
  @ApiModelProperty(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", value = "Error counts by error code")
  public List<ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUploadResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Customer List Upload ID.
   * @return id
   */
  @ApiModelProperty(example = "1234567890", required = true, value = "Customer List Upload ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerListUploadResponse operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Get operation
   * @return operation
   */
  @ApiModelProperty(required = true, value = "")
  public UserListOperationType getOperation() {
    return operation;
  }

  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  public CustomerListUploadResponse recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

  /**
   * Get recordCounts
   * @return recordCounts
   */
  @ApiModelProperty(value = "")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  public CustomerListUploadResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Workload processing state
   * @return state
   */
  @ApiModelProperty(example = "RUNNING", required = true, value = "Workload processing state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public CustomerListUploadResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Customer List Upload updated_time. Epoch (seconds).
   * @return updatedTime
   */
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload updated_time. Epoch (seconds).")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

