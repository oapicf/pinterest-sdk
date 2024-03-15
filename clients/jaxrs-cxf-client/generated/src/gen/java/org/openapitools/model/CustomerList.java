package org.openapitools.model;

import java.math.BigDecimal;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerList  {
  
  @ApiModelProperty(example = "549756359984", value = "Associated ad account ID.")
 /**
   * Associated ad account ID.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "1452208622", value = "Creation time. Unix timestamp in seconds.")
 /**
   * Creation time. Unix timestamp in seconds.
  **/
  private BigDecimal createdTime;

  @ApiModelProperty(example = "643", value = "Customer list ID.")
 /**
   * Customer list ID.
  **/
  private String id;

  @ApiModelProperty(example = "The Glengarry Glen Ross leads", value = "Customer list name.")
 /**
   * Customer list name.
  **/
  private String name;

  @ApiModelProperty(example = "2", value = "Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.")
 /**
   * Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
  **/
  private BigDecimal numBatches;

  @ApiModelProperty(example = "0", value = "Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.")
 /**
   * Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
  **/
  private BigDecimal numRemovedUserRecords;

  @ApiModelProperty(example = "11", value = "Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.")
 /**
   * Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
  **/
  private BigDecimal numUploadedUserRecords;

public enum StatusEnum {

PROCESSING(String.valueOf("PROCESSING")), READY(String.valueOf("READY")), TOO_SMALL(String.valueOf("TOO_SMALL")), UPLOADING(String.valueOf("UPLOADING"));


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

  @ApiModelProperty(example = "PROCESSING", value = "Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.")
 /**
   * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
  **/
  private StatusEnum status;

  @ApiModelProperty(example = "customerlist", value = "Always \"customerlist\".")
 /**
   * Always \"customerlist\".
  **/
  private String type;

  @ApiModelProperty(example = "1461269616", value = "Last update time. Unix timestamp in seconds.")
 /**
   * Last update time. Unix timestamp in seconds.
  **/
  private BigDecimal updatedTime;

  @ApiModelProperty(value = "Customer list errors")
 /**
   * Customer list errors
  **/
  private Object exceptions;
 /**
   * Associated ad account ID.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CustomerList adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

  public CustomerList createdTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Customer list ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomerList id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Customer list name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerList name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Total number of list updates.  List creation counts as one batch. Each &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append&lt;/a&gt; or &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
   * @return numBatches
  **/
  @JsonProperty("num_batches")
  public BigDecimal getNumBatches() {
    return numBatches;
  }

  public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

  public CustomerList numBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
    return this;
  }

 /**
   * Number of removed user records. In a &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\&quot;&gt;Remove API&lt;/a&gt; call, this counter increases even if the user is not found in the list.
   * @return numRemovedUserRecords
  **/
  @JsonProperty("num_removed_user_records")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }

  public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

  public CustomerList numRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
    return this;
  }

 /**
   * Number of uploaded user records. In an &lt;a href&#x3D;\&quot;/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\&quot;&gt;Append API&lt;/a&gt; call, this counter increases even if the uploaded user is already in the list.
   * @return numUploadedUserRecords
  **/
  @JsonProperty("num_uploaded_user_records")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }

  public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

  public CustomerList numUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
    return this;
  }

 /**
   * Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
   * @return status
  **/
  @JsonProperty("status")
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public CustomerList status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Always \&quot;customerlist\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CustomerList type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CustomerList updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
   * Customer list errors
   * @return exceptions
  **/
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }

  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
  }

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

