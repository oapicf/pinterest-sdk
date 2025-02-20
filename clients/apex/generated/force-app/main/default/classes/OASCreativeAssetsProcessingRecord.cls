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
 * Object describing an item processing record
 */
public class OASCreativeAssetsProcessingRecord implements OAS.MappedProperties {
    /**
     * The catalog creative assets id in the merchant namespace
     * @return creativeAssetsId
     */
    public String creativeAssetsId { get; set; }

    /**
     * Array with the validation errors for the item processing record.\nA non empty errors list causes the item processing to fail.
     * @return errors
     */
    public List<OASItemValidationEvent> errors { get; set; }

    /**
     * Array with the validation warnings for the item processing record
     * @return warnings
     */
    public List<OASItemValidationEvent> warnings { get; set; }

    /**
     * Get status
     * @return status
     */
    public OASItemProcessingStatus status { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'creative_assets_id' => 'creativeAssetsId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreativeAssetsProcessingRecord() {
        errors = new List<OASItemValidationEvent>();
        warnings = new List<OASItemValidationEvent>();
    }

    public static OASCreativeAssetsProcessingRecord getExample() {
        OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord = new OASCreativeAssetsProcessingRecord();
          creativeAssetsProcessingRecord.creativeAssetsId = 'DS0294-M';
          creativeAssetsProcessingRecord.errors = new List<OASItemValidationEvent>{OASItemValidationEvent.getExample()};
          creativeAssetsProcessingRecord.warnings = new List<OASItemValidationEvent>{OASItemValidationEvent.getExample()};
          creativeAssetsProcessingRecord.status = OASItemProcessingStatus.getExample();
        return creativeAssetsProcessingRecord;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreativeAssetsProcessingRecord) {           
            OASCreativeAssetsProcessingRecord creativeAssetsProcessingRecord = (OASCreativeAssetsProcessingRecord) obj;
            return this.creativeAssetsId == creativeAssetsProcessingRecord.creativeAssetsId
                && this.errors == creativeAssetsProcessingRecord.errors
                && this.warnings == creativeAssetsProcessingRecord.warnings
                && this.status == creativeAssetsProcessingRecord.status;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (creativeAssetsId == null ? 0 : System.hashCode(creativeAssetsId));
        hashCode = (17 * hashCode) + (errors == null ? 0 : System.hashCode(errors));
        hashCode = (17 * hashCode) + (warnings == null ? 0 : System.hashCode(warnings));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        return hashCode;
    }
}

