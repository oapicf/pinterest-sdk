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
 * OASCatalogsItemValidationIssues
 */
public class OASCatalogsItemValidationIssues implements OAS.MappedProperties {
    /**
     * Item number based on order of appearance in the Catalogs Feed. For example, \'0\' refers to first item found in a feed that was downloaded from a \'location\' specified during feed creation.
     * @return itemNumber
     */
    public Integer itemNumber { get; set; }

    /**
     * The merchant-created unique ID that represents the product.
     * @return itemId
     */
    public String itemId { get; set; }

    /**
     * Get errors
     * @return errors
     */
    public OASCatalogsItemValidationErrors errors { get; set; }

    /**
     * Get warnings
     * @return warnings
     */
    public OASCatalogsItemValidationWarnings warnings { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_number' => 'itemNumber',
        'item_id' => 'itemId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'item_number' => 'itemNumber',
        'item_id' => 'itemId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCatalogsItemValidationIssues getExample() {
        OASCatalogsItemValidationIssues catalogsItemValidationIssues = new OASCatalogsItemValidationIssues();
          catalogsItemValidationIssues.itemNumber = 0;
          catalogsItemValidationIssues.itemId = 'DS0294-L';
          catalogsItemValidationIssues.errors = OASCatalogsItemValidationErrors.getExample();
          catalogsItemValidationIssues.warnings = OASCatalogsItemValidationWarnings.getExample();
        return catalogsItemValidationIssues;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCatalogsItemValidationIssues) {           
            OASCatalogsItemValidationIssues catalogsItemValidationIssues = (OASCatalogsItemValidationIssues) obj;
            return this.itemNumber == catalogsItemValidationIssues.itemNumber
                && this.itemId == catalogsItemValidationIssues.itemId
                && this.errors == catalogsItemValidationIssues.errors
                && this.warnings == catalogsItemValidationIssues.warnings;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (itemNumber == null ? 0 : System.hashCode(itemNumber));
        hashCode = (17 * hashCode) + (itemId == null ? 0 : System.hashCode(itemId));
        hashCode = (17 * hashCode) + (errors == null ? 0 : System.hashCode(errors));
        hashCode = (17 * hashCode) + (warnings == null ? 0 : System.hashCode(warnings));
        return hashCode;
    }
}
