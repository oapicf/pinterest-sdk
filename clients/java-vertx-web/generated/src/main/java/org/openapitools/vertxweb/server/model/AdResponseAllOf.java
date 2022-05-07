package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Creation fields
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdResponseAllOf   {
  
  private String adGroupId;
  private String androidDeepLink;
  private List<String> carouselAndroidDeepLinks = new ArrayList<>();
  private List<String> carouselDestinationUrls = new ArrayList<>();
  private List<String> carouselIosDeepLinks = new ArrayList<>();
  private String clickTrackingUrl;


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

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CreativeTypeEnum creativeType;
  private String destinationUrl;
  private String iosDeepLink;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String name;
  private String pinId;
  private EntityStatus status;
  private TrackingUrls trackingUrls;
  private String viewTrackingUrl;

  public AdResponseAllOf () {

  }

  public AdResponseAllOf (String adGroupId, String androidDeepLink, List<String> carouselAndroidDeepLinks, List<String> carouselDestinationUrls, List<String> carouselIosDeepLinks, String clickTrackingUrl, CreativeTypeEnum creativeType, String destinationUrl, String iosDeepLink, Boolean isPinDeleted, Boolean isRemovable, String name, String pinId, EntityStatus status, TrackingUrls trackingUrls, String viewTrackingUrl) {
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
    this.pinId = pinId;
    this.status = status;
    this.trackingUrls = trackingUrls;
    this.viewTrackingUrl = viewTrackingUrl;
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
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeTypeEnum creativeType) {
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

    
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdResponseAllOf adResponseAllOf = (AdResponseAllOf) o;
    return Objects.equals(adGroupId, adResponseAllOf.adGroupId) &&
        Objects.equals(androidDeepLink, adResponseAllOf.androidDeepLink) &&
        Objects.equals(carouselAndroidDeepLinks, adResponseAllOf.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, adResponseAllOf.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, adResponseAllOf.carouselIosDeepLinks) &&
        Objects.equals(clickTrackingUrl, adResponseAllOf.clickTrackingUrl) &&
        Objects.equals(creativeType, adResponseAllOf.creativeType) &&
        Objects.equals(destinationUrl, adResponseAllOf.destinationUrl) &&
        Objects.equals(iosDeepLink, adResponseAllOf.iosDeepLink) &&
        Objects.equals(isPinDeleted, adResponseAllOf.isPinDeleted) &&
        Objects.equals(isRemovable, adResponseAllOf.isRemovable) &&
        Objects.equals(name, adResponseAllOf.name) &&
        Objects.equals(pinId, adResponseAllOf.pinId) &&
        Objects.equals(status, adResponseAllOf.status) &&
        Objects.equals(trackingUrls, adResponseAllOf.trackingUrls) &&
        Objects.equals(viewTrackingUrl, adResponseAllOf.viewTrackingUrl);
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
