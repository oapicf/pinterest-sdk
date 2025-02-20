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
 * OASSharedAudienceResponse
 */
public class OASSharedAudienceResponse implements OASSharedAudienceResponseCommon, OAS.MappedProperties {
    /**
     * Audience ID that was shared
     * @return audienceId
     */
    public String audienceId { get; set; }

    /**
     * Get permissions
     * @return permissions
     */
    public List<OASRole> permissions { get; set; }

    /**
     * Account IDs that received the audience
     * @return recipientAccountIds
     */
    public List<String> recipientAccountIds { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'audience_id' => 'audienceId',
        'recipient_account_ids' => 'recipientAccountIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'audience_id' => 'audienceId',
        'recipient_account_ids' => 'recipientAccountIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASSharedAudienceResponse() {
        permissions = new List<OASRole>();
        recipientAccountIds = new List<String>();
    }

    public static OASSharedAudienceResponse getExample() {
        OASSharedAudienceResponse sharedAudienceResponse = new OASSharedAudienceResponse();
          sharedAudienceResponse.audienceId = '2542621871096';
          sharedAudienceResponse.permissions = new List<OASRole>{OASRole.getExample()};
          sharedAudienceResponse.recipientAccountIds = new List<String>{''};
        return sharedAudienceResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASSharedAudienceResponse) {           
            OASSharedAudienceResponse sharedAudienceResponse = (OASSharedAudienceResponse) obj;
            return this.audienceId == sharedAudienceResponse.audienceId
                && this.permissions == sharedAudienceResponse.permissions
                && this.recipientAccountIds == sharedAudienceResponse.recipientAccountIds;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (audienceId == null ? 0 : System.hashCode(audienceId));
        hashCode = (17 * hashCode) + (permissions == null ? 0 : System.hashCode(permissions));
        hashCode = (17 * hashCode) + (recipientAccountIds == null ? 0 : System.hashCode(recipientAccountIds));
        return hashCode;
    }
}

