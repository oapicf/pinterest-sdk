package apimodels;

import apimodels.ErrorDetail;
import apimodels.RecordCounts;
import apimodels.UserListOperationType;
import apimodels.WorkloadState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomerListUpload
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUpload   {
  @JsonProperty("ad_account_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("creation_time")
  @NotNull

  private Integer creationTime;

  @JsonProperty("customer_list_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String customerListId;

  @JsonProperty("error_counts")
  @Valid

  private List<@Valid ErrorDetail> errorCounts = null;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("operation")
  @NotNull
@Valid

  private UserListOperationType operation;

  @JsonProperty("record_counts")
  @Valid

  private RecordCounts recordCounts;

  @JsonProperty("state")
  @NotNull
@Valid

  private WorkloadState state;

  @JsonProperty("updated_time")
  @NotNull

  private Integer updatedTime;

  public CustomerListUpload adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Advertiser ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerListUpload creationTime(Integer creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Customer List Upload creation_time. Epoch (seconds).
   * @return creationTime
  **/
  public Integer getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Integer creationTime) {
    this.creationTime = creationTime;
  }

  public CustomerListUpload customerListId(String customerListId) {
    this.customerListId = customerListId;
    return this;
  }

   /**
   * ID of the customer list associated with this upload.
   * @return customerListId
  **/
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  public CustomerListUpload errorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
    return this;
  }

  public CustomerListUpload addErrorCountsItem(ErrorDetail errorCountsItem) {
    if (this.errorCounts == null) {
      this.errorCounts = new ArrayList<>();
    }
    this.errorCounts.add(errorCountsItem);
    return this;
  }

   /**
   * Error counts by error code
   * @return errorCounts
  **/
  public List<@Valid ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUpload id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer List Upload ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerListUpload operation(UserListOperationType operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  public UserListOperationType getOperation() {
    return operation;
  }

  public void setOperation(UserListOperationType operation) {
    this.operation = operation;
  }

  public CustomerListUpload recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

   /**
   * Record processing counts
   * @return recordCounts
  **/
  public RecordCounts getRecordCounts() {
    return recordCounts;
  }

  public void setRecordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
  }

  public CustomerListUpload state(WorkloadState state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  public WorkloadState getState() {
    return state;
  }

  public void setState(WorkloadState state) {
    this.state = state;
  }

  public CustomerListUpload updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Customer List Upload updated_time. Epoch (seconds).
   * @return updatedTime
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

