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
 * Catalog entity
 */
public class OASCatalog implements OASCatalogsDbItem, OAS.MappedProperties {
    /**
     * Get createdAt
     * @return createdAt
     */
    public Datetime createdAt { get; set; }

    /**
     * ID of the catalog entity.
     * @return id
     */
    public String id { get; set; }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    public Datetime updatedAt { get; set; }

    /**
     * A human-friendly name associated to a catalog entity.
     * @return name
     */
    public String name { get; set; }

    /**
     * Get catalogType
     * @return catalogType
     */
    public OASCatalogsType catalogType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'created_at' => 'createdAt',
        'updated_at' => 'updatedAt',
        'catalog_type' => 'catalogType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalog getExample() {
        OASCatalog catalog = new OASCatalog();
          catalog.createdAt = Datetime.newInstanceGmt(2022, 3, 14, 15, 15, 22);
          catalog.id = '864344156814050986';
          catalog.updatedAt = Datetime.newInstanceGmt(2022, 3, 14, 15, 16, 34);
          catalog.name = '';
          catalog.catalogType = OASCatalogsType.getExample();
        return catalog;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalog) {           
            OASCatalog catalog = (OASCatalog) obj;
            return this.createdAt == catalog.createdAt
                && this.id == catalog.id
                && this.updatedAt == catalog.updatedAt
                && this.name == catalog.name
                && this.catalogType == catalog.catalogType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (updatedAt == null ? 0 : System.hashCode(updatedAt));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (catalogType == null ? 0 : System.hashCode(catalogType));
        return hashCode;
    }
}

