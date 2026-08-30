package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.CustomerListStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerList  {
  
 /**
  * Associated ad account ID.
  */
  @ApiModelProperty(example = "549756359984", value = "Associated ad account ID.")
  private String adAccountId;

 /**
  * Creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1452208622", value = "Creation time. Unix timestamp in seconds.")
  @Valid
  private BigDecimal createdTime;

 /**
  * Customer list errors.
  */
  @ApiModelProperty(value = "Customer list errors.")
  private Object exceptions;

 /**
  * Customer list ID.
  */
  @ApiModelProperty(example = "643", required = true, value = "Customer list ID.")
  private String id;

 /**
  * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  */
  @ApiModelProperty(value = "Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.")
  private Boolean isNca;

 /**
  * Customer list name.
  */
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", required = true, value = "Customer list name.")
  private String name;

 /**
  * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
  */
  @ApiModelProperty(example = "2", value = "Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.")
  @Valid
  private BigDecimal numBatches;

 /**
  * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
  */
  @ApiModelProperty(example = "0", value = "Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.")
  @Valid
  private BigDecimal numRemovedUserRecords;

 /**
  * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
  */
  @ApiModelProperty(example = "11", value = "Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.")
  @Valid
  private BigDecimal numUploadedUserRecords;

 /**
  * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  */
  @ApiModelProperty(example = "PROCESSING", value = "Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.")
  @Valid
  private CustomerListStatus status;

 /**
  * Always `customerlist`.
  */
  @ApiModelProperty(example = "customerlist", value = "Always `customerlist`.")
  private String type;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1461269616", value = "Last update time. Unix timestamp in seconds.")
  @Valid
  private BigDecimal updatedTime;
 /**
  * Associated ad account ID.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList createdTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Customer list errors.
  * @return exceptions
  */
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   * <br><em>N.B. <code>exceptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   * <br><em>N.B. <code>exceptions</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList exceptions(Object exceptions) {
    this.exceptions = exceptions;
    return this;
  }

 /**
  * Customer list ID.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   * <br><em>N.B. <code>id</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation.
  * @return isNca
  */
  @JsonProperty("is_nca")
  public Boolean getIsNca() {
    return isNca;
  }

  /**
   * Sets the <code>isNca</code> property.
   */
 public void setIsNca(Boolean isNca) {
    this.isNca = isNca;
  }

  /**
   * Sets the <code>isNca</code> property.
   */
  public CustomerList isNca(Boolean isNca) {
    this.isNca = isNca;
    return this;
  }

 /**
  * Customer list name.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CustomerList name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists.
  * @return numBatches
  */
  @JsonProperty("num_batches")
  public BigDecimal getNumBatches() {
    return numBatches;
  }

  /**
   * Sets the <code>numBatches</code> property.
   * <br><em>N.B. <code>numBatches</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

  /**
   * Sets the <code>numBatches</code> property.
   * <br><em>N.B. <code>numBatches</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList numBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
    return this;
  }

 /**
  * Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list.
  * @return numRemovedUserRecords
  */
  @JsonProperty("num_removed_user_records")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }

  /**
   * Sets the <code>numRemovedUserRecords</code> property.
   * <br><em>N.B. <code>numRemovedUserRecords</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

  /**
   * Sets the <code>numRemovedUserRecords</code> property.
   * <br><em>N.B. <code>numRemovedUserRecords</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList numRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
    return this;
  }

 /**
  * Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list.
  * @return numUploadedUserRecords
  */
  @JsonProperty("num_uploaded_user_records")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }

  /**
   * Sets the <code>numUploadedUserRecords</code> property.
   * <br><em>N.B. <code>numUploadedUserRecords</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

  /**
   * Sets the <code>numUploadedUserRecords</code> property.
   * <br><em>N.B. <code>numUploadedUserRecords</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList numUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
    return this;
  }

 /**
  * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
  * @return status
  */
  @JsonProperty("status")
  public CustomerListStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(CustomerListStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList status(CustomerListStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Always &#x60;customerlist&#x60;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   * <br><em>N.B. <code>type</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   * <br><em>N.B. <code>type</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Last update time. Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerList updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

