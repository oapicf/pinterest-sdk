package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingTemplateStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomerSegment  {
  
 /**
  * The ID of the ad account that this customer segment belongs to.
  */
  @ApiModelProperty(value = "The ID of the ad account that this customer segment belongs to.")
  private String adAccountId;

 /**
  * Audience IDs included in the customer segment.
  */
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")
  private List<String> audienceIds = new ArrayList<>();

 /**
  * Customer segment created time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Customer segment created time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Customer segment ID.
  */
  @ApiModelProperty(value = "Customer segment ID.")
  private String id;

 /**
  * Customer segment name.
  */
  @ApiModelProperty(required = true, value = "Customer segment name.")
  private String name;

 /**
  * Indicates whether the customer segment is active or deleted.
  */
  @ApiModelProperty(value = "Indicates whether the customer segment is active or deleted.")
  @Valid
  private TargetingTemplateStatus status;

 /**
  * Customer segment updated time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Customer segment updated time. Unix timestamp in seconds.")
  private Integer updatedTime;
 /**
  * The ID of the ad account that this customer segment belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
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
  public CustomerSegment adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Audience IDs included in the customer segment.
  * @return audienceIds
  */
  @JsonProperty("audience_ids")
  @NotNull
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  /**
   * Sets the <code>audienceIds</code> property.
   */
 public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Sets the <code>audienceIds</code> property.
   */
  public CustomerSegment audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  /**
   * Adds a new item to the <code>audienceIds</code> list.
   */
  public CustomerSegment addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

 /**
  * Customer segment created time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerSegment createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Customer segment ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
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
  public CustomerSegment id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Customer segment name.
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
  public CustomerSegment name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Indicates whether the customer segment is active or deleted.
  * @return status
  */
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   * <br><em>N.B. <code>status</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerSegment status(TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Customer segment updated time. Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public CustomerSegment updatedTime(Integer updatedTime) {
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
    CustomerSegment customerSegment = (CustomerSegment) o;
    return Objects.equals(this.adAccountId, customerSegment.adAccountId) &&
        Objects.equals(this.audienceIds, customerSegment.audienceIds) &&
        Objects.equals(this.createdTime, customerSegment.createdTime) &&
        Objects.equals(this.id, customerSegment.id) &&
        Objects.equals(this.name, customerSegment.name) &&
        Objects.equals(this.status, customerSegment.status) &&
        Objects.equals(this.updatedTime, customerSegment.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, audienceIds, createdTime, id, name, status, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerSegment {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    audienceIds: ").append(toIndentedString(audienceIds)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

