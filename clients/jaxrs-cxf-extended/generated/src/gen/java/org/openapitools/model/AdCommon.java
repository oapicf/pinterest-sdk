package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonQuizPinData;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Creation fields
 */
@ApiModel(description="Creation fields")

public class AdCommon  {
  
 /**
  * ID of the ad group that contains the ad.
  */
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group that contains the ad.")
  private String adGroupId;

 /**
  * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  */
  @ApiModelProperty(value = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.")
  private String androidDeepLink;

 /**
  * Comma-separated deep links for the carousel pin on Android.
  */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
  private List<String> carouselAndroidDeepLinks;

 /**
  * Comma-separated destination URLs for the carousel pin to promote.
  */
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
  private List<String> carouselDestinationUrls;

 /**
  * Comma-separated deep links for the carousel pin on iOS.
  */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
  private List<String> carouselIosDeepLinks;

 /**
  * Tracking url for the ad clicks.
  */
  @ApiModelProperty(value = "Tracking url for the ad clicks.")
  private String clickTrackingUrl;

  @ApiModelProperty(value = "")
  @Valid
  private CreativeType creativeType;

 /**
  * Destination URL.
  */
  @ApiModelProperty(value = "Destination URL.")
  private String destinationUrl;

 /**
  * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  */
  @ApiModelProperty(value = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.")
  private String iosDeepLink;

 /**
  * Is original pin deleted?
  */
  @ApiModelProperty(example = "false", value = "Is original pin deleted?")
  private Boolean isPinDeleted;

 /**
  * Is pin repinnable?
  */
  @ApiModelProperty(example = "false", value = "Is pin repinnable?")
  private Boolean isRemovable;

 /**
  * Name of the ad - 255 chars max.
  */
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private EntityStatus status;

  @ApiModelProperty(value = "")
  @Valid
  private AdCommonTrackingUrls trackingUrls;

 /**
  * Tracking URL for ad impressions.
  */
  @ApiModelProperty(value = "Tracking URL for ad impressions.")
  private String viewTrackingUrl;

 /**
  * Lead form ID for lead ad generation.
  */
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
  private String leadFormId;

  @ApiModelProperty(value = "")
  @Valid
  private GridClickType gridClickType;

public enum CustomizableCtaTypeEnum {

    @JsonProperty("GET_OFFER") GET_OFFER(String.valueOf("GET_OFFER")),
    @JsonProperty("LEARN_MORE") LEARN_MORE(String.valueOf("LEARN_MORE")),
    @JsonProperty("ORDER_NOW") ORDER_NOW(String.valueOf("ORDER_NOW")),
    @JsonProperty("SHOP_NOW") SHOP_NOW(String.valueOf("SHOP_NOW")),
    @JsonProperty("SIGN_UP") SIGN_UP(String.valueOf("SIGN_UP")),
    @JsonProperty("SUBSCRIBE") SUBSCRIBE(String.valueOf("SUBSCRIBE")),
    @JsonProperty("BUY_NOW") BUY_NOW(String.valueOf("BUY_NOW")),
    @JsonProperty("CONTACT_US") CONTACT_US(String.valueOf("CONTACT_US")),
    @JsonProperty("GET_QUOTE") GET_QUOTE(String.valueOf("GET_QUOTE")),
    @JsonProperty("VISIT_WEBSITE") VISIT_WEBSITE(String.valueOf("VISIT_WEBSITE")),
    @JsonProperty("APPLY_NOW") APPLY_NOW(String.valueOf("APPLY_NOW")),
    @JsonProperty("BOOK_NOW") BOOK_NOW(String.valueOf("BOOK_NOW")),
    @JsonProperty("REQUEST_DEMO") REQUEST_DEMO(String.valueOf("REQUEST_DEMO")),
    @JsonProperty("REGISTER_NOW") REGISTER_NOW(String.valueOf("REGISTER_NOW")),
    @JsonProperty("FIND_A_DEALER") FIND_A_DEALER(String.valueOf("FIND_A_DEALER")),
    @JsonProperty("ADD_TO_CART") ADD_TO_CART(String.valueOf("ADD_TO_CART")),
    @JsonProperty("WATCH_NOW") WATCH_NOW(String.valueOf("WATCH_NOW")),
    @JsonProperty("READ_MORE") READ_MORE(String.valueOf("READ_MORE")),
    @JsonProperty("null") NULL(String.valueOf("null"));

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

 /**
  * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  */
  @ApiModelProperty(example = "LEARN_MORE", value = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)")
  private CustomizableCtaTypeEnum customizableCtaType;

  @ApiModelProperty(value = "")
  @Valid
  private AdCommonQuizPinData quizPinData;
 /**
  * ID of the ad group that contains the ad.
  * @return adGroupId
  */
  @JsonProperty("ad_group_id")
 @Pattern(regexp="^(AG)?\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
 public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
  public AdCommon adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
  * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
  * @return androidDeepLink
  */
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  /**
   * Sets the <code>androidDeepLink</code> property.
   */
 public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   * Sets the <code>androidDeepLink</code> property.
   */
  public AdCommon androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

 /**
  * Comma-separated deep links for the carousel pin on Android.
  * @return carouselAndroidDeepLinks
  */
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  /**
   * Sets the <code>carouselAndroidDeepLinks</code> property.
   */
 public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  /**
   * Sets the <code>carouselAndroidDeepLinks</code> property.
   */
  public AdCommon carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  /**
   * Adds a new item to the <code>carouselAndroidDeepLinks</code> list.
   */
  public AdCommon addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

 /**
  * Comma-separated destination URLs for the carousel pin to promote.
  * @return carouselDestinationUrls
  */
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  /**
   * Sets the <code>carouselDestinationUrls</code> property.
   */
 public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  /**
   * Sets the <code>carouselDestinationUrls</code> property.
   */
  public AdCommon carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  /**
   * Adds a new item to the <code>carouselDestinationUrls</code> list.
   */
  public AdCommon addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

 /**
  * Comma-separated deep links for the carousel pin on iOS.
  * @return carouselIosDeepLinks
  */
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  /**
   * Sets the <code>carouselIosDeepLinks</code> property.
   */
 public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  /**
   * Sets the <code>carouselIosDeepLinks</code> property.
   */
  public AdCommon carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  /**
   * Adds a new item to the <code>carouselIosDeepLinks</code> list.
   */
  public AdCommon addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

 /**
  * Tracking url for the ad clicks.
  * @return clickTrackingUrl
  */
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  /**
   * Sets the <code>clickTrackingUrl</code> property.
   */
 public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  /**
   * Sets the <code>clickTrackingUrl</code> property.
   */
  public AdCommon clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

 /**
  * Get creativeType
  * @return creativeType
  */
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
 public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Sets the <code>creativeType</code> property.
   */
  public AdCommon creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
  * Destination URL.
  * @return destinationUrl
  */
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  /**
   * Sets the <code>destinationUrl</code> property.
   */
 public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * Sets the <code>destinationUrl</code> property.
   */
  public AdCommon destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

 /**
  * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
  * @return iosDeepLink
  */
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  /**
   * Sets the <code>iosDeepLink</code> property.
   */
 public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Sets the <code>iosDeepLink</code> property.
   */
  public AdCommon iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

 /**
  * Is original pin deleted?
  * @return isPinDeleted
  */
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  /**
   * Sets the <code>isPinDeleted</code> property.
   */
 public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  /**
   * Sets the <code>isPinDeleted</code> property.
   */
  public AdCommon isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

 /**
  * Is pin repinnable?
  * @return isRemovable
  */
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  /**
   * Sets the <code>isRemovable</code> property.
   */
 public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  /**
   * Sets the <code>isRemovable</code> property.
   */
  public AdCommon isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

 /**
  * Name of the ad - 255 chars max.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public AdCommon name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public AdCommon status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Get trackingUrls
  * @return trackingUrls
  */
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
 public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Sets the <code>trackingUrls</code> property.
   */
  public AdCommon trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
  * Tracking URL for ad impressions.
  * @return viewTrackingUrl
  */
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  /**
   * Sets the <code>viewTrackingUrl</code> property.
   */
 public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  /**
   * Sets the <code>viewTrackingUrl</code> property.
   */
  public AdCommon viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

 /**
  * Lead form ID for lead ad generation.
  * @return leadFormId
  */
  @JsonProperty("lead_form_id")
 @Pattern(regexp="^(AG)?\\d+$")  public String getLeadFormId() {
    return leadFormId;
  }

  /**
   * Sets the <code>leadFormId</code> property.
   */
 public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Sets the <code>leadFormId</code> property.
   */
  public AdCommon leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
  * Get gridClickType
  * @return gridClickType
  */
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  /**
   * Sets the <code>gridClickType</code> property.
   */
 public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   * Sets the <code>gridClickType</code> property.
   */
  public AdCommon gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
  * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
  * @return customizableCtaType
  */
  @JsonProperty("customizable_cta_type")
  public String getCustomizableCtaType() {
    return customizableCtaType == null ? null : customizableCtaType.value();
  }

  /**
   * Sets the <code>customizableCtaType</code> property.
   */
 public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Sets the <code>customizableCtaType</code> property.
   */
  public AdCommon customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
  * Get quizPinData
  * @return quizPinData
  */
  @JsonProperty("quiz_pin_data")
  public AdCommonQuizPinData getQuizPinData() {
    return quizPinData;
  }

  /**
   * Sets the <code>quizPinData</code> property.
   */
 public void setQuizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  /**
   * Sets the <code>quizPinData</code> property.
   */
  public AdCommon quizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
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
    AdCommon adCommon = (AdCommon) o;
    return Objects.equals(this.adGroupId, adCommon.adGroupId) &&
        Objects.equals(this.androidDeepLink, adCommon.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adCommon.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adCommon.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adCommon.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adCommon.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adCommon.creativeType) &&
        Objects.equals(this.destinationUrl, adCommon.destinationUrl) &&
        Objects.equals(this.iosDeepLink, adCommon.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adCommon.isPinDeleted) &&
        Objects.equals(this.isRemovable, adCommon.isRemovable) &&
        Objects.equals(this.name, adCommon.name) &&
        Objects.equals(this.status, adCommon.status) &&
        Objects.equals(this.trackingUrls, adCommon.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adCommon.viewTrackingUrl) &&
        Objects.equals(this.leadFormId, adCommon.leadFormId) &&
        Objects.equals(this.gridClickType, adCommon.gridClickType) &&
        Objects.equals(this.customizableCtaType, adCommon.customizableCtaType) &&
        Objects.equals(this.quizPinData, adCommon.quizPinData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, destinationUrl, iosDeepLink, isPinDeleted, isRemovable, name, status, trackingUrls, viewTrackingUrl, leadFormId, gridClickType, customizableCtaType, quizPinData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCommon {\n");
    
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

