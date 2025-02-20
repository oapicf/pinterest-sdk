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
 * An object containing the permissions a business member has on the asset.
 */
public class OASUsersForIndividualAssetResponse implements OAS.MappedProperties {
    /**
     * Unique identifier of a business asset.
     * @return assetId
     */
    public String assetId { get; set; }

    /**
     * Unique identifier of the business member with asset access.
     * @return memberId
     */
    public String memberId { get; set; }

    /**
     * Permission levels member or partner has on an asset.
     * @return permissions
     */
    public List<String> permissions { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'asset_id' => 'assetId',
        'member_id' => 'memberId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'asset_id' => 'assetId',
        'member_id' => 'memberId'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASUsersForIndividualAssetResponse() {
        permissions = new List<String>();
    }

    public static OASUsersForIndividualAssetResponse getExample() {
        OASUsersForIndividualAssetResponse usersForIndividualAssetResponse = new OASUsersForIndividualAssetResponse();
          usersForIndividualAssetResponse.assetId = '549755885175';
          usersForIndividualAssetResponse.memberId = '140943737684417';
          usersForIndividualAssetResponse.permissions = new List<String>{''};
        return usersForIndividualAssetResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUsersForIndividualAssetResponse) {           
            OASUsersForIndividualAssetResponse usersForIndividualAssetResponse = (OASUsersForIndividualAssetResponse) obj;
            return this.assetId == usersForIndividualAssetResponse.assetId
                && this.memberId == usersForIndividualAssetResponse.memberId
                && this.permissions == usersForIndividualAssetResponse.permissions;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (assetId == null ? 0 : System.hashCode(assetId));
        hashCode = (17 * hashCode) + (memberId == null ? 0 : System.hashCode(memberId));
        hashCode = (17 * hashCode) + (permissions == null ? 0 : System.hashCode(permissions));
        return hashCode;
    }
}

