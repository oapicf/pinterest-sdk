package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CustomerListUpload   {
  
  private String adAccountId;

  private Integer creationTime;

  private String customerListId;

  private List<@Valid ErrorDetail> errorCounts;

  private String id;

  private UserListOperationType operation;

  private RecordCounts recordCounts;


public enum StateEnum {

    @JsonProperty("NOT_STARTED") NOT_STARTED(String.valueOf("NOT_STARTED")), @JsonProperty("RUNNING") RUNNING(String.valueOf("RUNNING")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("SUCCEEDED") SUCCEEDED(String.valueOf("SUCCEEDED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED"));


    private String value;

    StateEnum(String v) {
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

  private StateEnum state;

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
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
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
  @NotNull
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
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCustomerListId() {
    return customerListId;
  }
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }


  /**
   * Error counts by error code
   **/
  public CustomerListUpload errorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", value = "Error counts by error code")
  @JsonProperty("error_counts")
  public List<@Valid ErrorDetail> getErrorCounts() {
    return errorCounts;
  }
  public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUpload addErrorCountsItem(ErrorDetail errorCountsItem) {
    if (this.errorCounts == null) {
      this.errorCounts = new ArrayList<>();
    }
    this.errorCounts.add(errorCountsItem);
    return this;
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
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
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
  @NotNull
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
  @NotNull
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
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

