package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonQuizPinData;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdUpdateRequest  {
  
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
  private List<String> carouselAndroidDeepLinks;

  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
 /**
   * Comma-separated destination URLs for the carousel pin to promote.
  **/
  private List<String> carouselDestinationUrls;

  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
 /**
   * Comma-separated deep links for the carousel pin on iOS.
  **/
  private List<String> carouselIosDeepLinks;

  @ApiModelProperty(value = "Tracking url for the ad clicks.")
 /**
   * Tracking url for the ad clicks.
  **/
  private String clickTrackingUrl;

  @ApiModelProperty(value = "")
  private CreativeType creativeType;

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

  @ApiModelProperty(value = "")
  private EntityStatus status;

  @ApiModelProperty(value = "")
  private AdCommonTrackingUrls trackingUrls;

  @ApiModelProperty(value = "Tracking URL for ad impressions.")
 /**
   * Tracking URL for ad impressions.
  **/
  private String viewTrackingUrl;

  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
 /**
   * Lead form ID for lead ad generation.
  **/
  private String leadFormId;

  @ApiModelProperty(value = "")
  private GridClickType gridClickType;

public enum CustomizableCtaTypeEnum {

GET_OFFER(String.valueOf("GET_OFFER")), LEARN_MORE(String.valueOf("LEARN_MORE")), ORDER_NOW(String.valueOf("ORDER_NOW")), SHOP_NOW(String.valueOf("SHOP_NOW")), SIGN_UP(String.valueOf("SIGN_UP")), SUBSCRIBE(String.valueOf("SUBSCRIBE")), BUY_NOW(String.valueOf("BUY_NOW")), CONTACT_US(String.valueOf("CONTACT_US")), GET_QUOTE(String.valueOf("GET_QUOTE")), VISIT_WEBSITE(String.valueOf("VISIT_WEBSITE")), APPLY_NOW(String.valueOf("APPLY_NOW")), BOOK_NOW(String.valueOf("BOOK_NOW")), REQUEST_DEMO(String.valueOf("REQUEST_DEMO")), REGISTER_NOW(String.valueOf("REGISTER_NOW")), FIND_A_DEALER(String.valueOf("FIND_A_DEALER")), ADD_TO_CART(String.valueOf("ADD_TO_CART")), WATCH_NOW(String.valueOf("WATCH_NOW")), READ_MORE(String.valueOf("READ_MORE")), NULL(String.valueOf("null"));


    private String value;

    CustomizableCtaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomizableCtaTypeEnum fromValue(String value) {
        for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

  @ApiModelProperty(example = "LEARN_MORE", value = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)")
 /**
   * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  **/
  private CustomizableCtaTypeEnum customizableCtaType;

  @ApiModelProperty(value = "")
  private AdCommonQuizPinData quizPinData;

  @ApiModelProperty(example = "687195134316", required = true, value = "The ID of this ad.")
 /**
   * The ID of this ad.
  **/
  private String id;

  @ApiModelProperty(example = "394205773611545468", value = "Pin ID. This field may only be updated for draft ads.")
 /**
   * Pin ID. This field may only be updated for draft ads.
  **/
  private String pinId;
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

  public AdUpdateRequest adGroupId(String adGroupId) {
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

  public AdUpdateRequest androidDeepLink(String androidDeepLink) {
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

  public AdUpdateRequest carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdUpdateRequest addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public AdUpdateRequest carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdUpdateRequest addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public AdUpdateRequest carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdUpdateRequest addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
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

  public AdUpdateRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
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

  public AdUpdateRequest creativeType(CreativeType creativeType) {
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

  public AdUpdateRequest destinationUrl(String destinationUrl) {
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

  public AdUpdateRequest iosDeepLink(String iosDeepLink) {
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

  public AdUpdateRequest isPinDeleted(Boolean isPinDeleted) {
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

  public AdUpdateRequest isRemovable(Boolean isRemovable) {
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

  public AdUpdateRequest name(String name) {
    this.name = name;
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

  public AdUpdateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdUpdateRequest trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
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

  public AdUpdateRequest viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
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

  public AdUpdateRequest leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
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

  public AdUpdateRequest gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
   * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
   * @return customizableCtaType
  **/
  @JsonProperty("customizable_cta_type")
  public String getCustomizableCtaType() {
    if (customizableCtaType == null) {
      return null;
    }
    return customizableCtaType.value();
  }

  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdUpdateRequest customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
   * Get quizPinData
   * @return quizPinData
  **/
  @JsonProperty("quiz_pin_data")
  public AdCommonQuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  public AdUpdateRequest quizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
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

  public AdUpdateRequest id(String id) {
    this.id = id;
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

  public AdUpdateRequest pinId(String pinId) {
    this.pinId = pinId;
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
    AdUpdateRequest adUpdateRequest = (AdUpdateRequest) o;
    return Objects.equals(this.adGroupId, adUpdateRequest.adGroupId) &&
        Objects.equals(this.androidDeepLink, adUpdateRequest.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adUpdateRequest.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adUpdateRequest.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adUpdateRequest.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adUpdateRequest.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adUpdateRequest.creativeType) &&
        Objects.equals(this.destinationUrl, adUpdateRequest.destinationUrl) &&
        Objects.equals(this.iosDeepLink, adUpdateRequest.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adUpdateRequest.isPinDeleted) &&
        Objects.equals(this.isRemovable, adUpdateRequest.isRemovable) &&
        Objects.equals(this.name, adUpdateRequest.name) &&
        Objects.equals(this.status, adUpdateRequest.status) &&
        Objects.equals(this.trackingUrls, adUpdateRequest.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adUpdateRequest.viewTrackingUrl) &&
        Objects.equals(this.leadFormId, adUpdateRequest.leadFormId) &&
        Objects.equals(this.gridClickType, adUpdateRequest.gridClickType) &&
        Objects.equals(this.customizableCtaType, adUpdateRequest.customizableCtaType) &&
        Objects.equals(this.quizPinData, adUpdateRequest.quizPinData) &&
        Objects.equals(this.id, adUpdateRequest.id) &&
        Objects.equals(this.pinId, adUpdateRequest.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, status, trackingUrls, viewTrackingUrl, leadFormId, gridClickType, customizableCtaType, quizPinData, id, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdUpdateRequest {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

