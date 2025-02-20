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
 * Batch of logs sent from an integration application.
 */
public class OASIntegrationLogsRequest {
    /**
     * Get logs
     * @return logs
     */
    public List<OASIntegrationLog> logs { get; set; }

    public OASIntegrationLogsRequest() {
        logs = new List<OASIntegrationLog>();
    }

    public static OASIntegrationLogsRequest getExample() {
        OASIntegrationLogsRequest integrationLogsRequest = new OASIntegrationLogsRequest();
          integrationLogsRequest.logs = new List<OASIntegrationLog>{OASIntegrationLog.getExample()};
        return integrationLogsRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASIntegrationLogsRequest) {           
            OASIntegrationLogsRequest integrationLogsRequest = (OASIntegrationLogsRequest) obj;
            return this.logs == integrationLogsRequest.logs;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (logs == null ? 0 : System.hashCode(logs));
        return hashCode;
    }
}

