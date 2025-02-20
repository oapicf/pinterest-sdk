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
 * OASCampaignCreateResponse
 */
public class OASCampaignCreateResponse {
    /**
     * Get items
     * @return items
     */
    public List<OASCampaignCreateResponseItem> items { get; set; }

    public OASCampaignCreateResponse() {
        items = new List<OASCampaignCreateResponseItem>();
    }

    public static OASCampaignCreateResponse getExample() {
        OASCampaignCreateResponse campaignCreateResponse = new OASCampaignCreateResponse();
          campaignCreateResponse.items = new List<OASCampaignCreateResponseItem>{OASCampaignCreateResponseItem.getExample()};
        return campaignCreateResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCampaignCreateResponse) {           
            OASCampaignCreateResponse campaignCreateResponse = (OASCampaignCreateResponse) obj;
            return this.items == campaignCreateResponse.items;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (items == null ? 0 : System.hashCode(items));
        return hashCode;
    }
}

