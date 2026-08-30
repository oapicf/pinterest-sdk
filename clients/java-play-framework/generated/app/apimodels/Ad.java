package apimodels;

import apimodels.AdCollectionsHeaderType;
import apimodels.AdDisapprovalReasons;
import apimodels.AdReviewStatus;
import apimodels.CartingProduct;
import apimodels.CreativeType;
import apimodels.CustomizableCTAType;
import apimodels.DisclosureType;
import apimodels.EntityStatus;
import apimodels.GridClickType;
import apimodels.PinPromotionSummaryStatus;
import apimodels.QuizPinData;
import apimodels.TrackingUrls;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Ad   {
  @JsonProperty("ad_account_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adAccountId;

  @JsonProperty("ad_group_id")
  @NotNull
@Pattern(regexp="^(AG)?\\d+$")

  private String adGroupId;

  @JsonProperty("android_deep_link")
  
  private String androidDeepLink;

  @JsonProperty("campaign_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String campaignId;

  @JsonProperty("carousel_android_deep_links")
  
  private List<String> carouselAndroidDeepLinks = null;

  @JsonProperty("carousel_destination_urls")
  
  private List<String> carouselDestinationUrls = null;

  @JsonProperty("carousel_ios_deep_links")
  
  private List<String> carouselIosDeepLinks = null;

  @JsonProperty("carting_platform_type")
  @Min(1)
@Max(2)

  private Integer cartingPlatformType;

  @JsonProperty("carting_products")
  @Valid

  private List<@Valid CartingProduct> cartingProducts = null;

  @JsonProperty("click_tracking_url")
  
  private String clickTrackingUrl;

  @JsonProperty("collection_items_destination_url_template")
  
  private String collectionItemsDestinationUrlTemplate;

  @JsonProperty("collections_header_type")
  @Valid

  private AdCollectionsHeaderType collectionsHeaderType;

  @JsonProperty("created_time")
  
  private Integer createdTime;

  @JsonProperty("creative_type")
  @NotNull
@Valid

  private CreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  @Valid

  private CustomizableCTAType customizableCtaType;

  @JsonProperty("destination_url")
  
  private String destinationUrl;

  @JsonProperty("disclosure_type")
  @Valid

  private DisclosureType disclosureType;

  @JsonProperty("disclosure_url")
  
  private String disclosureUrl;

  @JsonProperty("grid_click_type")
  @Valid

  private GridClickType gridClickType;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")
@Size(max=18)

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
  @Pattern(regexp="^(AG)?\\d+$")

  private String leadFormId;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("pin_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String pinId;

  @JsonProperty("quiz_pin_data")
  @Valid

  private QuizPinData quizPinData;

  @JsonProperty("rejected_reasons")
  @NotNull
@Valid

  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();

  @JsonProperty("rejection_labels")
  @NotNull

  private List<String> rejectionLabels = new ArrayList<>();

  @JsonProperty("review_status")
  @NotNull
@Valid

  private AdReviewStatus reviewStatus;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("summary_status")
  @NotNull
@Valid

  private PinPromotionSummaryStatus summaryStatus;

  @JsonProperty("tracking_urls")
  @Valid

  private TrackingUrls trackingUrls;

  @JsonProperty("type")
  @NotNull

  private String type;

  @JsonProperty("updated_time")
  
  private Integer updatedTime;

  @JsonProperty("view_tracking_url")
  
  private String viewTrackingUrl;

  public Ad adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  **/
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
  **/
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
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public Ad campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
  **/
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public Ad carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public Ad addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = new ArrayList<>();
    }
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  **/
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
      this.carouselDestinationUrls = new ArrayList<>();
    }
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

   /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  **/
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
      this.carouselIosDeepLinks = new ArrayList<>();
    }
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  **/
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
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
  **/
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
  **/
  public List<@Valid CartingProduct> getCartingProducts() {
    return cartingProducts;
  }

  public void setCartingProducts(List<@Valid CartingProduct> cartingProducts) {
    this.cartingProducts = cartingProducts;
  }

  public Ad clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  **/
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
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public Ad createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
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
  **/
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
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public Ad trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

   /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public Ad type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Always \"ad\".
   * @return type
  **/
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
  **/
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public Ad viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

   /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  **/
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
    return Objects.equals(adAccountId, ad.adAccountId) &&
        Objects.equals(adGroupId, ad.adGroupId) &&
        Objects.equals(androidDeepLink, ad.androidDeepLink) &&
        Objects.equals(campaignId, ad.campaignId) &&
        Objects.equals(carouselAndroidDeepLinks, ad.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, ad.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, ad.carouselIosDeepLinks) &&
        Objects.equals(cartingPlatformType, ad.cartingPlatformType) &&
        Objects.equals(cartingProducts, ad.cartingProducts) &&
        Objects.equals(clickTrackingUrl, ad.clickTrackingUrl) &&
        Objects.equals(collectionItemsDestinationUrlTemplate, ad.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(collectionsHeaderType, ad.collectionsHeaderType) &&
        Objects.equals(createdTime, ad.createdTime) &&
        Objects.equals(creativeType, ad.creativeType) &&
        Objects.equals(customizableCtaType, ad.customizableCtaType) &&
        Objects.equals(destinationUrl, ad.destinationUrl) &&
        Objects.equals(disclosureType, ad.disclosureType) &&
        Objects.equals(disclosureUrl, ad.disclosureUrl) &&
        Objects.equals(gridClickType, ad.gridClickType) &&
        Objects.equals(id, ad.id) &&
        Objects.equals(iosDeepLink, ad.iosDeepLink) &&
        Objects.equals(isCarting, ad.isCarting) &&
        Objects.equals(isCollageAcceptedTerms, ad.isCollageAcceptedTerms) &&
        Objects.equals(isCollageSingleDestination, ad.isCollageSingleDestination) &&
        Objects.equals(isPinDeleted, ad.isPinDeleted) &&
        Objects.equals(isRemovable, ad.isRemovable) &&
        Objects.equals(leadFormId, ad.leadFormId) &&
        Objects.equals(name, ad.name) &&
        Objects.equals(pinId, ad.pinId) &&
        Objects.equals(quizPinData, ad.quizPinData) &&
        Objects.equals(rejectedReasons, ad.rejectedReasons) &&
        Objects.equals(rejectionLabels, ad.rejectionLabels) &&
        Objects.equals(reviewStatus, ad.reviewStatus) &&
        Objects.equals(status, ad.status) &&
        Objects.equals(summaryStatus, ad.summaryStatus) &&
        Objects.equals(trackingUrls, ad.trackingUrls) &&
        Objects.equals(type, ad.type) &&
        Objects.equals(updatedTime, ad.updatedTime) &&
        Objects.equals(viewTrackingUrl, ad.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adGroupId, androidDeepLink, campaignId, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, cartingPlatformType, cartingProducts, clickTrackingUrl, collectionItemsDestinationUrlTemplate, collectionsHeaderType, createdTime, creativeType, customizableCtaType, destinationUrl, disclosureType, disclosureUrl, gridClickType, id, iosDeepLink, isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, leadFormId, name, pinId, quizPinData, rejectedReasons, rejectionLabels, reviewStatus, status, summaryStatus, trackingUrls, type, updatedTime, viewTrackingUrl);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

