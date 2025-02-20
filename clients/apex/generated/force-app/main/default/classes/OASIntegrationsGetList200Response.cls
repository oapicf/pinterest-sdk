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
 * OASIntegrationsGetList200Response
 */
public class OASIntegrationsGetList200Response implements OASPaginated {
    /**
     * Get items
     * @return items
     */
    public List<OASIntegrationRecord> items { get; set; }

    /**
     * Get bookmark
     * @return bookmark
     */
    public String bookmark { get; set; }

    public OASIntegrationsGetList200Response() {
        items = new List<OASIntegrationRecord>();
    }

    public static OASIntegrationsGetList200Response getExample() {
        OASIntegrationsGetList200Response integrationsGetList200Response = new OASIntegrationsGetList200Response();
          integrationsGetList200Response.items = new List<OASIntegrationRecord>{OASIntegrationRecord.getExample()};
          integrationsGetList200Response.bookmark = '';
        return integrationsGetList200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASIntegrationsGetList200Response) {           
            OASIntegrationsGetList200Response integrationsGetList200Response = (OASIntegrationsGetList200Response) obj;
            return this.items == integrationsGetList200Response.items
                && this.bookmark == integrationsGetList200Response.bookmark;
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

