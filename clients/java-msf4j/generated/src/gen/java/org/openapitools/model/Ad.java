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

/**
 * Ad
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Ad   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("android_deep_link")
  private String androidDeepLink;

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("carousel_android_deep_links")
  private List<String> carouselAndroidDeepLinks = null;

  @JsonProperty("carousel_destination_urls")
  private List<String> carouselDestinationUrls = null;

  @JsonProperty("carousel_ios_deep_links")
  private List<String> carouselIosDeepLinks = null;

  @JsonProperty("carting_platform_type")
  private Integer cartingPlatformType;

  @JsonProperty("carting_products")
  private List<@Valid CartingProduct> cartingProducts = null;

  @JsonProperty("click_tracking_url")
  private String clickTrackingUrl;

  @JsonProperty("collection_items_destination_url_template")
  private String collectionItemsDestinationUrlTemplate;

  @JsonProperty("collections_header_type")
  private AdCollectionsHeaderType collectionsHeaderType;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  private CustomizableCTAType customizableCtaType;

  @JsonProperty("destination_url")
  private String destinationUrl;

  @JsonProperty("disclosure_type")
  private DisclosureType disclosureType;

  @JsonProperty("disclosure_url")
  private String disclosureUrl;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("ios_deep_link")
  private String iosDeepLink;

  @JsonProperty("is_carting")
  private Boolean isCarting;

  @JsonProperty("is_collage_accepted_terms")
  private Boolean isCollageAcceptedTerms;

  @JsonProperty("is_collage_single_destination")
  private Boolean isCollageSingleDestination;

  @JsonProperty("is_pin_deleted")
  private Boolean isPinDeleted;

  @JsonProperty("is_removable")
  private Boolean isRemovable;

  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pin_id")
  private String pinId;

  @JsonProperty("quiz_pin_data")
  private QuizPinData quizPinData;

  @JsonProperty("rejected_reasons")
  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();

  @JsonProperty("rejection_labels")
  private List<String> rejectionLabels = new ArrayList<>();

  @JsonProperty("review_status")
  private AdReviewStatus reviewStatus;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("summary_status")
  private PinPromotionSummaryStatus summaryStatus;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("view_tracking_url")
  private String viewTrackingUrl;

   /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(required = true, value = "The ID of the advertiser that this ad belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public Ad adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  **/
  @ApiModelProperty(required = true, value = "ID of the ad group that contains the ad.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public Ad androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

   /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
  **/
  @ApiModelProperty(value = "Deep link URL for Android devices.")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

   /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
  **/
  @ApiModelProperty(required = true, value = "ID of the ad campaign that contains this ad.")
  public String getCampaignId() {
    return campaignId;
  }

  public Ad carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public Ad addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = ;
    }
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  **/
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public Ad carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public Ad addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null) {
      this.carouselDestinationUrls = ;
    }
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

   /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  **/
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public Ad carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public Ad addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null) {
      this.carouselIosDeepLinks = ;
    }
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  **/
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

   /**
   * The vendor platform type of the carting/WTB ad.
   * minimum: 1
   * maximum: 2
   * @return cartingPlatformType
  **/
  @ApiModelProperty(value = "The vendor platform type of the carting/WTB ad.")
  public Integer getCartingPlatformType() {
    return cartingPlatformType;
  }

   /**
   * Array of carting/WTB products for the ad.
   * @return cartingProducts
  **/
  @ApiModelProperty(value = "Array of carting/WTB products for the ad.")
  public List<@Valid CartingProduct> getCartingProducts() {
    return cartingProducts;
  }

  public Ad clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  **/
  @ApiModelProperty(value = "Tracking url for the ad clicks.")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public Ad collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

   /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
  **/
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public Ad collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

   /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
  **/
  @ApiModelProperty(value = "")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

   /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Pin creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public Ad creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  @ApiModelProperty(required = true, value = "")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public Ad customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

   /**
   * Get customizableCtaType
   * @return customizableCtaType
  **/
  @ApiModelProperty(value = "")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public Ad destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * Destination URL.
   * @return destinationUrl
  **/
  @ApiModelProperty(value = "Destination URL.")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public Ad disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

   /**
   * Get disclosureType
   * @return disclosureType
  **/
  @ApiModelProperty(value = "")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  public Ad disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

   /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
  **/
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  public Ad gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

   /**
   * Get gridClickType
   * @return gridClickType
  **/
  @ApiModelProperty(value = "")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public Ad id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this ad.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of this ad.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ad iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

   /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
  **/
  @ApiModelProperty(value = "Deep link URL for iOS devices.")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public Ad isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

   /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
  **/
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")
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
  **/
  @ApiModelProperty(value = "Whether the advertiser has accepted the terms and conditions for collage ad.")
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
  **/
  @ApiModelProperty(value = "Whether the collage ad has a single destination url override.")
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
  **/
  @ApiModelProperty(value = "Is original pin deleted?")
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
  **/
  @ApiModelProperty(value = "Is pin repinnable?")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public Ad leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

   /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
  **/
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public Ad name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the ad - 255 chars max.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ad pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
  **/
  @ApiModelProperty(required = true, value = "Pin ID. This field may only be updated for draft ads.")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public Ad quizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

   /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
  **/
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

   /**
   * Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
   * @return rejectedReasons
  **/
  @ApiModelProperty(required = true, value = "Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")
  public List<AdDisapprovalReasons> getRejectedReasons() {
    return rejectedReasons;
  }

   /**
   * Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
   * @return rejectionLabels
  **/
  @ApiModelProperty(required = true, value = "Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

   /**
   * Ad review status
   * @return reviewStatus
  **/
  @ApiModelProperty(required = true, value = "Ad review status")
  public AdReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public Ad status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

   /**
   * Ad summary status
   * @return summaryStatus
  **/
  @ApiModelProperty(required = true, value = "Ad summary status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public Ad trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @ApiModelProperty(value = "")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

   /**
   * Always \"ad\".
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Always \"ad\".")
  public String getType() {
    return type;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public Ad viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

   /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  **/
  @ApiModelProperty(value = "Tracking URL for ad impressions.")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(String viewTrackingUrl) {
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
        Objects.equals(this.androidDeepLink, ad.androidDeepLink) &&
        Objects.equals(this.campaignId, ad.campaignId) &&
        Objects.equals(this.carouselAndroidDeepLinks, ad.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, ad.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, ad.carouselIosDeepLinks) &&
        Objects.equals(this.cartingPlatformType, ad.cartingPlatformType) &&
        Objects.equals(this.cartingProducts, ad.cartingProducts) &&
        Objects.equals(this.clickTrackingUrl, ad.clickTrackingUrl) &&
        Objects.equals(this.collectionItemsDestinationUrlTemplate, ad.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.collectionsHeaderType, ad.collectionsHeaderType) &&
        Objects.equals(this.createdTime, ad.createdTime) &&
        Objects.equals(this.creativeType, ad.creativeType) &&
        Objects.equals(this.customizableCtaType, ad.customizableCtaType) &&
        Objects.equals(this.destinationUrl, ad.destinationUrl) &&
        Objects.equals(this.disclosureType, ad.disclosureType) &&
        Objects.equals(this.disclosureUrl, ad.disclosureUrl) &&
        Objects.equals(this.gridClickType, ad.gridClickType) &&
        Objects.equals(this.id, ad.id) &&
        Objects.equals(this.iosDeepLink, ad.iosDeepLink) &&
        Objects.equals(this.isCarting, ad.isCarting) &&
        Objects.equals(this.isCollageAcceptedTerms, ad.isCollageAcceptedTerms) &&
        Objects.equals(this.isCollageSingleDestination, ad.isCollageSingleDestination) &&
        Objects.equals(this.isPinDeleted, ad.isPinDeleted) &&
        Objects.equals(this.isRemovable, ad.isRemovable) &&
        Objects.equals(this.leadFormId, ad.leadFormId) &&
        Objects.equals(this.name, ad.name) &&
        Objects.equals(this.pinId, ad.pinId) &&
        Objects.equals(this.quizPinData, ad.quizPinData) &&
        Objects.equals(this.rejectedReasons, ad.rejectedReasons) &&
        Objects.equals(this.rejectionLabels, ad.rejectionLabels) &&
        Objects.equals(this.reviewStatus, ad.reviewStatus) &&
        Objects.equals(this.status, ad.status) &&
        Objects.equals(this.summaryStatus, ad.summaryStatus) &&
        Objects.equals(this.trackingUrls, ad.trackingUrls) &&
        Objects.equals(this.type, ad.type) &&
        Objects.equals(this.updatedTime, ad.updatedTime) &&
        Objects.equals(this.viewTrackingUrl, ad.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, androidDeepLink, campaignId, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, cartingPlatformType, cartingProducts, clickTrackingUrl, collectionItemsDestinationUrlTemplate, collectionsHeaderType, createdTime, creativeType, customizableCtaType, destinationUrl, disclosureType, disclosureUrl, gridClickType, id, iosDeepLink, isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, leadFormId, name, pinId, quizPinData, rejectedReasons, rejectionLabels, reviewStatus, status, summaryStatus, trackingUrls, type, updatedTime, viewTrackingUrl);
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

