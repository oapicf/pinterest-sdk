package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CustomerListUpload   {
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

  /**
   * Advertiser ID.
   **/
  public CustomerListUpload adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "9876543210", required = true, value = "Advertiser ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Customer List Upload creation_time. Epoch (seconds).
   **/
  public CustomerListUpload creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload creation_time. Epoch (seconds).")
  @JsonProperty("creation_time")
  public Integer getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * ID of the customer list associated with this upload.
   **/
  public CustomerListUpload customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  
  @ApiModelProperty(example = "59854745824", required = true, value = "ID of the customer list associated with this upload.")
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * Error counts by error code
   **/
  public CustomerListUpload errorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", value = "Error counts by error code")
  @JsonProperty("error_counts")
  public List<ErrorDetail> getErrorCounts() {
    return errorCounts;
  }
  public void setErrorCounts(List<ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  /**
   * Customer List Upload ID.
   **/
  public CustomerListUpload id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "Customer List Upload ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CustomerListUpload operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("operation")
  public UserListOperationType getOperation() {
    return operation;
  }
  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   **/
  public CustomerListUpload recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("record_counts")
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }
  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  /**
   * Workload processing state
   **/
  public CustomerListUpload state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(example = "RUNNING", required = true, value = "Workload processing state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Customer List Upload updated_time. Epoch (seconds).
   **/
  public CustomerListUpload updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload updated_time. Epoch (seconds).")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

