package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TargetingTemplateResponseData  {
  
 /**
  * targeting template name
  */
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  private String name;

 /**
  * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  private Boolean autoTargetingEnabled = true;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingSpec targetingAttributes;

  @ApiModelProperty(value = "")
  @Valid
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @Valid
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;

 /**
  * Targeting template ID.
  */
  @ApiModelProperty(example = "643", value = "Targeting template ID.")
  private String id;

 /**
  * Targeting template created time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1432744744", value = "Targeting template created time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Targeting template updated time.Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1432744744", value = "Targeting template updated time.Unix timestamp in seconds.")
  private Integer updatedTime;

 /**
  * The ID of the advertiser that this targeting template belongs to.
  */
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
  private String adAccountId;

public enum StatusEnum {

    @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")),
    @JsonProperty("DELETED") DELETED(String.valueOf("DELETED"));

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

 /**
  * Indicate targeting template is active or Deleted
  */
  @ApiModelProperty(example = "ACTIVE", value = "Indicate targeting template is active or Deleted")
  private StatusEnum status = StatusEnum.ACTIVE;

  @ApiModelProperty(value = "")
  @Valid
  private TargetingTemplateAudienceSizing sizing;
 /**
  * targeting template name
  * @return name
  */
  @JsonProperty("name")
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
  public TargetingTemplateResponseData name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
  * @return autoTargetingEnabled
  */
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
 public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   * Sets the <code>autoTargetingEnabled</code> property.
   */
  public TargetingTemplateResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

 /**
  * Get targetingAttributes
  * @return targetingAttributes
  */
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
 public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   * Sets the <code>targetingAttributes</code> property.
   */
  public TargetingTemplateResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

 /**
  * Get placementGroup
  * @return placementGroup
  */
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
 public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   * Sets the <code>placementGroup</code> property.
   */
  public TargetingTemplateResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

 /**
  * Get keywords
  * @return keywords
  */
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
 public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  /**
   * Sets the <code>keywords</code> property.
   */
  public TargetingTemplateResponseData keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  /**
   * Adds a new item to the <code>keywords</code> list.
   */
  public TargetingTemplateResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    this.keywords.add(keywordsItem);
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public TargetingTemplateResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
  * Targeting template ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public TargetingTemplateResponseData id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Targeting template created time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public TargetingTemplateResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Targeting template updated time.Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public TargetingTemplateResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

 /**
  * The ID of the advertiser that this targeting template belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public TargetingTemplateResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * Indicate targeting template is active or Deleted
  * @return status
  */
  @JsonProperty("status")
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public TargetingTemplateResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Get sizing
  * @return sizing
  */
  @JsonProperty("sizing")
  public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  /**
   * Sets the <code>sizing</code> property.
   */
 public void setSizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
  }

  /**
   * Sets the <code>sizing</code> property.
   */
  public TargetingTemplateResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

