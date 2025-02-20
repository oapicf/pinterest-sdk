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
 * OASCatalogsRetailBatchRequestItemsIn
 */
public class OASCatalogsRetailBatchRequestItemsIn implements OASCatalogsCreateRetailItem, OASCatalogsUpdateRetailItem, OASCatalogsUpsertRetailItem, OASCatalogsDeleteRetailItem, OAS.MappedProperties {
    /**
     * The catalog item id in the merchant namespace
     * @return itemId
     */
    public String itemId { get; set; }

    /**
     * Gets or Sets operation
     */
    public enum OperationEnum {
        DELETE
    }

    /**
     * Get operation
     * @return operation
     */
    public OperationEnum operation { get; set; }

    /**
     * Get attributes
     * @return attributes
     */
    public OASItemAttributesRequest attributes { get; set; }

    /**
     * The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
     * @return updateMask
     */
    public List<OASUpdateMaskFieldType> updateMask { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_id' => 'itemId',
        'update_mask' => 'updateMask'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_id' => 'itemId',
        'update_mask' => 'updateMask'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCatalogsRetailBatchRequestItemsIn() {
        updateMask = new List<OASUpdateMaskFieldType>();
    }

    public static OASCatalogsRetailBatchRequestItemsIn getExample() {
        OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner = new OASCatalogsRetailBatchRequestItemsIn();
          catalogsRetailBatchRequestItemsInner.itemId = 'DS0294-M';
          catalogsRetailBatchRequestItemsInner.operation = OperationEnum.DELETE;
          catalogsRetailBatchRequestItemsInner.attributes = OASItemAttributesRequest.getExample();
          catalogsRetailBatchRequestItemsInner.updateMask = new List<OASUpdateMaskFieldType>{OASUpdateMaskFieldType.getExample()};
        return catalogsRetailBatchRequestItemsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsRetailBatchRequestItemsIn) {           
            OASCatalogsRetailBatchRequestItemsIn catalogsRetailBatchRequestItemsInner = (OASCatalogsRetailBatchRequestItemsIn) obj;
            return this.itemId == catalogsRetailBatchRequestItemsInner.itemId
                && this.operation == catalogsRetailBatchRequestItemsInner.operation
                && this.attributes == catalogsRetailBatchRequestItemsInner.attributes
                && this.updateMask == catalogsRetailBatchRequestItemsInner.updateMask;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (itemId == null ? 0 : System.hashCode(itemId));
        hashCode = (17 * hashCode) + (operation == null ? 0 : System.hashCode(operation));
        hashCode = (17 * hashCode) + (attributes == null ? 0 : System.hashCode(attributes));
        hashCode = (17 * hashCode) + (updateMask == null ? 0 : System.hashCode(updateMask));
        return hashCode;
    }
}

