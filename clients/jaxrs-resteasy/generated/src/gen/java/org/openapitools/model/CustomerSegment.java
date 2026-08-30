package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TargetingTemplateStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomerSegment   {
  
  private String adAccountId;
  private List<String> audienceIds = new ArrayList<>();
  private Integer createdTime;
  private String id;
  private String name;
  private TargetingTemplateStatus status;
  private Integer updatedTime;

  /**
   * The ID of the ad account that this customer segment belongs to.
   **/
  
  @ApiModelProperty(value = "The ID of the ad account that this customer segment belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Audience IDs included in the customer segment.
   **/
  
  @ApiModelProperty(required = true, value = "Audience IDs included in the customer segment.")
  @JsonProperty("audience_ids")
  @NotNull
  public List<String> getAudienceIds() {
    return audienceIds;
  }
  public void setAudienceIds(List<String> audienceIds) {
    this.audienceIds = audienceIds;
  }

  /**
   * Customer segment created time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(value = "Customer segment created time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Customer segment ID.
   **/
  
  @ApiModelProperty(value = "Customer segment ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Customer segment name.
   **/
  
  @ApiModelProperty(required = true, value = "Customer segment name.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Indicates whether the customer segment is active or deleted.
   **/
  
  @ApiModelProperty(value = "Indicates whether the customer segment is active or deleted.")
  @JsonProperty("status")
  @Valid
  public TargetingTemplateStatus getStatus() {
    return status;
  }
  public void setStatus(TargetingTemplateStatus status) {
    this.status = status;
  }

  /**
   * Customer segment updated time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(value = "Customer segment updated time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
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

