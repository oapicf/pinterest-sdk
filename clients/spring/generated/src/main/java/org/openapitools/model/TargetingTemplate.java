package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlacementGroupType;
import org.openapitools.model.TargetingSpecOptimal;
import org.openapitools.model.TargetingTemplateAudienceSizing;
import org.openapitools.model.TargetingTemplateKeyword;
import org.openapitools.model.TargetingTemplateStatus;
import org.openapitools.model.TrackingUrls;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * TargetingTemplate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TargetingTemplate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean autoTargetingEnabled = true;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer createdTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid TargetingTemplateKeyword> keywords = new ArrayList<>();

  private String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private PlacementGroupType placementGroup = PlacementGroupType.ALL;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<TargetingTemplateAudienceSizing> sizing = JsonNullable.<TargetingTemplateAudienceSizing>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TargetingTemplateStatus status;

  private TargetingSpecOptimal targetingAttributes;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer updatedTime;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> valid = JsonNullable.<Boolean>undefined();

  public TargetingTemplate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TargetingTemplate(String name, TargetingSpecOptimal targetingAttributes) {
    this.name = name;
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplate adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this targeting template belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the advertiser that this targeting template belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public TargetingTemplate autoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
    return this;
  }

  /**
   * Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
   * @return autoTargetingEnabled
   */
  
  @Schema(name = "auto_targeting_enabled", description = "Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_targeting_enabled")
  public Boolean getAutoTargetingEnabled() {
    return autoTargetingEnabled;
  }

  @JsonProperty("auto_targeting_enabled")
  public void setAutoTargetingEnabled(Boolean autoTargetingEnabled) {
    this.autoTargetingEnabled = autoTargetingEnabled;
  }

  public TargetingTemplate createdTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Targeting template created time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Targeting template created time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
  }

  public TargetingTemplate id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * Targeting template ID.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "Targeting template ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public TargetingTemplate keywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
    return this;
  }

  public TargetingTemplate addKeywordsItem(TargetingTemplateKeyword keywordsItem) {
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
  @Schema(name = "keywords", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keywords")
  public List<@Valid TargetingTemplateKeyword> getKeywords() {
    return keywords;
  }

  @JsonProperty("keywords")
  public void setKeywords(List<@Valid TargetingTemplateKeyword> keywords) {
    this.keywords = keywords;
  }

  public TargetingTemplate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * targeting template name
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "targeting template name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  public TargetingTemplate placementGroup(PlacementGroupType placementGroup) {
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

  @JsonProperty("placement_group")
  public void setPlacementGroup(PlacementGroupType placementGroup) {
    this.placementGroup = placementGroup;
  }

  public TargetingTemplate sizing(TargetingTemplateAudienceSizing sizing) {
    this.sizing = JsonNullable.of(sizing);
    return this;
  }

  /**
   * Get sizing
   * @return sizing
   */
  @Valid 
  @Schema(name = "sizing", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sizing")
  public JsonNullable<TargetingTemplateAudienceSizing> getSizing() {
    return sizing;
  }

  public void setSizing(JsonNullable<TargetingTemplateAudienceSizing> sizing) {
    this.sizing = sizing;
  }

  public TargetingTemplate status(@Nullable TargetingTemplateStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Indicate targeting template is active or Deleted
   * @return status
   */
  @Valid 
  @Schema(name = "status", accessMode = Schema.AccessMode.READ_ONLY, description = "Indicate targeting template is active or Deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable TargetingTemplateStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable TargetingTemplateStatus status) {
    this.status = status;
  }

  public TargetingTemplate targetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
    return this;
  }

  /**
   * targeting profile attributes
   * @return targetingAttributes
   */
  @NotNull @Valid 
  @Schema(name = "targeting_attributes", description = "targeting profile attributes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targeting_attributes")
  public TargetingSpecOptimal getTargetingAttributes() {
    return targetingAttributes;
  }

  @JsonProperty("targeting_attributes")
  public void setTargetingAttributes(TargetingSpecOptimal targetingAttributes) {
    this.targetingAttributes = targetingAttributes;
  }

  public TargetingTemplate trackingUrls(TrackingUrls trackingUrls) {
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

  public TargetingTemplate updatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Targeting template updated time.Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Targeting template updated time.Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public @Nullable Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public TargetingTemplate valid(Boolean valid) {
    this.valid = JsonNullable.of(valid);
    return this;
  }

  /**
   * Inform if the targeting template is valid (ex. would be false if has revoked audience)
   * @return valid
   */
  
  @Schema(name = "valid", accessMode = Schema.AccessMode.READ_ONLY, description = "Inform if the targeting template is valid (ex. would be false if has revoked audience)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TargetingTemplate targetingTemplate = (TargetingTemplate) o;
    return Objects.equals(this.adAccountId, targetingTemplate.adAccountId) &&
        Objects.equals(this.autoTargetingEnabled, targetingTemplate.autoTargetingEnabled) &&
        Objects.equals(this.createdTime, targetingTemplate.createdTime) &&
        Objects.equals(this.id, targetingTemplate.id) &&
        Objects.equals(this.keywords, targetingTemplate.keywords) &&
        Objects.equals(this.name, targetingTemplate.name) &&
        Objects.equals(this.placementGroup, targetingTemplate.placementGroup) &&
        equalsNullable(this.sizing, targetingTemplate.sizing) &&
        Objects.equals(this.status, targetingTemplate.status) &&
        Objects.equals(this.targetingAttributes, targetingTemplate.targetingAttributes) &&
        equalsNullable(this.trackingUrls, targetingTemplate.trackingUrls) &&
        Objects.equals(this.updatedTime, targetingTemplate.updatedTime) &&
        equalsNullable(this.valid, targetingTemplate.valid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, autoTargetingEnabled, createdTime, id, keywords, name, placementGroup, hashCodeNullable(sizing), status, targetingAttributes, hashCodeNullable(trackingUrls), updatedTime, hashCodeNullable(valid));
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
    sb.append("class TargetingTemplate {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    autoTargetingEnabled: ").append(toIndentedString(autoTargetingEnabled)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    placementGroup: ").append(toIndentedString(placementGroup)).append("\n");
    sb.append("    sizing: ").append(toIndentedString(sizing)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetingAttributes: ").append(toIndentedString(targetingAttributes)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

