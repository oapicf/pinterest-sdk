package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdCollectionsHeaderType;
import org.openapitools.server.model.AdDisapprovalReasons;
import org.openapitools.server.model.AdReviewStatus;
import org.openapitools.server.model.CartingProduct;
import org.openapitools.server.model.CreativeType;
import org.openapitools.server.model.CustomizableCTAType;
import org.openapitools.server.model.DisclosureType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.GridClickType;
import org.openapitools.server.model.PinPromotionSummaryStatus;
import org.openapitools.server.model.QuizPinData;
import org.openapitools.server.model.TrackingUrls;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Ad   {

    private String adAccountId;
    private String adGroupId;
    private String androidDeepLink;
    private String campaignId;
    private List<String> carouselAndroidDeepLinks;
    private List<String> carouselDestinationUrls;
    private List<String> carouselIosDeepLinks;
    private Integer cartingPlatformType;
    private List<@Valid CartingProduct> cartingProducts = new ArrayList<>();
    private String clickTrackingUrl;
    private String collectionItemsDestinationUrlTemplate;
    private AdCollectionsHeaderType collectionsHeaderType;
    private Integer createdTime;
    private CreativeType creativeType;
    private CustomizableCTAType customizableCtaType;
    private String destinationUrl;
    private DisclosureType disclosureType;
    private String disclosureUrl;
    private GridClickType gridClickType;
    private String id;
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
    private List<AdDisapprovalReasons> rejectedReasons = new ArrayList<>();
    private List<String> rejectionLabels = new ArrayList<>();
    private AdReviewStatus reviewStatus;
    private EntityStatus status;
    private PinPromotionSummaryStatus summaryStatus;
    private TrackingUrls trackingUrls;
    private String type;
    private Integer updatedTime;
    private String viewTrackingUrl;

    /**
     * Default constructor.
     */
    public Ad() {
    // JSON-B / Jackson
    }

    /**
     * Create Ad.
     *
     * @param adAccountId The ID of the advertiser that this ad belongs to.
     * @param adGroupId ID of the ad group that contains the ad.
     * @param androidDeepLink Deep link URL for Android devices.
     * @param campaignId ID of the ad campaign that contains this ad.
     * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
     * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
     * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
     * @param cartingPlatformType The vendor platform type of the carting/WTB ad.
     * @param cartingProducts Array of carting/WTB products for the ad.
     * @param clickTrackingUrl Tracking url for the ad clicks.
     * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
     * @param collectionsHeaderType collectionsHeaderType
     * @param createdTime Pin creation time. Unix timestamp in seconds.
     * @param creativeType creativeType
     * @param customizableCtaType customizableCtaType
     * @param destinationUrl Destination URL.
     * @param disclosureType disclosureType
     * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
     * @param gridClickType gridClickType
     * @param id The ID of this ad.
     * @param iosDeepLink Deep link URL for iOS devices.
     * @param isCarting Is the ad a carting/WTB ad?
     * @param isCollageAcceptedTerms Whether the advertiser has accepted the terms and conditions for collage ad.
     * @param isCollageSingleDestination Whether the collage ad has a single destination url override.
     * @param isPinDeleted Is original pin deleted?
     * @param isRemovable Is pin repinnable?
     * @param leadFormId Lead form ID for lead ad generation.
     * @param name Name of the ad - 255 chars max.
     * @param pinId Pin ID. This field may only be updated for draft ads.
     * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @param rejectedReasons Enum reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
     * @param rejectionLabels Text reason why the pin was rejected. Returned if &#x60;review_status&#x60; is \&quot;REJECTED\&quot;.
     * @param reviewStatus Ad review status
     * @param status status
     * @param summaryStatus Ad summary status
     * @param trackingUrls trackingUrls
     * @param type Always \&quot;ad\&quot;.
     * @param updatedTime Last update time. Unix timestamp in seconds.
     * @param viewTrackingUrl Tracking URL for ad impressions.
     */
    public Ad(
        String adAccountId, 
        String adGroupId, 
        String androidDeepLink, 
        String campaignId, 
        List<String> carouselAndroidDeepLinks, 
        List<String> carouselDestinationUrls, 
        List<String> carouselIosDeepLinks, 
        Integer cartingPlatformType, 
        List<@Valid CartingProduct> cartingProducts, 
        String clickTrackingUrl, 
        String collectionItemsDestinationUrlTemplate, 
        AdCollectionsHeaderType collectionsHeaderType, 
        Integer createdTime, 
        CreativeType creativeType, 
        CustomizableCTAType customizableCtaType, 
        String destinationUrl, 
        DisclosureType disclosureType, 
        String disclosureUrl, 
        GridClickType gridClickType, 
        String id, 
        String iosDeepLink, 
        Boolean isCarting, 
        Boolean isCollageAcceptedTerms, 
        Boolean isCollageSingleDestination, 
        Boolean isPinDeleted, 
        Boolean isRemovable, 
        String leadFormId, 
        String name, 
        String pinId, 
        QuizPinData quizPinData, 
        List<AdDisapprovalReasons> rejectedReasons, 
        List<String> rejectionLabels, 
        AdReviewStatus reviewStatus, 
        EntityStatus status, 
        PinPromotionSummaryStatus summaryStatus, 
        TrackingUrls trackingUrls, 
        String type, 
        Integer updatedTime, 
        String viewTrackingUrl
    ) {
        this.adAccountId = adAccountId;
        this.adGroupId = adGroupId;
        this.androidDeepLink = androidDeepLink;
        this.campaignId = campaignId;
        this.carouselAndroidDeepLinks = carouselAndroidDeepLinks;
        this.carouselDestinationUrls = carouselDestinationUrls;
        this.carouselIosDeepLinks = carouselIosDeepLinks;
        this.cartingPlatformType = cartingPlatformType;
        this.cartingProducts = cartingProducts;
        this.clickTrackingUrl = clickTrackingUrl;
        this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
        this.collectionsHeaderType = collectionsHeaderType;
        this.createdTime = createdTime;
        this.creativeType = creativeType;
        this.customizableCtaType = customizableCtaType;
        this.destinationUrl = destinationUrl;
        this.disclosureType = disclosureType;
        this.disclosureUrl = disclosureUrl;
        this.gridClickType = gridClickType;
        this.id = id;
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
        this.rejectedReasons = rejectedReasons;
        this.rejectionLabels = rejectionLabels;
        this.reviewStatus = reviewStatus;
        this.status = status;
        this.summaryStatus = summaryStatus;
        this.trackingUrls = trackingUrls;
        this.type = type;
        this.updatedTime = updatedTime;
        this.viewTrackingUrl = viewTrackingUrl;
    }



    /**
     * The ID of the advertiser that this ad belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
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
     * ID of the ad campaign that contains this ad.
     * @return campaignId
     */
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
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
     * The vendor platform type of the carting/WTB ad.
     * minimum: 1
     * maximum: 2
     * @return cartingPlatformType
     */
    public Integer getCartingPlatformType() {
        return cartingPlatformType;
    }

    public void setCartingPlatformType(Integer cartingPlatformType) {
        this.cartingPlatformType = cartingPlatformType;
    }

    /**
     * Array of carting/WTB products for the ad.
     * @return cartingProducts
     */
    public List<@Valid CartingProduct> getCartingProducts() {
        return cartingProducts;
    }

    public void setCartingProducts(List<@Valid CartingProduct> cartingProducts) {
        this.cartingProducts = cartingProducts;
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
     * Destination URL template for all items within a collections drawer.
     * @return collectionItemsDestinationUrlTemplate
     */
    public String getCollectionItemsDestinationUrlTemplate() {
        return collectionItemsDestinationUrlTemplate;
    }

    public void setCollectionItemsDestinationUrlTemplate(String collectionItemsDestinationUrlTemplate) {
        this.collectionItemsDestinationUrlTemplate = collectionItemsDestinationUrlTemplate;
    }

    /**
     * Get collectionsHeaderType
     * @return collectionsHeaderType
     */
    public AdCollectionsHeaderType getCollectionsHeaderType() {
        return collectionsHeaderType;
    }

    public void setCollectionsHeaderType(AdCollectionsHeaderType collectionsHeaderType) {
        this.collectionsHeaderType = collectionsHeaderType;
    }

    /**
     * Pin creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
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
     * Whether the advertiser has accepted the terms and conditions for collage ad.
     * @return isCollageAcceptedTerms
     */
    public Boolean getIsCollageAcceptedTerms() {
        return isCollageAcceptedTerms;
    }

    public void setIsCollageAcceptedTerms(Boolean isCollageAcceptedTerms) {
        this.isCollageAcceptedTerms = isCollageAcceptedTerms;
    }

    /**
     * Whether the collage ad has a single destination url override.
     * @return isCollageSingleDestination
     */
    public Boolean getIsCollageSingleDestination() {
        return isCollageSingleDestination;
    }

    public void setIsCollageSingleDestination(Boolean isCollageSingleDestination) {
        this.isCollageSingleDestination = isCollageSingleDestination;
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
     * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
     * @return quizPinData
     */
    public QuizPinData getQuizPinData() {
        return quizPinData;
    }

    public void setQuizPinData(QuizPinData quizPinData) {
        this.quizPinData = quizPinData;
    }

    /**
     * Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
     * @return rejectedReasons
     */
    public List<AdDisapprovalReasons> getRejectedReasons() {
        return rejectedReasons;
    }

    public void setRejectedReasons(List<AdDisapprovalReasons> rejectedReasons) {
        this.rejectedReasons = rejectedReasons;
    }

    /**
     * Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
     * @return rejectionLabels
     */
    public List<String> getRejectionLabels() {
        return rejectionLabels;
    }

    public void setRejectionLabels(List<String> rejectionLabels) {
        this.rejectionLabels = rejectionLabels;
    }

    /**
     * Ad review status
     * @return reviewStatus
     */
    public AdReviewStatus getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(AdReviewStatus reviewStatus) {
        this.reviewStatus = reviewStatus;
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
     * Ad summary status
     * @return summaryStatus
     */
    public PinPromotionSummaryStatus getSummaryStatus() {
        return summaryStatus;
    }

    public void setSummaryStatus(PinPromotionSummaryStatus summaryStatus) {
        this.summaryStatus = summaryStatus;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    public TrackingUrls getTrackingUrls() {
        return trackingUrls;
    }

    public void setTrackingUrls(TrackingUrls trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    /**
     * Always \"ad\".
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Last update time. Unix timestamp in seconds.
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
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
        sb.append("class Ad {\n");
        
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
        sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    carouselAndroidDeepLinks: ").append(toIndentedString(carouselAndroidDeepLinks)).append("\n");
        sb.append("    carouselDestinationUrls: ").append(toIndentedString(carouselDestinationUrls)).append("\n");
        sb.append("    carouselIosDeepLinks: ").append(toIndentedString(carouselIosDeepLinks)).append("\n");
        sb.append("    cartingPlatformType: ").append(toIndentedString(cartingPlatformType)).append("\n");
        sb.append("    cartingProducts: ").append(toIndentedString(cartingProducts)).append("\n");
        sb.append("    clickTrackingUrl: ").append(toIndentedString(clickTrackingUrl)).append("\n");
        sb.append("    collectionItemsDestinationUrlTemplate: ").append(toIndentedString(collectionItemsDestinationUrlTemplate)).append("\n");
        sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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
        sb.append("    rejectedReasons: ").append(toIndentedString(rejectedReasons)).append("\n");
        sb.append("    rejectionLabels: ").append(toIndentedString(rejectionLabels)).append("\n");
        sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
        sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

