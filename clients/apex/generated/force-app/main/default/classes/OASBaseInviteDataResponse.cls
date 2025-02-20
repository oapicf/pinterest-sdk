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
 * OASBaseInviteDataResponse
 */
public class OASBaseInviteDataResponse implements OAS.MappedProperties {
    /**
     * Unique identifier of the invite/request.
     * @return id
     */
    public String id { get; set; }

    /**
     * Get inviteData
     * @return inviteData
     */
    public OASBaseInviteDataResponseInviteData inviteData { get; set; }

    /**
     * Indicates whether the invite/request was received.
     * @return isReceivedInvite
     */
    public Boolean isReceivedInvite { get; set; }

    /**
     * Metadata for the member/partner that was sent the invite/request.
     * @return user
     */
    public OASBusinessAccessUserSummary user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASBaseInviteDataResponse getExample() {
        OASBaseInviteDataResponse baseInviteDataResponse = new OASBaseInviteDataResponse();
          baseInviteDataResponse.id = '383791336903426391';
          baseInviteDataResponse.inviteData = OASBaseInviteDataResponseInviteData.getExample();
          baseInviteDataResponse.isReceivedInvite = true;
          baseInviteDataResponse.user = OASBusinessAccessUserSummary.getExample();
        return baseInviteDataResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBaseInviteDataResponse) {           
            OASBaseInviteDataResponse baseInviteDataResponse = (OASBaseInviteDataResponse) obj;
            return this.id == baseInviteDataResponse.id
                && this.inviteData == baseInviteDataResponse.inviteData
                && this.isReceivedInvite == baseInviteDataResponse.isReceivedInvite
                && this.user == baseInviteDataResponse.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (inviteData == null ? 0 : System.hashCode(inviteData));
        hashCode = (17 * hashCode) + (isReceivedInvite == null ? 0 : System.hashCode(isReceivedInvite));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

