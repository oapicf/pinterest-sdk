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
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */
public class OASInviteExceptionResponse implements OAS.MappedProperties {
    /**
     * Unique identifier of the invite/request.
     * @return inviteOrRequestId
     */
    public String inviteOrRequestId { get; set; }

    /**
     * Error code associated with the error in performing the action on the invite/request.
     * @return code
     */
    public Integer code { get; set; }

    /**
     * Error message associated with the error in performing the action on the invite/request.
     * @return message
     */
    public String message { get; set; }

    /**
     * A list of users\' usernames or emails OR a list of partner ids that caused the error.
     * @return usersOrPartnerIds
     */
    public List<String> usersOrPartnerIds { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'invite_or_request_id' => 'inviteOrRequestId',
        'users_or_partner_ids' => 'usersOrPartnerIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'invite_or_request_id' => 'inviteOrRequestId',
        'users_or_partner_ids' => 'usersOrPartnerIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASInviteExceptionResponse() {
        usersOrPartnerIds = new List<String>();
    }

    public static OASInviteExceptionResponse getExample() {
        OASInviteExceptionResponse inviteExceptionResponse = new OASInviteExceptionResponse();
          inviteExceptionResponse.inviteOrRequestId = '383791336903426391';
          inviteExceptionResponse.code = 403;
          inviteExceptionResponse.message = 'You hit the maximum number of pending invites allowed.';
          inviteExceptionResponse.usersOrPartnerIds = new List<String>{''};
        return inviteExceptionResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASInviteExceptionResponse) {           
            OASInviteExceptionResponse inviteExceptionResponse = (OASInviteExceptionResponse) obj;
            return this.inviteOrRequestId == inviteExceptionResponse.inviteOrRequestId
                && this.code == inviteExceptionResponse.code
                && this.message == inviteExceptionResponse.message
                && this.usersOrPartnerIds == inviteExceptionResponse.usersOrPartnerIds;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (inviteOrRequestId == null ? 0 : System.hashCode(inviteOrRequestId));
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (usersOrPartnerIds == null ? 0 : System.hashCode(usersOrPartnerIds));
        return hashCode;
    }
}

