package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.PlacementGroupType;
import com.prokarma.pkmst.model.TargetingSpec;
import com.prokarma.pkmst.model.TargetingTemplateAudienceSizing;
import com.prokarma.pkmst.model.TargetingTemplateKeyword;
import com.prokarma.pkmst.model.TrackingUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * TargetingTemplateResponseData
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateResponseData   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("auto_targeting_enabled")
  private Boolean autoTargetingEnabled = true;

  @JsonProperty("targeting_attributes")
  private TargetingSpec targetingAttributes;

  @JsonProperty("placement_group")
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @JsonProperty("keywords")
  
  private List<TargetingTemplateKeyword> keywords = null;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  @JsonProperty("id")
  private String id;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("ad_account_id")
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

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status = StatusEnum.ACTIVE;

  @JsonProperty("sizing")
  private TargetingTemplateAudienceSizing sizing;

  public TargetingTemplateResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * targeting template name
   * @return name
   */
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
   */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * Get targetingAttributes
   * @return targetingAttributes
   */
  @ApiModelProperty(value = "")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * Get placementGroup
   * @return placementGroup
   */
  @ApiModelProperty(value = "")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplateResponseData keywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
  }

  /**
   * Get keywords
   * @return keywords
   */
  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @ApiModelProperty(value = "")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public TargetingTemplateResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeting template ID.
   * @return id
   */
  @ApiModelProperty(example = "643", value = "Targeting template ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplateResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   * @return createdTime
   */
  @ApiModelProperty(example = "1432744744", value = "Targeting template created time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingTemplateResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   * @return updatedTime
   */
  @ApiModelProperty(example = "1432744744", value = "Targeting template updated time.Unix timestamp in seconds.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public TargetingTemplateResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   * @return adAccountId
   */
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TargetingTemplateResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Indicate targeting template is active or Deleted
   * @return status
   */
  @ApiModelProperty(example = "ACTIVE", value = "Indicate targeting template is active or Deleted")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TargetingTemplateResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

  /**
   * Get sizing
   * @return sizing
   */
  @ApiModelProperty(value = "")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingTemplateResponseData targetingTemplateResponseData = (TargetingTemplateResponseData) o;
    return Objects.equals(this.name, targetingTemplateResponseData.name) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplateResponseData.autoTargetingEnabled) &&
        Objects.equals(this.targetingAttributes, targetingTemplateResponseData.targetingAttributes) &&
        Objects.equals(this.placementGroup, targetingTemplateResponseData.placementGroup) &&
        Objects.equals(this.keywords, targetingTemplateResponseData.keywords) &&
        Objects.equals(this.trackingUrls, targetingTemplateResponseData.trackingUrls) &&
        Objects.equals(this.id, targetingTemplateResponseData.id) &&
        Objects.equals(this.createdTime, targetingTemplateResponseData.createdTime) &&
        Objects.equals(this.updatedTime, targetingTemplateResponseData.updatedTime) &&
        Objects.equals(this.adAccountId, targetingTemplateResponseData.adAccountId) &&
        Objects.equals(this.status, targetingTemplateResponseData.status) &&
        Objects.equals(this.sizing, targetingTemplateResponseData.sizing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, trackingUrls, id, createdTime, updatedTime, adAccountId, status, sizing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingTemplateResponseData {\n");
    
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

