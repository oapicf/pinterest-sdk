/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASProductGroupPromotionCreateReques
 */
public class OASProductGroupPromotionCreateReques implements OASProductGroupPromotion, OAS.MappedProperties {
    /**
     * ID of the product group promotion.
     * @return id
     */
    public String id { get; set; }

    /**
     * ID of the ad group the product group belongs to.
     * @return adGroupId
     */
    public String adGroupId { get; set; }

    /**
     * The bid in micro currency.
     * @return bidInMicroCurrency
     */
    public Integer bidInMicroCurrency { get; set; }

    /**
     * True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
     * @return included
     */
    public Boolean included { get; set; }

    /**
     * The full product group definition path
     * @return definition
     */
    public String definition { get; set; }

    /**
     * The definition of the product group, relative to its parent - an attribute name/value pair
     * @return relativeDefinition
     */
    public String relativeDefinition { get; set; }

    /**
     * The parent Product Group ID of this Product Group
     * @return parentId
     */
    public String parentId { get; set; }

    /**
     * Slideshow Collections Title
     * @return slideshowCollectionsTitle
     */
    public String slideshowCollectionsTitle { get; set; }

    /**
     * Slideshow Collections Description
     * @return slideshowCollectionsDescription
     */
    public String slideshowCollectionsDescription { get; set; }

    /**
     * If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
     * @return isMdl
     */
    public Boolean isMdl { get; set; }

    /**
     * Get status
     * @return status
     */
    public OASEntityStatus status { get; set; }

    /**
     * Tracking template for proudct group promotions. 4000 limit
     * @return trackingUrl
     */
    public String trackingUrl { get; set; }

    /**
     * ID of the catalogs product group that this product group promotion references
     * @return catalogProductGroupId
     */
    public String catalogProductGroupId { get; set; }

    /**
     * Catalogs product group name
     * @return catalogProductGroupName
     */
    public String catalogProductGroupName { get; set; }

    /**
     * Hero Pin ID if this PG is promoted as a Collection
     * @return collectionsHeroPinId
     */
    public String collectionsHeroPinId { get; set; }

    /**
     * Collections Hero Destination Url
     * @return collectionsHeroDestinationUrl
     */
    public String collectionsHeroDestinationUrl { get; set; }

    /**
     * Get gridClickType
     * @return gridClickType
     */
    public OASGridClickType gridClickType { get; set; }

