package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonQuizPinData;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdUpdateRequest   {
  @JsonProperty("ad_group_id")
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

  @JsonProperty("creative_type")
  private CreativeType creativeType;

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

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("tracking_urls")
  private AdCommonTrackingUrls trackingUrls;

  @JsonProperty("view_tracking_url")
  private String viewTrackingUrl;

  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  /**
   * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
   */
  public enum CustomizableCtaTypeEnum {
    GET_OFFER("GET_OFFER"),
    
    LEARN_MORE("LEARN_MORE"),
    
    ORDER_NOW("ORDER_NOW"),
    
    SHOP_NOW("SHOP_NOW"),
    
    SIGN_UP("SIGN_UP"),
    
    SUBSCRIBE("SUBSCRIBE"),
    
    BUY_NOW("BUY_NOW"),
    
    CONTACT_US("CONTACT_US"),
    
    GET_QUOTE("GET_QUOTE"),
    
    VISIT_WEBSITE("VISIT_WEBSITE"),
    
    APPLY_NOW("APPLY_NOW"),
    
    BOOK_NOW("BOOK_NOW"),
    
    REQUEST_DEMO("REQUEST_DEMO"),
    
    REGISTER_NOW("REGISTER_NOW"),
    
    FIND_A_DEALER("FIND_A_DEALER"),
    
    ADD_TO_CART("ADD_TO_CART"),
    
    WATCH_NOW("WATCH_NOW"),
    
    READ_MORE("READ_MORE"),
    
    NULL("null");

    private String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomizableCtaTypeEnum fromValue(String text) {
      for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customizable_cta_type")
  private CustomizableCtaTypeEnum customizableCtaType;

  @JsonProperty("quiz_pin_data")
  private AdCommonQuizPinData quizPinData;

  @JsonProperty("id")
  private String id;

  @JsonProperty("pin_id")
  private String pinId;

  /**
   * ID of the ad group that contains the ad.
   **/
  public AdUpdateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group that contains the ad.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   **/
  public AdUpdateRequest androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.")
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }
  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   **/
  public AdUpdateRequest carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }
  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   **/
  public AdUpdateRequest carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }
  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   **/
  public AdUpdateRequest carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }
  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  /**
   * Tracking url for the ad clicks.
   **/
  public AdUpdateRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Tracking url for the ad clicks.")
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }
  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  /**
   **/
  public AdUpdateRequest creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Destination URL.
   **/
  public AdUpdateRequest destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Destination URL.")
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   **/
  public AdUpdateRequest iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Is original pin deleted?
   **/
  public AdUpdateRequest isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Is original pin deleted?")
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }
  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  /**
   * Is pin repinnable?
   **/
  public AdUpdateRequest isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Is pin repinnable?")
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }
  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  /**
   * Name of the ad - 255 chars max.
   **/
  public AdUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public AdUpdateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  /**
   **/
  public AdUpdateRequest trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Tracking URL for ad impressions.
   **/
  public AdUpdateRequest viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Tracking URL for ad impressions.")
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }
  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  /**
   * Lead form ID for lead ad generation.
   **/
  public AdUpdateRequest leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   **/
  public AdUpdateRequest gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
   **/
  public AdUpdateRequest customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(example = "LEARN_MORE", value = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)")
  @JsonProperty("customizable_cta_type")
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   **/
  public AdUpdateRequest quizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quiz_pin_data")
  public AdCommonQuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  /**
   * The ID of this ad.
   **/
  public AdUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "687195134316", required = true, value = "The ID of this ad.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   **/
  public AdUpdateRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "394205773611545468", value = "Pin ID. This field may only be updated for draft ads.")
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
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
    return Objects.equals(adGroupId, adUpdateRequest.adGroupId) &&
        Objects.equals(androidDeepLink, adUpdateRequest.androidDeepLink) &&
        Objects.equals(carouselAndroidDeepLinks, adUpdateRequest.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, adUpdateRequest.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, adUpdateRequest.carouselIosDeepLinks) &&
        Objects.equals(clickTrackingUrl, adUpdateRequest.clickTrackingUrl) &&
        Objects.equals(creativeType, adUpdateRequest.creativeType) &&
        Objects.equals(destinationUrl, adUpdateRequest.destinationUrl) &&
        Objects.equals(iosDeepLink, adUpdateRequest.iosDeepLink) &&
        Objects.equals(isPinDeleted, adUpdateRequest.isPinDeleted) &&
        Objects.equals(isRemovable, adUpdateRequest.isRemovable) &&
        Objects.equals(name, adUpdateRequest.name) &&
        Objects.equals(status, adUpdateRequest.status) &&
        Objects.equals(trackingUrls, adUpdateRequest.trackingUrls) &&
        Objects.equals(viewTrackingUrl, adUpdateRequest.viewTrackingUrl) &&
        Objects.equals(leadFormId, adUpdateRequest.leadFormId) &&
        Objects.equals(gridClickType, adUpdateRequest.gridClickType) &&
        Objects.equals(customizableCtaType, adUpdateRequest.customizableCtaType) &&
        Objects.equals(quizPinData, adUpdateRequest.quizPinData) &&
        Objects.equals(id, adUpdateRequest.id) &&
        Objects.equals(pinId, adUpdateRequest.pinId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

