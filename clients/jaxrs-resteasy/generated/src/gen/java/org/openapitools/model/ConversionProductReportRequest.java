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
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Request for a brand, category, SKU report")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionProductReportRequest   {
  
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

  /**
   * Gets or Sets conversionProductAttributionType
   */
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
      return String.valueOf(value);
    }
  }

  private ConversionProductAttributionTypeEnum conversionProductAttributionType;

  /**
   * Gets or Sets conversionProductBreakdown
   */
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
      return String.valueOf(value);
    }
  }

  private ConversionProductBreakdownEnum conversionProductBreakdown;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private String endDate;

  /**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly.
   */
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
      return String.valueOf(value);
    }
  }

  private GranularityEnum granularity;

  /**
   * Level of the report
   */
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
      return String.valueOf(value);
    }
  }

  private LevelEnum level;
  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();
  private String reportName;
  private String startDate;
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30;

  /**
   * List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP.
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN.
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.")
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
 @Size(min=1,max=7)  @Valid
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("click_window_days")
  @Valid
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
  @Valid
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionTypeEnum getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }
  public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   **/
  
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
   **/
  
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @JsonProperty("conversion_report_time")
  @Valid
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports.
   **/
  
  @ApiModelProperty(example = "2024-04-23", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly.
   **/
  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.")
  @JsonProperty("granularity")
  @NotNull
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   **/
  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
 @Size(min=2,max=500)  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }
  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  /**
   * Name of the conversion product report.
   **/
  
  @ApiModelProperty(required = true, value = "Name of the conversion product report.")
  @JsonProperty("report_name")
  @NotNull
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   **/
  
  @ApiModelProperty(example = "2024-03-17", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.")
  @JsonProperty("view_window_days")
  @Valid
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
    return Objects.equals(this.adGroupIds, conversionProductReportRequest.adGroupIds) &&
        Objects.equals(this.campaignIds, conversionProductReportRequest.campaignIds) &&
        Objects.equals(this.campaignObjectiveTypes, conversionProductReportRequest.campaignObjectiveTypes) &&
        Objects.equals(this.clickWindowDays, conversionProductReportRequest.clickWindowDays) &&
        Objects.equals(this.columns, conversionProductReportRequest.columns) &&
        Objects.equals(this.conversionProductAttributionType, conversionProductReportRequest.conversionProductAttributionType) &&
        Objects.equals(this.conversionProductBreakdown, conversionProductReportRequest.conversionProductBreakdown) &&
        Objects.equals(this.conversionReportTime, conversionProductReportRequest.conversionReportTime) &&
        Objects.equals(this.endDate, conversionProductReportRequest.endDate) &&
        Objects.equals(this.granularity, conversionProductReportRequest.granularity) &&
        Objects.equals(this.level, conversionProductReportRequest.level) &&
        Objects.equals(this.productSkuIds, conversionProductReportRequest.productSkuIds) &&
        Objects.equals(this.reportName, conversionProductReportRequest.reportName) &&
        Objects.equals(this.startDate, conversionProductReportRequest.startDate) &&
        Objects.equals(this.viewWindowDays, conversionProductReportRequest.viewWindowDays);
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

