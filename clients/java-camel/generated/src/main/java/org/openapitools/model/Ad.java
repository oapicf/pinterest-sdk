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
import org.openapitools.model.AdDisapprovalReasons;
import org.openapitools.model.AdReviewStatus;
import org.openapitools.model.CartingProduct;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.QuizPinData;
import org.openapitools.model.TrackingUrls;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Ad {

  private String adAccountId;

  private String adGroupId;

  private JsonNullable<String> androidDeepLink = JsonNullable.<String>undefined();

  private String campaignId;

  @Valid
  private JsonNullable<List<String>> carouselAndroidDeepLinks = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselDestinationUrls = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselIosDeepLinks = JsonNullable.<List<String>>undefined();

  private Integer cartingPlatformType;

  @Valid
  private List<@Valid CartingProduct> cartingProducts = new ArrayList<>();

  private JsonNullable<String> clickTrackingUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> collectionItemsDestinationUrlTemplate = JsonNullable.<String>undefined();

  private JsonNullable<AdCollectionsHeaderType> collectionsHeaderType = JsonNullable.<AdCollectionsHeaderType>undefined();

  private Integer createdTime;

  private CreativeType creativeType;

  private JsonNullable<CustomizableCTAType> customizableCtaType = JsonNullable.<CustomizableCTAType>undefined();

  private JsonNullable<String> destinationUrl = JsonNullable.<String>undefined();

  private JsonNullable<DisclosureType> disclosureType = JsonNullable.<DisclosureType>undefined();

  private JsonNullable<String> disclosureUrl = JsonNullable.<String>undefined();

  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

  private String id;

  private JsonNullable<String> iosDeepLink = JsonNullable.<String>undefined();

  private Boolean isCarting;

  private Boolean isCollageAcceptedTerms;

  private Boolean isCollageSingleDestination;

  private Boolean isPinDeleted;

  private Boolean isRemovable;

  private JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private String pinId;

  private JsonNullable<QuizPinData> quizPinData = JsonNullable.<QuizPinData>undefined();

  @Valid
  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();

  @Valid
  private List<String> rejectionLabels = new ArrayList<>();

  private AdReviewStatus reviewStatus;

  private EntityStatus status;

  private PinPromotionSummaryStatus summaryStatus;

  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.<TrackingUrls>undefined();

  private String type;

  private Integer updatedTime;

  private JsonNullable<String> viewTrackingUrl = JsonNullable.<String>undefined();

  public Ad() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Ad(String adAccountId, String adGroupId, String campaignId, CreativeType creativeType, String id, String pinId, List<AdDisapprovalReasons> rejectedReasons, List<String> rejectionLabels, AdReviewStatus reviewStatus, PinPromotionSummaryStatus summaryStatus, String type) {
    this.adAccountId = adAccountId;
    this.adGroupId = adGroupId;
    this.campaignId = campaignId;
    this.creativeType = creativeType;
    this.id = id;
    this.pinId = pinId;
    this.rejectedReasons = rejectedReasons;
    this.rejectionLabels = rejectionLabels;
    this.reviewStatus = reviewStatus;
    this.summaryStatus = summaryStatus;
    this.type = type;
  }

  public Ad adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the advertiser that this ad belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public Ad adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
   */
  @NotNull @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", description = "ID of the ad group that contains the ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public Ad androidDeepLink(String androidDeepLink) {
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

  public Ad campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "campaign_id", accessMode = Schema.AccessMode.READ_ONLY, description = "ID of the ad campaign that contains this ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public Ad carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = JsonNullable.of(carouselAndroidDeepLinks);
    return this;
  }

  public Ad addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public Ad carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = JsonNullable.of(carouselDestinationUrls);
    return this;
  }

  public Ad addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public Ad carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = JsonNullable.of(carouselIosDeepLinks);
    return this;
  }

  public Ad addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
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

  public Ad cartingPlatformType(Integer cartingPlatformType) {
    this.cartingPlatformType = cartingPlatformType;
    return this;
  }

  /**
   * The vendor platform type of the carting/WTB ad.
   * minimum: 1
   * maximum: 2
   * @return cartingPlatformType
   */
  @Min(value = 1) @Max(value = 2) 
  @Schema(name = "carting_platform_type", accessMode = Schema.AccessMode.READ_ONLY, description = "The vendor platform type of the carting/WTB ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carting_platform_type")
  public Integer getCartingPlatformType() {
    return cartingPlatformType;
  }

  public void setCartingPlatformType(Integer cartingPlatformType) {
    this.cartingPlatformType = cartingPlatformType;
  }

  public Ad cartingProducts(List<@Valid CartingProduct> cartingProducts) {
    this.cartingProducts = cartingProducts;
    return this;
  }

  public Ad addCartingProductsItem(CartingProduct cartingProductsItem) {
    if (this.cartingProducts == null) {
      this.cartingProducts = new ArrayList<>();
    }
    this.cartingProducts.add(cartingProductsItem);
    return this;
  }

  /**
   * Array of carting/WTB products for the ad.
   * @return cartingProducts
   */
  @Valid 
  @Schema(name = "carting_products", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of carting/WTB products for the ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carting_products")
  public List<@Valid CartingProduct> getCartingProducts() {
    return cartingProducts;
  }

  public void setCartingProducts(List<@Valid CartingProduct> cartingProducts) {
    this.cartingProducts = cartingProducts;
  }

  public Ad clickTrackingUrl(String clickTrackingUrl) {
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

  public Ad collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
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

  public Ad collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
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

  public Ad createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Pin creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public Ad creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @NotNull @Valid 
  @Schema(name = "creative_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public Ad customizableCtaType(CustomizableCTAType customizableCtaType) {
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

  public Ad destinationUrl(String destinationUrl) {
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

  public Ad disclosureType(DisclosureType disclosureType) {
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

  public Ad disclosureUrl(String disclosureUrl) {
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

  public Ad gridClickType(GridClickType gridClickType) {
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

  public Ad id(String id) {
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

  public void setId(String id) {
    this.id = id;
  }

  public Ad iosDeepLink(String iosDeepLink) {
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

  public Ad isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
   */
  
  @Schema(name = "is_carting", description = "Is the ad a carting/WTB ad?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public Ad isCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
   */
  
  @Schema(name = "is_collage_accepted_terms", description = "Whether the advertiser has accepted the terms and conditions for collage ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  public Ad isCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

  /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
   */
  
  @Schema(name = "is_collage_single_destination", description = "Whether the collage ad has a single destination url override.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  public Ad isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
   */
  
  @Schema(name = "is_pin_deleted", description = "Is original pin deleted?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public Ad isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
   */
  
  @Schema(name = "is_removable", description = "Is pin repinnable?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public Ad leadFormId(String leadFormId) {
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

  public Ad name(String name) {
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

  public Ad pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", description = "Pin ID. This field may only be updated for draft ads.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public Ad quizPinData(QuizPinData quizPinData) {
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

  public Ad rejectedReasons(List<AdDisapprovalReasons> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  public Ad addRejectedReasonsItem(AdDisapprovalReasons rejectedReasonsItem) {
    if (this.rejectedReasons == null) {
      this.rejectedReasons = new ArrayList<>();
    }
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

  /**
   * Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
   * @return rejectedReasons
   */
  @Valid 
  @Schema(name = "rejected_reasons", accessMode = Schema.AccessMode.READ_ONLY, description = "Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejected_reasons")
  public List<AdDisapprovalReasons> getRejectedReasons() {
    return rejectedReasons;
  }

  public void setRejectedReasons(List<AdDisapprovalReasons> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public Ad rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  public Ad addRejectionLabelsItem(String rejectionLabelsItem) {
    if (this.rejectionLabels == null) {
      this.rejectionLabels = new ArrayList<>();
    }
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

  /**
   * Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
   * @return rejectionLabels
   */
  
  @Schema(name = "rejection_labels", accessMode = Schema.AccessMode.READ_ONLY, description = "Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public Ad reviewStatus(AdReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Ad review status
   * @return reviewStatus
   */
  @Valid 
  @Schema(name = "review_status", accessMode = Schema.AccessMode.READ_ONLY, description = "Ad review status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("review_status")
  public AdReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(AdReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public Ad status(EntityStatus status) {
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
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public Ad summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Ad summary status
   * @return summaryStatus
   */
  @Valid 
  @Schema(name = "summary_status", accessMode = Schema.AccessMode.READ_ONLY, description = "Ad summary status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public Ad trackingUrls(TrackingUrls trackingUrls) {
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

  public Ad type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"ad\".
   * @return type
   */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "Always \"ad\".", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Ad updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public Ad viewTrackingUrl(String viewTrackingUrl) {
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
    Ad ad = (Ad) o;
    return Objects.equals(this.adAccountId, ad.adAccountId) &&
        Objects.equals(this.adGroupId, ad.adGroupId) &&
        equalsNullable(this.androidDeepLink, ad.androidDeepLink) &&
        Objects.equals(this.campaignId, ad.campaignId) &&
        equalsNullable(this.carouselAndroidDeepLinks, ad.carouselAndroidDeepLinks) &&
        equalsNullable(this.carouselDestinationUrls, ad.carouselDestinationUrls) &&
        equalsNullable(this.carouselIosDeepLinks, ad.carouselIosDeepLinks) &&
        Objects.equals(this.cartingPlatformType, ad.cartingPlatformType) &&
        Objects.equals(this.cartingProducts, ad.cartingProducts) &&
        equalsNullable(this.clickTrackingUrl, ad.clickTrackingUrl) &&
        equalsNullable(this.collectionItemsDestinationUrlTemplate, ad.collectionItemsDestinationUrlTemplate) &&
        equalsNullable(this.collectionsHeaderType, ad.collectionsHeaderType) &&
        Objects.equals(this.createdTime, ad.createdTime) &&
        Objects.equals(this.creativeType, ad.creativeType) &&
        equalsNullable(this.customizableCtaType, ad.customizableCtaType) &&
        equalsNullable(this.destinationUrl, ad.destinationUrl) &&
        equalsNullable(this.disclosureType, ad.disclosureType) &&
        equalsNullable(this.disclosureUrl, ad.disclosureUrl) &&
        equalsNullable(this.gridClickType, ad.gridClickType) &&
        Objects.equals(this.id, ad.id) &&
        equalsNullable(this.iosDeepLink, ad.iosDeepLink) &&
        Objects.equals(this.isCarting, ad.isCarting) &&
        Objects.equals(this.isCollageAcceptedTerms, ad.isCollageAcceptedTerms) &&
        Objects.equals(this.isCollageSingleDestination, ad.isCollageSingleDestination) &&
        Objects.equals(this.isPinDeleted, ad.isPinDeleted) &&
        Objects.equals(this.isRemovable, ad.isRemovable) &&
        equalsNullable(this.leadFormId, ad.leadFormId) &&
        equalsNullable(this.name, ad.name) &&
        Objects.equals(this.pinId, ad.pinId) &&
        equalsNullable(this.quizPinData, ad.quizPinData) &&
        Objects.equals(this.rejectedReasons, ad.rejectedReasons) &&
        Objects.equals(this.rejectionLabels, ad.rejectionLabels) &&
        Objects.equals(this.reviewStatus, ad.reviewStatus) &&
        Objects.equals(this.status, ad.status) &&
        Objects.equals(this.summaryStatus, ad.summaryStatus) &&
        equalsNullable(this.trackingUrls, ad.trackingUrls) &&
        Objects.equals(this.type, ad.type) &&
        Objects.equals(this.updatedTime, ad.updatedTime) &&
        equalsNullable(this.viewTrackingUrl, ad.viewTrackingUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, hashCodeNullable(androidDeepLink), campaignId, hashCodeNullable(carouselAndroidDeepLinks), hashCodeNullable(carouselDestinationUrls), hashCodeNullable(carouselIosDeepLinks), cartingPlatformType, cartingProducts, hashCodeNullable(clickTrackingUrl), hashCodeNullable(collectionItemsDestinationUrlTemplate), hashCodeNullable(collectionsHeaderType), createdTime, creativeType, hashCodeNullable(customizableCtaType), hashCodeNullable(destinationUrl), hashCodeNullable(disclosureType), hashCodeNullable(disclosureUrl), hashCodeNullable(gridClickType), id, hashCodeNullable(iosDeepLink), isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, hashCodeNullable(leadFormId), hashCodeNullable(name), pinId, hashCodeNullable(quizPinData), rejectedReasons, rejectionLabels, reviewStatus, status, summaryStatus, hashCodeNullable(trackingUrls), type, updatedTime, hashCodeNullable(viewTrackingUrl));
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
    sb.append("class Ad {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    carouselAndroidDeepLinks: ").append(toIndentedString(carouselAndroidDeepLinks)).append("\n");
    sb.append("    carouselDestinationUrls: ").append(toIndentedString(carouselDestinationUrls)).append("\n");
    sb.append("    carouselIosDeepLinks: ").append(toIndentedString(carouselIosDeepLinks)).append("\n");
    sb.append("    cartingPlatformType: ").append(toIndentedString(cartingPlatformType)).append("\n");
    sb.append("    cartingProducts: ").append(toIndentedString(cartingProducts)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
    sb.append("    rejectedReasons: ").append(toIndentedString(rejectedReasons)).append("\n");
    sb.append("    rejectionLabels: ").append(toIndentedString(rejectionLabels)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    viewTrackingUrl: ").append(toIndentedString(viewTrackingUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

