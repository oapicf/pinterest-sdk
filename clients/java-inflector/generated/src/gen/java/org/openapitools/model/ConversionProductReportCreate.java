package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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



/**
 * Resource create operation model.
 **/

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionProductReportCreate   {
  @JsonProperty("ad_group_ids")
  private List<String> adGroupIds = null;

  @JsonProperty("campaign_ids")
  private List<String> campaignIds = null;

  @JsonProperty("campaign_objective_types")
  private List<ConversionObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("click_window_days")
  private ConversionAttributionWindowDays clickWindowDays;

  @JsonProperty("columns")
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

  @JsonProperty("conversion_product_attribution_type")
  private ConversionProductAttributionType conversionProductAttributionType;

  @JsonProperty("conversion_product_breakdown")
  private ConversionProductReportBreakdownType conversionProductBreakdown;

  @JsonProperty("conversion_report_time")
  private ConversionReportTimeType conversionReportTime;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("granularity")
  private ConversionProductReportGranularity granularity;

  @JsonProperty("level")
  private ConversionProductReportLevel level;

  @JsonProperty("product_sku_ids")
  private List<String> productSkuIds = null;

  @JsonProperty("report_name")
  private String reportName;

  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("view_window_days")
  private ConversionAttributionWindowDays viewWindowDays;

  /**
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   **/
  public ConversionProductReportCreate adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   **/
  public ConversionProductReportCreate campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
   **/
  public ConversionProductReportCreate campaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @JsonProperty("campaign_objective_types")
  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   **/
  public ConversionProductReportCreate clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Metric and entity columns
   **/
  public ConversionProductReportCreate columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   **/
  public ConversionProductReportCreate conversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

  
  @ApiModelProperty(value = "  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.")
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }
  public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
   **/
  public ConversionProductReportCreate conversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

  
  @ApiModelProperty(value = "Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.")
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }
  public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   **/
  public ConversionProductReportCreate conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
   **/
  public ConversionProductReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-23", required = true, value = "  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Report granularity for time-based metric aggregation
   **/
  public ConversionProductReportCreate granularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Report granularity for time-based metric aggregation")
  @JsonProperty("granularity")
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  public ConversionProductReportCreate level(ConversionProductReportLevel level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  public ConversionProductReportLevel getLevel() {
    return level;
  }
  public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   **/
  public ConversionProductReportCreate productSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
  public List<String> getProductSkuIds() {
    return productSkuIds;
  }
  public void setProductSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  /**
   * Name of the conversion product report
   **/
  public ConversionProductReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the conversion product report")
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   **/
  public ConversionProductReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-17", required = true, value = "  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   **/
  public ConversionProductReportCreate viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
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
    return Objects.equals(adGroupIds, conversionProductReportCreate.adGroupIds) &&
        Objects.equals(campaignIds, conversionProductReportCreate.campaignIds) &&
        Objects.equals(campaignObjectiveTypes, conversionProductReportCreate.campaignObjectiveTypes) &&
        Objects.equals(clickWindowDays, conversionProductReportCreate.clickWindowDays) &&
        Objects.equals(columns, conversionProductReportCreate.columns) &&
        Objects.equals(conversionProductAttributionType, conversionProductReportCreate.conversionProductAttributionType) &&
        Objects.equals(conversionProductBreakdown, conversionProductReportCreate.conversionProductBreakdown) &&
        Objects.equals(conversionReportTime, conversionProductReportCreate.conversionReportTime) &&
        Objects.equals(endDate, conversionProductReportCreate.endDate) &&
        Objects.equals(granularity, conversionProductReportCreate.granularity) &&
        Objects.equals(level, conversionProductReportCreate.level) &&
        Objects.equals(productSkuIds, conversionProductReportCreate.productSkuIds) &&
        Objects.equals(reportName, conversionProductReportCreate.reportName) &&
        Objects.equals(startDate, conversionProductReportCreate.startDate) &&
        Objects.equals(viewWindowDays, conversionProductReportCreate.viewWindowDays);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

