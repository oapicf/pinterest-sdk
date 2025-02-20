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
 * Object describing a hotel record
 */
public class OASCatalogsCreativeAssetsItemRespons implements OAS.MappedProperties {
    /**
     * Get catalogType
     * @return catalogType
     */
    public OASCatalogsType catalogType { get; set; }

    /**
     * The catalog creative assets id in the merchant namespace
     * @return creativeAssetsId
     */
    public String creativeAssetsId { get; set; }

    /**
     * The pins mapped to the item
     * @return pins
     */
    public List<OASPin> pins { get; set; }

    /**
     * Get attributes
     * @return attributes
     */
    public OASCatalogsCreativeAssetsAttributes attributes { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'creative_assets_id' => 'creativeAssetsId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'creative_assets_id' => 'creativeAssetsId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCatalogsCreativeAssetsItemRespons() {
        pins = new List<OASPin>();
    }

    public static OASCatalogsCreativeAssetsItemRespons getExample() {
        OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse = new OASCatalogsCreativeAssetsItemRespons();
          catalogsCreativeAssetsItemResponse.catalogType = OASCatalogsType.getExample();
          catalogsCreativeAssetsItemResponse.creativeAssetsId = 'DS0294-M';
          catalogsCreativeAssetsItemResponse.pins = new List<OASPin>{OASPin.getExample()};
          catalogsCreativeAssetsItemResponse.attributes = OASCatalogsCreativeAssetsAttributes.getExample();
        return catalogsCreativeAssetsItemResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsCreativeAssetsItemRespons) {           
            OASCatalogsCreativeAssetsItemRespons catalogsCreativeAssetsItemResponse = (OASCatalogsCreativeAssetsItemRespons) obj;
            return this.catalogType == catalogsCreativeAssetsItemResponse.catalogType
                && this.creativeAssetsId == catalogsCreativeAssetsItemResponse.creativeAssetsId
                && this.pins == catalogsCreativeAssetsItemResponse.pins
                && this.attributes == catalogsCreativeAssetsItemResponse.attributes;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (creativeAssetsId == null ? 0 : System.hashCode(creativeAssetsId));
        hashCode = (17 * hashCode) + (pins == null ? 0 : System.hashCode(pins));
        hashCode = (17 * hashCode) + (attributes == null ? 0 : System.hashCode(attributes));
        return hashCode;
    }
}

