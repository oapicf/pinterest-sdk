package apimodels;

import apimodels.ErrorDetail;
import apimodels.RecordCounts;
import apimodels.UserListOperationType;
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
 * CustomerListUploadResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerListUploadResponse   {
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

  private String id;

  @JsonProperty("operation")
  @NotNull
@Valid

  private UserListOperationType operation;

  @JsonProperty("record_counts")
  @Valid

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

    private final String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("state")
  @NotNull

  private StateEnum state;

  @JsonProperty("updated_time")
  @NotNull

  private Integer updatedTime;

  public CustomerListUploadResponse adAccountId(String adAccountId) {
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

  public CustomerListUploadResponse creationTime(Integer creationTime) {
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

  public CustomerListUploadResponse customerListId(String customerListId) {
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

  public CustomerListUploadResponse errorCounts(List<@Valid ErrorDetail> errorCounts) {
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
  **/
  public List<@Valid ErrorDetail> getErrorCounts() {
    return errorCounts;
  }

  public void setErrorCounts(List<@Valid ErrorDetail> errorCounts) {
    this.errorCounts = errorCounts;
  }

  public CustomerListUploadResponse id(String id) {
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

  public CustomerListUploadResponse operation(UserListOperationType operation) {
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

  public CustomerListUploadResponse recordCounts(RecordCounts recordCounts) {
    this.recordCounts = recordCounts;
    return this;
  }

   /**
   * Get recordCounts
   * @return recordCounts
  **/
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
  **/
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
    CustomerListUploadResponse customerListUploadResponse = (CustomerListUploadResponse) o;
    return Objects.equals(adAccountId, customerListUploadResponse.adAccountId) &&
        Objects.equals(creationTime, customerListUploadResponse.creationTime) &&
        Objects.equals(customerListId, customerListUploadResponse.customerListId) &&
        Objects.equals(errorCounts, customerListUploadResponse.errorCounts) &&
        Objects.equals(id, customerListUploadResponse.id) &&
        Objects.equals(operation, customerListUploadResponse.operation) &&
        Objects.equals(recordCounts, customerListUploadResponse.recordCounts) &&
        Objects.equals(state, customerListUploadResponse.state) &&
        Objects.equals(updatedTime, customerListUploadResponse.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, creationTime, customerListId, errorCounts, id, operation, recordCounts, state, updatedTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

