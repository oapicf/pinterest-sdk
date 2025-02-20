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
 * An item to be updated
 */
public class OASCatalogsUpdateRetailItem implements OAS.MappedProperties {
    /**
     * The catalog item id in the merchant namespace
     * @return itemId
     */
    public String itemId { get; set; }

    /**
     * Gets or Sets operation
     */
    public enum OperationEnum {
        UPDATE
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
    public OASUpdatableItemAttributes attributes { get; set; }

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

    public OASCatalogsUpdateRetailItem() {
        updateMask = new List<OASUpdateMaskFieldType>();
    }

    public static OASCatalogsUpdateRetailItem getExample() {
        OASCatalogsUpdateRetailItem catalogsUpdateRetailItem = new OASCatalogsUpdateRetailItem();
          catalogsUpdateRetailItem.itemId = 'DS0294-M';
          catalogsUpdateRetailItem.operation = OperationEnum.UPDATE;
          catalogsUpdateRetailItem.attributes = OASUpdatableItemAttributes.getExample();
          catalogsUpdateRetailItem.updateMask = new List<OASUpdateMaskFieldType>{OASUpdateMaskFieldType.getExample()};
        return catalogsUpdateRetailItem;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsUpdateRetailItem) {           
            OASCatalogsUpdateRetailItem catalogsUpdateRetailItem = (OASCatalogsUpdateRetailItem) obj;
            return this.itemId == catalogsUpdateRetailItem.itemId
                && this.operation == catalogsUpdateRetailItem.operation
                && this.attributes == catalogsUpdateRetailItem.attributes
                && this.updateMask == catalogsUpdateRetailItem.updateMask;
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

