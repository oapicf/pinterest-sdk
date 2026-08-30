package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ConversionAttributionWindowDays;
import org.openapitools.server.model.ConversionObjectiveType;
import org.openapitools.server.model.ConversionProductAttributionType;
import org.openapitools.server.model.ConversionProductReportBreakdownType;
import org.openapitools.server.model.ConversionProductReportGranularity;
import org.openapitools.server.model.ConversionProductReportLevel;
import org.openapitools.server.model.ConversionProductReportingColumn;
import org.openapitools.server.model.ConversionReportTimeType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class ConversionProductReportCreate   {

    private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
    private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
    private List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();
    private ConversionAttributionWindowDays clickWindowDays;
    private List<ConversionProductReportingColumn> columns = new ArrayList<>();
    private ConversionProductAttributionType conversionProductAttributionType;
    private ConversionProductReportBreakdownType conversionProductBreakdown;
    private ConversionReportTimeType conversionReportTime;
    private String endDate;
    private ConversionProductReportGranularity granularity;
    private ConversionProductReportLevel level;
    private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();
    private String reportName;
    private String startDate;
    private ConversionAttributionWindowDays viewWindowDays;

    /**
     * Default constructor.
     */
    public ConversionProductReportCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionProductReportCreate.
     *
     * @param adGroupIds   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
     * @param campaignIds   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
     * @param campaignObjectiveTypes List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
     * @param columns Metric and entity columns
     * @param conversionProductAttributionType   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
     * @param conversionProductBreakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @param endDate   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
     * @param granularity Report granularity for time-based metric aggregation
     * @param level Level of the report
     * @param productSkuIds   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
     * @param reportName Name of the conversion product report
     * @param startDate   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
     */
    public ConversionProductReportCreate(
        List<@Pattern(regexp = "^\\d+$")String> adGroupIds, 
        List<@Pattern(regexp = "^\\d+$")String> campaignIds, 
        List<ConversionObjectiveType> campaignObjectiveTypes, 
        ConversionAttributionWindowDays clickWindowDays, 
        List<ConversionProductReportingColumn> columns, 
        ConversionProductAttributionType conversionProductAttributionType, 
        ConversionProductReportBreakdownType conversionProductBreakdown, 
        ConversionReportTimeType conversionReportTime, 
        String endDate, 
        ConversionProductReportGranularity granularity, 
        ConversionProductReportLevel level, 
        List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds, 
        String reportName, 
        String startDate, 
        ConversionAttributionWindowDays viewWindowDays
    ) {
        this.adGroupIds = adGroupIds;
        this.campaignIds = campaignIds;
        this.campaignObjectiveTypes = campaignObjectiveTypes;
        this.clickWindowDays = clickWindowDays;
        this.columns = columns;
        this.conversionProductAttributionType = conversionProductAttributionType;
        this.conversionProductBreakdown = conversionProductBreakdown;
        this.conversionReportTime = conversionReportTime;
        this.endDate = endDate;
        this.granularity = granularity;
        this.level = level;
        this.productSkuIds = productSkuIds;
        this.reportName = reportName;
        this.startDate = startDate;
        this.viewWindowDays = viewWindowDays;
    }



    /**
     *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
     * @return adGroupIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
        return adGroupIds;
    }

    public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
        this.adGroupIds = adGroupIds;
    }

    /**
     *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
     * @return campaignIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
     * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
     * @return campaignObjectiveTypes
     */
    public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
        return campaignObjectiveTypes;
    }

    public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
        this.campaignObjectiveTypes = campaignObjectiveTypes;
    }

    /**
     * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
     * @return clickWindowDays
     */
    public ConversionAttributionWindowDays getClickWindowDays() {
        return clickWindowDays;
    }

    public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
        this.clickWindowDays = clickWindowDays;
    }

    /**
     * Metric and entity columns
     * @return columns
     */
    public List<ConversionProductReportingColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<ConversionProductReportingColumn> columns) {
        this.columns = columns;
    }

    /**
     *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
     * @return conversionProductAttributionType
     */
    public ConversionProductAttributionType getConversionProductAttributionType() {
        return conversionProductAttributionType;
    }

    public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
        this.conversionProductAttributionType = conversionProductAttributionType;
    }

    /**
     * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
     * @return conversionProductBreakdown
     */
    public ConversionProductReportBreakdownType getConversionProductBreakdown() {
        return conversionProductBreakdown;
    }

    public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
        this.conversionProductBreakdown = conversionProductBreakdown;
    }

    /**
     * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
     * @return conversionReportTime
     */
    public ConversionReportTimeType getConversionReportTime() {
        return conversionReportTime;
    }

    public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
        this.conversionReportTime = conversionReportTime;
    }

    /**
     *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Report granularity for time-based metric aggregation
     * @return granularity
     */
    public ConversionProductReportGranularity getGranularity() {
        return granularity;
    }

    public void setGranularity(ConversionProductReportGranularity granularity) {
        this.granularity = granularity;
    }

    /**
     * Level of the report
     * @return level
     */
    public ConversionProductReportLevel getLevel() {
        return level;
    }

    public void setLevel(ConversionProductReportLevel level) {
        this.level = level;
    }

    /**
     *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
     * @return productSkuIds
     */
    public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
        return productSkuIds;
    }

    public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
        this.productSkuIds = productSkuIds;
    }

    /**
     * Name of the conversion product report
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
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
        sb.append("class ConversionProductReportCreate {\n");
        
        sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
        sb.append("    campaignObjectiveTypes: ").append(toIndentedString(campaignObjectiveTypes)).append("\n");
        sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
        sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
        sb.append("    conversionProductAttributionType: ").append(toIndentedString(conversionProductAttributionType)).append("\n");
        sb.append("    conversionProductBreakdown: ").append(toIndentedString(conversionProductBreakdown)).append("\n");
        sb.append("    conversionReportTime: ").append(toIndentedString(conversionReportTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    productSkuIds: ").append(toIndentedString(productSkuIds)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

