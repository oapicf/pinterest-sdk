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
 * OASAdsAnalyticsCreateAsyncRequest
 */
public class OASAdsAnalyticsCreateAsyncRequest implements OAS.MappedProperties {
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @return startDate
     */
    public String startDate { get; set; }

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @return endDate
     */
    public String endDate { get; set; }

    /**
     * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
     * @return granularity
     */
    public OASGranularity granularity { get; set; }

    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @return clickWindowDays
     */
    public OASConversionAttributionWindowDays clickWindowDays { get; set; }

    /**
     * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @return engagementWindowDays
     */
    public OASConversionAttributionWindowDays engagementWindowDays { get; set; }

    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
     * @return viewWindowDays
     */
    public OASConversionAttributionWindowDays viewWindowDays { get; set; }

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @return conversionReportTime
     */
    public OASConversionReportTimeType conversionReportTime { get; set; }

    /**
     * List of types of attribution for the conversion report
     * @return attributionTypes
     */
    public List<OASConversionReportAttributionType> attributionTypes { get; set; }

    /**
     * List of campaign ids
     * @return campaignIds
     */
    public List<String> campaignIds { get; set; }

    /**
     * List of status values for filtering
     * @return campaignStatuses
     */
    public List<OASCampaignSummaryStatus> campaignStatuses { get; set; }

    /**
     * List of values for filtering. ["WEB_SESSIONS"] in BETA.
     * @return campaignObjectiveTypes
     */
    public List<OASObjectiveType> campaignObjectiveTypes { get; set; }

    /**
     * List of ad group ids
     * @return adGroupIds
     */
    public List<String> adGroupIds { get; set; }

    /**
     * List of values for filtering
     * @return adGroupStatuses
     */
    public List<OASAdGroupSummaryStatus> adGroupStatuses { get; set; }

    /**
     * List of ad ids [This parameter is no supported for Product Item Level Reports]
     * @return adIds
     */
    public List<String> adIds { get; set; }

    /**
     * List of values for filtering [This parameter is not supported for Product Item Level Reports]
     * @return adStatuses
     */
    public List<OASPinPromotionSummaryStatus> adStatuses { get; set; }

    /**
     * List of product group ids
     * @return productGroupIds
     */
    public List<String> productGroupIds { get; set; }

    /**
     * List of values for filtering
     * @return productGroupStatuses
     */
    public List<OASProductGroupSummaryStatus> productGroupStatuses { get; set; }

    /**
     * List of product item ids
     * @return productItemIds
     */
    public List<String> productItemIds { get; set; }

    /**
     * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
     * @return targetingTypes
     */
    public List<OASAdsAnalyticsTargetingType> targetingTypes { get; set; }

    /**
     * List of metrics filters
     * @return metricsFilters
     */
    public List<OASAdsAnalyticsMetricsFilter> metricsFilters { get; set; }

    /**
     * Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
     * @return columns
     */
    public List<OASReportingColumnAsync> columns { get; set; }

    /**
     * Level of the report
     * @return level
     */
    public OASMetricsReportingLevel level { get; set; }

    /**
     * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
     * @return reportFormat
     */
    public OASDataOutputFormat reportFormat { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'start_date' => 'startDate',
        'end_date' => 'endDate',
        'click_window_days' => 'clickWindowDays',
        'engagement_window_days' => 'engagementWindowDays',
        'view_window_days' => 'viewWindowDays',
        'conversion_report_time' => 'conversionReportTime',
        'attribution_types' => 'attributionTypes',
        'campaign_ids' => 'campaignIds',
        'campaign_statuses' => 'campaignStatuses',
        'campaign_objective_types' => 'campaignObjectiveTypes',
        'ad_group_ids' => 'adGroupIds',
        'ad_group_statuses' => 'adGroupStatuses',
        'ad_ids' => 'adIds',
        'ad_statuses' => 'adStatuses',
        'product_group_ids' => 'productGroupIds',
        'product_group_statuses' => 'productGroupStatuses',
        'product_item_ids' => 'productItemIds',
        'targeting_types' => 'targetingTypes',
        'metrics_filters' => 'metricsFilters',
        'report_format' => 'reportFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASAdsAnalyticsCreateAsyncRequest() {
        clickWindowDays = OASConversionAttributionWindowDays.NUMBER_30;
        engagementWindowDays = OASConversionAttributionWindowDays.NUMBER_30;
        viewWindowDays = OASConversionAttributionWindowDays.NUMBER_1;
        conversionReportTime = 'TIME_OF_AD_ACTION';
        attributionTypes = new List<OASConversionReportAttributionType>();
        campaignIds = new List<String>();
        campaignStatuses = new List<OASCampaignSummaryStatus>();
        campaignObjectiveTypes = new List<OASObjectiveType>();
        adGroupIds = new List<String>();
        adGroupStatuses = new List<OASAdGroupSummaryStatus>();
        adIds = new List<String>();
        adStatuses = new List<OASPinPromotionSummaryStatus>();
        productGroupIds = new List<String>();
        productGroupStatuses = new List<OASProductGroupSummaryStatus>();
        productItemIds = new List<String>();
        targetingTypes = new List<OASAdsAnalyticsTargetingType>();
        metricsFilters = new List<OASAdsAnalyticsMetricsFilter>();
        columns = new List<OASReportingColumnAsync>();
        reportFormat = 'JSON';
    }

