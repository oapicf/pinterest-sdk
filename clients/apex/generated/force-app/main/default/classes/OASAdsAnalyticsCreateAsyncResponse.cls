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
 * OASAdsAnalyticsCreateAsyncResponse
 */
public class OASAdsAnalyticsCreateAsyncResponse implements OAS.MappedProperties {
    /**
     * Get reportStatus
     * @return reportStatus
     */
    public OASBulkReportingJobStatus reportStatus { get; set; }

    /**
     * Get token
     * @return token
     */
    public String token { get; set; }

    /**
     * Get message
     * @return message
     */
    public String message { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'report_status' => 'reportStatus'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASAdsAnalyticsCreateAsyncResponse getExample() {
        OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse = new OASAdsAnalyticsCreateAsyncResponse();
          adsAnalyticsCreateAsyncResponse.reportStatus = OASBulkReportingJobStatus.getExample();
          adsAnalyticsCreateAsyncResponse.token = '';
          adsAnalyticsCreateAsyncResponse.message = '';
        return adsAnalyticsCreateAsyncResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdsAnalyticsCreateAsyncResponse) {           
            OASAdsAnalyticsCreateAsyncResponse adsAnalyticsCreateAsyncResponse = (OASAdsAnalyticsCreateAsyncResponse) obj;
            return this.reportStatus == adsAnalyticsCreateAsyncResponse.reportStatus
                && this.token == adsAnalyticsCreateAsyncResponse.token
                && this.message == adsAnalyticsCreateAsyncResponse.message;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (reportStatus == null ? 0 : System.hashCode(reportStatus));
        hashCode = (17 * hashCode) + (token == null ? 0 : System.hashCode(token));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        return hashCode;
    }
}

