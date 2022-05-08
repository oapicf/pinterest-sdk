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
import org.openapitools.model.AdResponseAllOf;
import org.openapitools.model.AdResponseAllOf1;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.TrackingUrls;
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

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-08T00:32:37.756477Z[Etc/UTC]")
public class AdResponse   {

  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("android_deep_link")
  private JsonNullable<String> androidDeepLink = JsonNullable.undefined();

  @JsonProperty("carousel_android_deep_links")
  @Valid
  private JsonNullable<List<String>> carouselAndroidDeepLinks = JsonNullable.undefined();

  @JsonProperty("carousel_destination_urls")
  @Valid
  private JsonNullable<List<String>> carouselDestinationUrls = JsonNullable.undefined();

  @JsonProperty("carousel_ios_deep_links")
  @Valid
  private JsonNullable<List<String>> carouselIosDeepLinks = JsonNullable.undefined();

  @JsonProperty("click_tracking_url")
  private JsonNullable<String> clickTrackingUrl = JsonNullable.undefined();

  /**
   * Ad creative type enum
   */
  public enum CreativeTypeEnum {
    REGULAR("REGULAR"),
    
    VIDEO("VIDEO"),
    
    SHOPPING("SHOPPING"),
    
    CAROUSEL("CAROUSEL"),
    
    MAX_VIDEO("MAX_VIDEO"),
    
    SHOP_THE_PIN("SHOP_THE_PIN"),
    
    STORY("STORY");

    private String value;

