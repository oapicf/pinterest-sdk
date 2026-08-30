package apimodels;

import apimodels.ConversionAttributionWindowDays;
import apimodels.ConversionObjectiveType;
import apimodels.ConversionProductAttributionType;
import apimodels.ConversionProductReportBreakdownType;
import apimodels.ConversionProductReportGranularity;
import apimodels.ConversionProductReportLevel;
import apimodels.ConversionProductReportingColumn;
import apimodels.ConversionReportTimeType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionProductReportCreate   {
  @JsonProperty("ad_group_ids")
  @Size(min=1,max=500)

  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = null;

  @JsonProperty("campaign_ids")
  @Size(min=1,max=500)

  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = null;

  @JsonProperty("campaign_objective_types")
  @Size(min=1,max=7)
@Valid

  private List<ConversionObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("click_window_days")
  @Valid

  private ConversionAttributionWindowDays clickWindowDays;

  @JsonProperty("columns")
  @NotNull
@Valid

  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

  @JsonProperty("conversion_product_attribution_type")
  @Valid

  private ConversionProductAttributionType conversionProductAttributionType;

  @JsonProperty("conversion_product_breakdown")
  @Valid

  private ConversionProductReportBreakdownType conversionProductBreakdown;

  @JsonProperty("conversion_report_time")
  @Valid

  private ConversionReportTimeType conversionReportTime;

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("granularity")
  @NotNull
@Valid

  private ConversionProductReportGranularity granularity;

  @JsonProperty("level")
  @NotNull
@Valid

  private ConversionProductReportLevel level;

  @JsonProperty("product_sku_ids")
  @Size(min=2,max=30000)

  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = null;

  @JsonProperty("report_name")
  @NotNull

  private String reportName;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  @JsonProperty("view_window_days")
  @Valid

  private ConversionAttributionWindowDays viewWindowDays;

  public ConversionProductReportCreate adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public ConversionProductReportCreate addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   *   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
   * @return adGroupIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public ConversionProductReportCreate campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ConversionProductReportCreate addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   *   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
   * @return campaignIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public ConversionProductReportCreate campaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public ConversionProductReportCreate addCampaignObjectiveTypesItem(ConversionObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<>();
    }
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

   /**
   * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
   * @return campaignObjectiveTypes
  **/
  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportCreate clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return clickWindowDays
  **/
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public ConversionProductReportCreate columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ConversionProductReportCreate addColumnsItem(ConversionProductReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Metric and entity columns
   * @return columns
  **/
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  public ConversionProductReportCreate conversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

   /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   * @return conversionProductAttributionType
  **/
  public ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  public ConversionProductReportCreate conversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

   /**
   * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
   * @return conversionProductBreakdown
  **/
  public ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  public ConversionProductReportCreate conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

   /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @return conversionReportTime
  **/
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public ConversionProductReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ConversionProductReportCreate granularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Report granularity for time-based metric aggregation
   * @return granularity
  **/
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }

  public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

  public ConversionProductReportCreate level(ConversionProductReportLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Level of the report
   * @return level
  **/
  public ConversionProductReportLevel getLevel() {
    return level;
  }

  public void setLevel(ConversionProductReportLevel level) {
    this.level = level;
  }

  public ConversionProductReportCreate productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  public ConversionProductReportCreate addProductSkuIdsItem(String productSkuIdsItem) {
    if (this.productSkuIds == null) {
      this.productSkuIds = new ArrayList<>();
    }
    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

   /**
   *   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   * @return productSkuIds
  **/
  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  public ConversionProductReportCreate reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the conversion product report
   * @return reportName
  **/
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ConversionProductReportCreate startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   *   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ConversionProductReportCreate viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @return viewWindowDays
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

