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
 * OASGetMMMReportResponse
 */
public class OASGetMMMReportResponse {
    /**
     * Get code
     * @return code
     */
    public Double code { get; set; }

    /**
     * Get data
     * @return data
     */
    public OASGetMMMReportResponseData data { get; set; }

    /**
     * Get message
     * @return message
     */
    public String message { get; set; }

    /**
     * Get status
     * @return status
     */
    public String status { get; set; }

    public static OASGetMMMReportResponse getExample() {
        OASGetMMMReportResponse getMMMReportResponse = new OASGetMMMReportResponse();
          getMMMReportResponse.code = 0;
          getMMMReportResponse.data = OASGetMMMReportResponseData.getExample();
          getMMMReportResponse.message = 'ok';
          getMMMReportResponse.status = 'success';
        return getMMMReportResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASGetMMMReportResponse) {           
            OASGetMMMReportResponse getMMMReportResponse = (OASGetMMMReportResponse) obj;
            return this.code == getMMMReportResponse.code
                && this.data == getMMMReportResponse.data
                && this.message == getMMMReportResponse.message
                && this.status == getMMMReportResponse.status;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (status == null ? 0 : System.hashCode(status));
        return hashCode;
    }
}
