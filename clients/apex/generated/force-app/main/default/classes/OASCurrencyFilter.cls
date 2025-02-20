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
 * OASCurrencyFilter
 */
public class OASCurrencyFilter implements OAS.MappedProperties {
    /**
     * Get r_CURRENCY
     * @return r_CURRENCY
     */
    public OASCatalogsProductGroupCurrencyCrite r_CURRENCY { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'CURRENCY' => 'r_CURRENCY'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCurrencyFilter getExample() {
        OASCurrencyFilter currencyFilter = new OASCurrencyFilter();
          currencyFilter.r_CURRENCY = null;
        return currencyFilter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCurrencyFilter) {           
            OASCurrencyFilter currencyFilter = (OASCurrencyFilter) obj;
            return this.r_CURRENCY == currencyFilter.r_CURRENCY;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (r_CURRENCY == null ? 0 : System.hashCode(r_CURRENCY));
        return hashCode;
    }
}

