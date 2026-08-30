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
import org.openapitools.model.AdCollectionsHeaderType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.QuizPinData;
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
 * AdBatchUpdate
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdBatchUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adGroupId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> androidDeepLink = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> carouselAndroidDeepLinks = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> carouselDestinationUrls = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<List<String>> carouselIosDeepLinks = JsonNullable.<List<String>>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> clickTrackingUrl = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> collectionItemsDestinationUrlTemplate = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<AdCollectionsHeaderType> collectionsHeaderType = JsonNullable.<AdCollectionsHeaderType>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreativeType creativeType;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CustomizableCTAType> customizableCtaType = JsonNullable.<CustomizableCTAType>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> destinationUrl = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<DisclosureType> disclosureType = JsonNullable.<DisclosureType>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> disclosureUrl = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  private String id;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> iosDeepLink = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isCarting;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isCollageAcceptedTerms;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isCollageSingleDestination;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isPinDeleted;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isRemovable;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String pinId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<QuizPinData> quizPinData = JsonNullable.<QuizPinData>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> viewTrackingUrl = JsonNullable.<String>undefined();

  public AdBatchUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdBatchUpdate(String id) {
    this.id = id;
  }

  public AdBatchUpdate adGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
   */
  @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", description = "ID of the ad group that contains the ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_id")
  public @Nullable String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdBatchUpdate androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = JsonNullable.of(androidDeepLink);
    return this;
  }

  /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
   */
  
  @Schema(name = "android_deep_link", description = "Deep link URL for Android devices.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public JsonNullable<String> getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(JsonNullable<String> androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdBatchUpdate carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = JsonNullable.of(carouselAndroidDeepLinks);
    return this;
  }

  public AdBatchUpdate addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null || !this.carouselAndroidDeepLinks.isPresent()) {
      this.carouselAndroidDeepLinks = JsonNullable.of(new ArrayList<>());
    }
    this.carouselAndroidDeepLinks.get().add(carouselAndroidDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
   */
  
  @Schema(name = "carousel_android_deep_links", description = "Comma-separated deep links for the carousel pin on Android.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_android_deep_links")
  public JsonNullable<List<String>> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(JsonNullable<List<String>> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdBatchUpdate carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = JsonNullable.of(carouselDestinationUrls);
    return this;
  }

  public AdBatchUpdate addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null || !this.carouselDestinationUrls.isPresent()) {
      this.carouselDestinationUrls = JsonNullable.of(new ArrayList<>());
    }
    this.carouselDestinationUrls.get().add(carouselDestinationUrlsItem);
    return this;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
   */
  
  @Schema(name = "carousel_destination_urls", description = "Comma-separated destination URLs for the carousel pin to promote.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_destination_urls")
  public JsonNullable<List<String>> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(JsonNullable<List<String>> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdBatchUpdate carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = JsonNullable.of(carouselIosDeepLinks);
    return this;
  }

  public AdBatchUpdate addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null || !this.carouselIosDeepLinks.isPresent()) {
      this.carouselIosDeepLinks = JsonNullable.of(new ArrayList<>());
    }
    this.carouselIosDeepLinks.get().add(carouselIosDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
   */
  
  @Schema(name = "carousel_ios_deep_links", description = "Comma-separated deep links for the carousel pin on iOS.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_ios_deep_links")
  public JsonNullable<List<String>> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(JsonNullable<List<String>> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdBatchUpdate clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = JsonNullable.of(clickTrackingUrl);
    return this;
  }

  /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
   */
  
  @Schema(name = "click_tracking_url", description = "Tracking url for the ad clicks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_tracking_url")
  public JsonNullable<String> getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(JsonNullable<String> clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdBatchUpdate collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = JsonNullable.of(collectionItemsDestinationUrlTemplate);
    return this;
  }

  /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
   */
  
  @Schema(name = "collection_items_destination_url_template", description = "Destination URL template for all items within a collections drawer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collection_items_destination_url_template")
  public JsonNullable<String> getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(JsonNullable<String> collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public AdBatchUpdate collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = JsonNullable.of(collectionsHeaderType);
    return this;
  }

  /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
   */
  @Valid 
  @Schema(name = "collections_header_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collections_header_type")
  public JsonNullable<AdCollectionsHeaderType> getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(JsonNullable<AdCollectionsHeaderType> collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public AdBatchUpdate creativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @Valid 
  @Schema(name = "creative_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_type")
  public @Nullable CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
  public void setCreativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdBatchUpdate customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = JsonNullable.of(customizableCtaType);
    return this;
  }

  /**
   * Get customizableCtaType
   * @return customizableCtaType
   */
  @Valid 
  @Schema(name = "customizable_cta_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customizable_cta_type")
  public JsonNullable<CustomizableCTAType> getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(JsonNullable<CustomizableCTAType> customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdBatchUpdate destinationUrl(String destinationUrl) {
    this.destinationUrl = JsonNullable.of(destinationUrl);
    return this;
  }

  /**
   * Destination URL.
   * @return destinationUrl
   */
  
  @Schema(name = "destination_url", description = "Destination URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination_url")
  public JsonNullable<String> getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(JsonNullable<String> destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdBatchUpdate disclosureType(DisclosureType disclosureType) {
    this.disclosureType = JsonNullable.of(disclosureType);
    return this;
  }

  /**
   * Get disclosureType
   * @return disclosureType
   */
  @Valid 
  @Schema(name = "disclosure_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disclosure_type")
  public JsonNullable<DisclosureType> getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(JsonNullable<DisclosureType> disclosureType) {
    this.disclosureType = disclosureType;
  }

  public AdBatchUpdate disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = JsonNullable.of(disclosureUrl);
    return this;
  }

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
   */
  
  @Schema(name = "disclosure_url", description = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disclosure_url")
  public JsonNullable<String> getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(JsonNullable<String> disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  public AdBatchUpdate gridClickType(GridClickType gridClickType) {
    this.gridClickType = JsonNullable.of(gridClickType);
    return this;
  }

  /**
   * Get gridClickType
   * @return gridClickType
   */
  @Valid 
  @Schema(name = "grid_click_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grid_click_type")
  public JsonNullable<GridClickType> getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(JsonNullable<GridClickType> gridClickType) {
    this.gridClickType = gridClickType;
  }

  public AdBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this ad.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 18) 
  @Schema(name = "id", description = "The ID of this ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public AdBatchUpdate iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = JsonNullable.of(iosDeepLink);
    return this;
  }

  /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
   */
  
  @Schema(name = "ios_deep_link", description = "Deep link URL for iOS devices.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public JsonNullable<String> getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(JsonNullable<String> iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdBatchUpdate isCarting(@Nullable Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
   */
  
  @Schema(name = "is_carting", description = "Is the ad a carting/WTB ad?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_carting")
  public @Nullable Boolean getIsCarting() {
    return isCarting;
  }

  @JsonProperty("is_carting")
  public void setIsCarting(@Nullable Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public AdBatchUpdate isCollageAcceptedTerms(@Nullable Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
   */
  
  @Schema(name = "is_collage_accepted_terms", description = "Whether the advertiser has accepted the terms and conditions for collage ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_collage_accepted_terms")
  public @Nullable Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  @JsonProperty("is_collage_accepted_terms")
  public void setIsCollageAcceptedTerms(@Nullable Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  public AdBatchUpdate isCollageSingleDestination(@Nullable Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

  /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
   */
  
  @Schema(name = "is_collage_single_destination", description = "Whether the collage ad has a single destination url override.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_collage_single_destination")
  public @Nullable Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  @JsonProperty("is_collage_single_destination")
  public void setIsCollageSingleDestination(@Nullable Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  public AdBatchUpdate isPinDeleted(@Nullable Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
   */
  
  @Schema(name = "is_pin_deleted", description = "Is original pin deleted?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pin_deleted")
  public @Nullable Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  @JsonProperty("is_pin_deleted")
  public void setIsPinDeleted(@Nullable Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdBatchUpdate isRemovable(@Nullable Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
   */
  
  @Schema(name = "is_removable", description = "Is pin repinnable?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_removable")
  public @Nullable Boolean getIsRemovable() {
    return isRemovable;
  }

  @JsonProperty("is_removable")
  public void setIsRemovable(@Nullable Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdBatchUpdate leadFormId(String leadFormId) {
    this.leadFormId = JsonNullable.of(leadFormId);
    return this;
  }

  /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
   */
  @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "lead_form_id", description = "Lead form ID for lead ad generation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_form_id")
  public JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(JsonNullable<String> leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdBatchUpdate name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Name of the ad - 255 chars max.
   * @return name
   */
  
  @Schema(name = "name", description = "Name of the ad - 255 chars max.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AdBatchUpdate pinId(@Nullable String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", description = "Pin ID. This field may only be updated for draft ads.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_id")
  public @Nullable String getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
  public void setPinId(@Nullable String pinId) {
    this.pinId = pinId;
  }

  public AdBatchUpdate quizPinData(QuizPinData quizPinData) {
    this.quizPinData = JsonNullable.of(quizPinData);
    return this;
  }

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
   */
  @Valid 
  @Schema(name = "quiz_pin_data", description = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quiz_pin_data")
  public JsonNullable<QuizPinData> getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(JsonNullable<QuizPinData> quizPinData) {
    this.quizPinData = quizPinData;
  }

  public AdBatchUpdate status(@Nullable EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public AdBatchUpdate trackingUrls(TrackingUrls trackingUrls) {
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

  public AdBatchUpdate viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = JsonNullable.of(viewTrackingUrl);
    return this;
  }

  /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
   */
  
  @Schema(name = "view_tracking_url", description = "Tracking URL for ad impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_tracking_url")
  public JsonNullable<String> getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(JsonNullable<String> viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdBatchUpdate adBatchUpdate = (AdBatchUpdate) o;
    return Objects.equals(this.adGroupId, adBatchUpdate.adGroupId) &&
        equalsNullable(this.androidDeepLink, adBatchUpdate.androidDeepLink) &&
        equalsNullable(this.carouselAndroidDeepLinks, adBatchUpdate.carouselAndroidDeepLinks) &&
        equalsNullable(this.carouselDestinationUrls, adBatchUpdate.carouselDestinationUrls) &&
        equalsNullable(this.carouselIosDeepLinks, adBatchUpdate.carouselIosDeepLinks) &&
        equalsNullable(this.clickTrackingUrl, adBatchUpdate.clickTrackingUrl) &&
        equalsNullable(this.collectionItemsDestinationUrlTemplate, adBatchUpdate.collectionItemsDestinationUrlTemplate) &&
        equalsNullable(this.collectionsHeaderType, adBatchUpdate.collectionsHeaderType) &&
        Objects.equals(this.creativeType, adBatchUpdate.creativeType) &&
        equalsNullable(this.customizableCtaType, adBatchUpdate.customizableCtaType) &&
        equalsNullable(this.destinationUrl, adBatchUpdate.destinationUrl) &&
        equalsNullable(this.disclosureType, adBatchUpdate.disclosureType) &&
        equalsNullable(this.disclosureUrl, adBatchUpdate.disclosureUrl) &&
        equalsNullable(this.gridClickType, adBatchUpdate.gridClickType) &&
        Objects.equals(this.id, adBatchUpdate.id) &&
        equalsNullable(this.iosDeepLink, adBatchUpdate.iosDeepLink) &&
        Objects.equals(this.isCarting, adBatchUpdate.isCarting) &&
        Objects.equals(this.isCollageAcceptedTerms, adBatchUpdate.isCollageAcceptedTerms) &&
        Objects.equals(this.isCollageSingleDestination, adBatchUpdate.isCollageSingleDestination) &&
        Objects.equals(this.isPinDeleted, adBatchUpdate.isPinDeleted) &&
        Objects.equals(this.isRemovable, adBatchUpdate.isRemovable) &&
        equalsNullable(this.leadFormId, adBatchUpdate.leadFormId) &&
        equalsNullable(this.name, adBatchUpdate.name) &&
        Objects.equals(this.pinId, adBatchUpdate.pinId) &&
        equalsNullable(this.quizPinData, adBatchUpdate.quizPinData) &&
        Objects.equals(this.status, adBatchUpdate.status) &&
        equalsNullable(this.trackingUrls, adBatchUpdate.trackingUrls) &&
        equalsNullable(this.viewTrackingUrl, adBatchUpdate.viewTrackingUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, hashCodeNullable(androidDeepLink), hashCodeNullable(carouselAndroidDeepLinks), hashCodeNullable(carouselDestinationUrls), hashCodeNullable(carouselIosDeepLinks), hashCodeNullable(clickTrackingUrl), hashCodeNullable(collectionItemsDestinationUrlTemplate), hashCodeNullable(collectionsHeaderType), creativeType, hashCodeNullable(customizableCtaType), hashCodeNullable(destinationUrl), hashCodeNullable(disclosureType), hashCodeNullable(disclosureUrl), hashCodeNullable(gridClickType), id, hashCodeNullable(iosDeepLink), isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, hashCodeNullable(leadFormId), hashCodeNullable(name), pinId, hashCodeNullable(quizPinData), status, hashCodeNullable(trackingUrls), hashCodeNullable(viewTrackingUrl));
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
    sb.append("class AdBatchUpdate {\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    carouselAndroidDeepLinks: ").append(toIndentedString(carouselAndroidDeepLinks)).append("\n");
    sb.append("    carouselDestinationUrls: ").append(toIndentedString(carouselDestinationUrls)).append("\n");
    sb.append("    carouselIosDeepLinks: ").append(toIndentedString(carouselIosDeepLinks)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureUrl: ").append(toIndentedString(disclosureUrl)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    isCarting: ").append(toIndentedString(isCarting)).append("\n");
    sb.append("    isCollageAcceptedTerms: ").append(toIndentedString(isCollageAcceptedTerms)).append("\n");
    sb.append("    isCollageSingleDestination: ").append(toIndentedString(isCollageSingleDestination)).append("\n");
    sb.append("    isPinDeleted: ").append(toIndentedString(isPinDeleted)).append("\n");
    sb.append("    isRemovable: ").append(toIndentedString(isRemovable)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    quizPinData: ").append(toIndentedString(quizPinData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    viewTrackingUrl: ").append(toIndentedString(viewTrackingUrl)).append("\n");
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

