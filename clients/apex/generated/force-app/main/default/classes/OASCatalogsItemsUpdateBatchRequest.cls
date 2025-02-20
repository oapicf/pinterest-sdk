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
 * Request object to update catalogs items
 */
public class OASCatalogsItemsUpdateBatchRequest {
    /**
     * Get country
     * @return country
     */
    public OASCountry country { get; set; }

    /**
     * Get language
     * @return language
     */
    public OASCatalogsItemsRequestLanguage language { get; set; }

    /**
     * Get operation
     * @return operation
     */
    public OASBatchOperation operation { get; set; }

    /**
     * Array with catalogs items
     * @return items
     */
    public List<OASItemUpdateBatchRecord> items { get; set; }

    public OASCatalogsItemsUpdateBatchRequest() {
        items = new List<OASItemUpdateBatchRecord>();
    }

    public static OASCatalogsItemsUpdateBatchRequest getExample() {
        OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = new OASCatalogsItemsUpdateBatchRequest();
          catalogsItemsUpdateBatchRequest.country = OASCountry.getExample();
          catalogsItemsUpdateBatchRequest.language = OASCatalogsItemsRequestLanguage.getExample();
          catalogsItemsUpdateBatchRequest.operation = OASBatchOperation.getExample();
          catalogsItemsUpdateBatchRequest.items = new List<OASItemUpdateBatchRecord>{OASItemUpdateBatchRecord.getExample()};
        return catalogsItemsUpdateBatchRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsItemsUpdateBatchRequest) {           
            OASCatalogsItemsUpdateBatchRequest catalogsItemsUpdateBatchRequest = (OASCatalogsItemsUpdateBatchRequest) obj;
            return this.country == catalogsItemsUpdateBatchRequest.country
                && this.language == catalogsItemsUpdateBatchRequest.language
                && this.operation == catalogsItemsUpdateBatchRequest.operation
                && this.items == catalogsItemsUpdateBatchRequest.items;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (country == null ? 0 : System.hashCode(country));
        hashCode = (17 * hashCode) + (language == null ? 0 : System.hashCode(language));
        hashCode = (17 * hashCode) + (operation == null ? 0 : System.hashCode(operation));
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        return hashCode;
    }
}

