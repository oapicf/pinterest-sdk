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
 * Request object for creating a catalog.
 */
public class OASCatalogsCreateRequest implements OAS.MappedProperties {
    /**
     * Type of the catalog entity.
     */
    public enum CatalogTypeEnum {
        HOTEL
    }

    /**
     * Type of the catalog entity.
     * @return catalogType
     */
    public CatalogTypeEnum catalogType { get; set; }

    /**
     * A human-friendly name associated to a given catalog.
     * @return name
     */
    public String name { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_type' => 'catalogType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsCreateRequest getExample() {
        OASCatalogsCreateRequest catalogsCreateRequest = new OASCatalogsCreateRequest();
          catalogsCreateRequest.catalogType = CatalogTypeEnum.HOTEL;
          catalogsCreateRequest.name = '';
        return catalogsCreateRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsCreateRequest) {           
            OASCatalogsCreateRequest catalogsCreateRequest = (OASCatalogsCreateRequest) obj;
            return this.catalogType == catalogsCreateRequest.catalogType
                && this.name == catalogsCreateRequest.name;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        return hashCode;
    }
}

