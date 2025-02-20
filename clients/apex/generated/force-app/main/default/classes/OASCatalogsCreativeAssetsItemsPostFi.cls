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
 * OASCatalogsCreativeAssetsItemsPostFi
 */
public class OASCatalogsCreativeAssetsItemsPostFi implements OAS.MappedProperties {
    /**
     * Gets or Sets catalogType
     */
    public enum CatalogTypeEnum {
        CREATIVE_ASSETS
    }

    /**
     * Get catalogType
     * @return catalogType
     */
    public CatalogTypeEnum catalogType { get; set; }

    /**
     * Get creativeAssetsIds
     * @return creativeAssetsIds
     */
    public List<String> creativeAssetsIds { get; set; }

    /**
     * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
     * @return catalogId
     */
    public String catalogId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'creative_assets_ids' => 'creativeAssetsIds',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'creative_assets_ids' => 'creativeAssetsIds',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'creative_assets_ids' => 'creativeAssetsIds',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCatalogsCreativeAssetsItemsPostFi() {
        creativeAssetsIds = new List<String>();
    }

    public static OASCatalogsCreativeAssetsItemsPostFi getExample() {
        OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter = new OASCatalogsCreativeAssetsItemsPostFi();
          catalogsCreativeAssetsItemsPostFilter.catalogType = CatalogTypeEnum.CREATIVE_ASSETS;
          catalogsCreativeAssetsItemsPostFilter.creativeAssetsIds = new List<String>{''};
          catalogsCreativeAssetsItemsPostFilter.catalogId = '';
        return catalogsCreativeAssetsItemsPostFilter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsCreativeAssetsItemsPostFi) {           
            OASCatalogsCreativeAssetsItemsPostFi catalogsCreativeAssetsItemsPostFilter = (OASCatalogsCreativeAssetsItemsPostFi) obj;
            return this.catalogType == catalogsCreativeAssetsItemsPostFilter.catalogType
                && this.creativeAssetsIds == catalogsCreativeAssetsItemsPostFilter.creativeAssetsIds
                && this.catalogId == catalogsCreativeAssetsItemsPostFilter.catalogId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (creativeAssetsIds == null ? 0 : System.hashCode(creativeAssetsIds));
        hashCode = (17 * hashCode) + (catalogId == null ? 0 : System.hashCode(catalogId));
        return hashCode;
    }
}

