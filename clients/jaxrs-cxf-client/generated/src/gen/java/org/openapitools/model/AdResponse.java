package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdResponseAllOf;
import org.openapitools.model.AdResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.TrackingUrls;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AdResponse  {
  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group that contains the ad.")
 /**
   * ID of the ad group that contains the ad.
  **/
  private String adGroupId;

  @ApiModelProperty(value = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.")
 /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  **/
  private String androidDeepLink;

  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
 /**
   * Comma-separated deep links for the carousel pin on Android.
  **/
  private List<String> carouselAndroidDeepLinks = null;

  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
 /**
   * Comma-separated destination URLs for the carousel pin to promote.
  **/
  private List<String> carouselDestinationUrls = null;

  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
 /**
   * Comma-separated deep links for the carousel pin on iOS.
  **/
  private List<String> carouselIosDeepLinks = null;

  @ApiModelProperty(value = "Tracking url for the ad clicks.")
 /**
   * Tracking url for the ad clicks.
  **/
  private String clickTrackingUrl;

public enum CreativeTypeEnum {

REGULAR(String.valueOf("REGULAR")), VIDEO(String.valueOf("VIDEO")), SHOPPING(String.valueOf("SHOPPING")), CAROUSEL(String.valueOf("CAROUSEL")), MAX_VIDEO(String.valueOf("MAX_VIDEO")), SHOP_THE_PIN(String.valueOf("SHOP_THE_PIN")), STORY(String.valueOf("STORY"));


    private String value;

    CreativeTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CreativeTypeEnum fromValue(String value) {
        for (CreativeTypeEnum b : CreativeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "REGULAR", value = "Ad creative type enum")
 /**
   * Ad creative type enum
  **/
  private CreativeTypeEnum creativeType;

  @ApiModelProperty(value = "Destination URL.")
 /**
   * Destination URL.
  **/
  private String destinationUrl;

  @ApiModelProperty(value = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.")
 /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  **/
  private String iosDeepLink;

  @ApiModelProperty(example = "false", value = "Is original pin deleted?")
 /**
   * Is original pin deleted?
  **/
  private Boolean isPinDeleted;

  @ApiModelProperty(example = "false", value = "Is pin repinnable?")
 /**
   * Is pin repinnable?
  **/
  private Boolean isRemovable;

  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
 /**
   * Name of the ad - 255 chars max.
  **/
  private String name;

  @ApiModelProperty(example = "394205773611545468", value = "Pin ID.")
 /**
   * Pin ID.
  **/
  private String pinId;

  @ApiModelProperty(value = "")
  private EntityStatus status;

  @ApiModelProperty(value = "")
  private TrackingUrls trackingUrls;

  @ApiModelProperty(value = "Tracking URL for ad impressions.")
 /**
   * Tracking URL for ad impressions.
  **/
  private String viewTrackingUrl;

  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
 /**
   * The ID of the advertiser that this ad belongs to.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
 /**
   * ID of the ad campaign that contains this ad.
  **/
  private String campaignId;

  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
 /**
   * Destination URL template for all items within a collections drawer.
  **/
  private String collectionItemsDestinationUrlTemplate;

  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
 /**
   * Pin creation time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
 /**
   * The ID of this ad.
  **/
  private String id;

public enum RejectedReasonsEnum {

HASHTAGS(String.valueOf("HASHTAGS")), PROMOTIONS_AND_PRICES(String.valueOf("PROMOTIONS_AND_PRICES")), TARGETING(String.valueOf("TARGETING")), LANDING_PAGE(String.valueOf("LANDING_PAGE")), CAPS_AND_SYMBOLS(String.valueOf("CAPS_AND_SYMBOLS")), SHOCKING(String.valueOf("SHOCKING")), WEIGHT_LOSS(String.valueOf("WEIGHT_LOSS")), PROHIBITED_PRODUCT(String.valueOf("PROHIBITED_PRODUCT")), AUTHENTICITY(String.valueOf("AUTHENTICITY")), NUDITY(String.valueOf("NUDITY")), CONFUSING_DESIGN(String.valueOf("CONFUSING_DESIGN")), URGENCY(String.valueOf("URGENCY")), RATINGS(String.valueOf("RATINGS")), APP(String.valueOf("APP")), ALCOHOL(String.valueOf("ALCOHOL")), CONTESTS(String.valueOf("CONTESTS")), POLITICAL(String.valueOf("POLITICAL")), OTHER(String.valueOf("OTHER")), IMAGE(String.valueOf("IMAGE")), NAR(String.valueOf("NAR")), INCONSISTENT(String.valueOf("INCONSISTENT")), CLICKBAIT(String.valueOf("CLICKBAIT")), NO_DESCRIPTION(String.valueOf("NO_DESCRIPTION")), LOW_QUALITY(String.valueOf("LOW_QUALITY")), EXAGGERATED_CLAIMS(String.valueOf("EXAGGERATED_CLAIMS")), PINTEREST_BRAND(String.valueOf("PINTEREST_BRAND")), ALCOHOL_NO_SALE(String.valueOf("ALCOHOL_NO_SALE")), LANDING_PAGE_SPEED(String.valueOf("LANDING_PAGE_SPEED")), LANDING_PAGE_HARDWALL(String.valueOf("LANDING_PAGE_HARDWALL")), LANDING_PAGE_BROKEN(String.valueOf("LANDING_PAGE_BROKEN")), LANDING_PAGE_QUALITY(String.valueOf("LANDING_PAGE_QUALITY")), OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), IMAGE_LOW_QUALITY(String.valueOf("IMAGE_LOW_QUALITY")), IMAGE_BUSY(String.valueOf("IMAGE_BUSY")), IMAGE_POORLY_EDITED(String.valueOf("IMAGE_POORLY_EDITED")), IMAGE_BEFORE_AFTER(String.valueOf("IMAGE_BEFORE_AFTER")), UGC(String.valueOf("UGC")), FAKE_BUTTONS(String.valueOf("FAKE_BUTTONS")), WEAPONS(String.valueOf("WEAPONS")), SENSITIVE(String.valueOf("SENSITIVE")), UNACCEPTABLE_BUSINESS(String.valueOf("UNACCEPTABLE_BUSINESS")), SUSPICIOUS_CLAIMS(String.valueOf("SUSPICIOUS_CLAIMS")), PHARMA(String.valueOf("PHARMA")), SUSPICIOUS_SUPPLEMENTS(String.valueOf("SUSPICIOUS_SUPPLEMENTS")), ILLEGAL_RECREATIONAL_DRUG(String.valueOf("ILLEGAL_RECREATIONAL_DRUG")), LOW_QUALITY_LANDING_PAGE(String.valueOf("LOW_QUALITY_LANDING_PAGE")), RESTRICTED_HEALTHCARE(String.valueOf("RESTRICTED_HEALTHCARE")), INCONSISTENT_LANG_FR(String.valueOf("INCONSISTENT_LANG_FR"));


    private String value;

    RejectedReasonsEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static RejectedReasonsEnum fromValue(String value) {
        for (RejectedReasonsEnum b : RejectedReasonsEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
 /**
   * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  **/
  private List<RejectedReasonsEnum> rejectedReasons = null;

  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
 /**
   * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
  **/
  private List<String> rejectionLabels = null;

public enum ReviewStatusEnum {

OTHER(String.valueOf("OTHER")), PENDING(String.valueOf("PENDING")), REJECTED(String.valueOf("REJECTED")), APPROVED(String.valueOf("APPROVED"));


    private String value;

    ReviewStatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReviewStatusEnum fromValue(String value) {
        for (ReviewStatusEnum b : ReviewStatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(example = "PENDING", value = "Ad review status")
 /**
   * Ad review status
  **/
  private ReviewStatusEnum reviewStatus;

  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
 /**
   * Always \"ad\".
  **/
  private String type;

  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
 /**
   * Last update time. Unix timestamp in seconds.
  **/
  private Integer updatedTime;

  @ApiModelProperty(value = "Ad summary status")
 /**
   * Ad summary status
  **/
  private PinPromotionSummaryStatus summaryStatus;
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

  public AdResponse adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   * @return androidDeepLink
  **/
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdResponse androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
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

  public AdResponse carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdResponse addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public AdResponse carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdResponse addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public AdResponse carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdResponse addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
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

  public AdResponse clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

 /**
   * Ad creative type enum
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public String getCreativeType() {
    if (creativeType == null) {
      return null;
    }
    return creativeType.value();
  }

  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

  public AdResponse creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
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

  public AdResponse destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

 /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   * @return iosDeepLink
  **/
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdResponse iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
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

  public AdResponse isPinDeleted(Boolean isPinDeleted) {
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

  public AdResponse isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
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

  public AdResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Pin ID.
   * @return pinId
  **/
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdResponse pinId(String pinId) {
    this.pinId = pinId;
    return this;
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

  public AdResponse status(EntityStatus status) {
    this.status = status;
    return this;
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

  public AdResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  public AdResponse putTrackingUrlsItem(String key,  trackingUrlsItem) {
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
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

  public AdResponse viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

 /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public AdResponse campaignId(String campaignId) {
    this.campaignId = campaignId;
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

  public AdResponse collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
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

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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

  public AdResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   * @return rejectedReasons
  **/
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public AdResponse rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  public AdResponse addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

 /**
   * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   * @return rejectionLabels
  **/
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponse rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  public AdResponse addRejectionLabelsItem(String rejectionLabelsItem) {
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

 /**
   * Ad review status
   * @return reviewStatus
  **/
  @JsonProperty("review_status")
  public String getReviewStatus() {
    if (reviewStatus == null) {
      return null;
    }
    return reviewStatus.value();
  }

  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public AdResponse reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
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

  public void setType(String type) {
    this.type = type;
  }

  public AdResponse type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
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

  public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public AdResponse summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
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
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    viewTrackingUrl: ").append(toIndentedString(viewTrackingUrl)).append("\n");
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

