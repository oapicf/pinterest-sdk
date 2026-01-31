package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CustomerListUploadResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CustomerListUploadResponse   {
  private String adAccountId;
  private Integer creationTime;
  private String customerListId;
  private @Valid List<@Valid ErrorDetail> errorCounts;
  private String id;
  private UserListOperationType operation;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StateEnum fromString(String s) {
        for (StateEnum b : StateEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  public CustomerListUploadResponse() {
  }

  @JsonCreator
  public CustomerListUploadResponse(
    @JsonProperty(required = true, value = "ad_account_id") String adAccountId,
    @JsonProperty(required = true, value = "creation_time") Integer creationTime,
    @JsonProperty(required = true, value = "customer_list_id") String customerListId,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "operation") UserListOperationType operation,
    @JsonProperty(required = true, value = "state") StateEnum state,
    @JsonProperty(required = true, value = "updated_time") Integer updatedTime
  ) {
    this.adAccountId = adAccountId;
    this.creationTime = creationTime;
    this.customerListId = customerListId;
    this.id = id;
    this.operation = operation;
    this.state = state;
    this.updatedTime = updatedTime;
  }

  /**
   * Advertiser ID.
   **/
  public CustomerListUploadResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "9876543210", required = true, value = "Advertiser ID.")
  @JsonProperty(required = true, value = "ad_account_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty(required = true, value = "ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Customer List Upload creation_time. Epoch (seconds).
   **/
  public CustomerListUploadResponse creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload creation_time. Epoch (seconds).")
  @JsonProperty(required = true, value = "creation_time")
  @NotNull public Integer getCreationTime() {
    return creationTime;
  }

  @JsonProperty(required = true, value = "creation_time")
  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  /**
   * ID of the customer list associated with this upload.
   **/
  public CustomerListUploadResponse customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

  
  @ApiModelProperty(example = "59854745824", required = true, value = "ID of the customer list associated with this upload.")
  @JsonProperty(required = true, value = "customer_list_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCustomerListId() {
    return customerListId;
  }

  @JsonProperty(required = true, value = "customer_list_id")
  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  /**
   * Error counts by error code
   **/
  public CustomerListUploadResponse errorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", value = "Error counts by error code")
  @JsonProperty("error_counts")
  @Valid public List<@Valid ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  @JsonProperty("error_counts")
  public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUploadResponse addErrorCountsItem(ErrorDetail errorCountsItem) {
    if (this.errorCounts == null) {
      this.errorCounts = new ArrayList<>();
    }

    this.errorCounts.add(errorCountsItem);
    return this;
  }

  public CustomerListUploadResponse removeErrorCountsItem(ErrorDetail errorCountsItem) {
    if (errorCountsItem != null && this.errorCounts != null) {
      this.errorCounts.remove(errorCountsItem);
    }

    return this;
  }
  /**
   * Customer List Upload ID.
   **/
  public CustomerListUploadResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "Customer List Upload ID.")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public CustomerListUploadResponse operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "operation")
  @NotNull public UserListOperationType getOperation() {
    return operation;
  }

  @JsonProperty(required = true, value = "operation")
  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  /**
   **/
  public CustomerListUploadResponse recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("record_counts")
  @Valid public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  @JsonProperty("record_counts")
  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  /**
   * Workload processing state
   **/
  public CustomerListUploadResponse state(StateEnum state) {
    this.state = state;
    return this;
  }

  
  @ApiModelProperty(example = "RUNNING", required = true, value = "Workload processing state")
  @JsonProperty(required = true, value = "state")
  @NotNull public StateEnum getState() {
    return state;
  }

  @JsonProperty(required = true, value = "state")
  public void setState(StateEnum state) {
    this.state = state;
  }

  /**
   * Customer List Upload updated_time. Epoch (seconds).
   **/
  public CustomerListUploadResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1728606435", required = true, value = "Customer List Upload updated_time. Epoch (seconds).")
  @JsonProperty(required = true, value = "updated_time")
  @NotNull public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty(required = true, value = "updated_time")
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

