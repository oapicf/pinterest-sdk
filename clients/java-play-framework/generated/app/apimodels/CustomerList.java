package apimodels;

import apimodels.CustomerListStatus;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CustomerList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CustomerList   {
  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("created_time")
  @Valid

  private BigDecimal createdTime;

  @JsonProperty("exceptions")
  
  private Object exceptions;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

  private String id;

  @JsonProperty("is_nca")
  
  private Boolean isNca;

  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("num_batches")
  @Valid

  private BigDecimal numBatches;

  @JsonProperty("num_removed_user_records")
  @Valid

  private BigDecimal numRemovedUserRecords;

  @JsonProperty("num_uploaded_user_records")
  @Valid

  private BigDecimal numUploadedUserRecords;

  @JsonProperty("status")
  @Valid

  private CustomerListStatus status;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("updated_time")
  @Valid

  private BigDecimal updatedTime;

  public CustomerList adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * Associated ad account ID.
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerList createdTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  public BigDecimal getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  public CustomerList exceptions(Object exceptions) {
    this.exceptions = exceptions;
    return this;
  }

   /**
   * Customer list errors.
   * @return exceptions
  **/
  public Object getExceptions() {
    return exceptions;
  }

  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

  public CustomerList id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Customer list ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerList isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

   /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   * @return isNca
  **/
  public Boolean getIsNca() {
    return isNca;
  }

  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  public CustomerList name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customer list name.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerList numBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
    return this;
  }

   /**
   * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
   * @return numBatches
  **/
  public BigDecimal getNumBatches() {
    return numBatches;
  }

  public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

  public CustomerList numRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
    return this;
  }

   /**
   * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
   * @return numRemovedUserRecords
  **/
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }

  public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

  public CustomerList numUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
    return this;
  }

   /**
   * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
   * @return numUploadedUserRecords
  **/
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }

  public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

  public CustomerList status(CustomerListStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
   * @return status
  **/
  public CustomerListStatus getStatus() {
    return status;
  }

  public void setStatus(CustomerListStatus status) {
    this.status = status;
  }

  public CustomerList type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always `customerlist`.
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomerList updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(BigDecimal updatedTime) {
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
    CustomerList customerList = (CustomerList) o;
    return Objects.equals(adAccountId, customerList.adAccountId) &&
        Objects.equals(createdTime, customerList.createdTime) &&
        Objects.equals(exceptions, customerList.exceptions) &&
        Objects.equals(id, customerList.id) &&
        Objects.equals(isNca, customerList.isNca) &&
        Objects.equals(name, customerList.name) &&
        Objects.equals(numBatches, customerList.numBatches) &&
        Objects.equals(numRemovedUserRecords, customerList.numRemovedUserRecords) &&
        Objects.equals(numUploadedUserRecords, customerList.numUploadedUserRecords) &&
        Objects.equals(status, customerList.status) &&
        Objects.equals(type, customerList.type) &&
        Objects.equals(updatedTime, customerList.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, createdTime, exceptions, id, isNca, name, numBatches, numRemovedUserRecords, numUploadedUserRecords, status, type, updatedTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerList {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isNca: ").append(toIndentedString(isNca)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numBatches: ").append(toIndentedString(numBatches)).append("\n");
    sb.append("    numRemovedUserRecords: ").append(toIndentedString(numRemovedUserRecords)).append("\n");
    sb.append("    numUploadedUserRecords: ").append(toIndentedString(numUploadedUserRecords)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

