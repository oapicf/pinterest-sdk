package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AdCommonQuizPinData;
import org.openapitools.server.api.model.AdCommonTrackingUrls;
import org.openapitools.server.api.model.CreativeType;
import org.openapitools.server.api.model.EntityStatus;
import org.openapitools.server.api.model.GridClickType;

/**
 * Creation fields
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdCommon   {
  
  private String adGroupId;
  private String androidDeepLink;
  private List<String> carouselAndroidDeepLinks;
  private List<String> carouselDestinationUrls;
  private List<String> carouselIosDeepLinks;
  private String clickTrackingUrl;
  private CreativeType creativeType;
  private String destinationUrl;
  private String iosDeepLink;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String name;
  private EntityStatus status;
  private AdCommonTrackingUrls trackingUrls;
  private String viewTrackingUrl;
  private String leadFormId;
  private GridClickType gridClickType;


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
      return value;
    }
  }

  private CustomizableCtaTypeEnum customizableCtaType;
  private AdCommonQuizPinData quizPinData;

  public AdCommon () {

  }

  public AdCommon (String adGroupId, String androidDeepLink, List<String> carouselAndroidDeepLinks, List<String> carouselDestinationUrls, List<String> carouselIosDeepLinks, String clickTrackingUrl, CreativeType creativeType, String destinationUrl, String iosDeepLink, Boolean isPinDeleted, Boolean isRemovable, String name, EntityStatus status, AdCommonTrackingUrls trackingUrls, String viewTrackingUrl, String leadFormId, GridClickType gridClickType, CustomizableCtaTypeEnum customizableCtaType, AdCommonQuizPinData quizPinData) {
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
    this.status = status;
    this.trackingUrls = trackingUrls;
    this.viewTrackingUrl = viewTrackingUrl;
    this.leadFormId = leadFormId;
    this.gridClickType = gridClickType;
    this.customizableCtaType = customizableCtaType;
    this.quizPinData = quizPinData;
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
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
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

    
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }
  public void setStatus(EntityStatus status) {
    this.status = status;
  }

    
  @JsonProperty("tracking_urls")
  public AdCommonTrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

    
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }
  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("quiz_pin_data")
  public AdCommonQuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = quizPinData;
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
    return Objects.equals(adGroupId, adCommon.adGroupId) &&
        Objects.equals(androidDeepLink, adCommon.androidDeepLink) &&
        Objects.equals(carouselAndroidDeepLinks, adCommon.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, adCommon.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, adCommon.carouselIosDeepLinks) &&
        Objects.equals(clickTrackingUrl, adCommon.clickTrackingUrl) &&
        Objects.equals(creativeType, adCommon.creativeType) &&
        Objects.equals(destinationUrl, adCommon.destinationUrl) &&
        Objects.equals(iosDeepLink, adCommon.iosDeepLink) &&
        Objects.equals(isPinDeleted, adCommon.isPinDeleted) &&
        Objects.equals(isRemovable, adCommon.isRemovable) &&
        Objects.equals(name, adCommon.name) &&
        Objects.equals(status, adCommon.status) &&
        Objects.equals(trackingUrls, adCommon.trackingUrls) &&
        Objects.equals(viewTrackingUrl, adCommon.viewTrackingUrl) &&
        Objects.equals(leadFormId, adCommon.leadFormId) &&
        Objects.equals(gridClickType, adCommon.gridClickType) &&
        Objects.equals(customizableCtaType, adCommon.customizableCtaType) &&
        Objects.equals(quizPinData, adCommon.quizPinData);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
