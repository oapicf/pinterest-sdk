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
 * OASAdArrayResponse
 */
public class OASAdArrayResponse {
    /**
     * Get items
     * @return items
     */
    public List<OASAdArrayResponseElement> items { get; set; }

    public OASAdArrayResponse() {
        items = new List<OASAdArrayResponseElement>();
    }

    public static OASAdArrayResponse getExample() {
        OASAdArrayResponse adArrayResponse = new OASAdArrayResponse();
          adArrayResponse.items = new List<OASAdArrayResponseElement>{OASAdArrayResponseElement.getExample()};
        return adArrayResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdArrayResponse) {           
            OASAdArrayResponse adArrayResponse = (OASAdArrayResponse) obj;
            return this.items == adArrayResponse.items;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        return hashCode;
    }
}

