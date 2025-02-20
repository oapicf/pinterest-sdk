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
 * OASMediaList200Response
 */
public class OASMediaList200Response implements OASPaginated {
    /**
     * Media
     * @return items
     */
    public List<OASMediaUploadDetails> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASMediaList200Response() {
        items = new List<OASMediaUploadDetails>();
    }

    public static OASMediaList200Response getExample() {
        OASMediaList200Response mediaList200Response = new OASMediaList200Response();
          mediaList200Response.items = new List<OASMediaUploadDetails>{OASMediaUploadDetails.getExample()};
          mediaList200Response.bookmark = '';
        return mediaList200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMediaList200Response) {           
            OASMediaList200Response mediaList200Response = (OASMediaList200Response) obj;
            return this.items == mediaList200Response.items
                && this.bookmark == mediaList200Response.bookmark;
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

