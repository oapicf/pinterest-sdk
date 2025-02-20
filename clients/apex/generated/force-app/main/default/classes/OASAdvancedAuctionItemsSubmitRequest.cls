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
 * Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
 */
public class OASAdvancedAuctionItemsSubmitRequest implements OAS.MappedProperties {
    /**
     * Catalog id pertaining to all items
     * @return catalogId
     */
    public String catalogId { get; set; }

    /**
     * Array of item bid option operations
     * @return items
     */
    public List<OASAdvancedAuctionItemsSubmitRecord> items { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'catalog_id' => 'catalogId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASAdvancedAuctionItemsSubmitRequest() {
        items = new List<OASAdvancedAuctionItemsSubmitRecord>();
    }

    public static OASAdvancedAuctionItemsSubmitRequest getExample() {
        OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = new OASAdvancedAuctionItemsSubmitRequest();
          advancedAuctionItemsSubmitRequest.catalogId = '2680059592705';
          advancedAuctionItemsSubmitRequest.items = new List<OASAdvancedAuctionItemsSubmitRecord>{OASAdvancedAuctionItemsSubmitRecord.getExample()};
        return advancedAuctionItemsSubmitRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdvancedAuctionItemsSubmitRequest) {           
            OASAdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest = (OASAdvancedAuctionItemsSubmitRequest) obj;
            return this.catalogId == advancedAuctionItemsSubmitRequest.catalogId
                && this.items == advancedAuctionItemsSubmitRequest.items;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (catalogId == null ? 0 : System.hashCode(catalogId));
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        return hashCode;
    }
}

