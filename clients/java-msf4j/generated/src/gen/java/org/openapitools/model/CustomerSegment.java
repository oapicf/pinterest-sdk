package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingTemplateStatus;

/**
 * CustomerSegment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegment   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("audience_ids")
  private List<String> audienceIds = new ArrayList<>();

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private TargetingTemplateStatus status;

  @JsonProperty("updated_time")
  private Integer updatedTime;

   /**
   * The ID of the ad account that this customer segment belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "The ID of the ad account that this customer segment belongs to.")
  public String getAdAccountId() {
    return adAccountId;
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
   * Audience IDs included in the customer segment.
   * @return audienceIds
  **/
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")
  public List<String> getAudienceIds() {
    return audienceIds;
  }

  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

   /**
   * Customer segment created time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Customer segment created time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

   /**
   * Customer segment ID.
   * @return id
  **/
  @ApiModelProperty(value = "Customer segment ID.")
  public String getId() {
    return id;
  }

  public CustomerSegment name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Customer segment name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Customer segment name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

   /**
   * Indicates whether the customer segment is active or deleted.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates whether the customer segment is active or deleted.")
  public TargetingTemplateStatus getStatus() {
    return status;
  }

   /**
   * Customer segment updated time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @ApiModelProperty(value = "Customer segment updated time. Unix timestamp in seconds.")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

