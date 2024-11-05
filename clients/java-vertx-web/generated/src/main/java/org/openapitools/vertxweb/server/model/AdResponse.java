package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.GridClickType;
import org.openapitools.vertxweb.server.model.PinPromotionSummaryStatus;
import org.openapitools.vertxweb.server.model.QuizPinData;
import org.openapitools.vertxweb.server.model.TrackingUrls;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdResponse   {
  
  private String adGroupId;
  private String androidDeepLink;
  private List<String> carouselAndroidDeepLinks;
  private List<String> carouselDestinationUrls;
  private List<String> carouselIosDeepLinks;
  private String clickTrackingUrl;
  private CreativeType creativeType;
  private String destinationUrl;
  private String iosDeepLink;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String name;
  private EntityStatus status;
  private TrackingUrls trackingUrls;
  private String viewTrackingUrl;
  private String leadFormId;
  private GridClickType gridClickType;


  public enum CustomizableCtaTypeEnum {
    GET_OFFER("GET_OFFER"),
    LEARN_MORE("LEARN_MORE"),
    ORDER_NOW("ORDER_NOW"),
    SHOP_NOW("SHOP_NOW"),
    SIGN_UP("SIGN_UP"),
    SUBSCRIBE("SUBSCRIBE"),
    BUY_NOW("BUY_NOW"),
    CONTACT_US("CONTACT_US"),
    GET_QUOTE("GET_QUOTE"),
    VISIT_SITE("VISIT_SITE"),
    APPLY_NOW("APPLY_NOW"),
    BOOK_NOW("BOOK_NOW"),
    REQUEST_DEMO("REQUEST_DEMO"),
    REGISTER_NOW("REGISTER_NOW"),
    FIND_A_DEALER("FIND_A_DEALER"),
    ADD_TO_CART("ADD_TO_CART"),
    WATCH_NOW("WATCH_NOW"),
    READ_MORE("READ_MORE");

    private String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CustomizableCtaTypeEnum customizableCtaType;
  private QuizPinData quizPinData;
  private String pinId;
  private String adAccountId;
  private String campaignId;
  private String collectionItemsDestinationUrlTemplate;
  private Integer createdTime;
  private String id;


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

    private String value;

    RejectedReasonsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<RejectedReasonsEnum> rejectedReasons = new ArrayList<>();
  private List<String> rejectionLabels = new ArrayList<>();


  public enum ReviewStatusEnum {
    OTHER("OTHER"),
    PENDING("PENDING"),
    REJECTED("REJECTED"),
    APPROVED("APPROVED");

    private String value;

    ReviewStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ReviewStatusEnum reviewStatus;
  private String type;
  private Integer updatedTime;
  private PinPromotionSummaryStatus summaryStatus;

  public AdResponse () {

  }

  public AdResponse (String adGroupId, String androidDeepLink, List<String> carouselAndroidDeepLinks, List<String> carouselDestinationUrls, List<String> carouselIosDeepLinks, String clickTrackingUrl, CreativeType creativeType, String destinationUrl, String iosDeepLink, Boolean isPinDeleted, Boolean isRemovable, String name, EntityStatus status, TrackingUrls trackingUrls, String viewTrackingUrl, String leadFormId, GridClickType gridClickType, CustomizableCtaTypeEnum customizableCtaType, QuizPinData quizPinData, String pinId, String adAccountId, String campaignId, String collectionItemsDestinationUrlTemplate, Integer createdTime, String id, List<RejectedReasonsEnum> rejectedReasons, List<String> rejectionLabels, ReviewStatusEnum reviewStatus, String type, Integer updatedTime, PinPromotionSummaryStatus summaryStatus) {
    this.adGroupId = adGroupId;
    this.androidDeepLink = androidDeepLink;
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    this.carouselDestinationUrls = carouselDestinationUrls;
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    this.clickTrackingUrl = clickTrackingUrl;
    this.creativeType = creativeType;
    this.destinationUrl = destinationUrl;
    this.iosDeepLink = iosDeepLink;
    this.isPinDeleted = isPinDeleted;
    this.isRemovable = isRemovable;
    this.name = name;
    this.status = status;
    this.trackingUrls = trackingUrls;
    this.viewTrackingUrl = viewTrackingUrl;
    this.leadFormId = leadFormId;
    this.gridClickType = gridClickType;
    this.customizableCtaType = customizableCtaType;
    this.quizPinData = quizPinData;
    this.pinId = pinId;
    this.adAccountId = adAccountId;
    this.campaignId = campaignId;
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    this.createdTime = createdTime;
    this.id = id;
    this.rejectedReasons = rejectedReasons;
    this.rejectionLabels = rejectionLabels;
    this.reviewStatus = reviewStatus;
    this.type = type;
    this.updatedTime = updatedTime;
    this.summaryStatus = summaryStatus;
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

    
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }
  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

    
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
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

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }
  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

    
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }
  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
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
  public ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }
  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
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

    
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }
  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
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
    return Objects.equals(adGroupId, adResponse.adGroupId) &&
        Objects.equals(androidDeepLink, adResponse.androidDeepLink) &&
        Objects.equals(carouselAndroidDeepLinks, adResponse.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, adResponse.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, adResponse.carouselIosDeepLinks) &&
        Objects.equals(clickTrackingUrl, adResponse.clickTrackingUrl) &&
        Objects.equals(creativeType, adResponse.creativeType) &&
        Objects.equals(destinationUrl, adResponse.destinationUrl) &&
        Objects.equals(iosDeepLink, adResponse.iosDeepLink) &&
        Objects.equals(isPinDeleted, adResponse.isPinDeleted) &&
        Objects.equals(isRemovable, adResponse.isRemovable) &&
        Objects.equals(name, adResponse.name) &&
        Objects.equals(status, adResponse.status) &&
        Objects.equals(trackingUrls, adResponse.trackingUrls) &&
        Objects.equals(viewTrackingUrl, adResponse.viewTrackingUrl) &&
        Objects.equals(leadFormId, adResponse.leadFormId) &&
        Objects.equals(gridClickType, adResponse.gridClickType) &&
        Objects.equals(customizableCtaType, adResponse.customizableCtaType) &&
        Objects.equals(quizPinData, adResponse.quizPinData) &&
        Objects.equals(pinId, adResponse.pinId) &&
        Objects.equals(adAccountId, adResponse.adAccountId) &&
        Objects.equals(campaignId, adResponse.campaignId) &&
        Objects.equals(collectionItemsDestinationUrlTemplate, adResponse.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(createdTime, adResponse.createdTime) &&
        Objects.equals(id, adResponse.id) &&
        Objects.equals(rejectedReasons, adResponse.rejectedReasons) &&
        Objects.equals(rejectionLabels, adResponse.rejectionLabels) &&
        Objects.equals(reviewStatus, adResponse.reviewStatus) &&
        Objects.equals(type, adResponse.type) &&
        Objects.equals(updatedTime, adResponse.updatedTime) &&
        Objects.equals(summaryStatus, adResponse.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, status, trackingUrls, viewTrackingUrl, leadFormId, gridClickType, customizableCtaType, quizPinData, pinId, adAccountId, campaignId, collectionItemsDestinationUrlTemplate, createdTime, id, rejectedReasons, rejectionLabels, reviewStatus, type, updatedTime, summaryStatus);
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
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    isPinDeleted: ").append(toIndentedString(isPinDeleted)).append("\n");
    sb.append("    isRemovable: ").append(toIndentedString(isRemovable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    viewTrackingUrl: ").append(toIndentedString(viewTrackingUrl)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    quizPinData: ").append(toIndentedString(quizPinData)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    rejectedReasons: ").append(toIndentedString(rejectedReasons)).append("\n");
    sb.append("    rejectionLabels: ").append(toIndentedString(rejectionLabels)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
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