    CreativeTypeEnum(String value) {
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
    public static CreativeTypeEnum fromValue(String value) {
      for (CreativeTypeEnum b : CreativeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("creative_type")
  private CreativeTypeEnum creativeType;

  @JsonProperty("destination_url")
  private JsonNullable<String> destinationUrl = JsonNullable.undefined();

  @JsonProperty("ios_deep_link")
  private JsonNullable<String> iosDeepLink = JsonNullable.undefined();

  @JsonProperty("is_pin_deleted")
  private Boolean isPinDeleted;

  @JsonProperty("is_removable")
  private Boolean isRemovable;

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("pin_id")
  private String pinId;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("tracking_urls")
  private JsonNullable<TrackingUrls> trackingUrls = JsonNullable.undefined();

  @JsonProperty("view_tracking_url")
  private JsonNullable<String> viewTrackingUrl = JsonNullable.undefined();

  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("collection_items_destination_url_template")
  private JsonNullable<String> collectionItemsDestinationUrlTemplate = JsonNullable.undefined();

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("id")
  private String id;

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

    private String value;

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

  @JsonProperty("rejected_reasons")
  @Valid
  private List<RejectedReasonsEnum> rejectedReasons = null;

  @JsonProperty("rejection_labels")
  @Valid
  private List<String> rejectionLabels = null;

  /**
   * Ad review status
   */
  public enum ReviewStatusEnum {
    OTHER("OTHER"),
    
    PENDING("PENDING"),
    
    REJECTED("REJECTED"),
    
    APPROVED("APPROVED");

    private String value;

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

  @JsonProperty("review_status")
  private ReviewStatusEnum reviewStatus;

  @JsonProperty("type")
  private String type;

  @JsonProperty("updated_time")
  private Integer updatedTime;

  @JsonProperty("summary_status")
  private PinPromotionSummaryStatus summaryStatus;

  public AdResponse adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the ad group that contains the ad.", required = false)
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdResponse androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = JsonNullable.of(androidDeepLink);
    return this;
  }

  /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   * @return androidDeepLink
  */
  
  @Schema(name = "android_deep_link", description = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.", required = false)
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
      this.carouselAndroidDeepLinks = JsonNullable.of(new ArrayList<String>());
    }
    this.carouselAndroidDeepLinks.get().add(carouselAndroidDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  */
  
  @Schema(name = "carousel_android_deep_links", description = "Comma-separated deep links for the carousel pin on Android.", required = false)
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
      this.carouselDestinationUrls = JsonNullable.of(new ArrayList<String>());
    }
    this.carouselDestinationUrls.get().add(carouselDestinationUrlsItem);
    return this;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  */
  
  @Schema(name = "carousel_destination_urls", description = "Comma-separated destination URLs for the carousel pin to promote.", required = false)
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
      this.carouselIosDeepLinks = JsonNullable.of(new ArrayList<String>());
    }
    this.carouselIosDeepLinks.get().add(carouselIosDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  */
  
  @Schema(name = "carousel_ios_deep_links", description = "Comma-separated deep links for the carousel pin on iOS.", required = false)
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
  
  @Schema(name = "click_tracking_url", description = "Tracking url for the ad clicks.", required = false)
  public JsonNullable<String> getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(JsonNullable<String> clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdResponse creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Ad creative type enum
   * @return creativeType
  */
  
  @Schema(name = "creative_type", example = "REGULAR", description = "Ad creative type enum", required = false)
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

  public AdResponse destinationUrl(String destinationUrl) {
    this.destinationUrl = JsonNullable.of(destinationUrl);
    return this;
  }

  /**
   * Destination URL.
   * @return destinationUrl
  */
  
  @Schema(name = "destination_url", description = "Destination URL.", required = false)
  public JsonNullable<String> getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(JsonNullable<String> destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdResponse iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = JsonNullable.of(iosDeepLink);
    return this;
  }

  /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   * @return iosDeepLink
  */
  
  @Schema(name = "ios_deep_link", description = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.", required = false)
  public JsonNullable<String> getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(JsonNullable<String> iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdResponse isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
  */
  
  @Schema(name = "is_pin_deleted", example = "false", description = "Is original pin deleted?", required = false)
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdResponse isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
  */
  
  @Schema(name = "is_removable", example = "false", description = "Is pin repinnable?", required = false)
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdResponse name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Name of the ad - 255 chars max.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the ad - 255 chars max.", required = false)
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AdResponse pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID.
   * @return pinId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", example = "394205773611545468", description = "Pin ID.", required = false)
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdResponse status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", required = false)
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdResponse trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  public AdResponse putTrackingUrlsItem(String key,  trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = ;
    }
    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", required = false)
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
  
  @Schema(name = "view_tracking_url", description = "Tracking URL for ad impressions.", required = false)
  public JsonNullable<String> getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(JsonNullable<String> viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  public AdResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The ID of the advertiser that this ad belongs to.
   * @return adAccountId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "The ID of the advertiser that this ad belongs to.", required = false)
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AdResponse campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * ID of the ad campaign that contains this ad.
   * @return campaignId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "campaign_id", example = "626735565838", description = "ID of the ad campaign that contains this ad.", required = false)
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
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
  
  @Schema(name = "collection_items_destination_url_template", description = "Destination URL template for all items within a collections drawer.", required = false)
  public JsonNullable<String> getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(JsonNullable<String> collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public AdResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Pin creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1451431341", description = "Pin creation time. Unix timestamp in seconds.", required = false)
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public AdResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this ad.
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "687195134316", description = "The ID of this ad.", required = false)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdResponse rejectedReasons(List<RejectedReasonsEnum> rejectedReasons) {
    this.rejectedReasons = rejectedReasons;
    return this;
  }

  public AdResponse addRejectedReasonsItem(RejectedReasonsEnum rejectedReasonsItem) {
    if (this.rejectedReasons == null) {
      this.rejectedReasons = new ArrayList<RejectedReasonsEnum>();
    }
    this.rejectedReasons.add(rejectedReasonsItem);
    return this;
  }

  /**
   * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
   * @return rejectedReasons
  */
  
  @Schema(name = "rejected_reasons", description = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".", required = false)
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
      this.rejectionLabels = new ArrayList<String>();
    }
    this.rejectionLabels.add(rejectionLabelsItem);
    return this;
  }

  /**
   * Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
   * @return rejectionLabels
  */
  
  @Schema(name = "rejection_labels", description = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".", required = false)
  public List<String> getRejectionLabels() {
    return rejectionLabels;
  }

  public void setRejectionLabels(List<String> rejectionLabels) {
    this.rejectionLabels = rejectionLabels;
  }

  public AdResponse reviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
    return this;
  }

  /**
   * Ad review status
   * @return reviewStatus
  */
  
  @Schema(name = "review_status", example = "PENDING", description = "Ad review status", required = false)
  public ReviewStatusEnum getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(ReviewStatusEnum reviewStatus) {
    this.reviewStatus = reviewStatus;
  }

  public AdResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"ad\".
   * @return type
  */
  
  @Schema(name = "type", example = "pinpromotion", description = "Always \"ad\".", required = false)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AdResponse updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1451431341", description = "Last update time. Unix timestamp in seconds.", required = false)
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AdResponse summaryStatus(PinPromotionSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Ad summary status
   * @return summaryStatus
  */
  @Valid 
  @Schema(name = "summary_status", description = "Ad summary status", required = false)
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, pinId, status, trackingUrls, viewTrackingUrl, adAccountId, campaignId, collectionItemsDestinationUrlTemplate, createdTime, id, rejectedReasons, rejectionLabels, reviewStatus, type, updatedTime, summaryStatus);
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

