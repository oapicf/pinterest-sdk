package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("ConversionProductReportCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionProductReportCreate   {
  private @Valid List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
  private @Valid List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays;
  private @Valid List<ConversionProductReportingColumn> columns = new ArrayList<>();
  private ConversionProductAttributionType conversionProductAttributionType;
  private ConversionProductReportBreakdownType conversionProductBreakdown;
  private ConversionReportTimeType conversionReportTime;
  private String endDate;
  private ConversionProductReportGranularity granularity;
  private ConversionProductReportLevel level;
  private @Valid List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();
  private String reportName;
  private String startDate;
  private ConversionAttributionWindowDays viewWindowDays;

  public ConversionProductReportCreate() {
  }

  @JsonCreator
  public ConversionProductReportCreate(
    @JsonProperty(required = true, value = "columns") List<ConversionProductReportingColumn> columns,
    @JsonProperty(required = true, value = "end_date") String endDate,
    @JsonProperty(required = true, value = "granularity") ConversionProductReportGranularity granularity,
    @JsonProperty(required = true, value = "level") ConversionProductReportLevel level,
    @JsonProperty(required = true, value = "report_name") String reportName,
    @JsonProperty(required = true, value = "start_date") String startDate
  ) {
    this.columns = columns;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
  }

  /**
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   **/
  public ConversionProductReportCreate adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
   @Size(min=1,max=500)public List< @Pattern(regexp="^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  @JsonProperty("ad_group_ids")
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public ConversionProductReportCreate addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }

    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  public ConversionProductReportCreate removeAdGroupIdsItem(String adGroupIdsItem) {
    if (adGroupIdsItem != null && this.adGroupIds != null) {
      this.adGroupIds.remove(adGroupIdsItem);
    }

    return this;
  }
  /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   **/
  public ConversionProductReportCreate campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")
  @JsonProperty("campaign_ids")
   @Size(min=1,max=500)public List< @Pattern(regexp="^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public ConversionProductReportCreate addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }

    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  public ConversionProductReportCreate removeCampaignIdsItem(String campaignIdsItem) {
    if (campaignIdsItem != null && this.campaignIds != null) {
      this.campaignIds.remove(campaignIdsItem);
    }

    return this;
  }
  /**
   * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
   **/
  public ConversionProductReportCreate campaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @JsonProperty("campaign_objective_types")
   @Size(min=1,max=7)public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  @JsonProperty("campaign_objective_types")
  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportCreate addCampaignObjectiveTypesItem(ConversionObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<>();
    }

    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

  public ConversionProductReportCreate removeCampaignObjectiveTypesItem(ConversionObjectiveType campaignObjectiveTypesItem) {
    if (campaignObjectiveTypesItem != null && this.campaignObjectiveTypes != null) {
      this.campaignObjectiveTypes.remove(campaignObjectiveTypesItem);
    }

    return this;
  }
  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
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

  @JsonProperty("click_window_days")
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
  @JsonProperty(required = true, value = "columns")
  @NotNull public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }

  @JsonProperty(required = true, value = "columns")
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  public ConversionProductReportCreate addColumnsItem(ConversionProductReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public ConversionProductReportCreate removeColumnsItem(ConversionProductReportingColumn columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
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

  @JsonProperty("conversion_product_attribution_type")
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

  @JsonProperty("conversion_product_breakdown")
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

  @JsonProperty("conversion_report_time")
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
  @JsonProperty(required = true, value = "end_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty(required = true, value = "end_date")
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
  @JsonProperty(required = true, value = "granularity")
  @NotNull public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }

  @JsonProperty(required = true, value = "granularity")
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
  @JsonProperty(required = true, value = "level")
  @NotNull public ConversionProductReportLevel getLevel() {
    return level;
  }

  @JsonProperty(required = true, value = "level")
  public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   **/
  public ConversionProductReportCreate productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
   @Size(min=2,max=30000)public List< @Pattern(regexp="^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  @JsonProperty("product_sku_ids")
  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  public ConversionProductReportCreate addProductSkuIdsItem(String productSkuIdsItem) {
    if (this.productSkuIds == null) {
      this.productSkuIds = new ArrayList<>();
    }

    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

  public ConversionProductReportCreate removeProductSkuIdsItem(String productSkuIdsItem) {
    if (productSkuIdsItem != null && this.productSkuIds != null) {
      this.productSkuIds.remove(productSkuIdsItem);
    }

    return this;
  }
  /**
   * Name of the conversion product report
   **/
  public ConversionProductReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the conversion product report")
  @JsonProperty(required = true, value = "report_name")
  @NotNull public String getReportName() {
    return reportName;
  }

  @JsonProperty(required = true, value = "report_name")
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
  @JsonProperty(required = true, value = "start_date")
  @NotNull  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty(required = true, value = "start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
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

  @JsonProperty("view_window_days")
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
