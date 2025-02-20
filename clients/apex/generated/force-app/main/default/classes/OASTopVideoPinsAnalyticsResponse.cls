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
 * OASTopVideoPinsAnalyticsResponse
 */
public class OASTopVideoPinsAnalyticsResponse implements OAS.MappedProperties {
    /**
     * Get dateAvailability
     * @return dateAvailability
     */
    public OASTopPinsAnalyticsResponseDateAvail dateAvailability { get; set; }

    /**
     * Get pins
     * @return pins
     */
    public List<OASTopVideoPinsAnalyticsResponsePins> pins { get; set; }

    /**
     * Gets or Sets sortBy
     */
    public enum SortByEnum {
        SAVE,
        IMPRESSION,
        OUTBOUND_CLICK,
        VIDEO_MRC_VIEW,
        VIDEO_AVG_WATCH_TIME,
        VIDEO_V50_WATCH_TIME,
        QUARTILE_95_PERCENT_VIEW,
        VIDEO_10S_VIEW,
        VIDEO_START
    }

    /**
     * Get sortBy
     * @return sortBy
     */
    public SortByEnum sortBy { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'date_availability' => 'dateAvailability',
        'sort_by' => 'sortBy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'date_availability' => 'dateAvailability',
        'sort_by' => 'sortBy'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASTopVideoPinsAnalyticsResponse() {
        pins = new List<OASTopVideoPinsAnalyticsResponsePins>();
    }

    public static OASTopVideoPinsAnalyticsResponse getExample() {
        OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = new OASTopVideoPinsAnalyticsResponse();
          topVideoPinsAnalyticsResponse.dateAvailability = OASTopPinsAnalyticsResponseDateAvail.getExample();
          topVideoPinsAnalyticsResponse.pins = new List<OASTopVideoPinsAnalyticsResponsePins>{OASTopVideoPinsAnalyticsResponsePins.getExample()};
          topVideoPinsAnalyticsResponse.sortBy = SortByEnum.IMPRESSION;
        return topVideoPinsAnalyticsResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASTopVideoPinsAnalyticsResponse) {           
            OASTopVideoPinsAnalyticsResponse topVideoPinsAnalyticsResponse = (OASTopVideoPinsAnalyticsResponse) obj;
            return this.dateAvailability == topVideoPinsAnalyticsResponse.dateAvailability
                && this.pins == topVideoPinsAnalyticsResponse.pins
                && this.sortBy == topVideoPinsAnalyticsResponse.sortBy;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (dateAvailability == null ? 0 : System.hashCode(dateAvailability));
        hashCode = (17 * hashCode) + (pins == null ? 0 : System.hashCode(pins));
        hashCode = (17 * hashCode) + (sortBy == null ? 0 : System.hashCode(sortBy));
        return hashCode;
    }
}

