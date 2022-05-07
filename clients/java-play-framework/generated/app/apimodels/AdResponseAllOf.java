package apimodels;

import apimodels.EntityStatus;
import apimodels.TrackingUrls;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Creation fields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-07T06:39:52.689511Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdResponseAllOf   {
  @JsonProperty("ad_group_id")
  @Pattern(regexp="^\\d+$")

  private String adGroupId;

  @JsonProperty("android_deep_link")
  
  private String androidDeepLink;

  @JsonProperty("carousel_android_deep_links")
  
  private List<String> carouselAndroidDeepLinks = null;

  @JsonProperty("carousel_destination_urls")
  
  private List<String> carouselDestinationUrls = null;

  @JsonProperty("carousel_ios_deep_links")
  
  private List<String> carouselIosDeepLinks = null;

  @JsonProperty("click_tracking_url")
  
  private String clickTrackingUrl;

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

    private final String value;

    CreativeTypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("creative_type")
  
  private CreativeTypeEnum creativeType;

  @JsonProperty("destination_url")
  
  private String destinationUrl;

  @JsonProperty("ios_deep_link")
  
  private String iosDeepLink;

  @JsonProperty("is_pin_deleted")
  
  private Boolean isPinDeleted;

  @JsonProperty("is_removable")
  
  private Boolean isRemovable;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("pin_id")
  @Pattern(regexp="^\\d+$")

  private String pinId;

  @JsonProperty("status")
  @Valid

  private EntityStatus status;

  @JsonProperty("tracking_urls")
  @Valid

  private TrackingUrls trackingUrls;

  @JsonProperty("view_tracking_url")
  
  private String viewTrackingUrl;

  public AdResponseAllOf adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  **/
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdResponseAllOf androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

   /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   * @return androidDeepLink
  **/
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdResponseAllOf carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdResponseAllOf addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (carouselAndroidDeepLinks == null) {
      carouselAndroidDeepLinks = new ArrayList<>();
    }
    carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  **/
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdResponseAllOf carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdResponseAllOf addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (carouselDestinationUrls == null) {
      carouselDestinationUrls = new ArrayList<>();
    }
    carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

   /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  **/
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdResponseAllOf carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdResponseAllOf addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (carouselIosDeepLinks == null) {
      carouselIosDeepLinks = new ArrayList<>();
    }
    carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

   /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  **/
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdResponseAllOf clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

   /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  **/
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdResponseAllOf creativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Ad creative type enum
   * @return creativeType
  **/
  public CreativeTypeEnum getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeTypeEnum creativeType) {
    this.creativeType = creativeType;
  }

  public AdResponseAllOf destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * Destination URL.
   * @return destinationUrl
  **/
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdResponseAllOf iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

   /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   * @return iosDeepLink
  **/
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdResponseAllOf isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

   /**
   * Is original pin deleted?
   * @return isPinDeleted
  **/
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
  **/
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdResponseAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the ad - 255 chars max.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdResponseAllOf pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID.
   * @return pinId
  **/
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
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdResponseAllOf trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
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
  **/
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdResponseAllOf viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

   /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

