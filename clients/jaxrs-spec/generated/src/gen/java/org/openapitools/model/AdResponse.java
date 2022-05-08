package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdResponseAllOf;
import org.openapitools.model.AdResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class AdResponse   {
  
  private @Valid String adGroupId;
  private @Valid String androidDeepLink;
  private @Valid List<String> carouselAndroidDeepLinks = new ArrayList<String>();
  private @Valid List<String> carouselDestinationUrls = new ArrayList<String>();
  private @Valid List<String> carouselIosDeepLinks = new ArrayList<String>();
  private @Valid String clickTrackingUrl;

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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CreativeTypeEnum fromValue(String value) {
        for (CreativeTypeEnum b : CreativeTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid CreativeTypeEnum creativeType;
  private @Valid String destinationUrl;
  private @Valid String iosDeepLink;
  private @Valid Boolean isPinDeleted;
  private @Valid Boolean isRemovable;
  private @Valid String name;
  private @Valid String pinId;
  private @Valid EntityStatus status;
  private @Valid TrackingUrls trackingUrls;
  private @Valid String viewTrackingUrl;
  private @Valid String adAccountId;
  private @Valid String campaignId;
  private @Valid String collectionItemsDestinationUrlTemplate;
  private @Valid Integer createdTime;
  private @Valid String id;

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
    @JsonValue
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

  private @Valid List<RejectedReasonsEnum> rejectedReasons = new ArrayList<RejectedReasonsEnum>();
  private @Valid List<String> rejectionLabels = new ArrayList<String>();

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
    @JsonValue
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

  private @Valid ReviewStatusEnum reviewStatus;
  private @Valid String type;
  private @Valid Integer updatedTime;
  private @Valid PinPromotionSummaryStatus summaryStatus;

  /**
   * ID of the ad group that contains the ad.
   **/
  public AdResponse adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group that contains the ad.")
  @JsonProperty("ad_group_id")
 @Pattern(regexp="^\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

/**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   **/
  public AdResponse androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  

  
  @ApiModelProperty(value = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.")
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  @JsonProperty("android_deep_link")
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

/**
   * Comma-separated deep links for the carousel pin on Android.
   **/
  public AdResponse carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  

  
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  @JsonProperty("carousel_android_deep_links")
  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdResponse addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = new ArrayList<String>();
    }

    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

  public AdResponse removeCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (carouselAndroidDeepLinksItem != null && this.carouselAndroidDeepLinks != null) {
      this.carouselAndroidDeepLinks.remove(carouselAndroidDeepLinksItem);
    }

    return this;
  }
/**
   * Comma-separated destination URLs for the carousel pin to promote.
   **/
  public AdResponse carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  

  
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  @JsonProperty("carousel_destination_urls")
  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdResponse addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null) {
      this.carouselDestinationUrls = new ArrayList<String>();
    }

    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

  public AdResponse removeCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (carouselDestinationUrlsItem != null && this.carouselDestinationUrls != null) {
      this.carouselDestinationUrls.remove(carouselDestinationUrlsItem);
    }

    return this;
  }
/**
   * Comma-separated deep links for the carousel pin on iOS.
   **/
  public AdResponse carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  

  
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  @JsonProperty("carousel_ios_deep_links")
  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdResponse addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null) {
      this.carouselIosDeepLinks = new ArrayList<String>();
    }

    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

  public AdResponse removeCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (carouselIosDeepLinksItem != null && this.carouselIosDeepLinks != null) {
      this.carouselIosDeepLinks.remove(carouselIosDeepLinksItem);
    }

    return this;
  }
/**
   * Tracking url for the ad clicks.
   **/
  public AdResponse clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  

  
  @ApiModelProperty(value = "Tracking url for the ad clicks.")
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  @JsonProperty("click_tracking_url")
  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

/**
   * Ad creative type enum
   **/
  public AdResponse creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  

  
  @ApiModelProperty(example = "REGULAR", value = "Ad creative type enum")
  @JsonProperty("creative_type")
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }

  @JsonProperty("creative_type")
  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

/**
   * Destination URL.
   **/
  public AdResponse destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  

  
  @ApiModelProperty(value = "Destination URL.")
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  @JsonProperty("destination_url")
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

