package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreativeType;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.GridClickType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T04:51:24.974216359Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ProductGroupPromotion   {
  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("bid_in_micro_currency")
  private Integer bidInMicroCurrency;

  @JsonProperty("catalog_product_group_id")
  private String catalogProductGroupId;

  @JsonProperty("catalog_product_group_name")
  private String catalogProductGroupName;

  /**
   * Collections ad header type
   */
  public enum CollectionsHeaderTypeEnum {
    SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
    
    EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
    
    NO_HEADER("NO_HEADER"),
    
    ON_SALE("ON_SALE"),
    
    GET_DEAL("GET_DEAL");

    private String value;

    CollectionsHeaderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CollectionsHeaderTypeEnum fromValue(String text) {
      for (CollectionsHeaderTypeEnum b : CollectionsHeaderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("collections_header_type")
  private CollectionsHeaderTypeEnum collectionsHeaderType;

  @JsonProperty("collections_hero_destination_url")
  private String collectionsHeroDestinationUrl;

  @JsonProperty("collections_hero_pin_id")
  private String collectionsHeroPinId;

  @JsonProperty("creative_type")
  private CreativeType creativeType;

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   */
  public enum CustomizableCtaTypeEnum {
    SHOP_NOW("SHOP_NOW"),
    
    BOOK_NOW("BOOK_NOW"),
    
    ON_SALE("ON_SALE"),
    
    GET_DEAL("GET_DEAL"),
    
    BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE");

    private String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomizableCtaTypeEnum fromValue(String text) {
      for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customizable_cta_type")
  private CustomizableCtaTypeEnum customizableCtaType;

  @JsonProperty("definition")
  private String definition;

  @JsonProperty("grid_click_type")
  private GridClickType gridClickType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("included")
  private Boolean included;

  @JsonProperty("is_generate_background")
  private Boolean isGenerateBackground;

  @JsonProperty("is_mdl")
  private Boolean isMdl;

  @JsonProperty("parent_id")
  private String parentId;

  /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   */
  public enum PreferredMediaTypeEnum {
    VIDEO("VIDEO"),
    
    IMAGE("IMAGE");

    private String value;

    PreferredMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferredMediaTypeEnum fromValue(String text) {
      for (PreferredMediaTypeEnum b : PreferredMediaTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("preferred_media_type")
  private PreferredMediaTypeEnum preferredMediaType;

  @JsonProperty("relative_definition")
  private String relativeDefinition;

  @JsonProperty("selected_image_tag")
  private String selectedImageTag;

  @JsonProperty("selected_video_tag")
  private String selectedVideoTag;

  @JsonProperty("slideshow_collections_description")
  private String slideshowCollectionsDescription;

  @JsonProperty("slideshow_collections_title")
  private String slideshowCollectionsTitle;

  @JsonProperty("status")
  private EntityStatus status;

  @JsonProperty("tracking_url")
  private String trackingUrl;

  /**
   * ID of the ad group the product group belongs to.
   **/
  public ProductGroupPromotion adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the ad group the product group belongs to.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The bid in micro currency.
   **/
  public ProductGroupPromotion bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

  
  @ApiModelProperty(example = "14000000", value = "The bid in micro currency.")
  @JsonProperty("bid_in_micro_currency")
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }
  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  /**
   * ID of the catalogs product group that this product group promotion references
   **/
  public ProductGroupPromotion catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "1231235", value = "ID of the catalogs product group that this product group promotion references")
  @JsonProperty("catalog_product_group_id")
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }
  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  /**
   * Catalogs product group name
   **/
  public ProductGroupPromotion catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

  
  @ApiModelProperty(example = "catalogProductGroupName", value = "Catalogs product group name")
  @JsonProperty("catalog_product_group_name")
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }
  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  /**
   * Collections ad header type
   **/
  public ProductGroupPromotion collectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

  
  @ApiModelProperty(example = "SHOP_THIS_COLLECTION", value = "Collections ad header type")
  @JsonProperty("collections_header_type")
  public CollectionsHeaderTypeEnum getCollectionsHeaderType() {
    return collectionsHeaderType;
  }
  public void setCollectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  /**
   * Collections Hero Destination Url
   **/
  public ProductGroupPromotion collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

  
  @ApiModelProperty(example = "http://www.pinterest.com", value = "Collections Hero Destination Url")
  @JsonProperty("collections_hero_destination_url")
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }
  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  /**
   * Hero Pin ID if this PG is promoted as a Collection
   **/
  public ProductGroupPromotion collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

  
  @ApiModelProperty(example = "123123", value = "Hero Pin ID if this PG is promoted as a Collection")
  @JsonProperty("collections_hero_pin_id")
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }
  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  /**
   **/
  public ProductGroupPromotion creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("creative_type")
  public CreativeType getCreativeType() {
    return creativeType;
  }
  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   **/
  public ProductGroupPromotion customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

  
  @ApiModelProperty(example = "SHOP_NOW", value = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE")
  @JsonProperty("customizable_cta_type")
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }
  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  /**
   * The full product group definition path
   **/
  public ProductGroupPromotion definition(String definition) {
    this.definition = definition;
    return this;
  }

  
  @ApiModelProperty(example = "*_/product_type_0='kitchen'/product_type_1='beverage appliances'", value = "The full product group definition path")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   **/
  public ProductGroupPromotion gridClickType(GridClickType gridClickType) {
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
   * ID of the product group promotion.
   **/
  public ProductGroupPromotion id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2680059592705", value = "ID of the product group promotion.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   **/
  public ProductGroupPromotion included(Boolean included) {
    this.included = included;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
  @JsonProperty("included")
  public Boolean getIncluded() {
    return included;
  }
  public void setIncluded(Boolean included) {
    this.included = included;
  }

  /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   **/
  public ProductGroupPromotion isGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.")
  @JsonProperty("is_generate_background")
  public Boolean getIsGenerateBackground() {
    return isGenerateBackground;
  }
  public void setIsGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

  /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   **/
  public ProductGroupPromotion isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
  @JsonProperty("is_mdl")
  public Boolean getIsMdl() {
    return isMdl;
  }
  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  /**
   * The parent Product Group ID of this Product Group
   **/
  public ProductGroupPromotion parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  
  @ApiModelProperty(example = "1231234", value = "The parent Product Group ID of this Product Group")
  @JsonProperty("parent_id")
  public String getParentId() {
    return parentId;
  }
  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   **/
  public ProductGroupPromotion preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

  
  @ApiModelProperty(example = "VIDEO", value = "Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.")
  @JsonProperty("preferred_media_type")
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }
  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   **/
  public ProductGroupPromotion relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

  
  @ApiModelProperty(example = "product_type_1='beverage appliances'", value = "The definition of the product group, relative to its parent - an attribute name/value pair")
  @JsonProperty("relative_definition")
  public String getRelativeDefinition() {
    return relativeDefinition;
  }
  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  /**
   * The ad image tag selected for the product group promotion.
   **/
  public ProductGroupPromotion selectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
    return this;
  }

  
  @ApiModelProperty(example = "holiday_sale", value = "The ad image tag selected for the product group promotion.")
  @JsonProperty("selected_image_tag")
  public String getSelectedImageTag() {
    return selectedImageTag;
  }
  public void setSelectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

  /**
   * The ad video tag selected for the product group promotion.
   **/
  public ProductGroupPromotion selectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
    return this;
  }

  
  @ApiModelProperty(example = "holiday_sale", value = "The ad video tag selected for the product group promotion.")
  @JsonProperty("selected_video_tag")
  public String getSelectedVideoTag() {
    return selectedVideoTag;
  }
  public void setSelectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

  /**
   * Slideshow Collections Description
   **/
  public ProductGroupPromotion slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow description", value = "Slideshow Collections Description")
  @JsonProperty("slideshow_collections_description")
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }
  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  /**
   * Slideshow Collections Title
   **/
  public ProductGroupPromotion slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

  
  @ApiModelProperty(example = "slideshow title", value = "Slideshow Collections Title")
  @JsonProperty("slideshow_collections_title")
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }
  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  /**
   **/
  public ProductGroupPromotion status(EntityStatus status) {
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
   * Tracking template for proudct group promotions. 4000 limit
   **/
  public ProductGroupPromotion trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.pinterest.com", value = "Tracking template for proudct group promotions. 4000 limit")
  @JsonProperty("tracking_url")
  public String getTrackingUrl() {
    return trackingUrl;
  }
  public void setTrackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
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
    return Objects.equals(adGroupId, productGroupPromotion.adGroupId) &&
        Objects.equals(bidInMicroCurrency, productGroupPromotion.bidInMicroCurrency) &&
        Objects.equals(catalogProductGroupId, productGroupPromotion.catalogProductGroupId) &&
        Objects.equals(catalogProductGroupName, productGroupPromotion.catalogProductGroupName) &&
        Objects.equals(collectionsHeaderType, productGroupPromotion.collectionsHeaderType) &&
        Objects.equals(collectionsHeroDestinationUrl, productGroupPromotion.collectionsHeroDestinationUrl) &&
        Objects.equals(collectionsHeroPinId, productGroupPromotion.collectionsHeroPinId) &&
        Objects.equals(creativeType, productGroupPromotion.creativeType) &&
        Objects.equals(customizableCtaType, productGroupPromotion.customizableCtaType) &&
        Objects.equals(definition, productGroupPromotion.definition) &&
        Objects.equals(gridClickType, productGroupPromotion.gridClickType) &&
        Objects.equals(id, productGroupPromotion.id) &&
        Objects.equals(included, productGroupPromotion.included) &&
        Objects.equals(isGenerateBackground, productGroupPromotion.isGenerateBackground) &&
        Objects.equals(isMdl, productGroupPromotion.isMdl) &&
        Objects.equals(parentId, productGroupPromotion.parentId) &&
        Objects.equals(preferredMediaType, productGroupPromotion.preferredMediaType) &&
        Objects.equals(relativeDefinition, productGroupPromotion.relativeDefinition) &&
        Objects.equals(selectedImageTag, productGroupPromotion.selectedImageTag) &&
        Objects.equals(selectedVideoTag, productGroupPromotion.selectedVideoTag) &&
        Objects.equals(slideshowCollectionsDescription, productGroupPromotion.slideshowCollectionsDescription) &&
        Objects.equals(slideshowCollectionsTitle, productGroupPromotion.slideshowCollectionsTitle) &&
        Objects.equals(status, productGroupPromotion.status) &&
        Objects.equals(trackingUrl, productGroupPromotion.trackingUrl);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

