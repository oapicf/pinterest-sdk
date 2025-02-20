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
 * OASBusinessAssetPartnersGet200Respon
 */
public class OASBusinessAssetPartnersGet200Respon implements OASPaginated {
    /**
     * List of partners with permissions to the asset.
     * @return items
     */
    public List<OASUserSingleAssetBinding> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASBusinessAssetPartnersGet200Respon() {
        items = new List<OASUserSingleAssetBinding>();
    }

    public static OASBusinessAssetPartnersGet200Respon getExample() {
        OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response = new OASBusinessAssetPartnersGet200Respon();
          businessAssetPartnersGet200Response.items = new List<OASUserSingleAssetBinding>{OASUserSingleAssetBinding.getExample()};
          businessAssetPartnersGet200Response.bookmark = '';
        return businessAssetPartnersGet200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBusinessAssetPartnersGet200Respon) {           
            OASBusinessAssetPartnersGet200Respon businessAssetPartnersGet200Response = (OASBusinessAssetPartnersGet200Respon) obj;
            return this.items == businessAssetPartnersGet200Response.items
                && this.bookmark == businessAssetPartnersGet200Response.bookmark;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        hashCode = (17 * hashCode) + (bookmark == null ? 0 : System.hashCode(bookmark));
        return hashCode;
    }
}

