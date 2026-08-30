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
import org.openapitools.model.AdCollectionsHeaderType;
import org.openapitools.model.CreativeType;
import org.openapitools.model.CustomizableCTAType;
import org.openapitools.model.DisclosureType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;
import org.openapitools.model.QuizPinData;
import org.openapitools.model.TrackingUrls;



/**
 * Resource create operation model.
 **/

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdCreate   {
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

  @JsonProperty("collection_items_destination_url_template")
  private String collectionItemsDestinationUrlTemplate;

  @JsonProperty("collections_header_type")
  private AdCollectionsHeaderType collectionsHeaderType;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  @JsonProperty("customizable_cta_type")
  private CustomizableCTAType customizableCtaType;

  @JsonProperty("destination_url")
  private String destinationUrl;

  @JsonProperty("disclosure_type")
  private DisclosureType disclosureType;

  @JsonProperty("disclosure_url")
  private String disclosureUrl;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  @JsonProperty("ios_deep_link")
  private String iosDeepLink;

  @JsonProperty("is_carting")
  private Boolean isCarting;

  @JsonProperty("is_collage_accepted_terms")
  private Boolean isCollageAcceptedTerms;

  @JsonProperty("is_collage_single_destination")
  private Boolean isCollageSingleDestination;

  @JsonProperty("is_pin_deleted")
  private Boolean isPinDeleted;

  @JsonProperty("is_removable")
  private Boolean isRemovable;

  @JsonProperty("lead_form_id")
  private String leadFormId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pin_id")
  private String pinId;

  @JsonProperty("quiz_pin_data")
  private QuizPinData quizPinData;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("tracking_urls")
  private TrackingUrls trackingUrls;

  @JsonProperty("view_tracking_url")
  private String viewTrackingUrl;

  /**
   * ID of the ad group that contains the ad.
   **/
  public AdCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "ID of the ad group that contains the ad.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Deep link URL for Android devices.
   **/
  public AdCreate androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for Android devices.")
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
  public AdCreate carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
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
  public AdCreate carouselDestinationUrls(List<String> carouselDestinationUrls) {
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
  public AdCreate carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
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
  public AdCreate clickTrackingUrl(String clickTrackingUrl) {
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
   * Destination URL template for all items within a collections drawer.
   **/
  public AdCreate collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

  
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  /**
   **/
  public AdCreate collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("collections_header_type")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }
  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  /**
   **/
  public AdCreate creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   **/
  public AdCreate customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * Destination URL.
   **/
  public AdCreate destinationUrl(String destinationUrl) {
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
   **/
  public AdCreate disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }
  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   **/
  public AdCreate disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

  
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }
  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  /**
   **/
  public AdCreate gridClickType(GridClickType gridClickType) {
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
   * Deep link URL for iOS devices.
   **/
  public AdCreate iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  
  @ApiModelProperty(value = "Deep link URL for iOS devices.")
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Is the ad a carting/WTB ad?
   **/
  public AdCreate isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }
  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   **/
  public AdCreate isCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the advertiser has accepted the terms and conditions for collage ad.")
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }
  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  /**
   * Whether the collage ad has a single destination url override.
   **/
  public AdCreate isCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the collage ad has a single destination url override.")
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }
  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  /**
   * Is original pin deleted?
   **/
  public AdCreate isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "Is original pin deleted?")
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
  public AdCreate isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  
  @ApiModelProperty(value = "Is pin repinnable?")
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }
  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  /**
   * Lead form ID for lead ad generation.
   **/
  public AdCreate leadFormId(String leadFormId) {
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
   * Name of the ad - 255 chars max.
   **/
  public AdCreate name(String name) {
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
   * Pin ID. This field may only be updated for draft ads.
   **/
  public AdCreate pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Pin ID. This field may only be updated for draft ads.")
  @JsonProperty("pin_id")
  public String getPinId() {
    return pinId;
  }
  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   **/
  public AdCreate quizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

  
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  /**
   **/
  public AdCreate status(EntityStatus status) {
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
  public AdCreate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }
  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  /**
   * Tracking URL for ad impressions.
   **/
  public AdCreate viewTrackingUrl(String viewTrackingUrl) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdCreate adCreate = (AdCreate) o;
    return Objects.equals(adGroupId, adCreate.adGroupId) &&
        Objects.equals(androidDeepLink, adCreate.androidDeepLink) &&
        Objects.equals(carouselAndroidDeepLinks, adCreate.carouselAndroidDeepLinks) &&
        Objects.equals(carouselDestinationUrls, adCreate.carouselDestinationUrls) &&
        Objects.equals(carouselIosDeepLinks, adCreate.carouselIosDeepLinks) &&
        Objects.equals(clickTrackingUrl, adCreate.clickTrackingUrl) &&
        Objects.equals(collectionItemsDestinationUrlTemplate, adCreate.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(collectionsHeaderType, adCreate.collectionsHeaderType) &&
        Objects.equals(creativeType, adCreate.creativeType) &&
        Objects.equals(customizableCtaType, adCreate.customizableCtaType) &&
        Objects.equals(destinationUrl, adCreate.destinationUrl) &&
        Objects.equals(disclosureType, adCreate.disclosureType) &&
        Objects.equals(disclosureUrl, adCreate.disclosureUrl) &&
        Objects.equals(gridClickType, adCreate.gridClickType) &&
        Objects.equals(iosDeepLink, adCreate.iosDeepLink) &&
        Objects.equals(isCarting, adCreate.isCarting) &&
        Objects.equals(isCollageAcceptedTerms, adCreate.isCollageAcceptedTerms) &&
        Objects.equals(isCollageSingleDestination, adCreate.isCollageSingleDestination) &&
        Objects.equals(isPinDeleted, adCreate.isPinDeleted) &&
        Objects.equals(isRemovable, adCreate.isRemovable) &&
        Objects.equals(leadFormId, adCreate.leadFormId) &&
        Objects.equals(name, adCreate.name) &&
        Objects.equals(pinId, adCreate.pinId) &&
        Objects.equals(quizPinData, adCreate.quizPinData) &&
        Objects.equals(status, adCreate.status) &&
        Objects.equals(trackingUrls, adCreate.trackingUrls) &&
        Objects.equals(viewTrackingUrl, adCreate.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, collectionItemsDestinationUrlTemplate, collectionsHeaderType, creativeType, customizableCtaType, destinationUrl, disclosureType, disclosureUrl, gridClickType, iosDeepLink, isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, leadFormId, name, pinId, quizPinData, status, trackingUrls, viewTrackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdCreate {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    carouselAndroidDeepLinks: ").append(toIndentedString(carouselAndroidDeepLinks)).append("\n");
    sb.append("    carouselDestinationUrls: ").append(toIndentedString(carouselDestinationUrls)).append("\n");
    sb.append("    carouselIosDeepLinks: ").append(toIndentedString(carouselIosDeepLinks)).append("\n");
    sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
    sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
    sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
    sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
    sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    disclosureType: ").append(toIndentedString(disclosureType)).append("\n");
    sb.append("    disclosureUrl: ").append(toIndentedString(disclosureUrl)).append("\n");
    sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    isCarting: ").append(toIndentedString(isCarting)).append("\n");
    sb.append("    isCollageAcceptedTerms: ").append(toIndentedString(isCollageAcceptedTerms)).append("\n");
    sb.append("    isCollageSingleDestination: ").append(toIndentedString(isCollageSingleDestination)).append("\n");
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

