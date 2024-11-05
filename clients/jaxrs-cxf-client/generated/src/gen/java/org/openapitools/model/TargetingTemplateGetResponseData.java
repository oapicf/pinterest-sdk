package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateGetResponseData  {
  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
 /**
   * targeting template name
  **/
  private String name;

  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
 /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  **/
  private Boolean autoTargetingEnabled = true;

  @ApiModelProperty(value = "")
  private TargetingSpec targetingAttributes;

  @ApiModelProperty(value = "")
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  private List<TargetingTemplateKeyword> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  private TrackingUrls trackingUrls;

  @ApiModelProperty(example = "643", value = "Targeting template ID.")
 /**
   * Targeting template ID.
  **/
  private String id;

  @ApiModelProperty(example = "1432744744", value = "Targeting template created time. Unix timestamp in seconds.")
 /**
   * Targeting template created time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "1432744744", value = "Targeting template updated time.Unix timestamp in seconds.")
 /**
   * Targeting template updated time.Unix timestamp in seconds.
  **/
  private Integer updatedTime;

  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
 /**
   * The ID of the advertiser that this targeting template belongs to.
  **/
  private String adAccountId;

public enum StatusEnum {

ACTIVE(String.valueOf("ACTIVE")), DELETED(String.valueOf("DELETED"));


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

  @ApiModelProperty(example = "ACTIVE", value = "Indicate targeting template is active or Deleted")
 /**
   * Indicate targeting template is active or Deleted
  **/
  private StatusEnum status = StatusEnum.ACTIVE;

  @ApiModelProperty(value = "")
  private TargetingTemplateAudienceSizing sizing;

  @ApiModelProperty(example = "true", value = "Inform if the targeting template is valid (ex. would be false if has revoked audience)")
 /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
  **/
  private Boolean valid;
 /**
   * targeting template name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateGetResponseData name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   * @return autoTargetingEnabled
  **/
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateGetResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
   * Get targetingAttributes
   * @return targetingAttributes
  **/
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateGetResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

 /**
   * Get placementGroup
   * @return placementGroup
  **/
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplateGetResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
   * Get keywords
   * @return keywords
  **/
  @JsonProperty("keywords")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateGetResponseData keywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateGetResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public TargetingTemplateGetResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
   * Targeting template ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplateGetResponseData id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Targeting template created time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingTemplateGetResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Targeting template updated time.Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public TargetingTemplateGetResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
   * The ID of the advertiser that this targeting template belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TargetingTemplateGetResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Indicate targeting template is active or Deleted
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

  public TargetingTemplateGetResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get sizing
   * @return sizing
  **/
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  public TargetingTemplateGetResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

 /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   * @return valid
  **/
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public TargetingTemplateGetResponseData valid(Boolean valid) {
    this.valid = valid;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

