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
 * Response object of catalogs items
 */
public class OASCatalogsItems {
    /**
     * Array with catalogs items
     * @return items
     */
    public List<OASItemBatchRecord> items { get; set; }

    public OASCatalogsItems() {
        items = new List<OASItemBatchRecord>();
    }

    public static OASCatalogsItems getExample() {
        OASCatalogsItems catalogsItems = new OASCatalogsItems();
          catalogsItems.items = new List<OASItemBatchRecord>{OASItemBatchRecord.getExample()};
        return catalogsItems;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsItems) {           
            OASCatalogsItems catalogsItems = (OASCatalogsItems) obj;
            return this.items == catalogsItems.items;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        return hashCode;
    }
}
