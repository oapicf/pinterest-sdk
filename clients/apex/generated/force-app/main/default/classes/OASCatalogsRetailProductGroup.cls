/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCatalogsRetailProductGroup
 */
public class OASCatalogsRetailProductGroup implements OAS.MappedProperties {
    /**
     * Gets or Sets catalogType
     */
    public enum CatalogTypeEnum {
        RETAIL
    }

    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum catalogType { get; set; }

    /**
     * ID of the catalog product group.
     * @return id
     */
    public String id { get; set; }

    /**
     * Name of catalog product group
     * @return name
     */
    public String name { get; set; }

    /**
     * Get description
     * @return description
     */
    public String description { get; set; }

    /**
     * Get filters
     * @return filters
     */
    public OASCatalogsProductGroupFilters filters { get; set; }

    /**
     * boolean indicator of whether the product group is being featured or not
     * @return isFeatured
     */
    public Boolean isFeatured { get; set; }

    /**
     * Get type
     * @return type
     */
    public OASCatalogsProductGroupType type { get; set; }

    /**
     * Get status
     * @return status
     */
    public OASCatalogsProductGroupStatus status { get; set; }

    /**
     * Unix timestamp in seconds of when catalog product group was created.
     * @return createdAt
     */
    public Integer createdAt { get; set; }

    /**
     * Unix timestamp in seconds of last time catalog product group was updated.
     * @return updatedAt
     */
    public Integer updatedAt { get; set; }

    /**
     * Gets or Sets feedId
     */
    public enum FeedIdEnum {
        NULL
    }

    /**
     * Get feedId
     * @return feedId
     */
    public FeedIdEnum feedId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsRetailProductGroup getExample() {
        OASCatalogsRetailProductGroup catalogsRetailProductGroup = new OASCatalogsRetailProductGroup();
          catalogsRetailProductGroup.catalogType = CatalogTypeEnum.RETAIL;
          catalogsRetailProductGroup.id = '443727193917';
          catalogsRetailProductGroup.name = 'Most Popular';
          catalogsRetailProductGroup.description = '';
          catalogsRetailProductGroup.filters = OASCatalogsProductGroupFilters.getExample();
          catalogsRetailProductGroup.isFeatured = true;
          catalogsRetailProductGroup.type = OASCatalogsProductGroupType.getExample();
          catalogsRetailProductGroup.status = OASCatalogsProductGroupStatus.getExample();
          catalogsRetailProductGroup.createdAt = 1621350033000;
          catalogsRetailProductGroup.updatedAt = 1622742155000;
          catalogsRetailProductGroup.feedId = FeedIdEnum.NULL;
        return catalogsRetailProductGroup;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsRetailProductGroup) {           
            OASCatalogsRetailProductGroup catalogsRetailProductGroup = (OASCatalogsRetailProductGroup) obj;
            return this.catalogType == catalogsRetailProductGroup.catalogType
                && this.id == catalogsRetailProductGroup.id
                && this.name == catalogsRetailProductGroup.name
                && this.description == catalogsRetailProductGroup.description
                && this.filters == catalogsRetailProductGroup.filters
                && this.isFeatured == catalogsRetailProductGroup.isFeatured
                && this.type == catalogsRetailProductGroup.type
                && this.status == catalogsRetailProductGroup.status
                && this.createdAt == catalogsRetailProductGroup.createdAt
                && this.updatedAt == catalogsRetailProductGroup.updatedAt
                && this.feedId == catalogsRetailProductGroup.feedId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (filters == null ? 0 : System.hashCode(filters));
        hashCode = (17 * hashCode) + (isFeatured == null ? 0 : System.hashCode(isFeatured));
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (updatedAt == null ? 0 : System.hashCode(updatedAt));
        hashCode = (17 * hashCode) + (feedId == null ? 0 : System.hashCode(feedId));
        return hashCode;
    }
}
