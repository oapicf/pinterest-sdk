package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CustomerListStatus;

/**
 * CustomerList
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerList   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("created_time")
  private BigDecimal createdTime;

  @JsonProperty("exceptions")
  private Object exceptions;

  @JsonProperty("id")
  private String id;

  @JsonProperty("is_nca")
  private Boolean isNca;

  @JsonProperty("name")
  private String name;

  @JsonProperty("num_batches")
  private BigDecimal numBatches;

  @JsonProperty("num_removed_user_records")
  private BigDecimal numRemovedUserRecords;

  @JsonProperty("num_uploaded_user_records")
  private BigDecimal numUploadedUserRecords;

  @JsonProperty("status")
  private CustomerListStatus status;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_time")
  private BigDecimal updatedTime;

   /**
   * Associated ad account ID.
   * @return adAccountId
  **/
  @ApiModelProperty(example = "549756359984", value = "Associated ad account ID.")
  public String getAdAccountId() {
    return adAccountId;
  }

   /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(example = "1452208622", value = "Creation time. Unix timestamp in seconds.")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }

   /**
   * Customer list errors.
   * @return exceptions
  **/
  @ApiModelProperty(value = "Customer list errors.")
  public Object getExceptions() {
    return exceptions;
  }

   /**
   * Customer list ID.
   * @return id
  **/
  @ApiModelProperty(example = "643", required = true, value = "Customer list ID.")
  public String getId() {
    return id;
  }

  public CustomerList isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

   /**
   * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
   * @return isNca
  **/
  @ApiModelProperty(value = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.")
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
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
   * @return numBatches
  **/
  @ApiModelProperty(example = "2", value = "Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.")
  public BigDecimal getNumBatches() {
    return numBatches;
  }

   /**
   * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
   * @return numRemovedUserRecords
  **/
  @ApiModelProperty(example = "0", value = "Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }

   /**
   * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
   * @return numUploadedUserRecords
  **/
  @ApiModelProperty(example = "11", value = "Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }

   /**
   * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
   * @return status
  **/
  @ApiModelProperty(example = "PROCESSING", value = "Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.")
  public CustomerListStatus getStatus() {
    return status;
  }

   /**
   * Always `customerlist`.
   * @return type
  **/
  @ApiModelProperty(example = "customerlist", value = "Always `customerlist`.")
  public String getType() {
    return type;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @ApiModelProperty(example = "1461269616", value = "Last update time. Unix timestamp in seconds.")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
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

