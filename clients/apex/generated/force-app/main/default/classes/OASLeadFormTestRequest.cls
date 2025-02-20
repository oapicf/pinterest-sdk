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
 * Request to create test data for lead data test API.
 */
public class OASLeadFormTestRequest {
    /**
     * Test lead answers. Should follow the creation order.
     * @return answers
     */
    public List<String> answers { get; set; }

    public OASLeadFormTestRequest() {
        answers = new List<String>();
    }

    public static OASLeadFormTestRequest getExample() {
        OASLeadFormTestRequest leadFormTestRequest = new OASLeadFormTestRequest();
          leadFormTestRequest.answers = new List<String>{''};
        return leadFormTestRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASLeadFormTestRequest) {           
            OASLeadFormTestRequest leadFormTestRequest = (OASLeadFormTestRequest) obj;
            return this.answers == leadFormTestRequest.answers;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (answers == null ? 0 : System.hashCode(answers));
        return hashCode;
    }
}

