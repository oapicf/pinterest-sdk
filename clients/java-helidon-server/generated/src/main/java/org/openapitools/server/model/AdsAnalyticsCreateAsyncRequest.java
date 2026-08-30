package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AdAdsAnalyticsAsyncTargetingTypes;
import org.openapitools.server.model.AdGroupSummaryStatus;
import org.openapitools.server.model.AdsAnalyticsMetricsFilter;
import org.openapitools.server.model.CampaignObjectiveType;
import org.openapitools.server.model.CampaignSummaryStatus;
import org.openapitools.server.model.ConversionAttributionWindowDays;
import org.openapitools.server.model.ConversionReportAttributionType;
import org.openapitools.server.model.ConversionReportTimeType;
import org.openapitools.server.model.CustomConversionEventMetrics;
import org.openapitools.server.model.DataOutputFormat;
import org.openapitools.server.model.Granularity;
import org.openapitools.server.model.MetricsReportingLevel;
import org.openapitools.server.model.PinPromotionSummaryStatus;
import org.openapitools.server.model.PrimarySort;
import org.openapitools.server.model.ProductGroupSummaryStatus;
import org.openapitools.server.model.ReportingColumnAsync;
import org.openapitools.server.model.ReportingTimeZone;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdsAnalyticsCreateAsyncRequest   {

    private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
    private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();
    private List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();
    private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();
    private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();
    private String campaignBrandLabel;
    private String campaignCustomLabel;
    private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
    private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();
    private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();
    private ConversionAttributionWindowDays clickWindowDays;
    private List<ReportingColumnAsync> columns = new ArrayList<>();
    private Boolean combineTargetingTypes = false;
    private ConversionReportTimeType conversionReportTime;
    private List<@Valid CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();
    private String endDate;
    private Integer endHour;
    private ConversionAttributionWindowDays engagementWindowDays;
    private Granularity granularity;
    private MetricsReportingLevel level;
    private List<@Valid AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();
    private PrimarySort primarySort;
    private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();
    private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();
    private List<@Pattern(regexp = "^\\d+$")String> productItemIds = new ArrayList<>();
    private DataOutputFormat reportFormat;
    private ReportingTimeZone reportingTimezone;
    private String startDate;
    private Integer startHour;
    private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();
    private ConversionAttributionWindowDays viewWindowDays;

    /**
     * Default constructor.
     */
    public AdsAnalyticsCreateAsyncRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsAnalyticsCreateAsyncRequest.
     *
     * @param adGroupIds List of ad group ids
     * @param adGroupStatuses List of values for filtering
     * @param adIds List of ad ids. This parameter is not supported for Product Item level reports.
     * @param adStatuses List of values for filtering. This parameter is not supported for Product Item level reports.
     * @param attributionTypes List of attribution types for the conversion report.
     * @param campaignBrandLabel Campaign brand label for filtering.
     * @param campaignCustomLabel Campaign custom label for filtering.
     * @param campaignIds List of campaign ids
     * @param campaignObjectiveTypes List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
     * @param campaignStatuses List of status values for filtering
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action.
     * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
     * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown.
     * @param conversionReportTime Date dimension for conversion metrics.
     * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
     * @param endHour Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action.
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
     * @param level Level of the report
     * @param metricsFilters List of metrics filters
     * @param primarySort primarySort
     * @param productGroupIds List of product group ids
     * @param productGroupStatuses List of values for filtering
     * @param productItemIds List of product item ids
     * @param reportFormat reportFormat
     * @param reportingTimezone Specify the timezone to be applied for the reporting.
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
     * @param startHour Which hour of the start date to begin the report. Only allowed for hourly reports.
     * @param targetingTypes List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action.
     */
    public AdsAnalyticsCreateAsyncRequest(
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds, 
        List<AdGroupSummaryStatus> adGroupStatuses, 
        List<@Pattern(regexp = "^\\d+$")String> adIds, 
        List<PinPromotionSummaryStatus> adStatuses, 
        List<ConversionReportAttributionType> attributionTypes, 
        String campaignBrandLabel, 
        String campaignCustomLabel, 
        List<@Pattern(regexp = "^\\d+$")String> campaignIds, 
        List<CampaignObjectiveType> campaignObjectiveTypes, 
        List<CampaignSummaryStatus> campaignStatuses, 
        ConversionAttributionWindowDays clickWindowDays, 
        List<ReportingColumnAsync> columns, 
        Boolean combineTargetingTypes, 
        ConversionReportTimeType conversionReportTime, 
        List<@Valid CustomConversionEventMetrics> customConversionEventMetrics, 
        String endDate, 
        Integer endHour, 
        ConversionAttributionWindowDays engagementWindowDays, 
        Granularity granularity, 
        MetricsReportingLevel level, 
        List<@Valid AdsAnalyticsMetricsFilter> metricsFilters, 
        PrimarySort primarySort, 
        List<@Pattern(regexp = "^\\d+$")String> productGroupIds, 
        List<ProductGroupSummaryStatus> productGroupStatuses, 
        List<@Pattern(regexp = "^\\d+$")String> productItemIds, 
        DataOutputFormat reportFormat, 
        ReportingTimeZone reportingTimezone, 
        String startDate, 
        Integer startHour, 
        List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes, 
        ConversionAttributionWindowDays viewWindowDays
    ) {
        this.adGroupIds = adGroupIds;
        this.adGroupStatuses = adGroupStatuses;
        this.adIds = adIds;
        this.adStatuses = adStatuses;
        this.attributionTypes = attributionTypes;
        this.campaignBrandLabel = campaignBrandLabel;
        this.campaignCustomLabel = campaignCustomLabel;
        this.campaignIds = campaignIds;
        this.campaignObjectiveTypes = campaignObjectiveTypes;
        this.campaignStatuses = campaignStatuses;
        this.clickWindowDays = clickWindowDays;
        this.columns = columns;
        this.combineTargetingTypes = combineTargetingTypes;
        this.conversionReportTime = conversionReportTime;
        this.customConversionEventMetrics = customConversionEventMetrics;
        this.endDate = endDate;
        this.endHour = endHour;
        this.engagementWindowDays = engagementWindowDays;
        this.granularity = granularity;
        this.level = level;
        this.metricsFilters = metricsFilters;
        this.primarySort = primarySort;
        this.productGroupIds = productGroupIds;
        this.productGroupStatuses = productGroupStatuses;
        this.productItemIds = productItemIds;
        this.reportFormat = reportFormat;
        this.reportingTimezone = reportingTimezone;
        this.startDate = startDate;
        this.startHour = startHour;
        this.targetingTypes = targetingTypes;
        this.viewWindowDays = viewWindowDays;
    }



    /**
     * List of ad group ids
     * @return adGroupIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
        return adGroupIds;
    }

    public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    /**
     * List of values for filtering
     * @return adGroupStatuses
     */
    public List<AdGroupSummaryStatus> getAdGroupStatuses() {
        return adGroupStatuses;
    }

    public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
        this.adGroupStatuses = adGroupStatuses;
    }

    /**
     * List of ad ids. This parameter is not supported for Product Item level reports.
     * @return adIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAdIds() {
        return adIds;
    }

    public void setAdIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
        this.adIds = adIds;
    }

    /**
     * List of values for filtering. This parameter is not supported for Product Item level reports.
     * @return adStatuses
     */
    public List<PinPromotionSummaryStatus> getAdStatuses() {
        return adStatuses;
    }

    public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
        this.adStatuses = adStatuses;
    }

    /**
     * List of attribution types for the conversion report.
     * @return attributionTypes
     */
    public List<ConversionReportAttributionType> getAttributionTypes() {
        return attributionTypes;
    }

    public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
        this.attributionTypes = attributionTypes;
    }

    /**
     * Campaign brand label for filtering.
     * @return campaignBrandLabel
     */
    public String getCampaignBrandLabel() {
        return campaignBrandLabel;
    }

    public void setCampaignBrandLabel(String campaignBrandLabel) {
        this.campaignBrandLabel = campaignBrandLabel;
    }

    /**
     * Campaign custom label for filtering.
     * @return campaignCustomLabel
     */
    public String getCampaignCustomLabel() {
        return campaignCustomLabel;
    }

    public void setCampaignCustomLabel(String campaignCustomLabel) {
        this.campaignCustomLabel = campaignCustomLabel;
    }

    /**
     * List of campaign ids
     * @return campaignIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
     * @return campaignObjectiveTypes
     */
    public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
        return campaignObjectiveTypes;
    }

    public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
        this.campaignObjectiveTypes = campaignObjectiveTypes;
    }

    /**
     * List of status values for filtering
     * @return campaignStatuses
     */
    public List<CampaignSummaryStatus> getCampaignStatuses() {
        return campaignStatuses;
    }

    public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
        this.campaignStatuses = campaignStatuses;
    }

    /**
     * Number of days to use as the conversion attribution window for a pin click action.
     * @return clickWindowDays
     */
    public ConversionAttributionWindowDays getClickWindowDays() {
        return clickWindowDays;
    }

    public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
        this.clickWindowDays = clickWindowDays;
    }

    /**
     * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
     * @return columns
     */
    public List<ReportingColumnAsync> getColumns() {
        return columns;
    }

    public void setColumns(List<ReportingColumnAsync> columns) {
        this.columns = columns;
    }

    /**
     * Determines if the targeting types included in the request should be consolidated into a single breakdown.
     * @return combineTargetingTypes
     */
    public Boolean getCombineTargetingTypes() {
        return combineTargetingTypes;
    }

    public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
        this.combineTargetingTypes = combineTargetingTypes;
    }

    /**
     * Date dimension for conversion metrics.
     * @return conversionReportTime
     */
    public ConversionReportTimeType getConversionReportTime() {
        return conversionReportTime;
    }

    public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
        this.conversionReportTime = conversionReportTime;
    }

    /**
     * List of advertiser-defined custom conversion event metrics to include in the report
     * @return customConversionEventMetrics
     */
    public List<@Valid CustomConversionEventMetrics> getCustomConversionEventMetrics() {
        return customConversionEventMetrics;
    }

    public void setCustomConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
        this.customConversionEventMetrics = customConversionEventMetrics;
    }

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
     * minimum: 0
     * maximum: 23
     * @return endHour
     */
    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    /**
     * Number of days to use as the conversion attribution window for an engagement action.
     * @return engagementWindowDays
     */
    public ConversionAttributionWindowDays getEngagementWindowDays() {
        return engagementWindowDays;
    }

    public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
        this.engagementWindowDays = engagementWindowDays;
    }

    /**
     *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
     * @return granularity
     */
    public Granularity getGranularity() {
        return granularity;
    }

    public void setGranularity(Granularity granularity) {
        this.granularity = granularity;
    }

    /**
     * Level of the report
     * @return level
     */
    public MetricsReportingLevel getLevel() {
        return level;
    }

    public void setLevel(MetricsReportingLevel level) {
        this.level = level;
    }

    /**
     * List of metrics filters
     * @return metricsFilters
     */
    public List<@Valid AdsAnalyticsMetricsFilter> getMetricsFilters() {
        return metricsFilters;
    }

    public void setMetricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
        this.metricsFilters = metricsFilters;
    }

    /**
     * Get primarySort
     * @return primarySort
     */
    public PrimarySort getPrimarySort() {
        return primarySort;
    }

    public void setPrimarySort(PrimarySort primarySort) {
        this.primarySort = primarySort;
    }

    /**
     * List of product group ids
     * @return productGroupIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
        return productGroupIds;
    }

    public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
        this.productGroupIds = productGroupIds;
    }

    /**
     * List of values for filtering
     * @return productGroupStatuses
     */
    public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
        return productGroupStatuses;
    }

    public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
        this.productGroupStatuses = productGroupStatuses;
    }

    /**
     * List of product item ids
     * @return productItemIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getProductItemIds() {
        return productItemIds;
    }

    public void setProductItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
        this.productItemIds = productItemIds;
    }

    /**
     * Get reportFormat
     * @return reportFormat
     */
    public DataOutputFormat getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(DataOutputFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    /**
     * Specify the timezone to be applied for the reporting.
     * @return reportingTimezone
     */
    public ReportingTimeZone getReportingTimezone() {
        return reportingTimezone;
    }

    public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
        this.reportingTimezone = reportingTimezone;
    }

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Which hour of the start date to begin the report. Only allowed for hourly reports.
     * minimum: 0
     * maximum: 23
     * @return startHour
     */
    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    /**
     * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
     * @return targetingTypes
     */
    public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
        return targetingTypes;
    }

    public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
        this.targetingTypes = targetingTypes;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action.
     * @return viewWindowDays
     */
    public ConversionAttributionWindowDays getViewWindowDays() {
        return viewWindowDays;
    }

    public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
        this.viewWindowDays = viewWindowDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsAnalyticsCreateAsyncRequest {\n");
        
        sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
        sb.append("    adGroupStatuses: ").append(toIndentedString(adGroupStatuses)).append("\n");
        sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
        sb.append("    adStatuses: ").append(toIndentedString(adStatuses)).append("\n");
        sb.append("    attributionTypes: ").append(toIndentedString(attributionTypes)).append("\n");
        sb.append("    campaignBrandLabel: ").append(toIndentedString(campaignBrandLabel)).append("\n");
        sb.append("    campaignCustomLabel: ").append(toIndentedString(campaignCustomLabel)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
        sb.append("    campaignObjectiveTypes: ").append(toIndentedString(campaignObjectiveTypes)).append("\n");
        sb.append("    campaignStatuses: ").append(toIndentedString(campaignStatuses)).append("\n");
        sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    combineTargetingTypes: ").append(toIndentedString(combineTargetingTypes)).append("\n");
        sb.append("    conversionReportTime: ").append(toIndentedString(conversionReportTime)).append("\n");
        sb.append("    customConversionEventMetrics: ").append(toIndentedString(customConversionEventMetrics)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
        sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
        sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    metricsFilters: ").append(toIndentedString(metricsFilters)).append("\n");
        sb.append("    primarySort: ").append(toIndentedString(primarySort)).append("\n");
        sb.append("    productGroupIds: ").append(toIndentedString(productGroupIds)).append("\n");
        sb.append("    productGroupStatuses: ").append(toIndentedString(productGroupStatuses)).append("\n");
        sb.append("    productItemIds: ").append(toIndentedString(productItemIds)).append("\n");
        sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
        sb.append("    reportingTimezone: ").append(toIndentedString(reportingTimezone)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
        sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
        sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

