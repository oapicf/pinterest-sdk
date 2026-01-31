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
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.QuizPinData;
import org.openapitools.model.TrackingUrls;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdResponse {

  private @Nullable String adGroupId;

  private JsonNullable<String> androidDeepLink = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> carouselAndroidDeepLinks = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselDestinationUrls = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselIosDeepLinks = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> clickTrackingUrl = JsonNullable.<String>undefined();

  private @Nullable CreativeType creativeType;

  private JsonNullable<CustomizableCTAType> customizableCtaType = JsonNullable.<CustomizableCTAType>undefined();

  private JsonNullable<String> destinationUrl = JsonNullable.<String>undefined();

  private JsonNullable<DisclosureType> disclosureType = JsonNullable.<DisclosureType>undefined();

  private JsonNullable<String> disclosureUrl = JsonNullable.<String>undefined();

  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  private JsonNullable<String> iosDeepLink = JsonNullable.<String>undefined();

  private @Nullable Boolean isPinDeleted;

  private @Nullable Boolean isRemovable;

  private JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<QuizPinData> quizPinData = JsonNullable.<QuizPinData>undefined();

  private @Nullable EntityStatus status;

  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  private JsonNullable<String> viewTrackingUrl = JsonNullable.<String>undefined();

  private @Nullable String pinId;

  private @Nullable String adAccountId;

  private @Nullable String campaignId;

  private JsonNullable<String> collectionItemsDestinationUrlTemplate = JsonNullable.<String>undefined();

  private @Nullable Integer createdTime;

  private @Nullable String id;

  /**
   * ad disapproval reasons
   */
  public enum RejectedReasonsEnum {
    HASHTAGS("HASHTAGS"),
    
    PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),
    
    TARGETING("TARGETING"),
    
    LANDING_PAGE("LANDING_PAGE"),
    
    CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),
    
    SHOCKING("SHOCKING"),
    
    WEIGHT_LOSS("WEIGHT_LOSS"),
    
    PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),
    
    AUTHENTICITY("AUTHENTICITY"),
    
    NUDITY("NUDITY"),
    
    CONFUSING_DESIGN("CONFUSING_DESIGN"),
    
    URGENCY("URGENCY"),
    
    RATINGS("RATINGS"),
    
    APP("APP"),
    
    ALCOHOL("ALCOHOL"),
    
    CONTESTS("CONTESTS"),
    
    POLITICAL("POLITICAL"),
    
    OTHER("OTHER"),
    
    IMAGE("IMAGE"),
    
    NAR("NAR"),
    
    INCONSISTENT("INCONSISTENT"),
    
    CLICKBAIT("CLICKBAIT"),
    
    NO_DESCRIPTION("NO_DESCRIPTION"),
    
    LOW_QUALITY("LOW_QUALITY"),
    
    EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),
    
    PINTEREST_BRAND("PINTEREST_BRAND"),
    
    ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),
    
    LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),
    
    LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),
    
    LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),
    
    LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),
    
    OUT_OF_STOCK("OUT_OF_STOCK"),
    
    IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),
    
    IMAGE_BUSY("IMAGE_BUSY"),
    
    IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),
    
    IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),
    
    UGC("UGC"),
    
    FAKE_BUTTONS("FAKE_BUTTONS"),
    
    WEAPONS("WEAPONS"),
    
    SENSITIVE("SENSITIVE"),
    
    UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),
    
    SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),
    
    PHARMA("PHARMA"),
    
    SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
    
    ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),
    
    LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),
    
    RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),
    
    INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR");

    private final String value;

    RejectedReasonsEnum(String value) {
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
    public static RejectedReasonsEnum fromValue(String value) {
      for (RejectedReasonsEnum b : RejectedReasonsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<RejectedReasonsEnum> rejectedReasons = new ArrayList<>();

  @Valid
  private List<String> rejectionLabels = new ArrayList<>();

  /**
   * Ad review status
   */
  public enum ReviewStatusEnum {
    OTHER("OTHER"),
    
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED");

    private final String value;

    ReviewStatusEnum(String value) {
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
    public static ReviewStatusEnum fromValue(String value) {
      for (ReviewStatusEnum b : ReviewStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ReviewStatusEnum reviewStatus;

  private @Nullable PinPromotionSummaryStatus summaryStatus;

  private @Nullable String type;

  private @Nullable Integer updatedTime;

  public AdResponse adGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
   */
  @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the ad group that contains the ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_id")
  public @Nullable String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(@Nullable String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdResponse androidDeepLink(String androidDeepLink) {
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

  public AdResponse carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = JsonNullable.of(carouselAndroidDeepLinks);
    return this;
  }

  public AdResponse addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public AdResponse carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = JsonNullable.of(carouselDestinationUrls);
    return this;
  }

  public AdResponse addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public AdResponse carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = JsonNullable.of(carouselIosDeepLinks);
    return this;
  }

  public AdResponse addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
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

  public AdResponse clickTrackingUrl(String clickTrackingUrl) {
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

  public AdResponse creativeType(@Nullable CreativeType creativeType) {
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

  public void setCreativeType(@Nullable CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdResponse customizableCtaType(CustomizableCTAType customizableCtaType) {
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

  public AdResponse destinationUrl(String destinationUrl) {
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

  public AdResponse disclosureType(DisclosureType disclosureType) {
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

  public AdResponse disclosureUrl(String disclosureUrl) {
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

  public AdResponse gridClickType(GridClickType gridClickType) {
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

  public AdResponse iosDeepLink(String iosDeepLink) {
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

  public AdResponse isPinDeleted(@Nullable Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
   */
  
  @Schema(name = "is_pin_deleted", example = "false", description = "Is original pin deleted?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pin_deleted")
  public @Nullable Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(@Nullable Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdResponse isRemovable(@Nullable Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
   */
  
  @Schema(name = "is_removable", example = "false", description = "Is pin repinnable?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_removable")
  public @Nullable Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(@Nullable Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdResponse leadFormId(String leadFormId) {
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

  public AdResponse name(String name) {
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

  public AdResponse quizPinData(QuizPinData quizPinData) {
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

  public AdResponse status(@Nullable EntityStatus status) {
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

  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public AdResponse trackingUrls(TrackingUrls trackingUrls) {
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

  public AdResponse viewTrackingUrl(String viewTrackingUrl) {
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

  public AdResponse pinId(@Nullable String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID.
   * @return pinId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", example = "394205773611545468", description = "Pin ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_id")
  public @Nullable String getPinId() {
    return pinId;
  }

  public void setPinId(@Nullable String pinId) {
    this.pinId = pinId;
  }

  public AdResponse adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "The ID of the advertiser that this ad belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdResponse campaignId(@Nullable String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "campaign_id", example = "626735565838", description = "ID of the ad campaign that contains this ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_id")
  public @Nullable String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(@Nullable String campaignId) {
    this.campaignId = campaignId;
  }

  public AdResponse collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
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

  public AdResponse createdTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", example = "1451431341", description = "Pin creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdResponse id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this ad.
   * @return id
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "687195134316", description = "The ID of this ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  public void setId(@Nullable String id) {
    this.id = id;
  }

  public AdResponse rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  public AdResponse addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (this.rejectedReasons == null) {
      this.rejectedReasons = new ArrayList<>();
    }
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

  /**
   * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
   * @return rejectedReasons
   */
  
  @Schema(name = "rejected_reasons", description = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public AdResponse rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  public AdResponse addRejectionLabelsItem(String rejectionLabelsItem) {
    if (this.rejectionLabels == null) {
      this.rejectionLabels = new ArrayList<>();
    }
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

  /**
   * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
   * @return rejectionLabels
   */
  
  @Schema(name = "rejection_labels", description = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponse reviewStatus(@Nullable ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Ad review status
   * @return reviewStatus
   */
  
  @Schema(name = "review_status", example = "PENDING", description = "Ad review status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("review_status")
  public @Nullable ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(@Nullable ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public AdResponse summaryStatus(@Nullable PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Ad summary status
   * @return summaryStatus
   */
  @Valid 
  @Schema(name = "summary_status", description = "Ad summary status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary_status")
  public @Nullable PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(@Nullable PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdResponse type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"ad\".
   * @return type
   */
  
  @Schema(name = "type", example = "pinpromotion", description = "Always \"ad\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public AdResponse updatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", example = "1451431341", description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public @Nullable Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdResponse adResponse = (AdResponse) o;
    return Objects.equals(this.adGroupId, adResponse.adGroupId) &&
        equalsNullable(this.androidDeepLink, adResponse.androidDeepLink) &&
        equalsNullable(this.carouselAndroidDeepLinks, adResponse.carouselAndroidDeepLinks) &&
        equalsNullable(this.carouselDestinationUrls, adResponse.carouselDestinationUrls) &&
        equalsNullable(this.carouselIosDeepLinks, adResponse.carouselIosDeepLinks) &&
        equalsNullable(this.clickTrackingUrl, adResponse.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adResponse.creativeType) &&
        equalsNullable(this.customizableCtaType, adResponse.customizableCtaType) &&
        equalsNullable(this.destinationUrl, adResponse.destinationUrl) &&
        equalsNullable(this.disclosureType, adResponse.disclosureType) &&
        equalsNullable(this.disclosureUrl, adResponse.disclosureUrl) &&
        equalsNullable(this.gridClickType, adResponse.gridClickType) &&
        equalsNullable(this.iosDeepLink, adResponse.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adResponse.isPinDeleted) &&
        Objects.equals(this.isRemovable, adResponse.isRemovable) &&
        equalsNullable(this.leadFormId, adResponse.leadFormId) &&
        equalsNullable(this.name, adResponse.name) &&
        equalsNullable(this.quizPinData, adResponse.quizPinData) &&
        Objects.equals(this.status, adResponse.status) &&
        equalsNullable(this.trackingUrls, adResponse.trackingUrls) &&
        equalsNullable(this.viewTrackingUrl, adResponse.viewTrackingUrl) &&
        Objects.equals(this.pinId, adResponse.pinId) &&
        Objects.equals(this.adAccountId, adResponse.adAccountId) &&
        Objects.equals(this.campaignId, adResponse.campaignId) &&
        equalsNullable(this.collectionItemsDestinationUrlTemplate, adResponse.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.createdTime, adResponse.createdTime) &&
        Objects.equals(this.id, adResponse.id) &&
        Objects.equals(this.rejectedReasons, adResponse.rejectedReasons) &&
        Objects.equals(this.rejectionLabels, adResponse.rejectionLabels) &&
        Objects.equals(this.reviewStatus, adResponse.reviewStatus) &&
        Objects.equals(this.summaryStatus, adResponse.summaryStatus) &&
        Objects.equals(this.type, adResponse.type) &&
        Objects.equals(this.updatedTime, adResponse.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, hashCodeNullable(androidDeepLink), hashCodeNullable(carouselAndroidDeepLinks), hashCodeNullable(carouselDestinationUrls), hashCodeNullable(carouselIosDeepLinks), hashCodeNullable(clickTrackingUrl), creativeType, hashCodeNullable(customizableCtaType), hashCodeNullable(destinationUrl), hashCodeNullable(disclosureType), hashCodeNullable(disclosureUrl), hashCodeNullable(gridClickType), hashCodeNullable(iosDeepLink), isPinDeleted, isRemovable, hashCodeNullable(leadFormId), hashCodeNullable(name), hashCodeNullable(quizPinData), status, hashCodeNullable(trackingUrls), hashCodeNullable(viewTrackingUrl), pinId, adAccountId, campaignId, hashCodeNullable(collectionItemsDestinationUrlTemplate), createdTime, id, rejectedReasons, rejectionLabels, reviewStatus, summaryStatus, type, updatedTime);
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
    sb.append("class AdResponse {\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    carouselAndroidDeepLinks: ").append(toIndentedString(carouselAndroidDeepLinks)).append("\n");
    sb.append("    carouselDestinationUrls: ").append(toIndentedString(carouselDestinationUrls)).append("\n");
    sb.append("    carouselIosDeepLinks: ").append(toIndentedString(carouselIosDeepLinks)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureUrl: ").append(toIndentedString(disclosureUrl)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    isPinDeleted: ").append(toIndentedString(isPinDeleted)).append("\n");
    sb.append("    isRemovable: ").append(toIndentedString(isRemovable)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quizPinData: ").append(toIndentedString(quizPinData)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    viewTrackingUrl: ").append(toIndentedString(viewTrackingUrl)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rejectedReasons: ").append(toIndentedString(rejectedReasons)).append("\n");
    sb.append("    rejectionLabels: ").append(toIndentedString(rejectionLabels)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

