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
 * OASFeedFields
 */
public class OASFeedFields implements OAS.MappedProperties {
    /**
     * Get defaultCountry
     * @return defaultCountry
     */
    public OASCountry defaultCountry { get; set; }

    /**
     * Get defaultAvailability
     * @return defaultAvailability
     */
    public OASProductAvailabilityType defaultAvailability { get; set; }

    /**
     * Get defaultCurrency
     * @return defaultCurrency
     */
    public OASNullableCurrency defaultCurrency { get; set; }

    /**
     * A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
     * @return name
     */
    public String name { get; set; }

    /**
     * Get format
     * @return format
     */
    public OASCatalogsFormat format { get; set; }

    /**
     * The locale used within a feed for product descriptions.
     * @return defaultLocale
     */
    public String defaultLocale { get; set; }

    /**
     * Get credentials
     * @return credentials
     */
    public OASCatalogsFeedCredentials credentials { get; set; }

    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @return location
     */
    public String location { get; set; }

    /**
     * Get preferredProcessingSchedule
     * @return preferredProcessingSchedule
     */
    public OASCatalogsFeedProcessingSchedule preferredProcessingSchedule { get; set; }

    /**
     * Get status
     * @return status
     */
    public OASCatalogsStatus status { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'default_country' => 'defaultCountry',
        'default_availability' => 'defaultAvailability',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'preferred_processing_schedule' => 'preferredProcessingSchedule'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'default_country' => 'defaultCountry',
        'default_availability' => 'defaultAvailability',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'preferred_processing_schedule' => 'preferredProcessingSchedule'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'default_country' => 'defaultCountry',
        'default_availability' => 'defaultAvailability',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'preferred_processing_schedule' => 'preferredProcessingSchedule'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'default_country' => 'defaultCountry',
        'default_availability' => 'defaultAvailability',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'preferred_processing_schedule' => 'preferredProcessingSchedule'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'default_country' => 'defaultCountry',
        'default_availability' => 'defaultAvailability',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'preferred_processing_schedule' => 'preferredProcessingSchedule'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASFeedFields getExample() {
        OASFeedFields feedFields = new OASFeedFields();
          feedFields.defaultCountry = OASCountry.getExample();
          feedFields.defaultAvailability = OASProductAvailabilityType.getExample();
          feedFields.defaultCurrency = OASNullableCurrency.getExample();
          feedFields.name = '';
          feedFields.format = OASCatalogsFormat.getExample();
          feedFields.defaultLocale = 'en_US';
          feedFields.credentials = OASCatalogsFeedCredentials.getExample();
          feedFields.location = '';
          feedFields.preferredProcessingSchedule = OASCatalogsFeedProcessingSchedule.getExample();
          feedFields.status = OASCatalogsStatus.getExample();
        return feedFields;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASFeedFields) {           
            OASFeedFields feedFields = (OASFeedFields) obj;
            return this.defaultCountry == feedFields.defaultCountry
                && this.defaultAvailability == feedFields.defaultAvailability
                && this.defaultCurrency == feedFields.defaultCurrency
                && this.name == feedFields.name
                && this.format == feedFields.format
                && this.defaultLocale == feedFields.defaultLocale
                && this.credentials == feedFields.credentials
                && this.location == feedFields.location
                && this.preferredProcessingSchedule == feedFields.preferredProcessingSchedule
                && this.status == feedFields.status;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (defaultCountry == null ? 0 : System.hashCode(defaultCountry));
        hashCode = (17 * hashCode) + (defaultAvailability == null ? 0 : System.hashCode(defaultAvailability));
        hashCode = (17 * hashCode) + (defaultCurrency == null ? 0 : System.hashCode(defaultCurrency));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (format == null ? 0 : System.hashCode(format));
        hashCode = (17 * hashCode) + (defaultLocale == null ? 0 : System.hashCode(defaultLocale));
        hashCode = (17 * hashCode) + (credentials == null ? 0 : System.hashCode(credentials));
        hashCode = (17 * hashCode) + (location == null ? 0 : System.hashCode(location));
        hashCode = (17 * hashCode) + (preferredProcessingSchedule == null ? 0 : System.hashCode(preferredProcessingSchedule));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        return hashCode;
    }
}
