package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorDetail;
import org.openapitools.model.RecordCounts;
import org.openapitools.model.UserListOperationType;
import org.openapitools.model.WorkloadState;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomerListUpload
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerListUpload {

  private String adAccountId;

  private Integer creationTime;

  private String customerListId;

  @Valid
  private JsonNullable<List<@Valid ErrorDetail>> errorCounts = JsonNullable.<List<@Valid ErrorDetail>>undefined();

  private String id;

  private UserListOperationType operation;

  private RecordCounts recordCounts;

  private WorkloadState state;

  private Integer updatedTime;

  public CustomerListUpload() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerListUpload(String adAccountId, Integer creationTime, String customerListId, String id, UserListOperationType operation, WorkloadState state, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.creationTime = creationTime;
    this.customerListId = customerListId;
    this.id = id;
    this.operation = operation;
    this.state = state;
    this.updatedTime = updatedTime;
  }

  public CustomerListUpload adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Advertiser ID.
   * @return adAccountId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "9876543210", description = "Advertiser ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
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
   */
  @NotNull 
  @Schema(name = "creation_time", example = "1728606435", description = "Customer List Upload creation_time. Epoch (seconds).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creation_time")
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
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "customer_list_id", example = "59854745824", description = "ID of the customer list associated with this upload.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("customer_list_id")
  public String getCustomerListId() {
    return customerListId;
  }

  public void setCustomerListId(String customerListId) {
    this.customerListId = customerListId;
  }

  public CustomerListUpload errorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = JsonNullable.of(errorCounts);
    return this;
  }

  public CustomerListUpload addErrorCountsItem(ErrorDetail errorCountsItem) {
    if (this.errorCounts == null || !this.errorCounts.isPresent()) {
      this.errorCounts = JsonNullable.of(new ArrayList<>());
    }
    this.errorCounts.get().add(errorCountsItem);
    return this;
  }

  /**
   * Error counts by error code
   * @return errorCounts
   */
  @Valid 
  @Schema(name = "error_counts", example = "[{\"error_code\":42,\"message\":\"Invalid email\",\"count\":20}]", description = "Error counts by error code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_counts")
  public JsonNullable<List<@Valid ErrorDetail>> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(JsonNullable<List<@Valid ErrorDetail>> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUpload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Customer List Upload ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", example = "1234567890", description = "Customer List Upload ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Valid 
  @Schema(name = "operation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("operation")
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
   */
  @Valid 
  @Schema(name = "record_counts", description = "Record processing counts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("record_counts")
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
   */
  @NotNull @Valid 
  @Schema(name = "state", example = "RUNNING", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
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
   */
  @NotNull 
  @Schema(name = "updated_time", example = "1728606435", description = "Customer List Upload updated_time. Epoch (seconds).", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.adAccountId, customerListUpload.adAccountId) &&
        Objects.equals(this.creationTime, customerListUpload.creationTime) &&
        Objects.equals(this.customerListId, customerListUpload.customerListId) &&
        equalsNullable(this.errorCounts, customerListUpload.errorCounts) &&
        Objects.equals(this.id, customerListUpload.id) &&
        Objects.equals(this.operation, customerListUpload.operation) &&
        Objects.equals(this.recordCounts, customerListUpload.recordCounts) &&
        Objects.equals(this.state, customerListUpload.state) &&
        Objects.equals(this.updatedTime, customerListUpload.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, creationTime, customerListId, hashCodeNullable(errorCounts), id, operation, recordCounts, state, updatedTime);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

