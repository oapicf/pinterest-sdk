package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TargetingTemplateGetResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class TargetingTemplateGetResponseData {

  private String name;

  private Boolean autoTargetingEnabled = true;

  private TargetingSpec targetingAttributes;

  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @Valid
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
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

  private JsonNullable<TargetingTemplateAudienceSizing> sizing = JsonNullable.<TargetingTemplateAudienceSizing>undefined();

  private JsonNullable<Boolean> valid = JsonNullable.<Boolean>undefined();

  public TargetingTemplateGetResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * targeting template name
   * @return name
   */
  
  @Schema(name = "name", example = "Gaming", description = "targeting template name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplateGetResponseData autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplateGetResponseData targetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * Get targetingAttributes
   * @return targetingAttributes
   */
  @Valid 
  @Schema(name = "targeting_attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_attributes")
  public TargetingSpec getTargetingAttributes() {
    return targetingAttributes;
  }

  public void setTargetingAttributes(TargetingSpec targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplateGetResponseData placementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
    return this;
  }

  /**
   * Get placementGroup
   * @return placementGroup
   */
  @Valid 
  @Schema(name = "placement_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_group")
  public PlacementGroupType getPlacementGroup() {
    return placementGroup;
  }

  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplateGetResponseData keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplateGetResponseData addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
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
  @Valid 
  @Schema(name = "keywords", example = "[{value=cats, match_type=EXACT_NEGATIVE}]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplateGetResponseData trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<TrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<TrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public TargetingTemplateGetResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeting template ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "643", description = "Targeting template ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TargetingTemplateGetResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1432744744", description = "Targeting template created time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingTemplateGetResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", example = "1432744744", description = "Targeting template updated time.Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public TargetingTemplateGetResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "The ID of the advertiser that this targeting template belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TargetingTemplateGetResponseData status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Indicate targeting template is active or Deleted
   * @return status
   */
  
  @Schema(name = "status", example = "ACTIVE", description = "Indicate targeting template is active or Deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TargetingTemplateGetResponseData sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = JsonNullable.of(sizing);
    return this;
  }

  /**
   * Get sizing
   * @return sizing
   */
  @Valid 
  @Schema(name = "sizing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sizing")
  public JsonNullable<TargetingTemplateAudienceSizing> getSizing() {
    return sizing;
  }

  public void setSizing(JsonNullable<TargetingTemplateAudienceSizing> sizing) {
    this.sizing = sizing;
  }

  public TargetingTemplateGetResponseData valid(Boolean valid) {
    this.valid = JsonNullable.of(valid);
    return this;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   * @return valid
   */
  
  @Schema(name = "valid", example = "true", description = "Inform if the targeting template is valid (ex. would be false if has revoked audience)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valid")
  public JsonNullable<Boolean> getValid() {
    return valid;
  }

  public void setValid(JsonNullable<Boolean> valid) {
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
        equalsNullable(this.trackingUrls, targetingTemplateGetResponseData.trackingUrls) &&
        Objects.equals(this.id, targetingTemplateGetResponseData.id) &&
        Objects.equals(this.createdTime, targetingTemplateGetResponseData.createdTime) &&
        Objects.equals(this.updatedTime, targetingTemplateGetResponseData.updatedTime) &&
        Objects.equals(this.adAccountId, targetingTemplateGetResponseData.adAccountId) &&
        Objects.equals(this.status, targetingTemplateGetResponseData.status) &&
        equalsNullable(this.sizing, targetingTemplateGetResponseData.sizing) &&
        equalsNullable(this.valid, targetingTemplateGetResponseData.valid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, autoTargetingEnabled, targetingAttributes, placementGroup, keywords, hashCodeNullable(trackingUrls), id, createdTime, updatedTime, adAccountId, status, hashCodeNullable(sizing), hashCodeNullable(valid));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

