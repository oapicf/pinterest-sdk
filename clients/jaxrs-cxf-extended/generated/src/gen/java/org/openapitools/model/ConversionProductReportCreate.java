package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();

 /**
  *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();

 /**
  * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  */
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @Valid
  private List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays clickWindowDays;

 /**
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @Valid
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

 /**
  *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  */
  @ApiModelProperty(value = "  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.")
  @Valid
  private ConversionProductAttributionType conversionProductAttributionType;

 /**
  * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  */
  @ApiModelProperty(value = "Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.")
  @Valid
  private ConversionProductReportBreakdownType conversionProductBreakdown;

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  */
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @Valid
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
  @Valid
  private ConversionProductReportGranularity granularity;

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")
  @Valid
  private ConversionProductReportLevel level;

 /**
  *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  */
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();

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
  @Valid
  private ConversionAttributionWindowDays viewWindowDays;
 /**
  *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
  * @return adGroupIds
  */
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
 public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
  public ConversionProductReportCreate adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroupIds</code> list.
   */
  public ConversionProductReportCreate addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

 /**
  *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
  * @return campaignIds
  */
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public ConversionProductReportCreate campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
  public ConversionProductReportCreate addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
  * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
  * @return campaignObjectiveTypes
  */
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
 public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
  public ConversionProductReportCreate campaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignObjectiveTypes</code> list.
   */
  public ConversionProductReportCreate addCampaignObjectiveTypesItem(ConversionObjectiveType campaignObjectiveTypesItem) {
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  * @return clickWindowDays
  */
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
 public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
  public ConversionProductReportCreate clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
  * Metric and entity columns
  * @return columns
  */
  @JsonProperty("columns")
  @NotNull
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
 public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
  public ConversionProductReportCreate columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Adds a new item to the <code>columns</code> list.
   */
  public ConversionProductReportCreate addColumnsItem(ConversionProductReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
  *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
  * @return conversionProductAttributionType
  */
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  /**
   * Sets the <code>conversionProductAttributionType</code> property.
   */
 public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   * Sets the <code>conversionProductAttributionType</code> property.
   */
  public ConversionProductReportCreate conversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

 /**
  * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
  * @return conversionProductBreakdown
  */
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  /**
   * Sets the <code>conversionProductBreakdown</code> property.
   */
 public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  /**
   * Sets the <code>conversionProductBreakdown</code> property.
   */
  public ConversionProductReportCreate conversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @return conversionReportTime
  */
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  /**
   * Sets the <code>conversionReportTime</code> property.
   */
 public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * Sets the <code>conversionReportTime</code> property.
   */
  public ConversionProductReportCreate conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

 /**
  *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
  * @return endDate
  */
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public ConversionProductReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * Report granularity for time-based metric aggregation
  * @return granularity
  */
  @JsonProperty("granularity")
  @NotNull
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
 public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
  public ConversionProductReportCreate granularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
  * Level of the report
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public ConversionProductReportLevel getLevel() {
    return level;
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public ConversionProductReportCreate level(ConversionProductReportLevel level) {
    this.level = level;
    return this;
  }

 /**
  *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  * @return productSkuIds
  */
  @JsonProperty("product_sku_ids")
 @Size(min=2,max=30000)  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  /**
   * Sets the <code>productSkuIds</code> property.
   */
 public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  /**
   * Sets the <code>productSkuIds</code> property.
   */
  public ConversionProductReportCreate productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  /**
   * Adds a new item to the <code>productSkuIds</code> list.
   */
  public ConversionProductReportCreate addProductSkuIdsItem(String productSkuIdsItem) {
    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

 /**
  * Name of the conversion product report
  * @return reportName
  */
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }

  /**
   * Sets the <code>reportName</code> property.
   */
 public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Sets the <code>reportName</code> property.
   */
  public ConversionProductReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
  *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public ConversionProductReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
  * @return viewWindowDays
  */
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
 public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
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

