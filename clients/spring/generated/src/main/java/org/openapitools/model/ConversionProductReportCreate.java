package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "ConversionProductReportCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionProductReportCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionAttributionWindowDays clickWindowDays;

  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionProductAttributionType conversionProductAttributionType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionProductReportBreakdownType conversionProductBreakdown;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionReportTimeType conversionReportTime;

  private String endDate;

  private ConversionProductReportGranularity granularity;

  private ConversionProductReportLevel level;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();

  private String reportName;

  private String startDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionAttributionWindowDays viewWindowDays;

  public ConversionProductReportCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionProductReportCreate(List<ConversionProductReportingColumn> columns, String endDate, ConversionProductReportGranularity granularity, ConversionProductReportLevel level, String reportName, String startDate) {
    this.columns = columns;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.reportName = reportName;
    this.startDate = startDate;
  }

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
   */
  @Size(min = 1, max = 500) 
  @Schema(name = "ad_group_ids", example = "[\"12345678\"]", description = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  @JsonProperty("ad_group_ids")
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
   */
  @Size(min = 1, max = 500) 
  @Schema(name = "campaign_ids", example = "[\"12345678\"]", description = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
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
   */
  @Valid @Size(min = 1, max = 7) 
  @Schema(name = "campaign_objective_types", description = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_objective_types")
  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  @JsonProperty("campaign_objective_types")
  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportCreate clickWindowDays(@Nullable ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return clickWindowDays
   */
  @Valid 
  @Schema(name = "click_window_days", description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(@Nullable ConversionAttributionWindowDays clickWindowDays) {
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
   */
  @NotNull @Valid 
  @Schema(name = "columns", description = "Metric and entity columns", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("columns")
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  public ConversionProductReportCreate conversionProductAttributionType(@Nullable ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

  /**
   *   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
   * @return conversionProductAttributionType
   */
  @Valid 
  @Schema(name = "conversion_product_attribution_type", description = "  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_product_attribution_type")
  public @Nullable ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  @JsonProperty("conversion_product_attribution_type")
  public void setConversionProductAttributionType(@Nullable ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  public ConversionProductReportCreate conversionProductBreakdown(@Nullable ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

  /**
   * Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
   * @return conversionProductBreakdown
   */
  @Valid 
  @Schema(name = "conversion_product_breakdown", description = "Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_product_breakdown")
  public @Nullable ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  @JsonProperty("conversion_product_breakdown")
  public void setConversionProductBreakdown(@Nullable ConversionProductReportBreakdownType conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  public ConversionProductReportCreate conversionReportTime(@Nullable ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @return conversionReportTime
   */
  @Valid 
  @Schema(name = "conversion_report_time", description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_report_time")
  public @Nullable ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  @JsonProperty("conversion_report_time")
  public void setConversionReportTime(@Nullable ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public ConversionProductReportCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   *   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
   * @return endDate
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", example = "2024-04-23", description = "  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
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
   */
  @NotNull @Valid 
  @Schema(name = "granularity", description = "Report granularity for time-based metric aggregation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granularity")
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }

  @JsonProperty("granularity")
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
   */
  @NotNull @Valid 
  @Schema(name = "level", description = "Level of the report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("level")
  public ConversionProductReportLevel getLevel() {
    return level;
  }

  @JsonProperty("level")
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
   */
  @Size(min = 2, max = 30000) 
  @Schema(name = "product_sku_ids", example = "[\"WBC45678\",\"WBC45679\"]", description = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_sku_ids")
  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  @JsonProperty("product_sku_ids")
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
   */
  @NotNull 
  @Schema(name = "report_name", description = "Name of the conversion product report", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }

  @JsonProperty("report_name")
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
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", example = "2024-04-17", description = "  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ConversionProductReportCreate viewWindowDays(@Nullable ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @return viewWindowDays
   */
  @Valid 
  @Schema(name = "view_window_days", description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(@Nullable ConversionAttributionWindowDays viewWindowDays) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

