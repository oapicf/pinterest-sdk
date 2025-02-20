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
 * OASUpdateAssetGroupResponseException
 */
public class OASUpdateAssetGroupResponseException implements OAS.MappedProperties {
    /**
     * Error code associated with the error editing asset group.
     * @return code
     */
    public Integer code { get; set; }

    /**
     * Error message associated with the error editing asset group.
     * @return message
     */
    public String message { get; set; }

    /**
     * Asset group id of the exception.
     * @return assetGroupId
     */
    public String assetGroupId { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'asset_group_id' => 'assetGroupId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASUpdateAssetGroupResponseException getExample() {
        OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner = new OASUpdateAssetGroupResponseException();
          updateAssetGroupResponseExceptionsInner.code = 29;
          updateAssetGroupResponseExceptionsInner.message = 'You are not permitted to access that resource.';
          updateAssetGroupResponseExceptionsInner.assetGroupId = '666791336903426391';
        return updateAssetGroupResponseExceptionsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUpdateAssetGroupResponseException) {           
            OASUpdateAssetGroupResponseException updateAssetGroupResponseExceptionsInner = (OASUpdateAssetGroupResponseException) obj;
            return this.code == updateAssetGroupResponseExceptionsInner.code
                && this.message == updateAssetGroupResponseExceptionsInner.message
                && this.assetGroupId == updateAssetGroupResponseExceptionsInner.assetGroupId;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (assetGroupId == null ? 0 : System.hashCode(assetGroupId));
        return hashCode;
    }
}

