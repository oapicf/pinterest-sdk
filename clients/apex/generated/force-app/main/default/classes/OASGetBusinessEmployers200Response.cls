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
 * OASGetBusinessEmployers200Response
 */
public class OASGetBusinessEmployers200Response implements OASPaginated {
    /**
     * List of employers.
     * @return items
     */
    public List<OASUserBusinessRoleBinding> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASGetBusinessEmployers200Response() {
        items = new List<OASUserBusinessRoleBinding>();
    }

    public static OASGetBusinessEmployers200Response getExample() {
        OASGetBusinessEmployers200Response getBusinessEmployers200Response = new OASGetBusinessEmployers200Response();
          getBusinessEmployers200Response.items = new List<OASUserBusinessRoleBinding>{OASUserBusinessRoleBinding.getExample()};
          getBusinessEmployers200Response.bookmark = '';
        return getBusinessEmployers200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGetBusinessEmployers200Response) {           
            OASGetBusinessEmployers200Response getBusinessEmployers200Response = (OASGetBusinessEmployers200Response) obj;
            return this.items == getBusinessEmployers200Response.items
                && this.bookmark == getBusinessEmployers200Response.bookmark;
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

