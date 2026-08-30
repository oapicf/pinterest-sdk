package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
   **/
  
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  
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
  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   **/
  
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
  
  @ApiModelProperty(example = "2024-04-23", required = true, value = "  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Report granularity for time-based metric aggregation
   **/
  
  @ApiModelProperty(required = true, value = "Report granularity for time-based metric aggregation")
  @JsonProperty("granularity")
  @NotNull
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  public ConversionProductReportLevel getLevel() {
    return level;
  }
  public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   **/
  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
 @Size(min=2,max=30000)  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }
  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  /**
   * Name of the conversion product report
   **/
  
  @ApiModelProperty(required = true, value = "Name of the conversion product report")
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   **/
  
  @ApiModelProperty(example = "2024-04-17", required = true, value = "  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
   **/
  
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

