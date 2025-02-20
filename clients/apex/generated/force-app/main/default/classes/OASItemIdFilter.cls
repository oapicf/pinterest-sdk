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
 * OASItemIdFilter
 */
public class OASItemIdFilter {
    /**
     * Get ITEM_ID
     * @return ITEM_ID
     */
    public OASCatalogsProductGroupMultipleStrin ITEM_ID { get; set; }

    public static OASItemIdFilter getExample() {
        OASItemIdFilter itemIdFilter = new OASItemIdFilter();
          itemIdFilter.ITEM_ID = null;
        return itemIdFilter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASItemIdFilter) {           
            OASItemIdFilter itemIdFilter = (OASItemIdFilter) obj;
            return this.ITEM_ID == itemIdFilter.ITEM_ID;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (ITEM_ID == null ? 0 : System.hashCode(ITEM_ID));
        return hashCode;
    }
}

