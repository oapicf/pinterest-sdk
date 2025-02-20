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
 * OASConversionEventResponse
 */
public class OASConversionEventResponse implements OAS.MappedProperties {
    /**
     * Get conversionEvent
     * @return conversionEvent
     */
    public OASConversionTagType conversionEvent { get; set; }

    /**
     * Id of the tag.
     * @return conversionTagId
     */
    public String conversionTagId { get; set; }

    /**
     * Id of the ad account.
     * @return adAccountId
     */
    public String adAccountId { get; set; }

    /**
     * Creation date in epoch format.
     * @return createdTime
     */
    public Integer createdTime { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'conversion_event' => 'conversionEvent',
        'conversion_tag_id' => 'conversionTagId',
        'ad_account_id' => 'adAccountId',
        'created_time' => 'createdTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'conversion_event' => 'conversionEvent',
        'conversion_tag_id' => 'conversionTagId',
        'ad_account_id' => 'adAccountId',
        'created_time' => 'createdTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'conversion_event' => 'conversionEvent',
        'conversion_tag_id' => 'conversionTagId',
        'ad_account_id' => 'adAccountId',
        'created_time' => 'createdTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'conversion_event' => 'conversionEvent',
        'conversion_tag_id' => 'conversionTagId',
        'ad_account_id' => 'adAccountId',
        'created_time' => 'createdTime'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASConversionEventResponse getExample() {
        OASConversionEventResponse conversionEventResponse = new OASConversionEventResponse();
          conversionEventResponse.conversionEvent = '';
          conversionEventResponse.conversionTagId = '2614324385652';
          conversionEventResponse.adAccountId = '549757463328';
          conversionEventResponse.createdTime = 1564768710;
        return conversionEventResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASConversionEventResponse) {           
            OASConversionEventResponse conversionEventResponse = (OASConversionEventResponse) obj;
            return this.conversionEvent == conversionEventResponse.conversionEvent
                && this.conversionTagId == conversionEventResponse.conversionTagId
                && this.adAccountId == conversionEventResponse.adAccountId
                && this.createdTime == conversionEventResponse.createdTime;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (conversionEvent == null ? 0 : System.hashCode(conversionEvent));
        hashCode = (17 * hashCode) + (conversionTagId == null ? 0 : System.hashCode(conversionTagId));
        hashCode = (17 * hashCode) + (adAccountId == null ? 0 : System.hashCode(adAccountId));
        hashCode = (17 * hashCode) + (createdTime == null ? 0 : System.hashCode(createdTime));
        return hashCode;
    }
}

