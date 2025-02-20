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
 * OASGoogleProductCategory1Filter
 */
public class OASGoogleProductCategory1Filter implements OAS.MappedProperties {
    /**
     * Get goOGLEPRODUCTCATEGORY1
     * @return goOGLEPRODUCTCATEGORY1
     */
    public OASCatalogsProductGroupMultipleStrin goOGLEPRODUCTCATEGORY1 { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'GOOGLE_PRODUCT_CATEGORY_1' => 'goOGLEPRODUCTCATEGORY1'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASGoogleProductCategory1Filter getExample() {
        OASGoogleProductCategory1Filter googleProductCategory1Filter = new OASGoogleProductCategory1Filter();
          googleProductCategory1Filter.goOGLEPRODUCTCATEGORY1 = null;
        return googleProductCategory1Filter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGoogleProductCategory1Filter) {           
            OASGoogleProductCategory1Filter googleProductCategory1Filter = (OASGoogleProductCategory1Filter) obj;
            return this.goOGLEPRODUCTCATEGORY1 == googleProductCategory1Filter.goOGLEPRODUCTCATEGORY1;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (goOGLEPRODUCTCATEGORY1 == null ? 0 : System.hashCode(goOGLEPRODUCTCATEGORY1));
        return hashCode;
    }
}

