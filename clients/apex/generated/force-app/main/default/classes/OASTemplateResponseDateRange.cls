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
 * OASTemplateResponseDateRange
 */
public class OASTemplateResponseDateRange implements OAS.MappedProperties {
    /**
     * Get dynamicDateRange
     * @return dynamicDateRange
     */
    public OASTemplateResponseDateRangeDynamicD dynamicDateRange { get; set; }

    /**
     * Get relativeDateRange
     * @return relativeDateRange
     */
    public OASTemplateResponseDateRangeRelative relativeDateRange { get; set; }

    /**
     * Get absoluteDateRange
     * @return absoluteDateRange
     */
    public OASTemplateResponseDateRangeAbsolute absoluteDateRange { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'dynamic_date_range' => 'dynamicDateRange',
        'relative_date_range' => 'relativeDateRange',
        'absolute_date_range' => 'absoluteDateRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'dynamic_date_range' => 'dynamicDateRange',
        'relative_date_range' => 'relativeDateRange',
        'absolute_date_range' => 'absoluteDateRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'dynamic_date_range' => 'dynamicDateRange',
        'relative_date_range' => 'relativeDateRange',
        'absolute_date_range' => 'absoluteDateRange'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASTemplateResponseDateRange getExample() {
        OASTemplateResponseDateRange templateResponseDateRange = new OASTemplateResponseDateRange();
          templateResponseDateRange.dynamicDateRange = OASTemplateResponseDateRangeDynamicD.getExample();
          templateResponseDateRange.relativeDateRange = OASTemplateResponseDateRangeRelative.getExample();
          templateResponseDateRange.absoluteDateRange = OASTemplateResponseDateRangeAbsolute.getExample();
        return templateResponseDateRange;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASTemplateResponseDateRange) {           
            OASTemplateResponseDateRange templateResponseDateRange = (OASTemplateResponseDateRange) obj;
            return this.dynamicDateRange == templateResponseDateRange.dynamicDateRange
                && this.relativeDateRange == templateResponseDateRange.relativeDateRange
                && this.absoluteDateRange == templateResponseDateRange.absoluteDateRange;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (dynamicDateRange == null ? 0 : System.hashCode(dynamicDateRange));
        hashCode = (17 * hashCode) + (relativeDateRange == null ? 0 : System.hashCode(relativeDateRange));
        hashCode = (17 * hashCode) + (absoluteDateRange == null ? 0 : System.hashCode(absoluteDateRange));
        return hashCode;
    }
}
