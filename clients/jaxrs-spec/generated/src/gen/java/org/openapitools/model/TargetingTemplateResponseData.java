package org.openapitools.model;

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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TargetingTemplateResponseData")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateResponseData   {
  private String name;
  private Boolean autoTargetingEnabled = true;
  private TargetingSpec targetingAttributes;
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;
  private @Valid List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();
  private TrackingUrls trackingUrls;
  private String id;
  private Integer createdTime;
  private Integer updatedTime;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static StatusEnum fromString(String s) {
        for (StatusEnum b : StatusEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
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

  /**
   * targeting template name
   **/
  public TargetingTemplateResponseData name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Gaming", value = "targeting template name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;.
   **/
  public TargetingTemplateResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.")
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  /**
   **/
  public TargetingTemplateResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("targeting_attributes")
  @Valid public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty("targeting_attributes")
  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  /**
   **/
  public TargetingTemplateResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  /**
   **/
  public TargetingTemplateResponseData keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  
  @ApiModelProperty(example = "[{value=cats, match_type=EXACT_NEGATIVE}]", value = "")
  @JsonProperty("keywords")
  @Valid public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (this.keywords == null) {
      this.keywords = new ArrayList<>();
    }

    this.keywords.add(keywordsItem);
    return this;
  }

  public TargetingTemplateResponseData removeKeywordsItem(TargetingTemplateKeyword keywordsItem) {
    if (keywordsItem != null && this.keywords != null) {
      this.keywords.remove(keywordsItem);
    }

    return this;
  }
  /**
   **/
  public TargetingTemplateResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  @Valid public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Targeting template ID.
   **/
  public TargetingTemplateResponseData id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "643", value = "Targeting template ID.")
  @JsonProperty("id")
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   **/
  public TargetingTemplateResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Targeting template created time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   **/
  public TargetingTemplateResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(example = "1432744744", value = "Targeting template updated time.Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   **/
  public TargetingTemplateResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this targeting template belongs to.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Indicate targeting template is active or Deleted
   **/
  public TargetingTemplateResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(example = "ACTIVE", value = "Indicate targeting template is active or Deleted")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  public TargetingTemplateResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = sizing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sizing")
  @Valid public TargetingTemplateAudienceSizing getSizing() {
    return sizing;
  }

  @JsonProperty("sizing")
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

