package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdCollectionsHeaderType;
import org.openapitools.vertxweb.server.model.AdDisapprovalReasons;
import org.openapitools.vertxweb.server.model.AdReviewStatus;
import org.openapitools.vertxweb.server.model.CartingProduct;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.CustomizableCTAType;
import org.openapitools.vertxweb.server.model.DisclosureType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.GridClickType;
import org.openapitools.vertxweb.server.model.PinPromotionSummaryStatus;
import org.openapitools.vertxweb.server.model.QuizPinData;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ad   {
  
  private String adAccountId;
  private String adGroupId;
  private String androidDeepLink;
  private String campaignId;
  private List<String> carouselAndroidDeepLinks;
  private List<String> carouselDestinationUrls;
  private List<String> carouselIosDeepLinks;
  private Integer cartingPlatformType;
  private List<CartingProduct> cartingProducts = new ArrayList<>();
  private String clickTrackingUrl;
  private String collectionItemsDestinationUrlTemplate;
  private AdCollectionsHeaderType collectionsHeaderType;
  private Integer createdTime;
  private CreativeType creativeType;
  private CustomizableCTAType customizableCtaType;
  private String destinationUrl;
  private DisclosureType disclosureType;
  private String disclosureUrl;
  private GridClickType gridClickType;
  private String id;
  private String iosDeepLink;
  private Boolean isCarting;
  private Boolean isCollageAcceptedTerms;
  private Boolean isCollageSingleDestination;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String leadFormId;
  private String name;
  private String pinId;
  private QuizPinData quizPinData;
  private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();
  private List<String> rejectionLabels = new ArrayList<>();
  private AdReviewStatus reviewStatus;
  private EntityStatus status;
  private PinPromotionSummaryStatus summaryStatus;
  private TrackingUrls trackingUrls;
  private String type;
  private Integer updatedTime;
  private String viewTrackingUrl;

  public Ad () {

  }

  public Ad (String adAccountId, String adGroupId, String androidDeepLink, String campaignId, List<String> carouselAndroidDeepLinks, List<String> carouselDestinationUrls, List<String> carouselIosDeepLinks, Integer cartingPlatformType, List<CartingProduct> cartingProducts, String clickTrackingUrl, String collectionItemsDestinationUrlTemplate, AdCollectionsHeaderType collectionsHeaderType, Integer createdTime, CreativeType creativeType, CustomizableCTAType customizableCtaType, String destinationUrl, DisclosureType disclosureType, String disclosureUrl, GridClickType gridClickType, String id, String iosDeepLink, Boolean isCarting, Boolean isCollageAcceptedTerms, Boolean isCollageSingleDestination, Boolean isPinDeleted, Boolean isRemovable, String leadFormId, String name, String pinId, QuizPinData quizPinData, List<AdDisapprovalReasons> rejectedReasons, List<String> rejectionLabels, AdReviewStatus reviewStatus, EntityStatus status, PinPromotionSummaryStatus summaryStatus, TrackingUrls trackingUrls, String type, Integer updatedTime, String viewTrackingUrl) {
    this.adAccountId = adAccountId;
    this.adGroupId = adGroupId;
    this.androidDeepLink = androidDeepLink;
    this.campaignId = campaignId;
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    this.carouselDestinationUrls = carouselDestinationUrls;
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    this.cartingPlatformType = cartingPlatformType;
    this.cartingProducts = cartingProducts;
    this.clickTrackingUrl = clickTrackingUrl;
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    this.collectionsHeaderType = collectionsHeaderType;
    this.createdTime = createdTime;
    this.creativeType = creativeType;
    this.customizableCtaType = customizableCtaType;
    this.destinationUrl = destinationUrl;
    this.disclosureType = disclosureType;
    this.disclosureUrl = disclosureUrl;
    this.gridClickType = gridClickType;
    this.id = id;
    this.iosDeepLink = iosDeepLink;
    this.isCarting = isCarting;
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    this.isCollageSingleDestination = isCollageSingleDestination;
    this.isPinDeleted = isPinDeleted;
    this.isRemovable = isRemovable;
    this.leadFormId = leadFormId;
    this.name = name;
    this.pinId = pinId;
    this.quizPinData = quizPinData;
    this.rejectedReasons = rejectedReasons;
    this.rejectionLabels = rejectionLabels;
    this.reviewStatus = reviewStatus;
    this.status = status;
    this.summaryStatus = summaryStatus;
    this.trackingUrls = trackingUrls;
    this.type = type;
    this.updatedTime = updatedTime;
    this.viewTrackingUrl = viewTrackingUrl;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

    
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

    
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }
  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

    
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }
  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

    
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }
  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

    
  @JsonProperty("carting_platform_type")
  public Integer getCartingPlatformType() {
    return cartingPlatformType;
  }
  public void setCartingPlatformType(Integer cartingPlatformType) {
    this.cartingPlatformType = cartingPlatformType;
  }

    
  @JsonProperty("carting_products")
  public List<CartingProduct> getCartingProducts() {
    return cartingProducts;
  }
  public void setCartingProducts(List<CartingProduct> cartingProducts) {
    this.cartingProducts = cartingProducts;
  }

    
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }
  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

    
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

    
  @JsonProperty("collections_header_type")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }
  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

    
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }
  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

    
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }
  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

    
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }
  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

    
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }
  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

    
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }
  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

    
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }
  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

    
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }
  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

    
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

    
  @JsonProperty("rejected_reasons")
  public List<AdDisapprovalReasons> getRejectedReasons() {
    return rejectedReasons;
  }
  public void setRejectedReasons(List<AdDisapprovalReasons> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

    
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }
  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

    
  @JsonProperty("review_status")
  public AdReviewStatus getReviewStatus() {
    return reviewStatus;
  }
  public void setReviewStatus(AdReviewStatus reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("view_tracking_url")
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
