package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Creation fields
 **/
@ApiModel(description="Creation fields")
public class AdResponseAllOf  {
  
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
  @Valid
  private EntityStatus status;

  @ApiModelProperty(value = "")
  @Valid
  private TrackingUrls trackingUrls;

  @ApiModelProperty(value = "Tracking URL for ad impressions.")
 /**
   * Tracking URL for ad impressions.
  **/
  private String viewTrackingUrl;
 /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
 @Pattern(regexp="^\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdResponseAllOf adGroupId(String adGroupId) {
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

  public AdResponseAllOf androidDeepLink(String androidDeepLink) {
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

  public AdResponseAllOf carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdResponseAllOf addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public AdResponseAllOf carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdResponseAllOf addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public AdResponseAllOf carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdResponseAllOf addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
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

  public AdResponseAllOf clickTrackingUrl(String clickTrackingUrl) {
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

  public AdResponseAllOf creativeType(CreativeTypeEnum creativeType) {
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

  public AdResponseAllOf destinationUrl(String destinationUrl) {
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

  public AdResponseAllOf iosDeepLink(String iosDeepLink) {
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

  public AdResponseAllOf isPinDeleted(Boolean isPinDeleted) {
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

  public AdResponseAllOf isRemovable(Boolean isRemovable) {
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

  public AdResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Pin ID.
   * @return pinId
  **/
  @JsonProperty("pin_id")
 @Pattern(regexp="^\\d+$")  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdResponseAllOf pinId(String pinId) {
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

  public AdResponseAllOf status(EntityStatus status) {
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

  public AdResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  public AdResponseAllOf putTrackingUrlsItem(String key,  trackingUrlsItem) {
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

  public AdResponseAllOf viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdResponseAllOf {\n");
    
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

