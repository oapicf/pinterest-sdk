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
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Creation fields
 */

@Schema(name = "AdResponse_allOf", description = "Creation fields")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2022-05-07T06:40:56.403503Z[Etc/UTC]")
public class AdResponseAllOf   {

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

  public AdResponseAllOf adGroupId(String adGroupId) {
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

  public AdResponseAllOf androidDeepLink(String androidDeepLink) {
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

  public AdResponseAllOf carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = JsonNullable.of(carouselAndroidDeepLinks);
    return this;
  }

  public AdResponseAllOf addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
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

  public AdResponseAllOf carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = JsonNullable.of(carouselDestinationUrls);
    return this;
  }

  public AdResponseAllOf addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
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

  public AdResponseAllOf carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = JsonNullable.of(carouselIosDeepLinks);
    return this;
  }

  public AdResponseAllOf addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
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

  public AdResponseAllOf clickTrackingUrl(String clickTrackingUrl) {
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

  public AdResponseAllOf creativeType(CreativeTypeEnum creativeType) {
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

  public AdResponseAllOf destinationUrl(String destinationUrl) {
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

  public AdResponseAllOf iosDeepLink(String iosDeepLink) {
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

  public AdResponseAllOf isPinDeleted(Boolean isPinDeleted) {
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

  public AdResponseAllOf isRemovable(Boolean isRemovable) {
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

  public AdResponseAllOf name(String name) {
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

  public AdResponseAllOf pinId(String pinId) {
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

  public AdResponseAllOf status(EntityStatus status) {
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

  public AdResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  public AdResponseAllOf putTrackingUrlsItem(String key,  trackingUrlsItem) {
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

  public AdResponseAllOf viewTrackingUrl(String viewTrackingUrl) {
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

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, pinId, status, trackingUrls, viewTrackingUrl);
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

