package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import java.util.Objects;



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


public enum StatusEnum {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("DELETED") DELETED(String.valueOf("DELETED"));


    private String value;

    StatusEnum(String v) {
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

  private StatusEnum status = StatusEnum.ACTIVE;

  private TargetingTemplateAudienceSizing sizing;

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
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
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
  public TargetingTemplateGetResponseData keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateGetResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }
    this.keywords.add(keywordsItem);
    return this;
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
 @Pattern(regexp="^\\d+$")  public String getId() {
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
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
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

