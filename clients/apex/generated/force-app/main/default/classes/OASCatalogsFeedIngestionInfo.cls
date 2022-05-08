/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCatalogsFeedIngestionInfo
 */
public class OASCatalogsFeedIngestionInfo implements OAS.MappedProperties {
    /**
     * Get inStock
     * @return inStock
     */
    public Integer inStock { get; set; }

    /**
     * Get outOfStock
     * @return outOfStock
     */
    public Integer outOfStock { get; set; }

    /**
     * Get preorder
     * @return preorder
     */
    public Integer preorder { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'in_stock' => 'inStock',
        'out_of_stock' => 'outOfStock'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'in_stock' => 'inStock',
        'out_of_stock' => 'outOfStock'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsFeedIngestionInfo getExample() {
        OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo = new OASCatalogsFeedIngestionInfo();
          catalogsFeedIngestionInfo.inStock = 0;
          catalogsFeedIngestionInfo.outOfStock = 0;
          catalogsFeedIngestionInfo.preorder = 0;
        return catalogsFeedIngestionInfo;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsFeedIngestionInfo) {           
            OASCatalogsFeedIngestionInfo catalogsFeedIngestionInfo = (OASCatalogsFeedIngestionInfo) obj;
            return this.inStock == catalogsFeedIngestionInfo.inStock
                && this.outOfStock == catalogsFeedIngestionInfo.outOfStock
                && this.preorder == catalogsFeedIngestionInfo.preorder;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (inStock == null ? 0 : System.hashCode(inStock));
        hashCode = (17 * hashCode) + (outOfStock == null ? 0 : System.hashCode(outOfStock));
        hashCode = (17 * hashCode) + (preorder == null ? 0 : System.hashCode(preorder));
        return hashCode;
    }
}
