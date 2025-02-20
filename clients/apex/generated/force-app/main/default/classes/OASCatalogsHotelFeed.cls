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
 * Catalogs Hotel Feed object
 */
public class OASCatalogsHotelFeed implements OASCatalogsDbItem, OAS.MappedProperties {
    /**
     * Get createdAt
     * @return createdAt
     */
    public Datetime createdAt { get; set; }

    /**
     * Get id
     * @return id
     */
    public String id { get; set; }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public Datetime updatedAt { get; set; }

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
     * Get catalogType
     * @return catalogType
     */
    public OASCatalogsType catalogType { get; set; }

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

    /**
     * Get defaultCurrency
     * @return defaultCurrency
     */
    public OASNullableCurrency defaultCurrency { get; set; }

    /**
     * The locale used within a feed for product descriptions.
     * @return defaultLocale
     */
    public String defaultLocale { get; set; }

    /**
     * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type.
     * @return catalogId
     */
    public String catalogId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType',
        'preferred_processing_schedule' => 'preferredProcessingSchedule',
        'default_currency' => 'defaultCurrency',
        'default_locale' => 'defaultLocale',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsHotelFeed getExample() {
        OASCatalogsHotelFeed catalogsHotelFeed = new OASCatalogsHotelFeed();
          catalogsHotelFeed.createdAt = Datetime.newInstanceGmt(2022, 3, 14, 15, 15, 22);
          catalogsHotelFeed.id = '';
          catalogsHotelFeed.updatedAt = Datetime.newInstanceGmt(2022, 3, 14, 15, 16, 34);
          catalogsHotelFeed.name = '';
          catalogsHotelFeed.format = OASCatalogsFormat.getExample();
          catalogsHotelFeed.catalogType = OASCatalogsType.getExample();
          catalogsHotelFeed.credentials = OASCatalogsFeedCredentials.getExample();
          catalogsHotelFeed.location = '';
          catalogsHotelFeed.preferredProcessingSchedule = OASCatalogsFeedProcessingSchedule.getExample();
          catalogsHotelFeed.status = OASCatalogsStatus.getExample();
          catalogsHotelFeed.defaultCurrency = OASNullableCurrency.getExample();
          catalogsHotelFeed.defaultLocale = 'en-US';
          catalogsHotelFeed.catalogId = '';
        return catalogsHotelFeed;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsHotelFeed) {           
            OASCatalogsHotelFeed catalogsHotelFeed = (OASCatalogsHotelFeed) obj;
            return this.createdAt == catalogsHotelFeed.createdAt
                && this.id == catalogsHotelFeed.id
                && this.updatedAt == catalogsHotelFeed.updatedAt
                && this.name == catalogsHotelFeed.name
                && this.format == catalogsHotelFeed.format
                && this.catalogType == catalogsHotelFeed.catalogType
                && this.credentials == catalogsHotelFeed.credentials
                && this.location == catalogsHotelFeed.location
                && this.preferredProcessingSchedule == catalogsHotelFeed.preferredProcessingSchedule
                && this.status == catalogsHotelFeed.status
                && this.defaultCurrency == catalogsHotelFeed.defaultCurrency
                && this.defaultLocale == catalogsHotelFeed.defaultLocale
                && this.catalogId == catalogsHotelFeed.catalogId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (updatedAt == null ? 0 : System.hashCode(updatedAt));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (format == null ? 0 : System.hashCode(format));
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (credentials == null ? 0 : System.hashCode(credentials));
        hashCode = (17 * hashCode) + (location == null ? 0 : System.hashCode(location));
        hashCode = (17 * hashCode) + (preferredProcessingSchedule == null ? 0 : System.hashCode(preferredProcessingSchedule));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        hashCode = (17 * hashCode) + (defaultCurrency == null ? 0 : System.hashCode(defaultCurrency));
        hashCode = (17 * hashCode) + (defaultLocale == null ? 0 : System.hashCode(defaultLocale));
        hashCode = (17 * hashCode) + (catalogId == null ? 0 : System.hashCode(catalogId));
        return hashCode;
    }
}

