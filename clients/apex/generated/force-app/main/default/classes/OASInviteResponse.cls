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
 * OASInviteResponse
 */
public class OASInviteResponse implements OASBaseInviteDataResponse, OAS.MappedProperties {
    /**
     * Get assetsSummary
     * @return assetsSummary
     */
    public OASInviteAssetsSummary assetsSummary { get; set; }

    /**
     * The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
     * @return businessRoles
     */
    public List<String> businessRoles { get; set; }

    /**
     * Metadata for the business that created the invite/request.
     * @return createdByBusiness
     */
    public OASBusinessAccessUserSummary createdByBusiness { get; set; }

    /**
     * Metadata for the user that created the invite/request.
     * @return createdByUser
     */
    public OASBusinessAccessUserSummary createdByUser { get; set; }

    /**
     * The time the invite/request was created. Returned in milliseconds.
     * @return createdTime
     */
    public Integer createdTime { get; set; }

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
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'assets_summary' => 'assetsSummary',
        'business_roles' => 'businessRoles',
        'created_by_business' => 'createdByBusiness',
        'created_by_user' => 'createdByUser',
        'created_time' => 'createdTime',
        'invite_data' => 'inviteData',
        'is_received_invite' => 'isReceivedInvite'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASInviteResponse() {
        businessRoles = new List<String>();
    }

    public static OASInviteResponse getExample() {
        OASInviteResponse inviteResponse = new OASInviteResponse();
          inviteResponse.assetsSummary = OASInviteAssetsSummary.getExample();
          inviteResponse.businessRoles = new List<String>{String.getExample()};
          inviteResponse.createdByBusiness = OASBusinessAccessUserSummary.getExample();
          inviteResponse.createdByUser = OASBusinessAccessUserSummary.getExample();
          inviteResponse.createdTime = 1646767577816;
          inviteResponse.id = '383791336903426391';
          inviteResponse.inviteData = OASBaseInviteDataResponseInviteData.getExample();
          inviteResponse.isReceivedInvite = true;
          inviteResponse.user = OASBusinessAccessUserSummary.getExample();
        return inviteResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASInviteResponse) {           
            OASInviteResponse inviteResponse = (OASInviteResponse) obj;
            return this.assetsSummary == inviteResponse.assetsSummary
                && this.businessRoles == inviteResponse.businessRoles
                && this.createdByBusiness == inviteResponse.createdByBusiness
                && this.createdByUser == inviteResponse.createdByUser
                && this.createdTime == inviteResponse.createdTime
                && this.id == inviteResponse.id
                && this.inviteData == inviteResponse.inviteData
                && this.isReceivedInvite == inviteResponse.isReceivedInvite
                && this.user == inviteResponse.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (assetsSummary == null ? 0 : System.hashCode(assetsSummary));
        hashCode = (17 * hashCode) + (businessRoles == null ? 0 : System.hashCode(businessRoles));
        hashCode = (17 * hashCode) + (createdByBusiness == null ? 0 : System.hashCode(createdByBusiness));
        hashCode = (17 * hashCode) + (createdByUser == null ? 0 : System.hashCode(createdByUser));
        hashCode = (17 * hashCode) + (createdTime == null ? 0 : System.hashCode(createdTime));
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (inviteData == null ? 0 : System.hashCode(inviteData));
        hashCode = (17 * hashCode) + (isReceivedInvite == null ? 0 : System.hashCode(isReceivedInvite));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

