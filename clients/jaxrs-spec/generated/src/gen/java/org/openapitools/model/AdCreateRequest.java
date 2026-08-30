package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdCreateRequest   {
  private String adGroupId;
  private String androidDeepLink;
  private @Valid List<String> carouselAndroidDeepLinks;
  private @Valid List<String> carouselDestinationUrls;
  private @Valid List<String> carouselIosDeepLinks;
  private String clickTrackingUrl;
  private CreativeType creativeType;
  private CustomizableCTAType customizableCtaType;
  private String destinationUrl;
  private DisclosureType disclosureType;
  private String disclosureUrl;
  private GridClickType gridClickType;
  private String iosDeepLink;
  private Boolean isCarting;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String leadFormId;
  private String name;
  private String pinId;
  private Object quizPinData;
  private EntityStatus status;
  private Object trackingUrls;
  private String viewTrackingUrl;

  public AdCreateRequest() {
  }

  @JsonCreator
  public AdCreateRequest(
    @JsonProperty(required = true, value = "ad_group_id") String adGroupId,
    @JsonProperty(required = true, value = "creative_type") CreativeType creativeType,
    @JsonProperty(required = true, value = "pin_id") String pinId
  ) {
    this.adGroupId = adGroupId;
    this.creativeType = creativeType;
    this.pinId = pinId;
  }

  /**
   * ID of the ad group that contains the ad.
   **/
  public AdCreateRequest adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the ad group that contains the ad.")
  @JsonProperty(required = true, value = "ad_group_id")
  @NotNull  @Pattern(regexp="^(AG)?\\d+$")public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty(required = true, value = "ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Deep link URL for Android devices.
   **/
  public AdCreateRequest androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for Android devices.")
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
  public AdCreateRequest carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
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

  public AdCreateRequest addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = new ArrayList<>();
    }

    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

  public AdCreateRequest removeCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (carouselAndroidDeepLinksItem != null && this.carouselAndroidDeepLinks != null) {
      this.carouselAndroidDeepLinks.remove(carouselAndroidDeepLinksItem);
    }

    return this;
  }
  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   **/
  public AdCreateRequest carouselDestinationUrls(List<String> carouselDestinationUrls) {
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

  public AdCreateRequest addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null) {
      this.carouselDestinationUrls = new ArrayList<>();
    }

    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

  public AdCreateRequest removeCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (carouselDestinationUrlsItem != null && this.carouselDestinationUrls != null) {
      this.carouselDestinationUrls.remove(carouselDestinationUrlsItem);
    }

    return this;
  }
  /**
   * Comma-separated deep links for the carousel pin on iOS.
   **/
  public AdCreateRequest carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
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

  public AdCreateRequest addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null) {
      this.carouselIosDeepLinks = new ArrayList<>();
    }

    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

  public AdCreateRequest removeCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (carouselIosDeepLinksItem != null && this.carouselIosDeepLinks != null) {
      this.carouselIosDeepLinks.remove(carouselIosDeepLinksItem);
    }

    return this;
  }
  /**
   * Tracking url for the ad clicks.
   **/
  public AdCreateRequest clickTrackingUrl(String clickTrackingUrl) {
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
   **/
  public AdCreateRequest creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "creative_type")
  @NotNull public CreativeType getCreativeType() {
    return creativeType;
  }

  @JsonProperty(required = true, value = "creative_type")
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   **/
  public AdCreateRequest customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  @JsonProperty("customizable_cta_type")
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Destination URL.
   **/
  public AdCreateRequest destinationUrl(String destinationUrl) {
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
   **/
  public AdCreateRequest disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  @JsonProperty("disclosure_type")
  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   **/
  public AdCreateRequest disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

  
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  @JsonProperty("disclosure_url")
  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  /**
   **/
  public AdCreateRequest gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  @JsonProperty("grid_click_type")
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  /**
   * Deep link URL for iOS devices.
   **/
  public AdCreateRequest iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for iOS devices.")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  @JsonProperty("ios_deep_link")
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Is the ad a carting/WTB ad?
   **/
  public AdCreateRequest isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }

  @JsonProperty("is_carting")
  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  /**
   * Is original pin deleted?
   **/
  public AdCreateRequest isPinDeleted(Boolean isPinDeleted) {
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
  public AdCreateRequest isRemovable(Boolean isRemovable) {
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
   * Lead form ID for lead ad generation.
   **/
  public AdCreateRequest leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
  @JsonProperty("lead_form_id")
   @Pattern(regexp="^(AG)?\\d+$")public String getLeadFormId() {
    return leadFormId;
  }

  @JsonProperty("lead_form_id")
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  /**
   * Name of the ad - 255 chars max.
   **/
  public AdCreateRequest name(String name) {
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
  public AdCreateRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(example = "394205773611545468", required = true, value = "Pin ID.")
  @JsonProperty(required = true, value = "pin_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getPinId() {
    return pinId;
  }

  @JsonProperty(required = true, value = "pin_id")
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   **/
  public AdCreateRequest quizPinData(Object quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

  
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
  @JsonProperty("quiz_pin_data")
  public Object getQuizPinData() {
    return quizPinData;
  }

  @JsonProperty("quiz_pin_data")
  public void setQuizPinData(Object quizPinData) {
    this.quizPinData = quizPinData;
  }

  /**
   **/
  public AdCreateRequest status(EntityStatus status) {
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
  public AdCreateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public Object getTrackingUrls() {
    return trackingUrls;
  }

  @JsonProperty("tracking_urls")
  public void setTrackingUrls(Object trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Tracking URL for ad impressions.
   **/
  public AdCreateRequest viewTrackingUrl(String viewTrackingUrl) {
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
    AdCreateRequest adCreateRequest = (AdCreateRequest) o;
    return Objects.equals(this.adGroupId, adCreateRequest.adGroupId) &&
        Objects.equals(this.androidDeepLink, adCreateRequest.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adCreateRequest.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adCreateRequest.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adCreateRequest.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adCreateRequest.clickTrackingUrl) &&
        Objects.equals(this.creativeType, adCreateRequest.creativeType) &&
        Objects.equals(this.customizableCtaType, adCreateRequest.customizableCtaType) &&
        Objects.equals(this.destinationUrl, adCreateRequest.destinationUrl) &&
        Objects.equals(this.disclosureType, adCreateRequest.disclosureType) &&
        Objects.equals(this.disclosureUrl, adCreateRequest.disclosureUrl) &&
        Objects.equals(this.gridClickType, adCreateRequest.gridClickType) &&
        Objects.equals(this.iosDeepLink, adCreateRequest.iosDeepLink) &&
        Objects.equals(this.isCarting, adCreateRequest.isCarting) &&
        Objects.equals(this.isPinDeleted, adCreateRequest.isPinDeleted) &&
        Objects.equals(this.isRemovable, adCreateRequest.isRemovable) &&
        Objects.equals(this.leadFormId, adCreateRequest.leadFormId) &&
        Objects.equals(this.name, adCreateRequest.name) &&
        Objects.equals(this.pinId, adCreateRequest.pinId) &&
        Objects.equals(this.quizPinData, adCreateRequest.quizPinData) &&
        Objects.equals(this.status, adCreateRequest.status) &&
        Objects.equals(this.trackingUrls, adCreateRequest.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adCreateRequest.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, creativeType, customizableCtaType, destinationUrl, disclosureType, disclosureUrl, gridClickType, iosDeepLink, isCarting, isPinDeleted, isRemovable, leadFormId, name, pinId, quizPinData, status, trackingUrls, viewTrackingUrl);
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
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureUrl: ").append(toIndentedString(disclosureUrl)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    isCarting: ").append(toIndentedString(isCarting)).append("\n");
    sb.append("    isPinDeleted: ").append(toIndentedString(isPinDeleted)).append("\n");
    sb.append("    isRemovable: ").append(toIndentedString(isRemovable)).append("\n");
    sb.append("    leadFormId: ").append(toIndentedString(leadFormId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    quizPinData: ").append(toIndentedString(quizPinData)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
