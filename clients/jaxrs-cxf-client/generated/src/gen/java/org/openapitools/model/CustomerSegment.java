package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingTemplateStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

  private TargetingTemplateStatus status;

 /**
  * Customer segment updated time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Customer segment updated time. Unix timestamp in seconds.")

  private Integer updatedTime;
 /**
   * The ID of the ad account that this customer segment belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }


 /**
   * Audience IDs included in the customer segment.
   * @return audienceIds
  **/
  @JsonProperty("audience_ids")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  public CustomerSegment audienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
    return this;
  }

  public CustomerSegment addAudienceIdsItem(String audienceIdsItem) {
    this.audienceIds.add(audienceIdsItem);
    return this;
  }

 /**
   * Customer segment created time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }


 /**
   * Customer segment ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }


 /**
   * Customer segment name.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerSegment name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Indicates whether the customer segment is active or deleted.
   * @return status
  **/
  @JsonProperty("status")
  public TargetingTemplateStatus getStatus() {
    return status;
  }


 /**
   * Customer segment updated time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
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

