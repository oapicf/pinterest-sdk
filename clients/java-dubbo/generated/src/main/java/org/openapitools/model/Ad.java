package org.openapitools.model;

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
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Ad implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the advertiser that this ad belongs to.
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * ID of the ad group that contains the ad.
   */
  @JsonProperty("ad_group_id")
  private String adGroupId;

  /**
   * Deep link URL for Android devices.
   */
  @JsonProperty("android_deep_link")
  private String androidDeepLink;

  /**
   * ID of the ad campaign that contains this ad.
   */
  @JsonProperty("campaign_id")
  private String campaignId;

  /**
   * Comma-separated deep links for the carousel pin on Android.
   */
  @JsonProperty("carousel_android_deep_links")
  private List<String> carouselAndroidDeepLinks;

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   */
  @JsonProperty("carousel_destination_urls")
  private List<String> carouselDestinationUrls;

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   */
  @JsonProperty("carousel_ios_deep_links")
  private List<String> carouselIosDeepLinks;

  /**
   * The vendor platform type of the carting/WTB ad.
   */
  @JsonProperty("carting_platform_type")
  private Integer cartingPlatformType;

  /**
   * Array of carting/WTB products for the ad.
   */
  @JsonProperty("carting_products")
  private List<CartingProduct> cartingProducts = new ArrayList<>();

  /**
   * Tracking url for the ad clicks.
   */
  @JsonProperty("click_tracking_url")
  private String clickTrackingUrl;

  /**
   * Destination URL template for all items within a collections drawer.
   */
  @JsonProperty("collection_items_destination_url_template")
  private String collectionItemsDestinationUrlTemplate;

  @JsonProperty("collections_header_type")
  private AdCollectionsHeaderType collectionsHeaderType;

  /**
   * Pin creation time. Unix timestamp in seconds.
   */
  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  private CustomizableCTAType customizableCtaType;

  /**
   * Destination URL.
   */
  @JsonProperty("destination_url")
  private String destinationUrl;

  @JsonProperty("disclosure_type")
  private DisclosureType disclosureType;

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   */
  @JsonProperty("disclosure_url")
  private String disclosureUrl;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  /**
   * The ID of this ad.
   */
  @JsonProperty("id")
  private String id;

  /**
   * Deep link URL for iOS devices.
   */
  @JsonProperty("ios_deep_link")
  private String iosDeepLink;

  /**
   * Is the ad a carting/WTB ad?
   */
  @JsonProperty("is_carting")
  private Boolean isCarting;

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   */
  @JsonProperty("is_collage_accepted_terms")
  private Boolean isCollageAcceptedTerms;

  /**
   * Whether the collage ad has a single destination url override.
   */
  @JsonProperty("is_collage_single_destination")
  private Boolean isCollageSingleDestination;

  /**
   * Is original pin deleted?
   */
  @JsonProperty("is_pin_deleted")
  private Boolean isPinDeleted;

  /**
   * Is pin repinnable?
   */
  @JsonProperty("is_removable")
  private Boolean isRemovable;

  /**
   * Lead form ID for lead ad generation.
   */
  @JsonProperty("lead_form_id")
  private String leadFormId;

  /**
   * Name of the ad - 255 chars max.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Pin ID. This field may only be updated for draft ads.
   */
  @JsonProperty("pin_id")
  private String pinId;

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   */
  @JsonProperty("quiz_pin_data")
  private QuizPinData quizPinData;

  /**
   * Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   */
  @JsonProperty("rejected_reasons")
  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();

  /**
   * Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   */
  @JsonProperty("rejection_labels")
  private List<String> rejectionLabels = new ArrayList<>();

  /**
   * Ad review status
   */
  @JsonProperty("review_status")
  private AdReviewStatus reviewStatus;

  @JsonProperty("status")
  private EntityStatus status;

  /**
   * Ad summary status
   */
  @JsonProperty("summary_status")
  private PinPromotionSummaryStatus summaryStatus;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  /**
   * Always \&quot;ad\&quot;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * Last update time. Unix timestamp in seconds.
   */
  @JsonProperty("updated_time")
  private Integer updatedTime;

  /**
   * Tracking URL for ad impressions.
   */
  @JsonProperty("view_tracking_url")
  private String viewTrackingUrl;

  /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
   */
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
   */
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
   */
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
   */
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
   */
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
   */
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  /**
   * The vendor platform type of the carting/WTB ad.
   * @return cartingPlatformType
   */
  public Integer getCartingPlatformType() {
    return cartingPlatformType;
  }

  public void setCartingPlatformType(Integer cartingPlatformType) {
    this.cartingPlatformType = cartingPlatformType;
  }

  /**
   * Array of carting/WTB products for the ad.
   * @return cartingProducts
   */
  public List<CartingProduct> getCartingProducts() {
    return cartingProducts;
  }

  public void setCartingProducts(List<CartingProduct> cartingProducts) {
    this.cartingProducts = cartingProducts;
  }

  /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
   */
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
   */
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  /**
   * 
   * @return collectionsHeaderType
   */
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * 
   * @return creativeType
   */
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * 
   * @return customizableCtaType
   */
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Destination URL.
   * @return destinationUrl
   */
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * 
   * @return disclosureType
   */
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
   */
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  /**
   * 
   * @return gridClickType
   */
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   * The ID of this ad.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
   */
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
   */
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
   */
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
   */
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
   */
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
   */
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
   */
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Name of the ad - 255 chars max.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
   */
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  /**
   * Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   * @return rejectedReasons
   */
  public List<AdDisapprovalReasons> getRejectedReasons() {
    return rejectedReasons;
  }

  public void setRejectedReasons(List<AdDisapprovalReasons> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  /**
   * Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
   * @return rejectionLabels
   */
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  /**
   * Ad review status
   * @return reviewStatus
   */
  public AdReviewStatus getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(AdReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  /**
   * 
   * @return status
   */
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Ad summary status
   * @return summaryStatus
   */
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  /**
   * 
   * @return trackingUrls
   */
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Always \&quot;ad\&quot;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
   */
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
