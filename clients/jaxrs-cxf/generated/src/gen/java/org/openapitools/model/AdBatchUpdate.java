package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdBatchUpdate  {
  
 /**
  * ID of the ad group that contains the ad.
  */
  @ApiModelProperty(value = "ID of the ad group that contains the ad.")

  private String adGroupId;

 /**
  * Deep link URL for Android devices.
  */
  @ApiModelProperty(value = "Deep link URL for Android devices.")

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

 /**
  * Destination URL template for all items within a collections drawer.
  */
  @ApiModelProperty(value = "Destination URL template for all items within a collections drawer.")

  private String collectionItemsDestinationUrlTemplate;

  @ApiModelProperty(value = "")

  @Valid

  private AdCollectionsHeaderType collectionsHeaderType;

  @ApiModelProperty(value = "")

  @Valid

  private CreativeType creativeType;

  @ApiModelProperty(value = "")

  @Valid

  private CustomizableCTAType customizableCtaType;

 /**
  * Destination URL.
  */
  @ApiModelProperty(value = "Destination URL.")

  private String destinationUrl;

  @ApiModelProperty(value = "")

  @Valid

  private DisclosureType disclosureType;

 /**
  * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  */
  @ApiModelProperty(value = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")

  private String disclosureUrl;

  @ApiModelProperty(value = "")

  @Valid

  private GridClickType gridClickType;

 /**
  * The ID of this ad.
  */
  @ApiModelProperty(required = true, value = "The ID of this ad.")

  private String id;

 /**
  * Deep link URL for iOS devices.
  */
  @ApiModelProperty(value = "Deep link URL for iOS devices.")

  private String iosDeepLink;

 /**
  * Is the ad a carting/WTB ad?
  */
  @ApiModelProperty(value = "Is the ad a carting/WTB ad?")

  private Boolean isCarting;

 /**
  * Whether the advertiser has accepted the terms and conditions for collage ad.
  */
  @ApiModelProperty(value = "Whether the advertiser has accepted the terms and conditions for collage ad.")

  private Boolean isCollageAcceptedTerms;

 /**
  * Whether the collage ad has a single destination url override.
  */
  @ApiModelProperty(value = "Whether the collage ad has a single destination url override.")

  private Boolean isCollageSingleDestination;

 /**
  * Is original pin deleted?
  */
  @ApiModelProperty(value = "Is original pin deleted?")

  private Boolean isPinDeleted;

 /**
  * Is pin repinnable?
  */
  @ApiModelProperty(value = "Is pin repinnable?")

  private Boolean isRemovable;

 /**
  * Lead form ID for lead ad generation.
  */
  @ApiModelProperty(value = "Lead form ID for lead ad generation.")

  private String leadFormId;

 /**
  * Name of the ad - 255 chars max.
  */
  @ApiModelProperty(value = "Name of the ad - 255 chars max.")

  private String name;

 /**
  * Pin ID. This field may only be updated for draft ads.
  */
  @ApiModelProperty(value = "Pin ID. This field may only be updated for draft ads.")

  private String pinId;

 /**
  * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  */
  @ApiModelProperty(value = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")

  @Valid

  private QuizPinData quizPinData;

  @ApiModelProperty(value = "")

  @Valid

  private EntityStatus status;

  @ApiModelProperty(value = "")

  @Valid

  private TrackingUrls trackingUrls;

 /**
  * Tracking URL for ad impressions.
  */
  @ApiModelProperty(value = "Tracking URL for ad impressions.")

  private String viewTrackingUrl;
 /**
   * ID of the ad group that contains the ad.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
 @Pattern(regexp="^(AG)?\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public AdBatchUpdate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * Deep link URL for Android devices.
   * @return androidDeepLink
  **/
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public AdBatchUpdate androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

 /**
   * Comma-separated deep links for the carousel pin on Android.
   * @return carouselAndroidDeepLinks
  **/
  @JsonProperty("carousel_android_deep_links")
  public List<String> getCarouselAndroidDeepLinks() {
    return carouselAndroidDeepLinks;
  }

  public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
  }

  public AdBatchUpdate carouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    return this;
  }

  public AdBatchUpdate addCarouselAndroidDeepLinksItem(String carouselAndroidDeepLinksItem) {
    this.carouselAndroidDeepLinks.add(carouselAndroidDeepLinksItem);
    return this;
  }

 /**
   * Comma-separated destination URLs for the carousel pin to promote.
   * @return carouselDestinationUrls
  **/
  @JsonProperty("carousel_destination_urls")
  public List<String> getCarouselDestinationUrls() {
    return carouselDestinationUrls;
  }

  public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
  }

  public AdBatchUpdate carouselDestinationUrls(List<String> carouselDestinationUrls) {
    this.carouselDestinationUrls = carouselDestinationUrls;
    return this;
  }

  public AdBatchUpdate addCarouselDestinationUrlsItem(String carouselDestinationUrlsItem) {
    this.carouselDestinationUrls.add(carouselDestinationUrlsItem);
    return this;
  }

 /**
   * Comma-separated deep links for the carousel pin on iOS.
   * @return carouselIosDeepLinks
  **/
  @JsonProperty("carousel_ios_deep_links")
  public List<String> getCarouselIosDeepLinks() {
    return carouselIosDeepLinks;
  }

  public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
  }

  public AdBatchUpdate carouselIosDeepLinks(List<String> carouselIosDeepLinks) {
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    return this;
  }

  public AdBatchUpdate addCarouselIosDeepLinksItem(String carouselIosDeepLinksItem) {
    this.carouselIosDeepLinks.add(carouselIosDeepLinksItem);
    return this;
  }

 /**
   * Tracking url for the ad clicks.
   * @return clickTrackingUrl
  **/
  @JsonProperty("click_tracking_url")
  public String getClickTrackingUrl() {
    return clickTrackingUrl;
  }

  public void setClickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
  }

  public AdBatchUpdate clickTrackingUrl(String clickTrackingUrl) {
    this.clickTrackingUrl = clickTrackingUrl;
    return this;
  }

 /**
   * Destination URL template for all items within a collections drawer.
   * @return collectionItemsDestinationUrlTemplate
  **/
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }

  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

  public AdBatchUpdate collectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    return this;
  }

 /**
   * Get collectionsHeaderType
   * @return collectionsHeaderType
  **/
  @JsonProperty("collections_header_type")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public AdBatchUpdate collectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

 /**
   * Get creativeType
   * @return creativeType
  **/
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public AdBatchUpdate creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
   * Get customizableCtaType
   * @return customizableCtaType
  **/
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public AdBatchUpdate customizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
   * Destination URL.
   * @return destinationUrl
  **/
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }

  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

  public AdBatchUpdate destinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

 /**
   * Get disclosureType
   * @return disclosureType
  **/
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }

  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

  public AdBatchUpdate disclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
    return this;
  }

 /**
   * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
   * @return disclosureUrl
  **/
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }

  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

  public AdBatchUpdate disclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
    return this;
  }

 /**
   * Get gridClickType
   * @return gridClickType
  **/
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public AdBatchUpdate gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
   * The ID of this ad.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AdBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Deep link URL for iOS devices.
   * @return iosDeepLink
  **/
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public AdBatchUpdate iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

 /**
   * Is the ad a carting/WTB ad?
   * @return isCarting
  **/
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }

  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

  public AdBatchUpdate isCarting(Boolean isCarting) {
    this.isCarting = isCarting;
    return this;
  }

 /**
   * Whether the advertiser has accepted the terms and conditions for collage ad.
   * @return isCollageAcceptedTerms
  **/
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }

  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

  public AdBatchUpdate isCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    return this;
  }

 /**
   * Whether the collage ad has a single destination url override.
   * @return isCollageSingleDestination
  **/
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }

  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
  }

  public AdBatchUpdate isCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
    return this;
  }

 /**
   * Is original pin deleted?
   * @return isPinDeleted
  **/
  @JsonProperty("is_pin_deleted")
  public Boolean getIsPinDeleted() {
    return isPinDeleted;
  }

  public void setIsPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
  }

  public AdBatchUpdate isPinDeleted(Boolean isPinDeleted) {
    this.isPinDeleted = isPinDeleted;
    return this;
  }

 /**
   * Is pin repinnable?
   * @return isRemovable
  **/
  @JsonProperty("is_removable")
  public Boolean getIsRemovable() {
    return isRemovable;
  }

  public void setIsRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
  }

  public AdBatchUpdate isRemovable(Boolean isRemovable) {
    this.isRemovable = isRemovable;
    return this;
  }

 /**
   * Lead form ID for lead ad generation.
   * @return leadFormId
  **/
  @JsonProperty("lead_form_id")
 @Pattern(regexp="^(AG)?\\d+$")  public String getLeadFormId() {
    return leadFormId;
  }

  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
  }

  public AdBatchUpdate leadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
    return this;
  }

 /**
   * Name of the ad - 255 chars max.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AdBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Pin ID. This field may only be updated for draft ads.
   * @return pinId
  **/
  @JsonProperty("pin_id")
 @Pattern(regexp="^\\d+$")  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }

  public AdBatchUpdate pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

 /**
   * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
   * @return quizPinData
  **/
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }

  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
  }

  public AdBatchUpdate quizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public AdBatchUpdate status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Get trackingUrls
   * @return trackingUrls
  **/
  @JsonProperty("tracking_urls")
  public TrackingUrls getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public AdBatchUpdate trackingUrls(TrackingUrls trackingUrls) {
    this.trackingUrls = trackingUrls;
    return this;
  }

 /**
   * Tracking URL for ad impressions.
   * @return viewTrackingUrl
  **/
  @JsonProperty("view_tracking_url")
  public String getViewTrackingUrl() {
    return viewTrackingUrl;
  }

  public void setViewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
  }

  public AdBatchUpdate viewTrackingUrl(String viewTrackingUrl) {
    this.viewTrackingUrl = viewTrackingUrl;
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
    AdBatchUpdate adBatchUpdate = (AdBatchUpdate) o;
    return Objects.equals(this.adGroupId, adBatchUpdate.adGroupId) &&
        Objects.equals(this.androidDeepLink, adBatchUpdate.androidDeepLink) &&
        Objects.equals(this.carouselAndroidDeepLinks, adBatchUpdate.carouselAndroidDeepLinks) &&
        Objects.equals(this.carouselDestinationUrls, adBatchUpdate.carouselDestinationUrls) &&
        Objects.equals(this.carouselIosDeepLinks, adBatchUpdate.carouselIosDeepLinks) &&
        Objects.equals(this.clickTrackingUrl, adBatchUpdate.clickTrackingUrl) &&
        Objects.equals(this.collectionItemsDestinationUrlTemplate, adBatchUpdate.collectionItemsDestinationUrlTemplate) &&
        Objects.equals(this.collectionsHeaderType, adBatchUpdate.collectionsHeaderType) &&
        Objects.equals(this.creativeType, adBatchUpdate.creativeType) &&
        Objects.equals(this.customizableCtaType, adBatchUpdate.customizableCtaType) &&
        Objects.equals(this.destinationUrl, adBatchUpdate.destinationUrl) &&
        Objects.equals(this.disclosureType, adBatchUpdate.disclosureType) &&
        Objects.equals(this.disclosureUrl, adBatchUpdate.disclosureUrl) &&
        Objects.equals(this.gridClickType, adBatchUpdate.gridClickType) &&
        Objects.equals(this.id, adBatchUpdate.id) &&
        Objects.equals(this.iosDeepLink, adBatchUpdate.iosDeepLink) &&
        Objects.equals(this.isCarting, adBatchUpdate.isCarting) &&
        Objects.equals(this.isCollageAcceptedTerms, adBatchUpdate.isCollageAcceptedTerms) &&
        Objects.equals(this.isCollageSingleDestination, adBatchUpdate.isCollageSingleDestination) &&
        Objects.equals(this.isPinDeleted, adBatchUpdate.isPinDeleted) &&
        Objects.equals(this.isRemovable, adBatchUpdate.isRemovable) &&
        Objects.equals(this.leadFormId, adBatchUpdate.leadFormId) &&
        Objects.equals(this.name, adBatchUpdate.name) &&
        Objects.equals(this.pinId, adBatchUpdate.pinId) &&
        Objects.equals(this.quizPinData, adBatchUpdate.quizPinData) &&
        Objects.equals(this.status, adBatchUpdate.status) &&
        Objects.equals(this.trackingUrls, adBatchUpdate.trackingUrls) &&
        Objects.equals(this.viewTrackingUrl, adBatchUpdate.viewTrackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, androidDeepLink, carouselAndroidDeepLinks, carouselDestinationUrls, carouselIosDeepLinks, clickTrackingUrl, collectionItemsDestinationUrlTemplate, collectionsHeaderType, creativeType, customizableCtaType, destinationUrl, disclosureType, disclosureUrl, gridClickType, id, iosDeepLink, isCarting, isCollageAcceptedTerms, isCollageSingleDestination, isPinDeleted, isRemovable, leadFormId, name, pinId, quizPinData, status, trackingUrls, viewTrackingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdBatchUpdate {\n");
    
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
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

