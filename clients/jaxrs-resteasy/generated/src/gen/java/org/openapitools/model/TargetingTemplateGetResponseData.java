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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateGetResponseData   {
  
  private String name;
  private Boolean autoTargetingEnabled = true;
  private TargetingSpec targetingAttributes;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
  private TrackingUrls trackingUrls;
  private String id;
  private Integer createdTime;
  private Integer updatedTime;
  private String adAccountId;

  /**
   * Indicate targeting template is active or Deleted
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),

        DELETED("DELETED");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = StatusEnum.ACTIVE;
  private TargetingTemplateAudienceSizing sizing;
  private Boolean valid;

  /**
   * targeting template name
   **/
  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_attributes")
  @Valid
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_group")
  @Valid
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  
  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @JsonProperty("keywords")
  @Valid
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  @Valid
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Targeting template ID.
   **/
  
  @ApiModelProperty(example = "643", value = "Targeting template ID.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1432744744", value = "Targeting template created time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1432744744", value = "Targeting template updated time.Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   **/
  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Indicate targeting template is active or Deleted
   **/
  
  @ApiModelProperty(example = "ACTIVE", value = "Indicate targeting template is active or Deleted")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sizing")
  @Valid
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   **/
  
  @ApiModelProperty(example = "true", value = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateGetResponseData targetingTemplateGetResponseData = (TargetingTemplateGetResponseData) o;
    return Objects.equals(this.name, targetingTemplateGetResponseData.name) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplateGetResponseData.autoTargetingEnabled) &&
        Objects.equals(this.targetingAttributes, targetingTemplateGetResponseData.targetingAttributes) &&
        Objects.equals(this.placementGroup, targetingTemplateGetResponseData.placementGroup) &&
        Objects.equals(this.keywords, targetingTemplateGetResponseData.keywords) &&
        Objects.equals(this.trackingUrls, targetingTemplateGetResponseData.trackingUrls) &&
        Objects.equals(this.id, targetingTemplateGetResponseData.id) &&
        Objects.equals(this.createdTime, targetingTemplateGetResponseData.createdTime) &&
        Objects.equals(this.updatedTime, targetingTemplateGetResponseData.updatedTime) &&
        Objects.equals(this.adAccountId, targetingTemplateGetResponseData.adAccountId) &&
        Objects.equals(this.status, targetingTemplateGetResponseData.status) &&
        Objects.equals(this.sizing, targetingTemplateGetResponseData.sizing) &&
        Objects.equals(this.valid, targetingTemplateGetResponseData.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, trackingUrls, id, createdTime, updatedTime, adAccountId, status, sizing, valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateGetResponseData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

