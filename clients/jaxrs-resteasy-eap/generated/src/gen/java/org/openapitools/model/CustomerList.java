package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CustomerListStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerList   {
  
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

  /**
   * Associated ad account ID.
   **/
  
  @ApiModelProperty(example = "549756359984", value = "Associated ad account ID.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Creation time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1452208622", value = "Creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Customer list errors.
   **/
  
  @ApiModelProperty(value = "Customer list errors.")
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }
  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Customer list ID.
   **/
  
  @ApiModelProperty(example = "643", required = true, value = "Customer list ID.")
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   **/
  
  @ApiModelProperty(value = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.")
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }
  public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  /**
   * Customer list name.
   **/
  
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
   **/
  
  @ApiModelProperty(example = "2", value = "Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.")
  @JsonProperty("num_batches")
  public BigDecimal getNumBatches() {
    return numBatches;
  }
  public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

  /**
   * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
   **/
  
  @ApiModelProperty(example = "0", value = "Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.")
  @JsonProperty("num_removed_user_records")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }
  public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

  /**
   * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
   **/
  
  @ApiModelProperty(example = "11", value = "Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.")
  @JsonProperty("num_uploaded_user_records")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }
  public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

  /**
   * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
   **/
  
  @ApiModelProperty(example = "PROCESSING", value = "Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.")
  @JsonProperty("status")
  public CustomerListStatus getStatus() {
    return status;
  }
  public void setStatus(CustomerListStatus status) {
    this.status = status;
  }

  /**
   * Always &#x60;customerlist&#x60;.
   **/
  
  @ApiModelProperty(example = "customerlist", value = "Always `customerlist`.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1461269616", value = "Last update time. Unix timestamp in seconds.")
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

