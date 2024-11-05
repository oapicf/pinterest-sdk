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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpec;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TrackingUrls;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateGetResponseData   {
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

  @JsonProperty("valid")
  private Boolean valid;

  /**
   * targeting template name
   **/
  public TargetingTemplateGetResponseData name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   **/
  public TargetingTemplateGetResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
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
  public TargetingTemplateGetResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   **/
  public TargetingTemplateGetResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  public TargetingTemplateGetResponseData keywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @JsonProperty("keywords")
  public List<TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   **/
  public TargetingTemplateGetResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Targeting template ID.
   **/
  public TargetingTemplateGetResponseData id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", value = "Targeting template ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   **/
  public TargetingTemplateGetResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
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
  public TargetingTemplateGetResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
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
  public TargetingTemplateGetResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Indicate targeting template is active or Deleted
   **/
  public TargetingTemplateGetResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
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
  public TargetingTemplateGetResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }
  public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   **/
  public TargetingTemplateGetResponseData valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

  
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
    return Objects.equals(name, targetingTemplateGetResponseData.name) &&
        Objects.equals(autoTargetingEnabled, targetingTemplateGetResponseData.autoTargetingEnabled) &&
        Objects.equals(targetingAttributes, targetingTemplateGetResponseData.targetingAttributes) &&
        Objects.equals(placementGroup, targetingTemplateGetResponseData.placementGroup) &&
        Objects.equals(keywords, targetingTemplateGetResponseData.keywords) &&
        Objects.equals(trackingUrls, targetingTemplateGetResponseData.trackingUrls) &&
        Objects.equals(id, targetingTemplateGetResponseData.id) &&
        Objects.equals(createdTime, targetingTemplateGetResponseData.createdTime) &&
        Objects.equals(updatedTime, targetingTemplateGetResponseData.updatedTime) &&
        Objects.equals(adAccountId, targetingTemplateGetResponseData.adAccountId) &&
        Objects.equals(status, targetingTemplateGetResponseData.status) &&
        Objects.equals(sizing, targetingTemplateGetResponseData.sizing) &&
        Objects.equals(valid, targetingTemplateGetResponseData.valid);
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

