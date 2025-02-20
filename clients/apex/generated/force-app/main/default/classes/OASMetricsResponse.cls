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
 * OASMetricsResponse
 */
public class OASMetricsResponse {
    /**
     * Get data
     * @return data
     */
    public List<Object> data { get; set; }

    public OASMetricsResponse() {
        data = new List<Object>();
    }

    public static OASMetricsResponse getExample() {
        OASMetricsResponse metricsResponse = new OASMetricsResponse();
          metricsResponse.data = new List<Object>{null};
        return metricsResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMetricsResponse) {           
            OASMetricsResponse metricsResponse = (OASMetricsResponse) obj;
            return this.data == metricsResponse.data;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        return hashCode;
    }
}

