package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CollectionsHeaderType;
import org.openapitools.server.model.CreativeType;
import org.openapitools.server.model.EntityStatus;
import org.openapitools.server.model.GridClickType;
import org.openapitools.server.model.PreferredMediaType;
import org.openapitools.server.model.ProductGroupPromotionCustomizableCTAType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProductGroupPromotion   {

    private String adGroupId;
    private Integer bidInMicroCurrency;
    private String catalogProductGroupId;
    private String catalogProductGroupName;
    private CollectionsHeaderType collectionsHeaderType;
    private String collectionsHeroDestinationUrl;
    private String collectionsHeroPinId;
    private CreativeType creativeType;
    private ProductGroupPromotionCustomizableCTAType customizableCtaType;
    private String definition;
    private GridClickType gridClickType;
    private String id;
    private Boolean included;
    private Boolean isGenerateBackground;
    private Boolean isImageAutoResizing;
    private Boolean isMdl;
    private String parentId;
    private PreferredMediaType preferredMediaType;
    private String relativeDefinition;
    private String selectedImageTag;
    private String selectedVideoTag;
    private String slideshowCollectionsDescription;
    private String slideshowCollectionsTitle;
    private EntityStatus status;
    private String trackingUrl;

    /**
     * Default constructor.
     */
    public ProductGroupPromotion() {
    // JSON-B / Jackson
    }

    /**
     * Create ProductGroupPromotion.
     *
     * @param adGroupId ID of the ad group the product group belongs to.
     * @param bidInMicroCurrency The bid in micro currency.
     * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references (required for create operations)
     * @param catalogProductGroupName Catalogs product group name
     * @param collectionsHeaderType collectionsHeaderType
     * @param collectionsHeroDestinationUrl Collections Hero Destination Url
     * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
     * @param creativeType creativeType
     * @param customizableCtaType customizableCtaType
     * @param definition The full product group definition path
     * @param gridClickType gridClickType
     * @param id ID of the product group promotion (required for update operations).
     * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
     * @param isImageAutoResizing Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
     * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @param parentId The parent Product Group ID of this Product Group
     * @param preferredMediaType preferredMediaType
     * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
     * @param selectedImageTag The ad image tag selected for the product group promotion.
     * @param selectedVideoTag The ad video tag selected for the product group promotion.
     * @param slideshowCollectionsDescription Slideshow Collections Description
     * @param slideshowCollectionsTitle Slideshow Collections Title
     * @param status status
     * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
     */
    public ProductGroupPromotion(
        String adGroupId, 
        Integer bidInMicroCurrency, 
        String catalogProductGroupId, 
        String catalogProductGroupName, 
        CollectionsHeaderType collectionsHeaderType, 
        String collectionsHeroDestinationUrl, 
        String collectionsHeroPinId, 
        CreativeType creativeType, 
        ProductGroupPromotionCustomizableCTAType customizableCtaType, 
        String definition, 
        GridClickType gridClickType, 
        String id, 
        Boolean included, 
        Boolean isGenerateBackground, 
        Boolean isImageAutoResizing, 
        Boolean isMdl, 
        String parentId, 
        PreferredMediaType preferredMediaType, 
        String relativeDefinition, 
        String selectedImageTag, 
        String selectedVideoTag, 
        String slideshowCollectionsDescription, 
        String slideshowCollectionsTitle, 
        EntityStatus status, 
        String trackingUrl
    ) {
        this.adGroupId = adGroupId;
        this.bidInMicroCurrency = bidInMicroCurrency;
        this.catalogProductGroupId = catalogProductGroupId;
        this.catalogProductGroupName = catalogProductGroupName;
        this.collectionsHeaderType = collectionsHeaderType;
        this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
        this.collectionsHeroPinId = collectionsHeroPinId;
        this.creativeType = creativeType;
        this.customizableCtaType = customizableCtaType;
        this.definition = definition;
        this.gridClickType = gridClickType;
        this.id = id;
        this.included = included;
        this.isGenerateBackground = isGenerateBackground;
        this.isImageAutoResizing = isImageAutoResizing;
        this.isMdl = isMdl;
        this.parentId = parentId;
        this.preferredMediaType = preferredMediaType;
        this.relativeDefinition = relativeDefinition;
        this.selectedImageTag = selectedImageTag;
        this.selectedVideoTag = selectedVideoTag;
        this.slideshowCollectionsDescription = slideshowCollectionsDescription;
        this.slideshowCollectionsTitle = slideshowCollectionsTitle;
        this.status = status;
        this.trackingUrl = trackingUrl;
    }



    /**
     * ID of the ad group the product group belongs to.
     * @return adGroupId
     */
    public String getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(String adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
     * The bid in micro currency.
     * @return bidInMicroCurrency
     */
    public Integer getBidInMicroCurrency() {
        return bidInMicroCurrency;
    }

    public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
        this.bidInMicroCurrency = bidInMicroCurrency;
    }

    /**
     * ID of the catalogs product group that this product group promotion references (required for create operations)
     * @return catalogProductGroupId
     */
    public String getCatalogProductGroupId() {
        return catalogProductGroupId;
    }

    public void setCatalogProductGroupId(String catalogProductGroupId) {
        this.catalogProductGroupId = catalogProductGroupId;
    }

    /**
     * Catalogs product group name
     * @return catalogProductGroupName
     */
    public String getCatalogProductGroupName() {
        return catalogProductGroupName;
    }

    public void setCatalogProductGroupName(String catalogProductGroupName) {
        this.catalogProductGroupName = catalogProductGroupName;
    }

    /**
     * Get collectionsHeaderType
     * @return collectionsHeaderType
     */
    public CollectionsHeaderType getCollectionsHeaderType() {
        return collectionsHeaderType;
    }

    public void setCollectionsHeaderType(CollectionsHeaderType collectionsHeaderType) {
        this.collectionsHeaderType = collectionsHeaderType;
    }

    /**
     * Collections Hero Destination Url
     * @return collectionsHeroDestinationUrl
     */
    public String getCollectionsHeroDestinationUrl() {
        return collectionsHeroDestinationUrl;
    }

    public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
        this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    }

    /**
     * Hero Pin ID if this PG is promoted as a Collection
     * @return collectionsHeroPinId
     */
    public String getCollectionsHeroPinId() {
        return collectionsHeroPinId;
    }

    public void setCollectionsHeroPinId(String collectionsHeroPinId) {
        this.collectionsHeroPinId = collectionsHeroPinId;
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
    public ProductGroupPromotionCustomizableCTAType getCustomizableCtaType() {
        return customizableCtaType;
    }

    public void setCustomizableCtaType(ProductGroupPromotionCustomizableCTAType customizableCtaType) {
        this.customizableCtaType = customizableCtaType;
    }

    /**
     * The full product group definition path
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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
     * ID of the product group promotion (required for update operations).
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @return included
     */
    public Boolean getIncluded() {
        return included;
    }

    public void setIncluded(Boolean included) {
        this.included = included;
    }

    /**
     * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
     * @return isGenerateBackground
     */
    public Boolean getIsGenerateBackground() {
        return isGenerateBackground;
    }

    public void setIsGenerateBackground(Boolean isGenerateBackground) {
        this.isGenerateBackground = isGenerateBackground;
    }

    /**
     * Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
     * @return isImageAutoResizing
     */
    public Boolean getIsImageAutoResizing() {
        return isImageAutoResizing;
    }

    public void setIsImageAutoResizing(Boolean isImageAutoResizing) {
        this.isImageAutoResizing = isImageAutoResizing;
    }

    /**
     * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @return isMdl
     */
    public Boolean getIsMdl() {
        return isMdl;
    }

    public void setIsMdl(Boolean isMdl) {
        this.isMdl = isMdl;
    }

    /**
     * The parent Product Group ID of this Product Group
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Get preferredMediaType
     * @return preferredMediaType
     */
    public PreferredMediaType getPreferredMediaType() {
        return preferredMediaType;
    }

    public void setPreferredMediaType(PreferredMediaType preferredMediaType) {
        this.preferredMediaType = preferredMediaType;
    }

    /**
     * The definition of the product group, relative to its parent - an attribute name/value pair
     * @return relativeDefinition
     */
    public String getRelativeDefinition() {
        return relativeDefinition;
    }

    public void setRelativeDefinition(String relativeDefinition) {
        this.relativeDefinition = relativeDefinition;
    }

    /**
     * The ad image tag selected for the product group promotion.
     * @return selectedImageTag
     */
    public String getSelectedImageTag() {
        return selectedImageTag;
    }

    public void setSelectedImageTag(String selectedImageTag) {
        this.selectedImageTag = selectedImageTag;
    }

    /**
     * The ad video tag selected for the product group promotion.
     * @return selectedVideoTag
     */
    public String getSelectedVideoTag() {
        return selectedVideoTag;
    }

    public void setSelectedVideoTag(String selectedVideoTag) {
        this.selectedVideoTag = selectedVideoTag;
    }

    /**
     * Slideshow Collections Description
     * @return slideshowCollectionsDescription
     */
    public String getSlideshowCollectionsDescription() {
        return slideshowCollectionsDescription;
    }

    public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
        this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    }

    /**
     * Slideshow Collections Title
     * @return slideshowCollectionsTitle
     */
    public String getSlideshowCollectionsTitle() {
        return slideshowCollectionsTitle;
    }

    public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
        this.slideshowCollectionsTitle = slideshowCollectionsTitle;
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
     * Tracking template for proudct group promotions. 4000 limit
     * @return trackingUrl
     */
    public String getTrackingUrl() {
        return trackingUrl;
    }

    public void setTrackingUrl(String trackingUrl) {
        this.trackingUrl = trackingUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductGroupPromotion {\n");
        
        sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
        sb.append("    bidInMicroCurrency: ").append(toIndentedString(bidInMicroCurrency)).append("\n");
        sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
        sb.append("    catalogProductGroupName: ").append(toIndentedString(catalogProductGroupName)).append("\n");
        sb.append("    collectionsHeaderType: ").append(toIndentedString(collectionsHeaderType)).append("\n");
        sb.append("    collectionsHeroDestinationUrl: ").append(toIndentedString(collectionsHeroDestinationUrl)).append("\n");
        sb.append("    collectionsHeroPinId: ").append(toIndentedString(collectionsHeroPinId)).append("\n");
        sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
        sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    gridClickType: ").append(toIndentedString(gridClickType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    included: ").append(toIndentedString(included)).append("\n");
        sb.append("    isGenerateBackground: ").append(toIndentedString(isGenerateBackground)).append("\n");
        sb.append("    isImageAutoResizing: ").append(toIndentedString(isImageAutoResizing)).append("\n");
        sb.append("    isMdl: ").append(toIndentedString(isMdl)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    preferredMediaType: ").append(toIndentedString(preferredMediaType)).append("\n");
        sb.append("    relativeDefinition: ").append(toIndentedString(relativeDefinition)).append("\n");
        sb.append("    selectedImageTag: ").append(toIndentedString(selectedImageTag)).append("\n");
        sb.append("    selectedVideoTag: ").append(toIndentedString(selectedVideoTag)).append("\n");
        sb.append("    slideshowCollectionsDescription: ").append(toIndentedString(slideshowCollectionsDescription)).append("\n");
        sb.append("    slideshowCollectionsTitle: ").append(toIndentedString(slideshowCollectionsTitle)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    trackingUrl: ").append(toIndentedString(trackingUrl)).append("\n");
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

