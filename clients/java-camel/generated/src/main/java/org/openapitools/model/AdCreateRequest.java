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
import org.openapitools.model.AdCommonQuizPinData;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdCreateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdCreateRequest {

  private String adGroupId;

  private JsonNullable<String> androidDeepLink = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> carouselAndroidDeepLinks = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselDestinationUrls = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> carouselIosDeepLinks = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> clickTrackingUrl = JsonNullable.<String>undefined();

  private CreativeType creativeType;

  private JsonNullable<String> destinationUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> iosDeepLink = JsonNullable.<String>undefined();

  private Boolean isPinDeleted;

  private Boolean isRemovable;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private EntityStatus status;

  private JsonNullable<AdCommonTrackingUrls> trackingUrls = JsonNullable.<AdCommonTrackingUrls>undefined();

  private JsonNullable<String> viewTrackingUrl = JsonNullable.<String>undefined();

  private JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> leadFormId = JsonNullable.<String>undefined();

  private JsonNullable<GridClickType> gridClickType = JsonNullable.<GridClickType>undefined();

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomizableCtaTypeEnum fromValue(String value) {
      for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<CustomizableCtaTypeEnum> customizableCtaType = JsonNullable.<CustomizableCtaTypeEnum>undefined();

  private JsonNullable<AdCommonQuizPinData> quizPinData = JsonNullable.<AdCommonQuizPinData>undefined();

  private String pinId;

  public AdCreateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdCreateRequest(String adGroupId, CreativeType creativeType, String pinId) {
    this.adGroupId = adGroupId;
    this.creativeType = creativeType;
    this.pinId = pinId;
  }

  public AdCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  */
  @NotNull @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "ad_group_id", example = "2680059592705", description = "ID of the ad group that contains the ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdCreateRequest androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = JsonNullable.of(androidDeepLink);
    return this;
  }

  /**
   * Deep link URL for Android devices. Not currently available. Using this field will generate an error.
   * @return androidDeepLink
  */
  
  @Schema(name = "android_deep_link", description = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public JsonNullable<String> getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(JsonNullable<String> androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdCreateRequest carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = JsonNullable.of(carouselAndroidDeepLinks);
    return this;
  }

  public AdCreateRequest addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null || !this.carouselAndroidDeepLinks.isPresent()) {
      this.carouselAndroidDeepLinks = JsonNullable.of(new ArrayList<>());
    }
    this.carouselAndroidDeepLinks.get().add(carouselAndroidDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  */
  
  @Schema(name = "carousel_android_deep_links", description = "Comma-separated deep links for the carousel pin on Android.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_android_deep_links")
  public JsonNullable<List<String>> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(JsonNullable<List<String>> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdCreateRequest carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = JsonNullable.of(carouselDestinationUrls);
    return this;
  }

  public AdCreateRequest addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null || !this.carouselDestinationUrls.isPresent()) {
      this.carouselDestinationUrls = JsonNullable.of(new ArrayList<>());
    }
    this.carouselDestinationUrls.get().add(carouselDestinationUrlsItem);
    return this;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  */
  
  @Schema(name = "carousel_destination_urls", description = "Comma-separated destination URLs for the carousel pin to promote.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_destination_urls")
  public JsonNullable<List<String>> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(JsonNullable<List<String>> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdCreateRequest carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = JsonNullable.of(carouselIosDeepLinks);
    return this;
  }

  public AdCreateRequest addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null || !this.carouselIosDeepLinks.isPresent()) {
      this.carouselIosDeepLinks = JsonNullable.of(new ArrayList<>());
    }
    this.carouselIosDeepLinks.get().add(carouselIosDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  */
  
  @Schema(name = "carousel_ios_deep_links", description = "Comma-separated deep links for the carousel pin on iOS.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("carousel_ios_deep_links")
  public JsonNullable<List<String>> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(JsonNullable<List<String>> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdCreateRequest clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = JsonNullable.of(clickTrackingUrl);
    return this;
  }

  /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  */
  
  @Schema(name = "click_tracking_url", description = "Tracking url for the ad clicks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_tracking_url")
  public JsonNullable<String> getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(JsonNullable<String> clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdCreateRequest creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
  */
  @NotNull @Valid 
  @Schema(name = "creative_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdCreateRequest destinationUrl(String destinationUrl) {
    this.destinationUrl = JsonNullable.of(destinationUrl);
    return this;
  }

  /**
   * Destination URL.
   * @return destinationUrl
  */
  
  @Schema(name = "destination_url", description = "Destination URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("destination_url")
  public JsonNullable<String> getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(JsonNullable<String> destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdCreateRequest iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = JsonNullable.of(iosDeepLink);
    return this;
  }

  /**
   * Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
   * @return iosDeepLink
  */
  
  @Schema(name = "ios_deep_link", description = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public JsonNullable<String> getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(JsonNullable<String> iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdCreateRequest isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
  */
  
  @Schema(name = "is_pin_deleted", example = "false", description = "Is original pin deleted?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdCreateRequest isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
  */
  
  @Schema(name = "is_removable", example = "false", description = "Is pin repinnable?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdCreateRequest name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Name of the ad - 255 chars max.
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the ad - 255 chars max.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public AdCreateRequest status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdCreateRequest trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<AdCommonTrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<AdCommonTrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdCreateRequest viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = JsonNullable.of(viewTrackingUrl);
    return this;
  }

  /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  */
  
  @Schema(name = "view_tracking_url", description = "Tracking URL for ad impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_tracking_url")
  public JsonNullable<String> getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(JsonNullable<String> viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  public AdCreateRequest leadFormId(String leadFormId) {
    this.leadFormId = JsonNullable.of(leadFormId);
    return this;
  }

  /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
  */
  @Pattern(regexp = "^(AG)?\\d+$") 
  @Schema(name = "lead_form_id", description = "Lead form ID for lead ad generation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lead_form_id")
  public JsonNullable<@Pattern(regexp = "^(AG)?\\d+$") String> getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(JsonNullable<String> leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdCreateRequest gridClickType(GridClickType gridClickType) {
    this.gridClickType = JsonNullable.of(gridClickType);
    return this;
  }

  /**
   * Get gridClickType
   * @return gridClickType
  */
  @Valid 
  @Schema(name = "grid_click_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("grid_click_type")
  public JsonNullable<GridClickType> getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(JsonNullable<GridClickType> gridClickType) {
    this.gridClickType = gridClickType;
  }

  public AdCreateRequest customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = JsonNullable.of(customizableCtaType);
    return this;
  }

  /**
   * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
   * @return customizableCtaType
  */
  
  @Schema(name = "customizable_cta_type", example = "LEARN_MORE", description = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customizable_cta_type")
  public JsonNullable<CustomizableCtaTypeEnum> getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(JsonNullable<CustomizableCtaTypeEnum> customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdCreateRequest quizPinData(AdCommonQuizPinData quizPinData) {
    this.quizPinData = JsonNullable.of(quizPinData);
    return this;
  }

  /**
   * Get quizPinData
   * @return quizPinData
  */
  @Valid 
  @Schema(name = "quiz_pin_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quiz_pin_data")
  public JsonNullable<AdCommonQuizPinData> getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(JsonNullable<AdCommonQuizPinData> quizPinData) {
    this.quizPinData = quizPinData;
  }

  public AdCreateRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID.
   * @return pinId
  */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "pin_id", example = "394205773611545468", description = "Pin ID.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    AdCreateRequest adCreateRequest = (AdCreateRequest) o;
    return Objects.equals(this.adGroupId, adCreateRequest.adGroupId) &&
        equalsNullable(this.androidDeepLink, adCreateRequest.androidDeepLink) &&
        equalsNullable(this.carouselAndroidDeepLinks, adCreateRequest.carouselAndroidDeepLinks) &&
        equalsNullable(this.carouselDestinationUrls, adCreateRequest.carouselDestinationUrls) &&
        equalsNullable(this.carouselIosDeepLinks, adCreateRequest.carouselIosDeepLinks) &&
        equalsNullable(this.clickTrackingUrl, adCreateRequest.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adCreateRequest.creativeType) &&
        equalsNullable(this.destinationUrl, adCreateRequest.destinationUrl) &&
        equalsNullable(this.iosDeepLink, adCreateRequest.iosDeepLink) &&
        Objects.equals(this.isPinDeleted, adCreateRequest.isPinDeleted) &&
        Objects.equals(this.isRemovable, adCreateRequest.isRemovable) &&
        equalsNullable(this.name, adCreateRequest.name) &&
        Objects.equals(this.status, adCreateRequest.status) &&
        equalsNullable(this.trackingUrls, adCreateRequest.trackingUrls) &&
        equalsNullable(this.viewTrackingUrl, adCreateRequest.viewTrackingUrl) &&
        equalsNullable(this.leadFormId, adCreateRequest.leadFormId) &&
        equalsNullable(this.gridClickType, adCreateRequest.gridClickType) &&
        equalsNullable(this.customizableCtaType, adCreateRequest.customizableCtaType) &&
        equalsNullable(this.quizPinData, adCreateRequest.quizPinData) &&
        Objects.equals(this.pinId, adCreateRequest.pinId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, hashCodeNullable(androidDeepLink), hashCodeNullable(carouselAndroidDeepLinks), hashCodeNullable(carouselDestinationUrls), hashCodeNullable(carouselIosDeepLinks), hashCodeNullable(clickTrackingUrl), creativeType, hashCodeNullable(destinationUrl), hashCodeNullable(iosDeepLink), isPinDeleted, isRemovable, hashCodeNullable(name), status, hashCodeNullable(trackingUrls), hashCodeNullable(viewTrackingUrl), hashCodeNullable(leadFormId), hashCodeNullable(gridClickType), hashCodeNullable(customizableCtaType), hashCodeNullable(quizPinData), pinId);
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
    sb.append("class AdCreateRequest {\n");
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

