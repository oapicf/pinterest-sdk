/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ObjectiveType;



/**
 * Request for a brand, category, SKU report
 */

@ApiModel(description = "Request for a brand, category, SKU report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionProductReportRequest   {
  
  private List<String> adGroupIds = new ArrayList<>();
  private List<String> campaignIds = new ArrayList<>();
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();


  public enum ConversionProductAttributionTypeEnum {
    DEFAULT("DEFAULT"),
    BRAND_ATTRIBUTION("BRAND_ATTRIBUTION");

    private String value;

    ConversionProductAttributionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ConversionProductAttributionTypeEnum conversionProductAttributionType;


  public enum ConversionProductBreakdownEnum {
    PRODUCT_BRAND("PRODUCT_BRAND"),
    PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
    PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
    PRODUCT_SKU("PRODUCT_SKU"),
    PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

    private String value;

    ConversionProductBreakdownEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ConversionProductBreakdownEnum conversionProductBreakdown;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private String endDate;


  public enum GranularityEnum {
    WEEK("WEEK"),
    MONTH("MONTH"),
    TOTAL("TOTAL");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private GranularityEnum granularity;


  public enum LevelEnum {
    ADVERTISER("ADVERTISER"),
    CAMPAIGN("CAMPAIGN"),
    AD_GROUP("AD_GROUP");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private LevelEnum level;
  private List<String> productSkuIds = new ArrayList<>();
  private String reportName;
  private String startDate;
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30;

  /**
   * List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
   */
  public ConversionProductReportRequest adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
   */
  public ConversionProductReportRequest campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.")
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
   */
  public ConversionProductReportRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @JsonProperty("campaign_objective_types")
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   */
  public ConversionProductReportRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
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
   */
  public ConversionProductReportRequest columns(List<ConversionProductReportingColumn> columns) {
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
   */
  public ConversionProductReportRequest conversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionTypeEnum getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }
  public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   */
  public ConversionProductReportRequest conversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductBreakdownEnum getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }
  public void setConversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   */
  public ConversionProductReportRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
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
   * Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
   */
  public ConversionProductReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-23", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
   */
  public ConversionProductReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   */
  public ConversionProductReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   */
  public ConversionProductReportRequest productSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
  public List<String> getProductSkuIds() {
    return productSkuIds;
  }
  public void setProductSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  /**
   * Name of the conversion product report.
   */
  public ConversionProductReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the conversion product report.")
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   */
  public ConversionProductReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-03-17", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
   */
  public ConversionProductReportRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.")
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
    ConversionProductReportRequest conversionProductReportRequest = (ConversionProductReportRequest) o;
    return Objects.equals(adGroupIds, conversionProductReportRequest.adGroupIds) &&
        Objects.equals(campaignIds, conversionProductReportRequest.campaignIds) &&
        Objects.equals(campaignObjectiveTypes, conversionProductReportRequest.campaignObjectiveTypes) &&
        Objects.equals(clickWindowDays, conversionProductReportRequest.clickWindowDays) &&
        Objects.equals(columns, conversionProductReportRequest.columns) &&
        Objects.equals(conversionProductAttributionType, conversionProductReportRequest.conversionProductAttributionType) &&
        Objects.equals(conversionProductBreakdown, conversionProductReportRequest.conversionProductBreakdown) &&
        Objects.equals(conversionReportTime, conversionProductReportRequest.conversionReportTime) &&
        Objects.equals(endDate, conversionProductReportRequest.endDate) &&
        Objects.equals(granularity, conversionProductReportRequest.granularity) &&
        Objects.equals(level, conversionProductReportRequest.level) &&
        Objects.equals(productSkuIds, conversionProductReportRequest.productSkuIds) &&
        Objects.equals(reportName, conversionProductReportRequest.reportName) &&
        Objects.equals(startDate, conversionProductReportRequest.startDate) &&
        Objects.equals(viewWindowDays, conversionProductReportRequest.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupIds, campaignIds, campaignObjectiveTypes, clickWindowDays, columns, conversionProductAttributionType, conversionProductBreakdown, conversionReportTime, endDate, granularity, level, productSkuIds, reportName, startDate, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionProductReportRequest {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

