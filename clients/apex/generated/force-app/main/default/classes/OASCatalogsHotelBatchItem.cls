/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Hotel batch item
 */
public class OASCatalogsHotelBatchItem implements OASCatalogsCreateHotelItem, OASCatalogsUpsertHotelItem, OASCatalogsUpdateHotelItem, OASCatalogsDeleteHotelItem, OAS.MappedProperties {
    /**
     * The catalog hotel id in the merchant namespace
     * @return hotelId
     */
    public String hotelId { get; set; }

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
    public OASCatalogsUpdatableHotelAttributes attributes { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'hotel_id' => 'hotelId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsHotelBatchItem getExample() {
        OASCatalogsHotelBatchItem catalogsHotelBatchItem = new OASCatalogsHotelBatchItem();
          catalogsHotelBatchItem.hotelId = 'DS0294-M';
          catalogsHotelBatchItem.operation = OperationEnum.DELETE;
          catalogsHotelBatchItem.attributes = OASCatalogsUpdatableHotelAttributes.getExample();
        return catalogsHotelBatchItem;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsHotelBatchItem) {           
            OASCatalogsHotelBatchItem catalogsHotelBatchItem = (OASCatalogsHotelBatchItem) obj;
            return this.hotelId == catalogsHotelBatchItem.hotelId
                && this.operation == catalogsHotelBatchItem.operation
                && this.attributes == catalogsHotelBatchItem.attributes;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (hotelId == null ? 0 : System.hashCode(hotelId));
        hashCode = (17 * hashCode) + (operation == null ? 0 : System.hashCode(operation));
        hashCode = (17 * hashCode) + (attributes == null ? 0 : System.hashCode(attributes));
        return hashCode;
    }
}
