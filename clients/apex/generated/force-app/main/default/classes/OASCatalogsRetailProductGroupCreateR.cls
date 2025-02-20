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
 * Request object for creating a product group.
 */
public class OASCatalogsRetailProductGroupCreateR implements OAS.MappedProperties {
    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     */
    public enum CatalogTypeEnum {
        RETAIL
    }

    /**
     * Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
     * @return catalogType
     */
    public CatalogTypeEnum catalogType { get; set; }

    /**
     * Get name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get description
     * @return description
     */
    public String description { get; set; }

    /**
     * Get filters
     * @return filters
     */
    public OASCatalogsProductGroupFiltersReques filters { get; set; }

    /**
     * Catalog id pertaining to the retail product group.
     * @return catalogId
     */
    public String catalogId { get; set; }

    /**
     * Get country
     * @return country
     */
    public OASCountry country { get; set; }

    /**
     * Get locale
     * @return locale
     */
    public OASCatalogsLocale locale { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType',
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsRetailProductGroupCreateR getExample() {
        OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest = new OASCatalogsRetailProductGroupCreateR();
          catalogsRetailProductGroupCreateRequest.catalogType = CatalogTypeEnum.RETAIL;
          catalogsRetailProductGroupCreateRequest.name = '';
          catalogsRetailProductGroupCreateRequest.description = '';
          catalogsRetailProductGroupCreateRequest.filters = OASCatalogsProductGroupFiltersReques.getExample();
          catalogsRetailProductGroupCreateRequest.catalogId = '2680059592705';
          catalogsRetailProductGroupCreateRequest.country = OASCountry.getExample();
          catalogsRetailProductGroupCreateRequest.locale = OASCatalogsLocale.getExample();
        return catalogsRetailProductGroupCreateRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsRetailProductGroupCreateR) {           
            OASCatalogsRetailProductGroupCreateR catalogsRetailProductGroupCreateRequest = (OASCatalogsRetailProductGroupCreateR) obj;
            return this.catalogType == catalogsRetailProductGroupCreateRequest.catalogType
                && this.name == catalogsRetailProductGroupCreateRequest.name
                && this.description == catalogsRetailProductGroupCreateRequest.description
                && this.filters == catalogsRetailProductGroupCreateRequest.filters
                && this.catalogId == catalogsRetailProductGroupCreateRequest.catalogId
                && this.country == catalogsRetailProductGroupCreateRequest.country
                && this.locale == catalogsRetailProductGroupCreateRequest.locale;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (filters == null ? 0 : System.hashCode(filters));
        hashCode = (17 * hashCode) + (catalogId == null ? 0 : System.hashCode(catalogId));
        hashCode = (17 * hashCode) + (country == null ? 0 : System.hashCode(country));
        hashCode = (17 * hashCode) + (locale == null ? 0 : System.hashCode(locale));
        return hashCode;
    }
}

