package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Ad  {
  
 /**
  * The ID of the advertiser that this ad belongs to.
  */
  @ApiModelProperty(required = true, value = "The ID of the advertiser that this ad belongs to.")

  private String adAccountId;

 /**
  * ID of the ad group that contains the ad.
  */
  @ApiModelProperty(required = true, value = "ID of the ad group that contains the ad.")

  private String adGroupId;

 /**
  * Deep link URL for Android devices.
  */
  @ApiModelProperty(value = "Deep link URL for Android devices.")

  private String androidDeepLink;

 /**
  * ID of the ad campaign that contains this ad.
  */
  @ApiModelProperty(required = true, value = "ID of the ad campaign that contains this ad.")

  private String campaignId;

 /**
  * Comma-separated deep links for the carousel pin on Android.
  */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")

  private List<String> carouselAndroidDeepLinks;

 /**
  * Comma-separated destination URLs for the carousel pin to promote.
  */
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")

  private List<String> carouselDestinationUrls;

 /**
  * Comma-separated deep links for the carousel pin on iOS.
  */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")

  private List<String> carouselIosDeepLinks;

 /**
  * The vendor platform type of the carting/WTB ad.
  */
  @ApiModelProperty(value = "The vendor platform type of the carting/WTB ad.")

  private Integer cartingPlatformType;

 /**
  * Array of carting/WTB products for the ad.
  */
  @ApiModelProperty(value = "Array of carting/WTB products for the ad.")

  private List<CartingProduct> cartingProducts = new ArrayList<>();

 /**
  * Tracking url for the ad clicks.
  */
  @ApiModelProperty(value = "Tracking url for the ad clicks.")

  private String clickTrackingUrl;

 /**
  * Destination URL template for all items within a collections drawer.
  */
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")

  private String collectionItemsDestinationUrlTemplate;

  @ApiModelProperty(value = "")

  private AdCollectionsHeaderType collectionsHeaderType;

 /**
  * Pin creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Pin creation time. Unix timestamp in seconds.")

  private Integer createdTime;

  @ApiModelProperty(required = true, value = "")

  private CreativeType creativeType;

  @ApiModelProperty(value = "")

  private CustomizableCTAType customizableCtaType;

 /**
  * Destination URL.
  */
  @ApiModelProperty(value = "Destination URL.")

  private String destinationUrl;

  @ApiModelProperty(value = "")

  private DisclosureType disclosureType;

 /**
  * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  */
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")

  private String disclosureUrl;

  @ApiModelProperty(value = "")

  private GridClickType gridClickType;

 /**
  * The ID of this ad.
  */
  @ApiModelProperty(required = true, value = "The ID of this ad.")

  private String id;

 /**
  * Deep link URL for iOS devices.
  */
  @ApiModelProperty(value = "Deep link URL for iOS devices.")

  private String iosDeepLink;

 /**
  * Is the ad a carting/WTB ad?
  */
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")

  private Boolean isCarting;

 /**
  * Whether the advertiser has accepted the terms and conditions for collage ad.
  */
  @ApiModelProperty(value = "Whether the advertiser has accepted the terms and conditions for collage ad.")

  private Boolean isCollageAcceptedTerms;

 /**
  * Whether the collage ad has a single destination url override.
  */
  @ApiModelProperty(value = "Whether the collage ad has a single destination url override.")

  private Boolean isCollageSingleDestination;

 /**
  * Is original pin deleted?
  */
  @ApiModelProperty(value = "Is original pin deleted?")

  private Boolean isPinDeleted;

 /**
  * Is pin repinnable?
  */
  @ApiModelProperty(value = "Is pin repinnable?")

  private Boolean isRemovable;

 /**
  * Lead form ID for lead ad generation.
  */
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")

  private String leadFormId;

 /**
  * Name of the ad - 255 chars max.
  */
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")

  private String name;

 /**
  * Pin ID. This field may only be updated for draft ads.
  */
  @ApiModelProperty(required = true, value = "Pin ID. This field may only be updated for draft ads.")

  private String pinId;

 /**
  * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  */
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")

  private QuizPinData quizPinData;

 /**
  * Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  */
  @ApiModelProperty(required = true, value = "Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")

  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();

 /**
  * Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  */
  @ApiModelProperty(required = true, value = "Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")

  private List<String> rejectionLabels = new ArrayList<>();

 /**
  * Ad review status
  */
  @ApiModelProperty(required = true, value = "Ad review status")

  private AdReviewStatus reviewStatus;

  @ApiModelProperty(value = "")

  private EntityStatus status;

 /**
  * Ad summary status
  */
  @ApiModelProperty(required = true, value = "Ad summary status")

  private PinPromotionSummaryStatus summaryStatus;

  @ApiModelProperty(value = "")

  private TrackingUrls trackingUrls;

 /**
  * Always \"ad\".
  */
  @ApiModelProperty(required = true, value = "Always \"ad\".")

  private String type;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")

  private Integer updatedTime;

 /**
  * Tracking URL for ad impressions.
  */
  @ApiModelProperty(value = "Tracking URL for ad impressions.")

  private String viewTrackingUrl;
 /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }


 /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public Ad adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
  **/
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public Ad androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

 /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }


 /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  **/
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public Ad carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public Ad addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

 /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  **/
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public Ad carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public Ad addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

 /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  **/
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public Ad carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public Ad addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

 /**
   * The vendor platform type of the carting/WTB ad.
   * minimum: 1
   * maximum: 2
   * @return cartingPlatformType
  **/
  @JsonProperty("carting_platform_type")
  public Integer getCartingPlatformType() {
    return cartingPlatformType;
  }


 /**
   * Array of carting/WTB products for the ad.
   * @return cartingProducts
  **/
  @JsonProperty("carting_products")
  public List<CartingProduct> getCartingProducts() {
    return cartingProducts;
  }


 /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  **/
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public Ad clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

 /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
  **/
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public Ad collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

 /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
  **/
  @JsonProperty("collections_header_type")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public Ad collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

 /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }


 /**
   * Get creativeType
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public Ad creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
   * Get customizableCtaType
   * @return customizableCtaType
  **/
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public Ad customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
   * Destination URL.
   * @return destinationUrl
  **/
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public Ad destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

 /**
   * Get disclosureType
   * @return disclosureType
  **/
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  public Ad disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

 /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
  **/
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  public Ad disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

 /**
   * Get gridClickType
   * @return gridClickType
  **/
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public Ad gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
   * The ID of this ad.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Ad id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
  **/
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public Ad iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

 /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
  **/
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public Ad isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

 /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
  **/
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  public Ad isCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

 /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
  **/
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  public Ad isCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

 /**
   * Is original pin deleted?
   * @return isPinDeleted
  **/
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public Ad isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

 /**
   * Is pin repinnable?
   * @return isRemovable
  **/
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public Ad isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

 /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
  **/
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public Ad leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
   * Name of the ad - 255 chars max.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Ad name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public Ad pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

 /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
  **/
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  public Ad quizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

 /**
   * Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   * @return rejectedReasons
  **/
  @JsonProperty("rejected_reasons")
  public List<AdDisapprovalReasons> getRejectedReasons() {
    return rejectedReasons;
  }


 /**
   * Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   * @return rejectionLabels
  **/
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }


 /**
   * Ad review status
   * @return reviewStatus
  **/
  @JsonProperty("review_status")
  public AdReviewStatus getReviewStatus() {
    return reviewStatus;
  }


 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public Ad status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Ad summary status
   * @return summaryStatus
  **/
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }


 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public Ad trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
   * Always \&quot;ad\&quot;.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }


 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }


 /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  **/
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  public Ad viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

