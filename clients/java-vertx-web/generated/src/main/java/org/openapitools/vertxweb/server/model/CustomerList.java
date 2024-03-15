package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerList   {
  
  private String adAccountId;
  private BigDecimal createdTime;
  private String id;
  private String name;
  private BigDecimal numBatches;
  private BigDecimal numRemovedUserRecords;
  private BigDecimal numUploadedUserRecords;


  public enum StatusEnum {
    PROCESSING("PROCESSING"),
    READY("READY"),
    TOO_SMALL("TOO_SMALL"),
    UPLOADING("UPLOADING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;
  private String type;
  private BigDecimal updatedTime;
  private Object exceptions;

  public CustomerList () {

  }

  public CustomerList (String adAccountId, BigDecimal createdTime, String id, String name, BigDecimal numBatches, BigDecimal numRemovedUserRecords, BigDecimal numUploadedUserRecords, StatusEnum status, String type, BigDecimal updatedTime, Object exceptions) {
    this.adAccountId = adAccountId;
    this.createdTime = createdTime;
    this.id = id;
    this.name = name;
    this.numBatches = numBatches;
    this.numRemovedUserRecords = numRemovedUserRecords;
    this.numUploadedUserRecords = numUploadedUserRecords;
    this.status = status;
    this.type = type;
    this.updatedTime = updatedTime;
    this.exceptions = exceptions;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("created_time")
  public BigDecimal getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(BigDecimal createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("num_batches")
  public BigDecimal getNumBatches() {
    return numBatches;
  }
  public void setNumBatches(BigDecimal numBatches) {
    this.numBatches = numBatches;
  }

    
  @JsonProperty("num_removed_user_records")
  public BigDecimal getNumRemovedUserRecords() {
    return numRemovedUserRecords;
  }
  public void setNumRemovedUserRecords(BigDecimal numRemovedUserRecords) {
    this.numRemovedUserRecords = numRemovedUserRecords;
  }

    
  @JsonProperty("num_uploaded_user_records")
  public BigDecimal getNumUploadedUserRecords() {
    return numUploadedUserRecords;
  }
  public void setNumUploadedUserRecords(BigDecimal numUploadedUserRecords) {
    this.numUploadedUserRecords = numUploadedUserRecords;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("exceptions")
  public Object getExceptions() {
    return exceptions;
  }
  public void setExceptions(Object exceptions) {
    this.exceptions = exceptions;
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
        Objects.equals(id, customerList.id) &&
        Objects.equals(name, customerList.name) &&
        Objects.equals(numBatches, customerList.numBatches) &&
        Objects.equals(numRemovedUserRecords, customerList.numRemovedUserRecords) &&
        Objects.equals(numUploadedUserRecords, customerList.numUploadedUserRecords) &&
        Objects.equals(status, customerList.status) &&
        Objects.equals(type, customerList.type) &&
        Objects.equals(updatedTime, customerList.updatedTime) &&
        Objects.equals(exceptions, customerList.exceptions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
