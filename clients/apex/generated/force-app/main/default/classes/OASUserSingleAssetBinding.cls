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
 * An object containing the permissions a business member/partner has on the asset.
 */
public class OASUserSingleAssetBinding {
    /**
     * Permission levels member or partner has on an asset.
     * @return permissions
     */
    public List<String> permissions { get; set; }

    /**
     * Get user
     * @return user
     */
    public OASBusinessAccessUserSummary user { get; set; }

    public OASUserSingleAssetBinding() {
        permissions = new List<String>();
    }

    public static OASUserSingleAssetBinding getExample() {
        OASUserSingleAssetBinding userSingleAssetBinding = new OASUserSingleAssetBinding();
          userSingleAssetBinding.permissions = new List<String>{''};
          userSingleAssetBinding.user = OASBusinessAccessUserSummary.getExample();
        return userSingleAssetBinding;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASUserSingleAssetBinding) {           
            OASUserSingleAssetBinding userSingleAssetBinding = (OASUserSingleAssetBinding) obj;
            return this.permissions == userSingleAssetBinding.permissions
                && this.user == userSingleAssetBinding.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (permissions == null ? 0 : System.hashCode(permissions));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

