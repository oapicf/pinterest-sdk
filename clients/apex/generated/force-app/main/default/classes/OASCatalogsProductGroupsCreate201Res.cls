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
 * OASCatalogsProductGroupsCreate201Res
 */
public class OASCatalogsProductGroupsCreate201Res implements OASCatalogsProductGroup, OASCatalogsVerticalProductGroup, OAS.MappedProperties {
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
     * Get catalogId
     * @return catalogId
     */
    public String catalogId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'is_featured' => 'isFeatured',
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'feed_id' => 'feedId',
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsProductGroupsCreate201Res getExample() {
        OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response = new OASCatalogsProductGroupsCreate201Res();
          catalogsProductGroupsCreate201Response.id = '443727193917';
          catalogsProductGroupsCreate201Response.name = 'Most Popular';
          catalogsProductGroupsCreate201Response.description = '';
          catalogsProductGroupsCreate201Response.filters = OASCatalogsProductGroupFilters.getExample();
          catalogsProductGroupsCreate201Response.isFeatured = true;
          catalogsProductGroupsCreate201Response.type = OASCatalogsProductGroupType.getExample();
          catalogsProductGroupsCreate201Response.status = OASCatalogsProductGroupStatus.getExample();
          catalogsProductGroupsCreate201Response.createdAt = 1621350033000;
          catalogsProductGroupsCreate201Response.updatedAt = 1622742155000;
          catalogsProductGroupsCreate201Response.feedId = FeedIdEnum.NULL;
          catalogsProductGroupsCreate201Response.catalogType = CatalogTypeEnum.RETAIL;
          catalogsProductGroupsCreate201Response.catalogId = '';
        return catalogsProductGroupsCreate201Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsProductGroupsCreate201Res) {           
            OASCatalogsProductGroupsCreate201Res catalogsProductGroupsCreate201Response = (OASCatalogsProductGroupsCreate201Res) obj;
            return this.id == catalogsProductGroupsCreate201Response.id
                && this.name == catalogsProductGroupsCreate201Response.name
                && this.description == catalogsProductGroupsCreate201Response.description
                && this.filters == catalogsProductGroupsCreate201Response.filters
                && this.isFeatured == catalogsProductGroupsCreate201Response.isFeatured
                && this.type == catalogsProductGroupsCreate201Response.type
                && this.status == catalogsProductGroupsCreate201Response.status
                && this.createdAt == catalogsProductGroupsCreate201Response.createdAt
                && this.updatedAt == catalogsProductGroupsCreate201Response.updatedAt
                && this.feedId == catalogsProductGroupsCreate201Response.feedId
                && this.catalogType == catalogsProductGroupsCreate201Response.catalogType
                && this.catalogId == catalogsProductGroupsCreate201Response.catalogId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
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
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (catalogId == null ? 0 : System.hashCode(catalogId));
        return hashCode;
    }
}
