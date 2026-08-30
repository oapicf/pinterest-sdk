package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CreativeType;
import org.openapitools.server.model.CustomizableCTAType;
import org.openapitools.server.model.DisclosureType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.GridClickType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdUpdateRequest   {

    private String id;
    private String pinId;
    private String adGroupId;
    private String androidDeepLink;
    private List<String> carouselAndroidDeepLinks;
    private List<String> carouselDestinationUrls;
    private List<String> carouselIosDeepLinks;
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
    private Object quizPinData;
    private EntityStatus status;
    private Object trackingUrls;
    private String viewTrackingUrl;

    /**
     * Default constructor.
     */
    public AdUpdateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AdUpdateRequest.
     *
     * @param id The ID of this ad.
     * @param pinId Pin ID. This field may only be updated for draft ads.
     * @param adGroupId ID of the ad group that contains the ad.
     * @param androidDeepLink Deep link URL for Android devices.
     * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
     * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
     * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
     * @param clickTrackingUrl Tracking url for the ad clicks.
     * @param creativeType creativeType
     * @param customizableCtaType customizableCtaType
     * @param destinationUrl Destination URL.
     * @param disclosureType disclosureType
     * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
     * @param gridClickType gridClickType
     * @param iosDeepLink Deep link URL for iOS devices.
     * @param isCarting Is the ad a carting/WTB ad?
     * @param isPinDeleted Is original pin deleted?
     * @param isRemovable Is pin repinnable?
     * @param leadFormId Lead form ID for lead ad generation.
     * @param name Name of the ad - 255 chars max.
     * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @param status status
     * @param trackingUrls trackingUrls
     * @param viewTrackingUrl Tracking URL for ad impressions.
     */
    public AdUpdateRequest(
        String id, 
        String pinId, 
        String adGroupId, 
        String androidDeepLink, 
        List<String> carouselAndroidDeepLinks, 
        List<String> carouselDestinationUrls, 
        List<String> carouselIosDeepLinks, 
        String clickTrackingUrl, 
        CreativeType creativeType, 
        CustomizableCTAType customizableCtaType, 
        String destinationUrl, 
        DisclosureType disclosureType, 
        String disclosureUrl, 
        GridClickType gridClickType, 
        String iosDeepLink, 
        Boolean isCarting, 
        Boolean isPinDeleted, 
        Boolean isRemovable, 
        String leadFormId, 
        String name, 
        Object quizPinData, 
        EntityStatus status, 
        Object trackingUrls, 
        String viewTrackingUrl
    ) {
        this.id = id;
        this.pinId = pinId;
        this.adGroupId = adGroupId;
        this.androidDeepLink = androidDeepLink;
        this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
        this.carouselDestinationUrls = carouselDestinationUrls;
        this.carouselIosDeepLinks = carouselIosDeepLinks;
        this.clickTrackingUrl = clickTrackingUrl;
        this.creativeType = creativeType;
        this.customizableCtaType = customizableCtaType;
        this.destinationUrl = destinationUrl;
        this.disclosureType = disclosureType;
        this.disclosureUrl = disclosureUrl;
        this.gridClickType = gridClickType;
        this.iosDeepLink = iosDeepLink;
        this.isCarting = isCarting;
        this.isPinDeleted = isPinDeleted;
        this.isRemovable = isRemovable;
        this.leadFormId = leadFormId;
        this.name = name;
        this.quizPinData = quizPinData;
        this.status = status;
        this.trackingUrls = trackingUrls;
        this.viewTrackingUrl = viewTrackingUrl;
    }



    /**
     * The ID of this ad.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Pin ID. This field may only be updated for draft ads.
     * @return pinId
     */
    public String getPinId() {
        return pinId;
    }

    public void setPinId(String pinId) {
        this.pinId = pinId;
    }

    /**
     * ID of the ad group that contains the ad.
     * @return adGroupId
     */
    public String getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(String adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * Deep link URL for Android devices.
     * @return androidDeepLink
     */
    public String getAndroidDeepLink() {
        return androidDeepLink;
    }

    public void setAndroidDeepLink(String androidDeepLink) {
        this.androidDeepLink = androidDeepLink;
    }

    /**
     * Comma-separated deep links for the carousel pin on Android.
     * @return carouselAndroidDeepLinks
     */
    public List<String> getCarouselAndroidDeepLinks() {
        return carouselAndroidDeepLinks;
    }

    public void setCarouselAndroidDeepLinks(List<String> carouselAndroidDeepLinks) {
        this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
    }

    /**
     * Comma-separated destination URLs for the carousel pin to promote.
     * @return carouselDestinationUrls
     */
    public List<String> getCarouselDestinationUrls() {
        return carouselDestinationUrls;
    }

    public void setCarouselDestinationUrls(List<String> carouselDestinationUrls) {
        this.carouselDestinationUrls = carouselDestinationUrls;
    }

    /**
     * Comma-separated deep links for the carousel pin on iOS.
     * @return carouselIosDeepLinks
     */
    public List<String> getCarouselIosDeepLinks() {
        return carouselIosDeepLinks;
    }

    public void setCarouselIosDeepLinks(List<String> carouselIosDeepLinks) {
        this.carouselIosDeepLinks = carouselIosDeepLinks;
    }

    /**
     * Tracking url for the ad clicks.
     * @return clickTrackingUrl
     */
    public String getClickTrackingUrl() {
        return clickTrackingUrl;
    }

    public void setClickTrackingUrl(String clickTrackingUrl) {
        this.clickTrackingUrl = clickTrackingUrl;
    }

    /**
     * Get creativeType
     * @return creativeType
     */
    public CreativeType getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(CreativeType creativeType) {
        this.creativeType = creativeType;
    }

    /**
     * Get customizableCtaType
     * @return customizableCtaType
     */
    public CustomizableCTAType getCustomizableCtaType() {
        return customizableCtaType;
    }

    public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
        this.customizableCtaType = customizableCtaType;
    }

    /**
     * Destination URL.
     * @return destinationUrl
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    public void setDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    /**
     * Get disclosureType
     * @return disclosureType
     */
    public DisclosureType getDisclosureType() {
        return disclosureType;
    }

    public void setDisclosureType(DisclosureType disclosureType) {
        this.disclosureType = disclosureType;
    }

    /**
     * URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
     * @return disclosureUrl
     */
    public String getDisclosureUrl() {
        return disclosureUrl;
    }

    public void setDisclosureUrl(String disclosureUrl) {
        this.disclosureUrl = disclosureUrl;
    }

    /**
     * Get gridClickType
     * @return gridClickType
     */
    public GridClickType getGridClickType() {
        return gridClickType;
    }

    public void setGridClickType(GridClickType gridClickType) {
        this.gridClickType = gridClickType;
    }

    /**
     * Deep link URL for iOS devices.
     * @return iosDeepLink
     */
    public String getIosDeepLink() {
        return iosDeepLink;
    }

    public void setIosDeepLink(String iosDeepLink) {
        this.iosDeepLink = iosDeepLink;
    }

    /**
     * Is the ad a carting/WTB ad?
     * @return isCarting
     */
    public Boolean getIsCarting() {
        return isCarting;
    }

    public void setIsCarting(Boolean isCarting) {
        this.isCarting = isCarting;
    }

    /**
     * Is original pin deleted?
     * @return isPinDeleted
     */
    public Boolean getIsPinDeleted() {
        return isPinDeleted;
    }

    public void setIsPinDeleted(Boolean isPinDeleted) {
        this.isPinDeleted = isPinDeleted;
    }

    /**
     * Is pin repinnable?
     * @return isRemovable
     */
    public Boolean getIsRemovable() {
        return isRemovable;
    }

    public void setIsRemovable(Boolean isRemovable) {
        this.isRemovable = isRemovable;
    }

    /**
     * Lead form ID for lead ad generation.
     * @return leadFormId
     */
    public String getLeadFormId() {
        return leadFormId;
    }

    public void setLeadFormId(String leadFormId) {
        this.leadFormId = leadFormId;
    }

    /**
     * Name of the ad - 255 chars max.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @return quizPinData
     */
    public Object getQuizPinData() {
        return quizPinData;
    }

    public void setQuizPinData(Object quizPinData) {
        this.quizPinData = quizPinData;
    }

    /**
     * Get status
     * @return status
     */
    public EntityStatus getStatus() {
        return status;
    }

    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    public Object getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(Object trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
     * Tracking URL for ad impressions.
     * @return viewTrackingUrl
     */
    public String getViewTrackingUrl() {
        return viewTrackingUrl;
    }

    public void setViewTrackingUrl(String viewTrackingUrl) {
        this.viewTrackingUrl = viewTrackingUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdUpdateRequest {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

