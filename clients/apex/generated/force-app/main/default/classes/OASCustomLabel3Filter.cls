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
 * OASCustomLabel3Filter
 */
public class OASCustomLabel3Filter implements OAS.MappedProperties {
    /**
     * Get cuSTOMLABEL3
     * @return cuSTOMLABEL3
     */
    public OASCatalogsProductGroupMultipleStrin cuSTOMLABEL3 { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'CUSTOM_LABEL_3' => 'cuSTOMLABEL3'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCustomLabel3Filter getExample() {
        OASCustomLabel3Filter customLabel3Filter = new OASCustomLabel3Filter();
          customLabel3Filter.cuSTOMLABEL3 = null;
        return customLabel3Filter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCustomLabel3Filter) {           
            OASCustomLabel3Filter customLabel3Filter = (OASCustomLabel3Filter) obj;
            return this.cuSTOMLABEL3 == customLabel3Filter.cuSTOMLABEL3;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (cuSTOMLABEL3 == null ? 0 : System.hashCode(cuSTOMLABEL3));
        return hashCode;
    }
}
