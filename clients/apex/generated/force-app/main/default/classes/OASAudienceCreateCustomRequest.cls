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
 * OASAudienceCreateCustomRequest
 */
public class OASAudienceCreateCustomRequest implements OASAudienceCommon, OAS.MappedProperties {
    /**
     * Ad account ID.
     * @return adAccountId
     */
    public String adAccountId { get; set; }

    /**
     * Audience name.
     * @return name
     */
    public String name { get; set; }

    /**
     * Get rule
     * @return rule
     */
    public OASAudienceRule rule { get; set; }

    /**
     * Get sharingType
     * @return sharingType
     */
    public OASAudienceSharingType sharingType { get; set; }

    /**
     * Get dataParty
     * @return dataParty
     */
    public OASAudienceDataParty dataParty { get; set; }

    /**
     * Get category
     * @return category
     */
    public String category { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_account_id' => 'adAccountId',
        'sharing_type' => 'sharingType',
        'data_party' => 'dataParty'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_account_id' => 'adAccountId',
        'sharing_type' => 'sharingType',
        'data_party' => 'dataParty'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'ad_account_id' => 'adAccountId',
        'sharing_type' => 'sharingType',
        'data_party' => 'dataParty'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASAudienceCreateCustomRequest getExample() {
        OASAudienceCreateCustomRequest audienceCreateCustomRequest = new OASAudienceCreateCustomRequest();
          audienceCreateCustomRequest.adAccountId = '549755885175';
          audienceCreateCustomRequest.name = 'string';
          audienceCreateCustomRequest.rule = OASAudienceRule.getExample();
          audienceCreateCustomRequest.sharingType = OASAudienceSharingType.getExample();
          audienceCreateCustomRequest.dataParty = OASAudienceDataParty.getExample();
          audienceCreateCustomRequest.category = 'DLX Demographics';
        return audienceCreateCustomRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAudienceCreateCustomRequest) {           
            OASAudienceCreateCustomRequest audienceCreateCustomRequest = (OASAudienceCreateCustomRequest) obj;
            return this.adAccountId == audienceCreateCustomRequest.adAccountId
                && this.name == audienceCreateCustomRequest.name
                && this.rule == audienceCreateCustomRequest.rule
                && this.sharingType == audienceCreateCustomRequest.sharingType
                && this.dataParty == audienceCreateCustomRequest.dataParty
                && this.category == audienceCreateCustomRequest.category;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (adAccountId == null ? 0 : System.hashCode(adAccountId));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (rule == null ? 0 : System.hashCode(rule));
        hashCode = (17 * hashCode) + (sharingType == null ? 0 : System.hashCode(sharingType));
        hashCode = (17 * hashCode) + (dataParty == null ? 0 : System.hashCode(dataParty));
        hashCode = (17 * hashCode) + (category == null ? 0 : System.hashCode(category));
        return hashCode;
    }
}

