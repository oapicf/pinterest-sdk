package apimodels;

import apimodels.CreativeType;
import apimodels.EntityStatus;
import apimodels.GridClickType;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ProductGroupPromotion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProductGroupPromotion   {
  @JsonProperty("ad_group_id")
  @Pattern(regexp="^(AG)?\\d+$")

  private String adGroupId;

  @JsonProperty("bid_in_micro_currency")
  
  private Integer bidInMicroCurrency;

  @JsonProperty("catalog_product_group_id")
  @Pattern(regexp="^\\d+$")

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

    private final String value;

    CollectionsHeaderTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CollectionsHeaderTypeEnum fromValue(String value) {
      for (CollectionsHeaderTypeEnum b : CollectionsHeaderTypeEnum.values()) {
        if (b.value.equals(value)) {
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
  @Pattern(regexp="^\\d+$")

  private String collectionsHeroPinId;

  @JsonProperty("creative_type")
  @Valid

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

    private final String value;

    CustomizableCtaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomizableCtaTypeEnum fromValue(String value) {
      for (CustomizableCtaTypeEnum b : CustomizableCtaTypeEnum.values()) {
        if (b.value.equals(value)) {
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
  @Valid

  private GridClickType gridClickType;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("included")
  
  private Boolean included;

  @JsonProperty("is_generate_background")
  
  private Boolean isGenerateBackground;

  @JsonProperty("is_mdl")
  
  private Boolean isMdl;

  @JsonProperty("parent_id")
  @Pattern(regexp="^\\d+$")

  private String parentId;

  /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   */
  public enum PreferredMediaTypeEnum {
    VIDEO("VIDEO"),
    
    IMAGE("IMAGE");

    private final String value;

    PreferredMediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PreferredMediaTypeEnum fromValue(String value) {
      for (PreferredMediaTypeEnum b : PreferredMediaTypeEnum.values()) {
        if (b.value.equals(value)) {
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
  @Valid

  private EntityStatus status;

  @JsonProperty("tracking_url")
  
  private String trackingUrl;

  public ProductGroupPromotion adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

   /**
   * ID of the ad group the product group belongs to.
   * @return adGroupId
  **/
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ProductGroupPromotion bidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
    return this;
  }

   /**
   * The bid in micro currency.
   * @return bidInMicroCurrency
  **/
  public Integer getBidInMicroCurrency() {
    return bidInMicroCurrency;
  }

  public void setBidInMicroCurrency(Integer bidInMicroCurrency) {
    this.bidInMicroCurrency = bidInMicroCurrency;
  }

  public ProductGroupPromotion catalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
    return this;
  }

   /**
   * ID of the catalogs product group that this product group promotion references
   * @return catalogProductGroupId
  **/
  public String getCatalogProductGroupId() {
    return catalogProductGroupId;
  }

  public void setCatalogProductGroupId(String catalogProductGroupId) {
    this.catalogProductGroupId = catalogProductGroupId;
  }

  public ProductGroupPromotion catalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
    return this;
  }

   /**
   * Catalogs product group name
   * @return catalogProductGroupName
  **/
  public String getCatalogProductGroupName() {
    return catalogProductGroupName;
  }

  public void setCatalogProductGroupName(String catalogProductGroupName) {
    this.catalogProductGroupName = catalogProductGroupName;
  }

  public ProductGroupPromotion collectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
    return this;
  }

   /**
   * Collections ad header type
   * @return collectionsHeaderType
  **/
  public CollectionsHeaderTypeEnum getCollectionsHeaderType() {
    return collectionsHeaderType;
  }

  public void setCollectionsHeaderType(CollectionsHeaderTypeEnum collectionsHeaderType) {
    this.collectionsHeaderType = collectionsHeaderType;
  }

  public ProductGroupPromotion collectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
    return this;
  }

   /**
   * Collections Hero Destination Url
   * @return collectionsHeroDestinationUrl
  **/
  public String getCollectionsHeroDestinationUrl() {
    return collectionsHeroDestinationUrl;
  }

  public void setCollectionsHeroDestinationUrl(String collectionsHeroDestinationUrl) {
    this.collectionsHeroDestinationUrl = collectionsHeroDestinationUrl;
  }

  public ProductGroupPromotion collectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
    return this;
  }

   /**
   * Hero Pin ID if this PG is promoted as a Collection
   * @return collectionsHeroPinId
  **/
  public String getCollectionsHeroPinId() {
    return collectionsHeroPinId;
  }

  public void setCollectionsHeroPinId(String collectionsHeroPinId) {
    this.collectionsHeroPinId = collectionsHeroPinId;
  }

  public ProductGroupPromotion creativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
    return this;
  }

   /**
   * Get creativeType
   * @return creativeType
  **/
  public CreativeType getCreativeType() {
    return creativeType;
  }

  public void setCreativeType(CreativeType creativeType) {
    this.creativeType = creativeType;
  }

  public ProductGroupPromotion customizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
    return this;
  }

   /**
   * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
   * @return customizableCtaType
  **/
  public CustomizableCtaTypeEnum getCustomizableCtaType() {
    return customizableCtaType;
  }

  public void setCustomizableCtaType(CustomizableCtaTypeEnum customizableCtaType) {
    this.customizableCtaType = customizableCtaType;
  }

  public ProductGroupPromotion definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * The full product group definition path
   * @return definition
  **/
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public ProductGroupPromotion gridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
    return this;
  }

   /**
   * Get gridClickType
   * @return gridClickType
  **/
  public GridClickType getGridClickType() {
    return gridClickType;
  }

  public void setGridClickType(GridClickType gridClickType) {
    this.gridClickType = gridClickType;
  }

  public ProductGroupPromotion id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the product group promotion.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductGroupPromotion included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
   * @return included
  **/
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public ProductGroupPromotion isGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
    return this;
  }

   /**
   * Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
   * @return isGenerateBackground
  **/
  public Boolean getIsGenerateBackground() {
    return isGenerateBackground;
  }

  public void setIsGenerateBackground(Boolean isGenerateBackground) {
    this.isGenerateBackground = isGenerateBackground;
  }

  public ProductGroupPromotion isMdl(Boolean isMdl) {
    this.isMdl = isMdl;
    return this;
  }

   /**
   * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
   * @return isMdl
  **/
  public Boolean getIsMdl() {
    return isMdl;
  }

  public void setIsMdl(Boolean isMdl) {
    this.isMdl = isMdl;
  }

  public ProductGroupPromotion parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * The parent Product Group ID of this Product Group
   * @return parentId
  **/
  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ProductGroupPromotion preferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
    return this;
  }

   /**
   * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
   * @return preferredMediaType
  **/
  public PreferredMediaTypeEnum getPreferredMediaType() {
    return preferredMediaType;
  }

  public void setPreferredMediaType(PreferredMediaTypeEnum preferredMediaType) {
    this.preferredMediaType = preferredMediaType;
  }

  public ProductGroupPromotion relativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
    return this;
  }

   /**
   * The definition of the product group, relative to its parent - an attribute name/value pair
   * @return relativeDefinition
  **/
  public String getRelativeDefinition() {
    return relativeDefinition;
  }

  public void setRelativeDefinition(String relativeDefinition) {
    this.relativeDefinition = relativeDefinition;
  }

  public ProductGroupPromotion selectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
    return this;
  }

   /**
   * The ad image tag selected for the product group promotion.
   * @return selectedImageTag
  **/
  public String getSelectedImageTag() {
    return selectedImageTag;
  }

  public void setSelectedImageTag(String selectedImageTag) {
    this.selectedImageTag = selectedImageTag;
  }

  public ProductGroupPromotion selectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
    return this;
  }

   /**
   * The ad video tag selected for the product group promotion.
   * @return selectedVideoTag
  **/
  public String getSelectedVideoTag() {
    return selectedVideoTag;
  }

  public void setSelectedVideoTag(String selectedVideoTag) {
    this.selectedVideoTag = selectedVideoTag;
  }

  public ProductGroupPromotion slideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
    return this;
  }

   /**
   * Slideshow Collections Description
   * @return slideshowCollectionsDescription
  **/
  public String getSlideshowCollectionsDescription() {
    return slideshowCollectionsDescription;
  }

  public void setSlideshowCollectionsDescription(String slideshowCollectionsDescription) {
    this.slideshowCollectionsDescription = slideshowCollectionsDescription;
  }

  public ProductGroupPromotion slideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
    return this;
  }

   /**
   * Slideshow Collections Title
   * @return slideshowCollectionsTitle
  **/
  public String getSlideshowCollectionsTitle() {
    return slideshowCollectionsTitle;
  }

  public void setSlideshowCollectionsTitle(String slideshowCollectionsTitle) {
    this.slideshowCollectionsTitle = slideshowCollectionsTitle;
  }

  public ProductGroupPromotion status(EntityStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public ProductGroupPromotion trackingUrl(String trackingUrl) {
    this.trackingUrl = trackingUrl;
    return this;
  }

   /**
   * Tracking template for proudct group promotions. 4000 limit
   * @return trackingUrl
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

