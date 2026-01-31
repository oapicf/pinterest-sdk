package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ProductGroupPromotion  {
  
 /**
  * ID of the ad group the product group belongs to.
  */
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")

  private String adGroupId;

 /**
  * The bid in micro currency.
  */
  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")

  private Integer bidInMicroCurrency;

 /**
  * ID of the catalogs product group that this product group promotion references
  */
  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")

  private String catalogProductGroupId;

 /**
  * Catalogs product group name
  */
  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")

  private String catalogProductGroupName;

public enum CollectionsHeaderTypeEnum {

SHOP_THIS_COLLECTION(String.valueOf("SHOP_THIS_COLLECTION")), EXPLORE_THIS_COLLECTION(String.valueOf("EXPLORE_THIS_COLLECTION")), NO_HEADER(String.valueOf("NO_HEADER")), ON_SALE(String.valueOf("ON_SALE")), GET_DEAL(String.valueOf("GET_DEAL"));


    private String value;

    CollectionsHeaderTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CollectionsHeaderTypeEnum fromValue(String value) {
        for (CollectionsHeaderTypeEnum b : CollectionsHeaderTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Collections ad header type
  */
  @ApiModelProperty(example = "SHOP_THIS_COLLECTION", value = "Collections ad header type")

  private CollectionsHeaderTypeEnum collectionsHeaderType;

 /**
  * Collections Hero Destination Url
  */
  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")

  private String collectionsHeroDestinationUrl;

 /**
  * Hero Pin ID if this PG is promoted as a Collection
  */
  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")

  private String collectionsHeroPinId;

  @ApiModelProperty(value = "")

  private CreativeType creativeType;

public enum CustomizableCtaTypeEnum {

SHOP_NOW(String.valueOf("SHOP_NOW")), BOOK_NOW(String.valueOf("BOOK_NOW")), ON_SALE(String.valueOf("ON_SALE")), GET_DEAL(String.valueOf("GET_DEAL")), BUY_ONLINE_PICKUP_IN_STORE(String.valueOf("BUY_ONLINE_PICKUP_IN_STORE"));


    private String value;

    CustomizableCtaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CustomizableCtaTypeEnum fromValue(String value) {
        for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  */
  @ApiModelProperty(example = "SHOP_NOW", value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE")

  private CustomizableCtaTypeEnum customizableCtaType;

 /**
  * The full product group definition path
  */
  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")

  private String definition;

  @ApiModelProperty(value = "")

  private GridClickType gridClickType;

 /**
  * ID of the product group promotion.
  */
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")

  private String id;

 /**
  * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  */
  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")

  private Boolean included;

 /**
  * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  */
  @ApiModelProperty(example = "true", value = "Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.")

  private Boolean isGenerateBackground;

 /**
  * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  */
  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")

  private Boolean isMdl;

 /**
  * The parent Product Group ID of this Product Group
  */
  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")

  private String parentId;

public enum PreferredMediaTypeEnum {

VIDEO(String.valueOf("VIDEO")), IMAGE(String.valueOf("IMAGE"));


    private String value;

    PreferredMediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PreferredMediaTypeEnum fromValue(String value) {
        for (PreferredMediaTypeEnum b : PreferredMediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  */
  @ApiModelProperty(example = "VIDEO", value = "Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.")

  private PreferredMediaTypeEnum preferredMediaType;

 /**
  * The definition of the product group, relative to its parent - an attribute name/value pair
  */
  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")

  private String relativeDefinition;

 /**
  * The ad image tag selected for the product group promotion.
  */
  @ApiModelProperty(example = "holiday_sale", value = "The ad image tag selected for the product group promotion.")

  private String selectedImageTag;

 /**
  * The ad video tag selected for the product group promotion.
  */
  @ApiModelProperty(example = "holiday_sale", value = "The ad video tag selected for the product group promotion.")

  private String selectedVideoTag;

 /**
  * Slideshow Collections Description
  */
  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")

  private String slideshowCollectionsDescription;

 /**
  * Slideshow Collections Title
  */
  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")

  private String slideshowCollectionsTitle;

  @ApiModelProperty(value = "")

  private EntityStatus status;

 /**
  * Tracking template for proudct group promotions. 4000 limit
  */
  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")

  private String trackingUrl;
 /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotion adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
  **/
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotion bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

 /**
   * ID of the catalogs product group that this product group promotion references
   * @return catalogProductGroupId
  **/
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotion catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

 /**
   * Catalogs product group name
   * @return catalogProductGroupName
  **/
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotion catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

 /**
   * Collections ad header type
   * @return collectionsHeaderType
  **/
  @JsonProperty("collections_header_type")
  public String getCollectionsHeaderType() {
    if (collectionsHeaderType == null) {
      return null;
    }
    return collectionsHeaderType.value();
  }

  public void setCollectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public ProductGroupPromotion collectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

 /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
  **/
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  public ProductGroupPromotion collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

 /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
  **/
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  public ProductGroupPromotion collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
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

  public ProductGroupPromotion creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

 /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   * @return customizableCtaType
  **/
  @JsonProperty("customizable_cta_type")
  public String getCustomizableCtaType() {
    if (customizableCtaType == null) {
      return null;
    }
    return customizableCtaType.value();
  }

  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public ProductGroupPromotion customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

 /**
   * The full product group definition path
   * @return definition
  **/
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public ProductGroupPromotion definition(String definition) {
    this.definition = definition;
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

  public ProductGroupPromotion gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

 /**
   * ID of the product group promotion.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductGroupPromotion id(String id) {
    this.id = id;
    return this;
  }

 /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
  **/
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public ProductGroupPromotion included(Boolean included) {
    this.included = included;
    return this;
  }

 /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   * @return isGenerateBackground
  **/
  @JsonProperty("is_generate_background")
  public Boolean getIsGenerateBackground() {
    return isGenerateBackground;
  }

  public void setIsGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

  public ProductGroupPromotion isGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
    return this;
  }

 /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
  **/
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotion isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

 /**
   * The parent Product Group ID of this Product Group
   * @return parentId
  **/
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotion parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

 /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   * @return preferredMediaType
  **/
  @JsonProperty("preferred_media_type")
  public String getPreferredMediaType() {
    if (preferredMediaType == null) {
      return null;
    }
    return preferredMediaType.value();
  }

  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public ProductGroupPromotion preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

 /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
  **/
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  public ProductGroupPromotion relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

 /**
   * The ad image tag selected for the product group promotion.
   * @return selectedImageTag
  **/
  @JsonProperty("selected_image_tag")
  public String getSelectedImageTag() {
    return selectedImageTag;
  }

  public void setSelectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

  public ProductGroupPromotion selectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
    return this;
  }

 /**
   * The ad video tag selected for the product group promotion.
   * @return selectedVideoTag
  **/
  @JsonProperty("selected_video_tag")
  public String getSelectedVideoTag() {
    return selectedVideoTag;
  }

  public void setSelectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

  public ProductGroupPromotion selectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
    return this;
  }

 /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
  **/
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  public ProductGroupPromotion slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

 /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
  **/
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  public ProductGroupPromotion slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
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

  public ProductGroupPromotion status(EntityStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
  **/
  @JsonProperty("tracking_url")
  public String getTrackingUrl() {
    return trackingUrl;
  }

  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
  }

  public ProductGroupPromotion trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
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
    ProductGroupPromotion productGroupPromotion = (ProductGroupPromotion) o;
    return Objects.equals(this.adGroupId, productGroupPromotion.adGroupId) &&
        Objects.equals(this.bidInMicroCurrency, productGroupPromotion.bidInMicroCurrency) &&
        Objects.equals(this.catalogProductGroupId, productGroupPromotion.catalogProductGroupId) &&
        Objects.equals(this.catalogProductGroupName, productGroupPromotion.catalogProductGroupName) &&
        Objects.equals(this.collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        Objects.equals(this.collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        Objects.equals(this.collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(this.creativeType, productGroupPromotion.creativeType) &&
        Objects.equals(this.customizableCtaType, productGroupPromotion.customizableCtaType) &&
        Objects.equals(this.definition, productGroupPromotion.definition) &&
        Objects.equals(this.gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(this.id, productGroupPromotion.id) &&
        Objects.equals(this.included, productGroupPromotion.included) &&
        Objects.equals(this.isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        Objects.equals(this.isMdl, productGroupPromotion.isMdl) &&
        Objects.equals(this.parentId, productGroupPromotion.parentId) &&
        Objects.equals(this.preferredMediaType, productGroupPromotion.preferredMediaType) &&
        Objects.equals(this.relativeDefinition, productGroupPromotion.relativeDefinition) &&
        Objects.equals(this.selectedImageTag, productGroupPromotion.selectedImageTag) &&
        Objects.equals(this.selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        Objects.equals(this.slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        Objects.equals(this.slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(this.status, productGroupPromotion.status) &&
        Objects.equals(this.trackingUrl, productGroupPromotion.trackingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, bidInMicroCurrency, catalogProductGroupId, catalogProductGroupName, collectionsHeaderType, collectionsHeroDestinationUrl, collectionsHeroPinId, creativeType, customizableCtaType, definition, gridClickType, id, included, isGenerateBackground, isMdl, parentId, preferredMediaType, relativeDefinition, selectedImageTag, selectedVideoTag, slideshowCollectionsDescription, slideshowCollectionsTitle, status, trackingUrl);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

