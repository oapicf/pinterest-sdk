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
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */
public class OASMediaUploadAllOfUploadParameters implements OAS.MappedProperties {
    /**
     * Get xAmzDate
     * @return xAmzDate
     */
    public String xAmzDate { get; set; }

    /**
     * Get xAmzSignature
     * @return xAmzSignature
     */
    public String xAmzSignature { get; set; }

    /**
     * Get xAmzSecurityToken
     * @return xAmzSecurityToken
     */
    public String xAmzSecurityToken { get; set; }

    /**
     * Get xAmzAlgorithm
     * @return xAmzAlgorithm
     */
    public String xAmzAlgorithm { get; set; }

    /**
     * Get key
     * @return key
     */
    public String key { get; set; }

    /**
     * Get policy
     * @return policy
     */
    public String policy { get; set; }

    /**
     * Get xAmzCredential
     * @return xAmzCredential
     */
    public String xAmzCredential { get; set; }

    /**
     * Get contentType
     * @return contentType
     */
    public String contentType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'x-amz-date' => 'xAmzDate',
        'x-amz-signature' => 'xAmzSignature',
        'x-amz-security-token' => 'xAmzSecurityToken',
        'x-amz-algorithm' => 'xAmzAlgorithm',
        'x-amz-credential' => 'xAmzCredential',
        'Content-Type' => 'contentType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASMediaUploadAllOfUploadParameters getExample() {
        OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters = new OASMediaUploadAllOfUploadParameters();
          mediaUploadAllOfUploadParameters.xAmzDate = '';
          mediaUploadAllOfUploadParameters.xAmzSignature = '';
          mediaUploadAllOfUploadParameters.xAmzSecurityToken = '';
          mediaUploadAllOfUploadParameters.xAmzAlgorithm = '';
          mediaUploadAllOfUploadParameters.key = '';
          mediaUploadAllOfUploadParameters.policy = '';
          mediaUploadAllOfUploadParameters.xAmzCredential = '';
          mediaUploadAllOfUploadParameters.contentType = 'multipart/form-data';
        return mediaUploadAllOfUploadParameters;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMediaUploadAllOfUploadParameters) {           
            OASMediaUploadAllOfUploadParameters mediaUploadAllOfUploadParameters = (OASMediaUploadAllOfUploadParameters) obj;
            return this.xAmzDate == mediaUploadAllOfUploadParameters.xAmzDate
                && this.xAmzSignature == mediaUploadAllOfUploadParameters.xAmzSignature
                && this.xAmzSecurityToken == mediaUploadAllOfUploadParameters.xAmzSecurityToken
                && this.xAmzAlgorithm == mediaUploadAllOfUploadParameters.xAmzAlgorithm
                && this.key == mediaUploadAllOfUploadParameters.key
                && this.policy == mediaUploadAllOfUploadParameters.policy
                && this.xAmzCredential == mediaUploadAllOfUploadParameters.xAmzCredential
                && this.contentType == mediaUploadAllOfUploadParameters.contentType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (xAmzDate == null ? 0 : System.hashCode(xAmzDate));
        hashCode = (17 * hashCode) + (xAmzSignature == null ? 0 : System.hashCode(xAmzSignature));
        hashCode = (17 * hashCode) + (xAmzSecurityToken == null ? 0 : System.hashCode(xAmzSecurityToken));
        hashCode = (17 * hashCode) + (xAmzAlgorithm == null ? 0 : System.hashCode(xAmzAlgorithm));
        hashCode = (17 * hashCode) + (key == null ? 0 : System.hashCode(key));
        hashCode = (17 * hashCode) + (policy == null ? 0 : System.hashCode(policy));
        hashCode = (17 * hashCode) + (xAmzCredential == null ? 0 : System.hashCode(xAmzCredential));
        hashCode = (17 * hashCode) + (contentType == null ? 0 : System.hashCode(contentType));
        return hashCode;
    }
}