    /**
     * Get creativeType
     * @return creativeType
     */
    public OASCreativeType creativeType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_group_id' => 'adGroupId',
        'bid_in_micro_currency' => 'bidInMicroCurrency',
        'relative_definition' => 'relativeDefinition',
        'parent_id' => 'parentId',
        'slideshow_collections_title' => 'slideshowCollectionsTitle',
        'slideshow_collections_description' => 'slideshowCollectionsDescription',
        'is_mdl' => 'isMdl',
        'tracking_url' => 'trackingUrl',
        'catalog_product_group_id' => 'catalogProductGroupId',
        'catalog_product_group_name' => 'catalogProductGroupName',
        'collections_hero_pin_id' => 'collectionsHeroPinId',
        'collections_hero_destination_url' => 'collectionsHeroDestinationUrl',
        'grid_click_type' => 'gridClickType',
        'creative_type' => 'creativeType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASProductGroupPromotionCreateReques getExample() {
        OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement = new OASProductGroupPromotionCreateReques();
          productGroupPromotionCreateRequestElement.id = '2680059592705';
          productGroupPromotionCreateRequestElement.adGroupId = '2680059592705';
          productGroupPromotionCreateRequestElement.bidInMicroCurrency = 14000000;
          productGroupPromotionCreateRequestElement.included = true;
          productGroupPromotionCreateRequestElement.definition = '*_/product_type_0=\'kitchen\'/product_type_1=\'beverage appliances\'';
          productGroupPromotionCreateRequestElement.relativeDefinition = 'product_type_1=\'beverage appliances\'';
          productGroupPromotionCreateRequestElement.parentId = '1231234';
          productGroupPromotionCreateRequestElement.slideshowCollectionsTitle = 'slideshow title';
          productGroupPromotionCreateRequestElement.slideshowCollectionsDescription = 'slideshow description';
          productGroupPromotionCreateRequestElement.isMdl = true;
          productGroupPromotionCreateRequestElement.status = OASEntityStatus.getExample();
          productGroupPromotionCreateRequestElement.trackingUrl = 'https://www.pinterest.com';
          productGroupPromotionCreateRequestElement.catalogProductGroupId = '1231235';
          productGroupPromotionCreateRequestElement.catalogProductGroupName = 'catalogProductGroupName';
          productGroupPromotionCreateRequestElement.collectionsHeroPinId = '123123';
          productGroupPromotionCreateRequestElement.collectionsHeroDestinationUrl = 'http://www.pinterest.com';
          productGroupPromotionCreateRequestElement.gridClickType = OASGridClickType.getExample();
          productGroupPromotionCreateRequestElement.creativeType = OASCreativeType.getExample();
        return productGroupPromotionCreateRequestElement;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASProductGroupPromotionCreateReques) {           
            OASProductGroupPromotionCreateReques productGroupPromotionCreateRequestElement = (OASProductGroupPromotionCreateReques) obj;
            return this.id == productGroupPromotionCreateRequestElement.id
                && this.adGroupId == productGroupPromotionCreateRequestElement.adGroupId
                && this.bidInMicroCurrency == productGroupPromotionCreateRequestElement.bidInMicroCurrency
                && this.included == productGroupPromotionCreateRequestElement.included
                && this.definition == productGroupPromotionCreateRequestElement.definition
                && this.relativeDefinition == productGroupPromotionCreateRequestElement.relativeDefinition
                && this.parentId == productGroupPromotionCreateRequestElement.parentId
                && this.slideshowCollectionsTitle == productGroupPromotionCreateRequestElement.slideshowCollectionsTitle
                && this.slideshowCollectionsDescription == productGroupPromotionCreateRequestElement.slideshowCollectionsDescription
                && this.isMdl == productGroupPromotionCreateRequestElement.isMdl
                && this.status == productGroupPromotionCreateRequestElement.status
                && this.trackingUrl == productGroupPromotionCreateRequestElement.trackingUrl
                && this.catalogProductGroupId == productGroupPromotionCreateRequestElement.catalogProductGroupId
                && this.catalogProductGroupName == productGroupPromotionCreateRequestElement.catalogProductGroupName
                && this.collectionsHeroPinId == productGroupPromotionCreateRequestElement.collectionsHeroPinId
                && this.collectionsHeroDestinationUrl == productGroupPromotionCreateRequestElement.collectionsHeroDestinationUrl
                && this.gridClickType == productGroupPromotionCreateRequestElement.gridClickType
                && this.creativeType == productGroupPromotionCreateRequestElement.creativeType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (adGroupId == null ? 0 : System.hashCode(adGroupId));
        hashCode = (17 * hashCode) + (bidInMicroCurrency == null ? 0 : System.hashCode(bidInMicroCurrency));
        hashCode = (17 * hashCode) + (included == null ? 0 : System.hashCode(included));
        hashCode = (17 * hashCode) + (definition == null ? 0 : System.hashCode(definition));
        hashCode = (17 * hashCode) + (relativeDefinition == null ? 0 : System.hashCode(relativeDefinition));
        hashCode = (17 * hashCode) + (parentId == null ? 0 : System.hashCode(parentId));
        hashCode = (17 * hashCode) + (slideshowCollectionsTitle == null ? 0 : System.hashCode(slideshowCollectionsTitle));
        hashCode = (17 * hashCode) + (slideshowCollectionsDescription == null ? 0 : System.hashCode(slideshowCollectionsDescription));
        hashCode = (17 * hashCode) + (isMdl == null ? 0 : System.hashCode(isMdl));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (trackingUrl == null ? 0 : System.hashCode(trackingUrl));
        hashCode = (17 * hashCode) + (catalogProductGroupId == null ? 0 : System.hashCode(catalogProductGroupId));
        hashCode = (17 * hashCode) + (catalogProductGroupName == null ? 0 : System.hashCode(catalogProductGroupName));
        hashCode = (17 * hashCode) + (collectionsHeroPinId == null ? 0 : System.hashCode(collectionsHeroPinId));
        hashCode = (17 * hashCode) + (collectionsHeroDestinationUrl == null ? 0 : System.hashCode(collectionsHeroDestinationUrl));
        hashCode = (17 * hashCode) + (gridClickType == null ? 0 : System.hashCode(gridClickType));
        hashCode = (17 * hashCode) + (creativeType == null ? 0 : System.hashCode(creativeType));
        return hashCode;
    }
}