/**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   **/
  public AdResponse iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  

  
  @ApiModelProperty(value = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  @JsonProperty("ios_deep_link")
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

/**
   * Is original pin deleted?
   **/
  public AdResponse isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  

  
  @ApiModelProperty(example = "false", value = "Is original pin deleted?")
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  @JsonProperty("is_pin_deleted")
  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

/**
   * Is pin repinnable?
   **/
  public AdResponse isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  

  
  @ApiModelProperty(example = "false", value = "Is pin repinnable?")
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  @JsonProperty("is_removable")
  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

/**
   * Name of the ad - 255 chars max.
   **/
  public AdResponse name(String name) {
    this.name = name;
    return this;
  }

  

  
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

/**
   * Pin ID.
   **/
  public AdResponse pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  

  
  @ApiModelProperty(example = "394205773611545468", value = "Pin ID.")
  @JsonProperty("pin_id")
 @Pattern(regexp="^\\d+$")  public String getPinId() {
    return pinId;
  }

  @JsonProperty("pin_id")
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

/**
   **/
  public AdResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

/**
   **/
  public AdResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdResponse putTrackingUrlsItem(String key,  trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = ;
    }

    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

  public AdResponse removeTrackingUrlsItem( trackingUrlsItem) {
    if (trackingUrlsItem != null && this.trackingUrls != null) {
      this.trackingUrls.remove(trackingUrlsItem);
    }

    return this;
  }
/**
   * Tracking URL for ad impressions.
   **/
  public AdResponse viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

  

  
  @ApiModelProperty(value = "Tracking URL for ad impressions.")
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  @JsonProperty("view_tracking_url")
  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

/**
   * The ID of the advertiser that this ad belongs to.
   **/
  public AdResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  

  
  @ApiModelProperty(example = "549755885175", value = "The ID of the advertiser that this ad belongs to.")
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

/**
   * ID of the ad campaign that contains this ad.
   **/
  public AdResponse campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  

  
  @ApiModelProperty(example = "626735565838", value = "ID of the ad campaign that contains this ad.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

/**
   * Destination URL template for all items within a collections drawer.
   **/
  public AdResponse collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

  

  
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  @JsonProperty("collection_items_destination_url_template")
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

/**
   * Pin creation time. Unix timestamp in seconds.
   **/
  public AdResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1451431341", value = "Pin creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

/**
   * The ID of this ad.
   **/
  public AdResponse id(String id) {
    this.id = id;
    return this;
  }

  

  
  @ApiModelProperty(example = "687195134316", value = "The ID of this ad.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

/**
   * Enum reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  public AdResponse rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  

  
  @ApiModelProperty(value = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejected_reasons")
  public List<RejectedReasonsEnum> getRejectedReasons() {
    return rejectedReasons;
  }

  @JsonProperty("rejected_reasons")
  public void setRejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
  }

  public AdResponse addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (this.rejectedReasons == null) {
      this.rejectedReasons = new ArrayList<RejectedReasonsEnum>();
    }

    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

  public AdResponse removeRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (rejectedReasonsItem != null && this.rejectedReasons != null) {
      this.rejectedReasons.remove(rejectedReasonsItem);
    }

    return this;
  }
/**
   * Text reason why the pin was rejected. Returned if &lt;code&gt;review_status&lt;/code&gt; is \&quot;REJECTED\&quot;.
   **/
  public AdResponse rejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
    return this;
  }

  

  
  @ApiModelProperty(value = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
  @JsonProperty("rejection_labels")
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  @JsonProperty("rejection_labels")
  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponse addRejectionLabelsItem(String rejectionLabelsItem) {
    if (this.rejectionLabels == null) {
      this.rejectionLabels = new ArrayList<String>();
    }

    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

  public AdResponse removeRejectionLabelsItem(String rejectionLabelsItem) {
    if (rejectionLabelsItem != null && this.rejectionLabels != null) {
      this.rejectionLabels.remove(rejectionLabelsItem);
    }

    return this;
  }
/**
   * Ad review status
   **/
  public AdResponse reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  

  
  @ApiModelProperty(example = "PENDING", value = "Ad review status")
  @JsonProperty("review_status")
  public ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }

  @JsonProperty("review_status")
  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

/**
   * Always \&quot;ad\&quot;.
   **/
  public AdResponse type(String type) {
    this.type = type;
    return this;
  }

  

  
  @ApiModelProperty(example = "pinpromotion", value = "Always \"ad\".")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

/**
   * Last update time. Unix timestamp in seconds.
   **/
  public AdResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  

  
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

/**
   * Ad summary status
   **/
  public AdResponse summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  

  
  @ApiModelProperty(value = "Ad summary status")
  @JsonProperty("summary_status")
  public PinPromotionSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  @JsonProperty("summary_status")
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
    return Objects.equals(this.adGroupId, adResponse.adGroupId) &&
        Objects.equals(this.androidDeepLink, adResponse.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adResponse.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adResponse.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adResponse.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adResponse.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adResponse.creativeType) &&
        Objects.equals(this.destinationUrl, adResponse.destinationUrl) &&
        Objects.equals(this.iosDeepLink, adResponse.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adResponse.isPinDeleted) &&
        Objects.equals(this.isRemovable, adResponse.isRemovable) &&
        Objects.equals(this.name, adResponse.name) &&
        Objects.equals(this.pinId, adResponse.pinId) &&
        Objects.equals(this.status, adResponse.status) &&
        Objects.equals(this.trackingUrls, adResponse.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adResponse.viewTrackingUrl) &&
        Objects.equals(this.adAccountId, adResponse.adAccountId) &&
        Objects.equals(this.campaignId, adResponse.campaignId) &&
        Objects.equals(this.collectionItemsDestinationUrlTemplate, adResponse.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.createdTime, adResponse.createdTime) &&
        Objects.equals(this.id, adResponse.id) &&
        Objects.equals(this.rejectedReasons, adResponse.rejectedReasons) &&
        Objects.equals(this.rejectionLabels, adResponse.rejectionLabels) &&
        Objects.equals(this.reviewStatus, adResponse.reviewStatus) &&
        Objects.equals(this.type, adResponse.type) &&
        Objects.equals(this.updatedTime, adResponse.updatedTime) &&
        Objects.equals(this.summaryStatus, adResponse.summaryStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, pinId, status, trackingUrls, viewTrackingUrl, adAccountId, campaignId, collectionItemsDestinationUrlTemplate, createdTime, id, rejectedReasons, rejectionLabels, reviewStatus, type, updatedTime, summaryStatus);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

