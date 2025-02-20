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
 * OASProductType4Filter
 */
public class OASProductType4Filter implements OAS.MappedProperties {
    /**
     * Get prODUCTTYPE4
     * @return prODUCTTYPE4
     */
    public OASCatalogsProductGroupMultipleStrin prODUCTTYPE4 { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'PRODUCT_TYPE_4' => 'prODUCTTYPE4'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASProductType4Filter getExample() {
        OASProductType4Filter productType4Filter = new OASProductType4Filter();
          productType4Filter.prODUCTTYPE4 = null;
        return productType4Filter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASProductType4Filter) {           
            OASProductType4Filter productType4Filter = (OASProductType4Filter) obj;
            return this.prODUCTTYPE4 == productType4Filter.prODUCTTYPE4;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (prODUCTTYPE4 == null ? 0 : System.hashCode(prODUCTTYPE4));
        return hashCode;
    }
}

