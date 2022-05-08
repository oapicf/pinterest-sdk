package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Creation fields
 **/
@ApiModel(description = "Creation fields")
@JsonTypeName("AdResponse_allOf")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class AdResponseAllOf   {
  
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

  /**
   * ID of the ad group that contains the ad.
   **/
  public AdResponseAllOf adGroupId(String adGroupId) {
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
  public AdResponseAllOf androidDeepLink(String androidDeepLink) {
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
  public AdResponseAllOf carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
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

  public AdResponseAllOf addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = new ArrayList<String>();
    }

    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

  public AdResponseAllOf removeCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (carouselAndroidDeepLinksItem != null && this.carouselAndroidDeepLinks != null) {
      this.carouselAndroidDeepLinks.remove(carouselAndroidDeepLinksItem);
    }

    return this;
  }
/**
   * Comma-separated destination URLs for the carousel pin to promote.
   **/
  public AdResponseAllOf carouselDestinationUrls(List<String> carouselDestinationUrls) {
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

  public AdResponseAllOf addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null) {
      this.carouselDestinationUrls = new ArrayList<String>();
    }

    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

  public AdResponseAllOf removeCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (carouselDestinationUrlsItem != null && this.carouselDestinationUrls != null) {
      this.carouselDestinationUrls.remove(carouselDestinationUrlsItem);
    }

    return this;
  }
/**
   * Comma-separated deep links for the carousel pin on iOS.
   **/
  public AdResponseAllOf carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
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

  public AdResponseAllOf addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null) {
      this.carouselIosDeepLinks = new ArrayList<String>();
    }

    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

  public AdResponseAllOf removeCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (carouselIosDeepLinksItem != null && this.carouselIosDeepLinks != null) {
      this.carouselIosDeepLinks.remove(carouselIosDeepLinksItem);
    }

    return this;
  }
/**
   * Tracking url for the ad clicks.
   **/
  public AdResponseAllOf clickTrackingUrl(String clickTrackingUrl) {
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
  public AdResponseAllOf creativeType(CreativeTypeEnum creativeType) {
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
  public AdResponseAllOf destinationUrl(String destinationUrl) {
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
  public AdResponseAllOf iosDeepLink(String iosDeepLink) {
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
  public AdResponseAllOf isPinDeleted(Boolean isPinDeleted) {
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
  public AdResponseAllOf isRemovable(Boolean isRemovable) {
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
  public AdResponseAllOf name(String name) {
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
  public AdResponseAllOf pinId(String pinId) {
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
  public AdResponseAllOf status(EntityStatus status) {
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
  public AdResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
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

  public AdResponseAllOf putTrackingUrlsItem(String key,  trackingUrlsItem) {
    if (this.trackingUrls == null) {
      this.trackingUrls = ;
    }

    this.trackingUrls.put(key, trackingUrlsItem);
    return this;
  }

  public AdResponseAllOf removeTrackingUrlsItem( trackingUrlsItem) {
    if (trackingUrlsItem != null && this.trackingUrls != null) {
      this.trackingUrls.remove(trackingUrlsItem);
    }

    return this;
  }
/**
   * Tracking URL for ad impressions.
   **/
  public AdResponseAllOf viewTrackingUrl(String viewTrackingUrl) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdResponseAllOf adResponseAllOf = (AdResponseAllOf) o;
    return Objects.equals(this.adGroupId, adResponseAllOf.adGroupId) &&
        Objects.equals(this.androidDeepLink, adResponseAllOf.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adResponseAllOf.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adResponseAllOf.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adResponseAllOf.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adResponseAllOf.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adResponseAllOf.creativeType) &&
        Objects.equals(this.destinationUrl, adResponseAllOf.destinationUrl) &&
        Objects.equals(this.iosDeepLink, adResponseAllOf.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adResponseAllOf.isPinDeleted) &&
        Objects.equals(this.isRemovable, adResponseAllOf.isRemovable) &&
        Objects.equals(this.name, adResponseAllOf.name) &&
        Objects.equals(this.pinId, adResponseAllOf.pinId) &&
        Objects.equals(this.status, adResponseAllOf.status) &&
        Objects.equals(this.trackingUrls, adResponseAllOf.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adResponseAllOf.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, pinId, status, trackingUrls, viewTrackingUrl);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

