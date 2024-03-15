package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
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
  * Customer list ID.
  */
  @ApiModelProperty(example = "643", value = "Customer list ID.")
  private String id;

 /**
  * Customer list name.
  */
  @ApiModelProperty(example = "The Glengarry Glen Ross leads", value = "Customer list name.")
  private String name;

 /**
  * Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
  */
  @ApiModelProperty(example = "2", value = "Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.")
  @Valid
  private BigDecimal numBatches;

 /**
  * Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
  */
  @ApiModelProperty(example = "0", value = "Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.")
  @Valid
  private BigDecimal numRemovedUserRecords;

 /**
  * Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
  */
  @ApiModelProperty(example = "11", value = "Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.")
  @Valid
  private BigDecimal numUploadedUserRecords;

public enum StatusEnum {

    @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")),
    @JsonProperty("READY") READY(String.valueOf("READY")),
    @JsonProperty("TOO_SMALL") TOO_SMALL(String.valueOf("TOO_SMALL")),
    @JsonProperty("UPLOADING") UPLOADING(String.valueOf("UPLOADING"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
  */
  @ApiModelProperty(example = "PROCESSING", value = "Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.")
  private StatusEnum status;

 /**
  * Always \"customerlist\".
  */
  @ApiModelProperty(example = "customerlist", value = "Always \"customerlist\".")
  private String type;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1461269616", value = "Last update time. Unix timestamp in seconds.")
  @Valid
  private BigDecimal updatedTime;

 /**
  * Customer list errors
  */
  @ApiModelProperty(value = "Customer list errors")
  private Object exceptions;
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
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
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
   */
 public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public CustomerList createdTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Customer list ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CustomerList id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Customer list name.
  * @return name
  */
  @JsonProperty("name")
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
  * Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
  * @return numBatches
  */
  @JsonProperty("num_batches")
  public BigDecimal getNumBatches() {
    return numBatches;
  }

  /**
   * Sets the <code>numBatches</code> property.
   */
 public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

  /**
   * Sets the <code>numBatches</code> property.
   */
  public CustomerList numBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
    return this;
  }

 /**
  * Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.
  * @return numRemovedUserRecords
  */
  @JsonProperty("num_removed_user_records")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }

  /**
   * Sets the <code>numRemovedUserRecords</code> property.
   */
 public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

  /**
   * Sets the <code>numRemovedUserRecords</code> property.
   */
  public CustomerList numRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
    return this;
  }

 /**
  * Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.
  * @return numUploadedUserRecords
  */
  @JsonProperty("num_uploaded_user_records")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }

  /**
   * Sets the <code>numUploadedUserRecords</code> property.
   */
 public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

  /**
   * Sets the <code>numUploadedUserRecords</code> property.
   */
  public CustomerList numUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
    return this;
  }

 /**
  * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public CustomerList status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Always \&quot;customerlist\&quot;.
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
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
   */
 public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public CustomerList updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * Customer list errors
  * @return exceptions
  */
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
 public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

  /**
   * Sets the <code>exceptions</code> property.
   */
  public CustomerList exceptions(Object exceptions) {
    this.exceptions = exceptions;
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
        Objects.equals(this.id, customerList.id) &&
        Objects.equals(this.name, customerList.name) &&
        Objects.equals(this.numBatches, customerList.numBatches) &&
        Objects.equals(this.numRemovedUserRecords, customerList.numRemovedUserRecords) &&
        Objects.equals(this.numUploadedUserRecords, customerList.numUploadedUserRecords) &&
        Objects.equals(this.status, customerList.status) &&
        Objects.equals(this.type, customerList.type) &&
        Objects.equals(this.updatedTime, customerList.updatedTime) &&
        Objects.equals(this.exceptions, customerList.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, createdTime, id, name, numBatches, numRemovedUserRecords, numUploadedUserRecords, status, type, updatedTime, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerList {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numBatches: ").append(toIndentedString(numBatches)).append("\n");
    sb.append("    numRemovedUserRecords: ").append(toIndentedString(numRemovedUserRecords)).append("\n");
    sb.append("    numUploadedUserRecords: ").append(toIndentedString(numUploadedUserRecords)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

