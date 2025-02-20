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
 * OASGoogleProductCategory6Filter
 */
public class OASGoogleProductCategory6Filter implements OAS.MappedProperties {
    /**
     * Get goOGLEPRODUCTCATEGORY6
     * @return goOGLEPRODUCTCATEGORY6
     */
    public OASCatalogsProductGroupMultipleStrin goOGLEPRODUCTCATEGORY6 { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'GOOGLE_PRODUCT_CATEGORY_6' => 'goOGLEPRODUCTCATEGORY6'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASGoogleProductCategory6Filter getExample() {
        OASGoogleProductCategory6Filter googleProductCategory6Filter = new OASGoogleProductCategory6Filter();
          googleProductCategory6Filter.goOGLEPRODUCTCATEGORY6 = null;
        return googleProductCategory6Filter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGoogleProductCategory6Filter) {           
            OASGoogleProductCategory6Filter googleProductCategory6Filter = (OASGoogleProductCategory6Filter) obj;
            return this.goOGLEPRODUCTCATEGORY6 == googleProductCategory6Filter.goOGLEPRODUCTCATEGORY6;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (goOGLEPRODUCTCATEGORY6 == null ? 0 : System.hashCode(goOGLEPRODUCTCATEGORY6));
        return hashCode;
    }
}

