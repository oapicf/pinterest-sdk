package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdCollectionsHeaderType;
import com.prokarma.pkmst.model.CreativeType;
import com.prokarma.pkmst.model.CustomizableCTAType;
import com.prokarma.pkmst.model.DisclosureType;
import com.prokarma.pkmst.model.EntityStatus;
import com.prokarma.pkmst.model.GridClickType;
import com.prokarma.pkmst.model.QuizPinData;
import com.prokarma.pkmst.model.TrackingUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public AdCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
   */
  @ApiModelProperty(required = true, value = "ID of the ad group that contains the ad.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdCreate androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
   */
  @ApiModelProperty(value = "Deep link URL for Android devices.")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdCreate carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdCreate addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    if (this.carouselAndroidDeepLinks == null) {
      this.carouselAndroidDeepLinks = new ArrayList<>();
    }
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
   */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on Android.")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdCreate carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdCreate addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    if (this.carouselDestinationUrls == null) {
      this.carouselDestinationUrls = new ArrayList<>();
    }
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

  /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
   */
  @ApiModelProperty(value = "Comma-separated destination URLs for the carousel pin to promote.")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdCreate carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdCreate addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    if (this.carouselIosDeepLinks == null) {
      this.carouselIosDeepLinks = new ArrayList<>();
    }
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

  /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
   */
  @ApiModelProperty(value = "Comma-separated deep links for the carousel pin on iOS.")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdCreate clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

  /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
   */
  @ApiModelProperty(value = "Tracking url for the ad clicks.")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdCreate collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

  /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
   */
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public AdCreate collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

  /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
   */
  @ApiModelProperty(value = "")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public AdCreate creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  /**
   * Get creativeType
   * @return creativeType
   */
  @ApiModelProperty(required = true, value = "")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdCreate customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  /**
   * Get customizableCtaType
   * @return customizableCtaType
   */
  @ApiModelProperty(value = "")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdCreate destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

  /**
   * Destination URL.
   * @return destinationUrl
   */
  @ApiModelProperty(value = "Destination URL.")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdCreate disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

  /**
   * Get disclosureType
   * @return disclosureType
   */
  @ApiModelProperty(value = "")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  public AdCreate disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

  /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
   */
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  public AdCreate gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

  /**
   * Get gridClickType
   * @return gridClickType
   */
  @ApiModelProperty(value = "")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public AdCreate iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
   */
  @ApiModelProperty(value = "Deep link URL for iOS devices.")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdCreate isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

  /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
   */
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public AdCreate isCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
   */
  @ApiModelProperty(value = "Whether the advertiser has accepted the terms and conditions for collage ad.")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  public AdCreate isCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

  /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
   */
  @ApiModelProperty(value = "Whether the collage ad has a single destination url override.")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  public AdCreate isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

  /**
   * Is original pin deleted?
   * @return isPinDeleted
   */
  @ApiModelProperty(value = "Is original pin deleted?")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdCreate isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

  /**
   * Is pin repinnable?
   * @return isRemovable
   */
  @ApiModelProperty(value = "Is pin repinnable?")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdCreate leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

  /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
   */
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")
  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdCreate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the ad - 255 chars max.
   * @return name
   */
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdCreate pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

  /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
   */
  @ApiModelProperty(required = true, value = "Pin ID. This field may only be updated for draft ads.")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdCreate quizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

  /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
   */
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  public AdCreate status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdCreate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  @ApiModelProperty(value = "")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdCreate viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
    return this;
  }

  /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
   */
  @ApiModelProperty(value = "Tracking URL for ad impressions.")
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
    return Objects.equals(this.adGroupId, adCreate.adGroupId) &&
        Objects.equals(this.androidDeepLink, adCreate.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adCreate.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adCreate.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adCreate.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adCreate.clickTrackingUrl) &&
        Objects.equals(this.collectionItemsDestinationUrlTemplate, adCreate.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.collectionsHeaderType, adCreate.collectionsHeaderType) &&
        Objects.equals(this.creativeType, adCreate.creativeType) &&
        Objects.equals(this.customizableCtaType, adCreate.customizableCtaType) &&
        Objects.equals(this.destinationUrl, adCreate.destinationUrl) &&
        Objects.equals(this.disclosureType, adCreate.disclosureType) &&
        Objects.equals(this.disclosureUrl, adCreate.disclosureUrl) &&
        Objects.equals(this.gridClickType, adCreate.gridClickType) &&
        Objects.equals(this.iosDeepLink, adCreate.iosDeepLink) &&
        Objects.equals(this.isCarting, adCreate.isCarting) &&
        Objects.equals(this.isCollageAcceptedTerms, adCreate.isCollageAcceptedTerms) &&
        Objects.equals(this.isCollageSingleDestination, adCreate.isCollageSingleDestination) &&
        Objects.equals(this.isPinDeleted, adCreate.isPinDeleted) &&
        Objects.equals(this.isRemovable, adCreate.isRemovable) &&
        Objects.equals(this.leadFormId, adCreate.leadFormId) &&
        Objects.equals(this.name, adCreate.name) &&
        Objects.equals(this.pinId, adCreate.pinId) &&
        Objects.equals(this.quizPinData, adCreate.quizPinData) &&
        Objects.equals(this.status, adCreate.status) &&
        Objects.equals(this.trackingUrls, adCreate.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adCreate.viewTrackingUrl);
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