    public static OASAdsAnalyticsCreateAsyncRequest getExample() {
        OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = new OASAdsAnalyticsCreateAsyncRequest();
          adsAnalyticsCreateAsyncRequest.startDate = '2020-12-20';
          adsAnalyticsCreateAsyncRequest.endDate = '2020-12-20';
          adsAnalyticsCreateAsyncRequest.granularity = OASGranularity.getExample();
          adsAnalyticsCreateAsyncRequest.clickWindowDays = OASConversionAttributionWindowDays.getExample();
          adsAnalyticsCreateAsyncRequest.engagementWindowDays = OASConversionAttributionWindowDays.getExample();
          adsAnalyticsCreateAsyncRequest.viewWindowDays = OASConversionAttributionWindowDays.getExample();
          adsAnalyticsCreateAsyncRequest.conversionReportTime = OASConversionReportTimeType.getExample();
          adsAnalyticsCreateAsyncRequest.attributionTypes = new List<OASConversionReportAttributionType>{OASConversionReportAttributionType.getExample()};
          adsAnalyticsCreateAsyncRequest.campaignIds = new List<String>{''};
          adsAnalyticsCreateAsyncRequest.campaignStatuses = new List<OASCampaignSummaryStatus>{OASCampaignSummaryStatus.getExample()};
          adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes = new List<OASObjectiveType>{OASObjectiveType.getExample()};
          adsAnalyticsCreateAsyncRequest.adGroupIds = new List<String>{''};
          adsAnalyticsCreateAsyncRequest.adGroupStatuses = new List<OASAdGroupSummaryStatus>{OASAdGroupSummaryStatus.getExample()};
          adsAnalyticsCreateAsyncRequest.adIds = new List<String>{''};
          adsAnalyticsCreateAsyncRequest.adStatuses = new List<OASPinPromotionSummaryStatus>{OASPinPromotionSummaryStatus.getExample()};
          adsAnalyticsCreateAsyncRequest.productGroupIds = new List<String>{''};
          adsAnalyticsCreateAsyncRequest.productGroupStatuses = new List<OASProductGroupSummaryStatus>{OASProductGroupSummaryStatus.getExample()};
          adsAnalyticsCreateAsyncRequest.productItemIds = new List<String>{''};
          adsAnalyticsCreateAsyncRequest.targetingTypes = new List<OASAdsAnalyticsTargetingType>{OASAdsAnalyticsTargetingType.getExample()};
          adsAnalyticsCreateAsyncRequest.metricsFilters = new List<OASAdsAnalyticsMetricsFilter>{OASAdsAnalyticsMetricsFilter.getExample()};
          adsAnalyticsCreateAsyncRequest.columns = new List<OASReportingColumnAsync>{OASReportingColumnAsync.getExample()};
          adsAnalyticsCreateAsyncRequest.level = OASMetricsReportingLevel.getExample();
          adsAnalyticsCreateAsyncRequest.reportFormat = OASDataOutputFormat.getExample();
        return adsAnalyticsCreateAsyncRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAdsAnalyticsCreateAsyncRequest) {           
            OASAdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = (OASAdsAnalyticsCreateAsyncRequest) obj;
            return this.startDate == adsAnalyticsCreateAsyncRequest.startDate
                && this.endDate == adsAnalyticsCreateAsyncRequest.endDate
                && this.granularity == adsAnalyticsCreateAsyncRequest.granularity
                && this.clickWindowDays == adsAnalyticsCreateAsyncRequest.clickWindowDays
                && this.engagementWindowDays == adsAnalyticsCreateAsyncRequest.engagementWindowDays
                && this.viewWindowDays == adsAnalyticsCreateAsyncRequest.viewWindowDays
                && this.conversionReportTime == adsAnalyticsCreateAsyncRequest.conversionReportTime
                && this.attributionTypes == adsAnalyticsCreateAsyncRequest.attributionTypes
                && this.campaignIds == adsAnalyticsCreateAsyncRequest.campaignIds
                && this.campaignStatuses == adsAnalyticsCreateAsyncRequest.campaignStatuses
                && this.campaignObjectiveTypes == adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes
                && this.adGroupIds == adsAnalyticsCreateAsyncRequest.adGroupIds
                && this.adGroupStatuses == adsAnalyticsCreateAsyncRequest.adGroupStatuses
                && this.adIds == adsAnalyticsCreateAsyncRequest.adIds
                && this.adStatuses == adsAnalyticsCreateAsyncRequest.adStatuses
                && this.productGroupIds == adsAnalyticsCreateAsyncRequest.productGroupIds
                && this.productGroupStatuses == adsAnalyticsCreateAsyncRequest.productGroupStatuses
                && this.productItemIds == adsAnalyticsCreateAsyncRequest.productItemIds
                && this.targetingTypes == adsAnalyticsCreateAsyncRequest.targetingTypes
                && this.metricsFilters == adsAnalyticsCreateAsyncRequest.metricsFilters
                && this.columns == adsAnalyticsCreateAsyncRequest.columns
                && this.level == adsAnalyticsCreateAsyncRequest.level
                && this.reportFormat == adsAnalyticsCreateAsyncRequest.reportFormat;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (startDate == null ? 0 : System.hashCode(startDate));
        hashCode = (17 * hashCode) + (endDate == null ? 0 : System.hashCode(endDate));
        hashCode = (17 * hashCode) + (granularity == null ? 0 : System.hashCode(granularity));
        hashCode = (17 * hashCode) + (clickWindowDays == null ? 0 : System.hashCode(clickWindowDays));
        hashCode = (17 * hashCode) + (engagementWindowDays == null ? 0 : System.hashCode(engagementWindowDays));
        hashCode = (17 * hashCode) + (viewWindowDays == null ? 0 : System.hashCode(viewWindowDays));
        hashCode = (17 * hashCode) + (conversionReportTime == null ? 0 : System.hashCode(conversionReportTime));
        hashCode = (17 * hashCode) + (attributionTypes == null ? 0 : System.hashCode(attributionTypes));
        hashCode = (17 * hashCode) + (campaignIds == null ? 0 : System.hashCode(campaignIds));
        hashCode = (17 * hashCode) + (campaignStatuses == null ? 0 : System.hashCode(campaignStatuses));
        hashCode = (17 * hashCode) + (campaignObjectiveTypes == null ? 0 : System.hashCode(campaignObjectiveTypes));
        hashCode = (17 * hashCode) + (adGroupIds == null ? 0 : System.hashCode(adGroupIds));
        hashCode = (17 * hashCode) + (adGroupStatuses == null ? 0 : System.hashCode(adGroupStatuses));
        hashCode = (17 * hashCode) + (adIds == null ? 0 : System.hashCode(adIds));
        hashCode = (17 * hashCode) + (adStatuses == null ? 0 : System.hashCode(adStatuses));
        hashCode = (17 * hashCode) + (productGroupIds == null ? 0 : System.hashCode(productGroupIds));
        hashCode = (17 * hashCode) + (productGroupStatuses == null ? 0 : System.hashCode(productGroupStatuses));
        hashCode = (17 * hashCode) + (productItemIds == null ? 0 : System.hashCode(productItemIds));
        hashCode = (17 * hashCode) + (targetingTypes == null ? 0 : System.hashCode(targetingTypes));
        hashCode = (17 * hashCode) + (metricsFilters == null ? 0 : System.hashCode(metricsFilters));
        hashCode = (17 * hashCode) + (columns == null ? 0 : System.hashCode(columns));
        hashCode = (17 * hashCode) + (level == null ? 0 : System.hashCode(level));
        hashCode = (17 * hashCode) + (reportFormat == null ? 0 : System.hashCode(reportFormat));
        return hashCode;
    }
}
