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
 * OASPinsList200Response
 */
public class OASPinsList200Response implements OASPaginated {
    /**
     * Get items
     * @return items
     */
    public List<OASPin> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASPinsList200Response() {
        items = new List<OASPin>();
    }

    public static OASPinsList200Response getExample() {
        OASPinsList200Response pinsList200Response = new OASPinsList200Response();
          pinsList200Response.items = new List<OASPin>{OASPin.getExample()};
          pinsList200Response.bookmark = '';
        return pinsList200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASPinsList200Response) {           
            OASPinsList200Response pinsList200Response = (OASPinsList200Response) obj;
            return this.items == pinsList200Response.items
                && this.bookmark == pinsList200Response.bookmark;
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
