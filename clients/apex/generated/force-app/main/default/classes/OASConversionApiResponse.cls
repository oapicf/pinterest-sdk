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
 * Schema describing the object in the response, which contains information about the events that were received and processed.
 */
public class OASConversionApiResponse implements OAS.MappedProperties {
    /**
     * Total number of events received in the request.
     * @return numEventsReceived
     */
    public Integer numEventsReceived { get; set; }

    /**
     * Number of events that were successfully processed from the events.
     * @return numEventsProcessed
     */
    public Integer numEventsProcessed { get; set; }

    /**
     * Specific messages for each event received. The order will match the order in which the events were received in the request.
     * @return events
     */
    public List<OASConversionApiResponseEventsInner> events { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'num_events_received' => 'numEventsReceived',
        'num_events_processed' => 'numEventsProcessed'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'num_events_received' => 'numEventsReceived',
        'num_events_processed' => 'numEventsProcessed'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASConversionApiResponse() {
        events = new List<OASConversionApiResponseEventsInner>();
    }

    public static OASConversionApiResponse getExample() {
        OASConversionApiResponse conversionApiResponse = new OASConversionApiResponse();
          conversionApiResponse.numEventsReceived = 0;
          conversionApiResponse.numEventsProcessed = 0;
          conversionApiResponse.events = new List<OASConversionApiResponseEventsInner>{OASConversionApiResponseEventsInner.getExample()};
        return conversionApiResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASConversionApiResponse) {           
            OASConversionApiResponse conversionApiResponse = (OASConversionApiResponse) obj;
            return this.numEventsReceived == conversionApiResponse.numEventsReceived
                && this.numEventsProcessed == conversionApiResponse.numEventsProcessed
                && this.events == conversionApiResponse.events;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (numEventsReceived == null ? 0 : System.hashCode(numEventsReceived));
        hashCode = (17 * hashCode) + (numEventsProcessed == null ? 0 : System.hashCode(numEventsProcessed));
        hashCode = (17 * hashCode) + (events == null ? 0 : System.hashCode(events));
        return hashCode;
    }
}

