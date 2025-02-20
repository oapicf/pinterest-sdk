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
 * OASKeywordsCommon
 */
public class OASKeywordsCommon implements OAS.MappedProperties {
    /**
     * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
     * @return bid
     */
    public Integer bid { get; set; }

    /**
     * Get matchType
     * @return matchType
     */
    public OASMatchTypeResponse matchType { get; set; }

    /**
     * Keyword value (120 chars max).
     * @return value
     */
    public String value { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'match_type' => 'matchType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASKeywordsCommon getExample() {
        OASKeywordsCommon keywordsCommon = new OASKeywordsCommon();
          keywordsCommon.bid = 0;
          keywordsCommon.matchType = OASMatchTypeResponse.getExample();
          keywordsCommon.value = '';
        return keywordsCommon;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASKeywordsCommon) {           
            OASKeywordsCommon keywordsCommon = (OASKeywordsCommon) obj;
            return this.bid == keywordsCommon.bid
                && this.matchType == keywordsCommon.matchType
                && this.value == keywordsCommon.value;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (bid == null ? 0 : System.hashCode(bid));
        hashCode = (17 * hashCode) + (matchType == null ? 0 : System.hashCode(matchType));
        hashCode = (17 * hashCode) + (value == null ? 0 : System.hashCode(value));
        return hashCode;
    }
}

