package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CustomerListStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CustomerList
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerList {

  private String adAccountId;

  private BigDecimal createdTime;

  private Object exceptions;

  private String id;

  private Boolean isNca;

  private String name;

  private BigDecimal numBatches;

  private BigDecimal numRemovedUserRecords;

  private BigDecimal numUploadedUserRecords;

  private CustomerListStatus status;

  private String type;

  private BigDecimal updatedTime;

  public CustomerList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomerList(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public CustomerList adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Associated ad account ID.
   * @return adAccountId
   */
  
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, example = "549756359984", description = "Associated ad account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
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
   */
  @Valid 
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, example = "1452208622", description = "Creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
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
   */
  
  @Schema(name = "exceptions", accessMode = Schema.AccessMode.READ_ONLY, description = "Customer list errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
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
   */
  @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "643", description = "Customer list ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  
  @Schema(name = "is_nca", description = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_nca")
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
   */
  @NotNull 
  @Schema(name = "name", example = "The Glengarry Glen Ross leads", description = "Customer list name.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "num_batches", accessMode = Schema.AccessMode.READ_ONLY, example = "2", description = "Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_batches")
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
   */
  @Valid 
  @Schema(name = "num_removed_user_records", accessMode = Schema.AccessMode.READ_ONLY, example = "0", description = "Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_removed_user_records")
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
   */
  @Valid 
  @Schema(name = "num_uploaded_user_records", accessMode = Schema.AccessMode.READ_ONLY, example = "11", description = "Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_uploaded_user_records")
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
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, example = "PROCESSING", description = "Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, example = "customerlist", description = "Always `customerlist`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, example = "1461269616", description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
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
    return Objects.equals(this.adAccountId, customerList.adAccountId) &&
        Objects.equals(this.createdTime, customerList.createdTime) &&
        Objects.equals(this.exceptions, customerList.exceptions) &&
        Objects.equals(this.id, customerList.id) &&
        Objects.equals(this.isNca, customerList.isNca) &&
        Objects.equals(this.name, customerList.name) &&
        Objects.equals(this.numBatches, customerList.numBatches) &&
        Objects.equals(this.numRemovedUserRecords, customerList.numRemovedUserRecords) &&
        Objects.equals(this.numUploadedUserRecords, customerList.numUploadedUserRecords) &&
        Objects.equals(this.status, customerList.status) &&
        Objects.equals(this.type, customerList.type) &&
        Objects.equals(this.updatedTime, customerList.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, createdTime, exceptions, id, isNca, name, numBatches, numRemovedUserRecords, numUploadedUserRecords, status, type, updatedTime);
  }

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

