package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AdCollectionsHeaderType;
import org.openapitools.vertxweb.server.model.CreativeType;
import org.openapitools.vertxweb.server.model.CustomizableCTAType;
import org.openapitools.vertxweb.server.model.DisclosureType;
import org.openapitools.vertxweb.server.model.EntityStatus;
import org.openapitools.vertxweb.server.model.GridClickType;
import org.openapitools.vertxweb.server.model.QuizPinData;
import org.openapitools.vertxweb.server.model.TrackingUrls;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdCreate   {
  
  private String adGroupId;
  private String androidDeepLink;
  private List<String> carouselAndroidDeepLinks;
  private List<String> carouselDestinationUrls;
  private List<String> carouselIosDeepLinks;
  private String clickTrackingUrl;
  private String collectionItemsDestinationUrlTemplate;
  private AdCollectionsHeaderType collectionsHeaderType;
  private CreativeType creativeType;
  private CustomizableCTAType customizableCtaType;
  private String destinationUrl;
  private DisclosureType disclosureType;
  private String disclosureUrl;
  private GridClickType gridClickType;
  private String iosDeepLink;
  private Boolean isCarting;
  private Boolean isCollageAcceptedTerms;
  private Boolean isCollageSingleDestination;
  private Boolean isPinDeleted;
  private Boolean isRemovable;
  private String leadFormId;
  private String name;
  private String pinId;
  private QuizPinData quizPinData;
  private EntityStatus status;
  private TrackingUrls trackingUrls;
  private String viewTrackingUrl;

  public AdCreate () {

  }

  public AdCreate (String adGroupId, String androidDeepLink, List<String> carouselAndroidDeepLinks, List<String> carouselDestinationUrls, List<String> carouselIosDeepLinks, String clickTrackingUrl, String collectionItemsDestinationUrlTemplate, AdCollectionsHeaderType collectionsHeaderType, CreativeType creativeType, CustomizableCTAType customizableCtaType, String destinationUrl, DisclosureType disclosureType, String disclosureUrl, GridClickType gridClickType, String iosDeepLink, Boolean isCarting, Boolean isCollageAcceptedTerms, Boolean isCollageSingleDestination, Boolean isPinDeleted, Boolean isRemovable, String leadFormId, String name, String pinId, QuizPinData quizPinData, EntityStatus status, TrackingUrls trackingUrls, String viewTrackingUrl) {
    this.adGroupId = adGroupId;
    this.androidDeepLink = androidDeepLink;
    this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    this.carouselDestinationUrls = carouselDestinationUrls;
    this.carouselIosDeepLinks = carouselIosDeepLinks;
    this.clickTrackingUrl = clickTrackingUrl;
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    this.collectionsHeaderType = collectionsHeaderType;
    this.creativeType = creativeType;
    this.customizableCtaType = customizableCtaType;
    this.destinationUrl = destinationUrl;
    this.disclosureType = disclosureType;
    this.disclosureUrl = disclosureUrl;
    this.gridClickType = gridClickType;
    this.iosDeepLink = iosDeepLink;
    this.isCarting = isCarting;
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    this.isCollageSingleDestination = isCollageSingleDestination;
    this.isPinDeleted = isPinDeleted;
    this.isRemovable = isRemovable;
    this.leadFormId = leadFormId;
    this.name = name;
    this.pinId = pinId;
    this.quizPinData = quizPinData;
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

    
  @JsonProperty("collection_items_destination_url_template")
  public String getCollectionItemsDestinationUrlTemplate() {
    return collectionItemsDestinationUrlTemplate;
  }
  public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
    this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
  }

    
  @JsonProperty("collections_header_type")
  public AdCollectionsHeaderType getCollectionsHeaderType() {
    return collectionsHeaderType;
  }
  public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

    
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

    
  @JsonProperty("customizable_cta_type")
  public CustomizableCTAType getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

    
  @JsonProperty("destination_url")
  public String getDestinationUrl() {
    return destinationUrl;
  }
  public void setDestinationUrl(String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

    
  @JsonProperty("disclosure_type")
  public DisclosureType getDisclosureType() {
    return disclosureType;
  }
  public void setDisclosureType(DisclosureType disclosureType) {
    this.disclosureType = disclosureType;
  }

    
  @JsonProperty("disclosure_url")
  public String getDisclosureUrl() {
    return disclosureUrl;
  }
  public void setDisclosureUrl(String disclosureUrl) {
    this.disclosureUrl = disclosureUrl;
  }

    
  @JsonProperty("grid_click_type")
  public GridClickType getGridClickType() {
    return gridClickType;
  }
  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

    
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }
  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

    
  @JsonProperty("is_carting")
  public Boolean getIsCarting() {
    return isCarting;
  }
  public void setIsCarting(Boolean isCarting) {
    this.isCarting = isCarting;
  }

    
  @JsonProperty("is_collage_accepted_terms")
  public Boolean getIsCollageAcceptedTerms() {
    return isCollageAcceptedTerms;
  }
  public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
    this.isCollageAcceptedTerms = isCollageAcceptedTerms;
  }

    
  @JsonProperty("is_collage_single_destination")
  public Boolean getIsCollageSingleDestination() {
    return isCollageSingleDestination;
  }
  public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
    this.isCollageSingleDestination = isCollageSingleDestination;
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

    
  @JsonProperty("lead_form_id")
  public String getLeadFormId() {
    return leadFormId;
  }
  public void setLeadFormId(String leadFormId) {
    this.leadFormId = leadFormId;
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

    
  @JsonProperty("quiz_pin_data")
  public QuizPinData getQuizPinData() {
    return quizPinData;
  }
  public void setQuizPinData(QuizPinData quizPinData) {
    this.quizPinData = quizPinData;
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
