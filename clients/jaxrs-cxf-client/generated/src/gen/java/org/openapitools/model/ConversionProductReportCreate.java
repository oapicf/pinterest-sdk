package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.ConversionProductAttributionType;
import org.openapitools.model.ConversionProductReportBreakdownType;
import org.openapitools.model.ConversionProductReportGranularity;
import org.openapitools.model.ConversionProductReportLevel;
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class ConversionProductReportCreate  {
  
 /**
  *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.")

  private List<String> adGroupIds = new ArrayList<>();

 /**
  *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")

  private List<String> campaignIds = new ArrayList<>();

 /**
  * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  */
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")

  private List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")

  private ConversionAttributionWindowDays clickWindowDays;

 /**
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")

  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

 /**
  *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  */
  @ApiModelProperty(value = "  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.")

  private ConversionProductAttributionType conversionProductAttributionType;

 /**
  * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  */
  @ApiModelProperty(value = "Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.")

  private ConversionProductReportBreakdownType conversionProductBreakdown;

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  */
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")

  private ConversionReportTimeType conversionReportTime;

 /**
  *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
  */
  @ApiModelProperty(example = "2024-04-23", required = true, value = "  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.")

  private String endDate;

 /**
  * Report granularity for time-based metric aggregation
  */
  @ApiModelProperty(required = true, value = "Report granularity for time-based metric aggregation")

  private ConversionProductReportGranularity granularity;

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")

  private ConversionProductReportLevel level;

 /**
  *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  */
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")

  private List<String> productSkuIds = new ArrayList<>();

 /**
  * Name of the conversion product report
  */
  @ApiModelProperty(required = true, value = "Name of the conversion product report")

  private String reportName;

 /**
  *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  */
  @ApiModelProperty(example = "2024-04-17", required = true, value = "  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.")

  private String startDate;

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")

  private ConversionAttributionWindowDays viewWindowDays;
 /**
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   * @return adGroupIds
  **/
  @JsonProperty("ad_group_ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public ConversionProductReportCreate adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public ConversionProductReportCreate addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

 /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   * @return campaignIds
  **/
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public ConversionProductReportCreate campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ConversionProductReportCreate addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
   * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
   * @return campaignObjectiveTypes
  **/
  @JsonProperty("campaign_objective_types")
  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportCreate campaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public ConversionProductReportCreate addCampaignObjectiveTypesItem(ConversionObjectiveType campaignObjectiveTypesItem) {
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

 /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   * @return clickWindowDays
  **/
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public ConversionProductReportCreate clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
   * Metric and entity columns
   * @return columns
  **/
  @JsonProperty("columns")
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  public ConversionProductReportCreate columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ConversionProductReportCreate addColumnsItem(ConversionProductReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   * @return conversionProductAttributionType
  **/
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  public ConversionProductReportCreate conversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

 /**
   * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
   * @return conversionProductBreakdown
  **/
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  public ConversionProductReportCreate conversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

 /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @return conversionReportTime
  **/
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public ConversionProductReportCreate conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

 /**
   *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
   * @return endDate
  **/
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ConversionProductReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Report granularity for time-based metric aggregation
   * @return granularity
  **/
  @JsonProperty("granularity")
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

  public ConversionProductReportCreate granularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
   * Level of the report
   * @return level
  **/
  @JsonProperty("level")
  public ConversionProductReportLevel getLevel() {
    return level;
  }

  public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  public ConversionProductReportCreate level(ConversionProductReportLevel level) {
    this.level = level;
    return this;
  }

 /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   * @return productSkuIds
  **/
  @JsonProperty("product_sku_ids")
  public List<String> getProductSkuIds() {
    return productSkuIds;
  }

  public void setProductSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  public ConversionProductReportCreate productSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  public ConversionProductReportCreate addProductSkuIdsItem(String productSkuIdsItem) {
    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

 /**
   * Name of the conversion product report
   * @return reportName
  **/
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ConversionProductReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
   *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   * @return startDate
  **/
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ConversionProductReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
   * @return viewWindowDays
  **/
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  public ConversionProductReportCreate viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionProductReportCreate conversionProductReportCreate = (ConversionProductReportCreate) o;
    return Objects.equals(this.adGroupIds, conversionProductReportCreate.adGroupIds) &&
        Objects.equals(this.campaignIds, conversionProductReportCreate.campaignIds) &&
        Objects.equals(this.campaignObjectiveTypes, conversionProductReportCreate.campaignObjectiveTypes) &&
        Objects.equals(this.clickWindowDays, conversionProductReportCreate.clickWindowDays) &&
        Objects.equals(this.columns, conversionProductReportCreate.columns) &&
        Objects.equals(this.conversionProductAttributionType, conversionProductReportCreate.conversionProductAttributionType) &&
        Objects.equals(this.conversionProductBreakdown, conversionProductReportCreate.conversionProductBreakdown) &&
        Objects.equals(this.conversionReportTime, conversionProductReportCreate.conversionReportTime) &&
        Objects.equals(this.endDate, conversionProductReportCreate.endDate) &&
        Objects.equals(this.granularity, conversionProductReportCreate.granularity) &&
        Objects.equals(this.level, conversionProductReportCreate.level) &&
        Objects.equals(this.productSkuIds, conversionProductReportCreate.productSkuIds) &&
        Objects.equals(this.reportName, conversionProductReportCreate.reportName) &&
        Objects.equals(this.startDate, conversionProductReportCreate.startDate) &&
        Objects.equals(this.viewWindowDays, conversionProductReportCreate.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupIds, campaignIds, campaignObjectiveTypes, clickWindowDays, columns, conversionProductAttributionType, conversionProductBreakdown, conversionReportTime, endDate, granularity, level, productSkuIds, reportName, startDate, viewWindowDays);
  }

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

