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
 * OASBusinessMemberAssetsSummaryAdAcco
 */
public class OASBusinessMemberAssetsSummaryAdAcco {
    /**
     * Unique identifier of a business ad account.
     * @return id
     */
    public String id { get; set; }

    /**
     * Permission levels member or partner has on an asset.
     * @return permissions
     */
    public List<String> permissions { get; set; }

    public OASBusinessMemberAssetsSummaryAdAcco() {
        permissions = new List<String>();
    }

    public static OASBusinessMemberAssetsSummaryAdAcco getExample() {
        OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner = new OASBusinessMemberAssetsSummaryAdAcco();
          businessMemberAssetsSummaryAdAccountsInner.id = '549755885175';
          businessMemberAssetsSummaryAdAccountsInner.permissions = new List<String>{''};
        return businessMemberAssetsSummaryAdAccountsInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBusinessMemberAssetsSummaryAdAcco) {           
            OASBusinessMemberAssetsSummaryAdAcco businessMemberAssetsSummaryAdAccountsInner = (OASBusinessMemberAssetsSummaryAdAcco) obj;
            return this.id == businessMemberAssetsSummaryAdAccountsInner.id
                && this.permissions == businessMemberAssetsSummaryAdAccountsInner.permissions;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (permissions == null ? 0 : System.hashCode(permissions));
        return hashCode;
    }
}

