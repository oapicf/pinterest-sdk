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
 * OASBulkDownloadRequestCampaignFilter
 */
public class OASBulkDownloadRequestCampaignFilter implements OAS.MappedProperties {
    /**
     * Unix UTC timestamp.
     * @return startTime
     */
    public String startTime { get; set; }

    /**
     * Unix UTC timestamp.
     * @return endTime
     */
    public String endTime { get; set; }

    /**
     * Campaign name
     * @return name
     */
    public String name { get; set; }

    /**
     * Get campaignStatus
     * @return campaignStatus
     */
    public List<OASCampaignSummaryStatus> campaignStatus { get; set; }

    /**
     * Get objectiveType
     * @return objectiveType
     */
    public List<OASObjectiveType> objectiveType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_time' => 'startTime',
        'end_time' => 'endTime',
        'campaign_status' => 'campaignStatus',
        'objective_type' => 'objectiveType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_time' => 'startTime',
        'end_time' => 'endTime',
        'campaign_status' => 'campaignStatus',
        'objective_type' => 'objectiveType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_time' => 'startTime',
        'end_time' => 'endTime',
        'campaign_status' => 'campaignStatus',
        'objective_type' => 'objectiveType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_time' => 'startTime',
        'end_time' => 'endTime',
        'campaign_status' => 'campaignStatus',
        'objective_type' => 'objectiveType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASBulkDownloadRequestCampaignFilter() {
        campaignStatus = new List<OASCampaignSummaryStatus>();
        objectiveType = new List<OASObjectiveType>();
    }

    public static OASBulkDownloadRequestCampaignFilter getExample() {
        OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = new OASBulkDownloadRequestCampaignFilter();
          bulkDownloadRequestCampaignFilter.startTime = '1622848072';
          bulkDownloadRequestCampaignFilter.endTime = '1622848072';
          bulkDownloadRequestCampaignFilter.name = 'campaign name';
          bulkDownloadRequestCampaignFilter.campaignStatus = new List<OASCampaignSummaryStatus>{OASCampaignSummaryStatus.getExample()};
          bulkDownloadRequestCampaignFilter.objectiveType = new List<OASObjectiveType>{OASObjectiveType.getExample()};
        return bulkDownloadRequestCampaignFilter;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASBulkDownloadRequestCampaignFilter) {           
            OASBulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = (OASBulkDownloadRequestCampaignFilter) obj;
            return this.startTime == bulkDownloadRequestCampaignFilter.startTime
                && this.endTime == bulkDownloadRequestCampaignFilter.endTime
                && this.name == bulkDownloadRequestCampaignFilter.name
                && this.campaignStatus == bulkDownloadRequestCampaignFilter.campaignStatus
                && this.objectiveType == bulkDownloadRequestCampaignFilter.objectiveType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (startTime == null ? 0 : System.hashCode(startTime));
        hashCode = (17 * hashCode) + (endTime == null ? 0 : System.hashCode(endTime));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (campaignStatus == null ? 0 : System.hashCode(campaignStatus));
        hashCode = (17 * hashCode) + (objectiveType == null ? 0 : System.hashCode(objectiveType));
        return hashCode;
    }
}

