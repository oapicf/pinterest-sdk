package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionProductReportingColumn;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ObjectiveType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Request for a brand, category, SKU report
 */
@ApiModel(description="Request for a brand, category, SKU report")

public class ConversionProductReportRequest  {
  
 /**
  * List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.")
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();

 /**
  * List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.")
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();

 /**
  * List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
  */
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @Valid
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;

 /**
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @Valid
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

public enum ConversionProductAttributionTypeEnum {

    @JsonProperty("DEFAULT") DEFAULT(String.valueOf("DEFAULT")),
    @JsonProperty("BRAND_ATTRIBUTION") BRAND_ATTRIBUTION(String.valueOf("BRAND_ATTRIBUTION"));

    private String value;

    ConversionProductAttributionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductAttributionTypeEnum fromValue(String value) {
        for (ConversionProductAttributionTypeEnum b : ConversionProductAttributionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ConversionProductAttributionTypeEnum conversionProductAttributionType;

public enum ConversionProductBreakdownEnum {

    @JsonProperty("PRODUCT_BRAND") PRODUCT_BRAND(String.valueOf("PRODUCT_BRAND")),
    @JsonProperty("PRODUCT_CATEGORY") PRODUCT_CATEGORY(String.valueOf("PRODUCT_CATEGORY")),
    @JsonProperty("PRODUCT_BRAND_AND_CATEGORY") PRODUCT_BRAND_AND_CATEGORY(String.valueOf("PRODUCT_BRAND_AND_CATEGORY")),
    @JsonProperty("PRODUCT_SKU") PRODUCT_SKU(String.valueOf("PRODUCT_SKU")),
    @JsonProperty("PRODUCT_SKU_GROUP") PRODUCT_SKU_GROUP(String.valueOf("PRODUCT_SKU_GROUP"));

    private String value;

    ConversionProductBreakdownEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductBreakdownEnum fromValue(String value) {
        for (ConversionProductBreakdownEnum b : ConversionProductBreakdownEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "")
  private ConversionProductBreakdownEnum conversionProductBreakdown;

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  */
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @Valid
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
  */
  @ApiModelProperty(example = "2024-04-23", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.")
  private String endDate;

public enum GranularityEnum {

    @JsonProperty("WEEK") WEEK(String.valueOf("WEEK")),
    @JsonProperty("MONTH") MONTH(String.valueOf("MONTH")),
    @JsonProperty("TOTAL") TOTAL(String.valueOf("TOTAL"));

    private String value;

    GranularityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static GranularityEnum fromValue(String value) {
        for (GranularityEnum b : GranularityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
  */
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.")
  private GranularityEnum granularity;

public enum LevelEnum {

    @JsonProperty("ADVERTISER") ADVERTISER(String.valueOf("ADVERTISER")),
    @JsonProperty("CAMPAIGN") CAMPAIGN(String.valueOf("CAMPAIGN")),
    @JsonProperty("AD_GROUP") AD_GROUP(String.valueOf("AD_GROUP"));

    private String value;

    LevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")
  private LevelEnum level;

 /**
  * List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  */
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();

 /**
  * Name of the conversion product report.
  */
  @ApiModelProperty(required = true, value = "Name of the conversion product report.")
  private String reportName;

 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  */
  @ApiModelProperty(example = "2024-03-17", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  private String startDate;

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.")
  @Valid
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30;
 /**
  * List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP.
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
  public ConversionProductReportRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroupIds</code> list.
   */
  public ConversionProductReportRequest addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

 /**
  * List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN.
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
  public ConversionProductReportRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
  public ConversionProductReportRequest addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
  * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
  * @return campaignObjectiveTypes
  */
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
 public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
  public ConversionProductReportRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignObjectiveTypes</code> list.
   */
  public ConversionProductReportRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
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
  public ConversionProductReportRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
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
  public ConversionProductReportRequest columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Adds a new item to the <code>columns</code> list.
   */
  public ConversionProductReportRequest addColumnsItem(ConversionProductReportingColumn columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
  * Get conversionProductAttributionType
  * @return conversionProductAttributionType
  */
  @JsonProperty("conversion_product_attribution_type")
  public String getConversionProductAttributionType() {
    return conversionProductAttributionType == null ? null : conversionProductAttributionType.value();
  }

  /**
   * Sets the <code>conversionProductAttributionType</code> property.
   */
 public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   * Sets the <code>conversionProductAttributionType</code> property.
   */
  public ConversionProductReportRequest conversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

 /**
  * Get conversionProductBreakdown
  * @return conversionProductBreakdown
  */
  @JsonProperty("conversion_product_breakdown")
  public String getConversionProductBreakdown() {
    return conversionProductBreakdown == null ? null : conversionProductBreakdown.value();
  }

  /**
   * Sets the <code>conversionProductBreakdown</code> property.
   */
 public void setConversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  /**
   * Sets the <code>conversionProductBreakdown</code> property.
   */
  public ConversionProductReportRequest conversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
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
  public ConversionProductReportRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports.
  * @return endDate
  */
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
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
  public ConversionProductReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly.
  * @return granularity
  */
  @JsonProperty("granularity")
  @NotNull
  public String getGranularity() {
    return granularity == null ? null : granularity.value();
  }

  /**
   * Sets the <code>granularity</code> property.
   */
 public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
  public ConversionProductReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
  * Level of the report
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public String getLevel() {
    return level == null ? null : level.value();
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public ConversionProductReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

 /**
  * List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
  * @return productSkuIds
  */
  @JsonProperty("product_sku_ids")
 @Size(min=2,max=500)  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
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
  public ConversionProductReportRequest productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  /**
   * Adds a new item to the <code>productSkuIds</code> list.
   */
  public ConversionProductReportRequest addProductSkuIdsItem(String productSkuIdsItem) {
    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

 /**
  * Name of the conversion product report.
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
  public ConversionProductReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required.
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
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
  public ConversionProductReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day.
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
  public ConversionProductReportRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

