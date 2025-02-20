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
 * Creative assets product metadata entity
 */
public class OASCatalogsCreativeAssetsProductMeta implements OAS.MappedProperties {
    /**
     * The user-created unique ID that represents the creative assets item.
     * @return creativeAssetsId
     */
    public String creativeAssetsId { get; set; }

    /**
     * Get visibility
     * @return visibility
     */
    public OASCreativeAssetsVisibilityType visibility { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'creative_assets_id' => 'creativeAssetsId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsCreativeAssetsProductMeta getExample() {
        OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata = new OASCatalogsCreativeAssetsProductMeta();
          catalogsCreativeAssetsProductMetadata.creativeAssetsId = '123abc';
          catalogsCreativeAssetsProductMetadata.visibility = OASCreativeAssetsVisibilityType.getExample();
        return catalogsCreativeAssetsProductMetadata;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsCreativeAssetsProductMeta) {           
            OASCatalogsCreativeAssetsProductMeta catalogsCreativeAssetsProductMetadata = (OASCatalogsCreativeAssetsProductMeta) obj;
            return this.creativeAssetsId == catalogsCreativeAssetsProductMetadata.creativeAssetsId
                && this.visibility == catalogsCreativeAssetsProductMetadata.visibility;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (creativeAssetsId == null ? 0 : System.hashCode(creativeAssetsId));
        hashCode = (17 * hashCode) + (visibility == null ? 0 : System.hashCode(visibility));
        return hashCode;
    }
}

