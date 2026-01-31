package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request for a brand, category, SKU report
 **/
@ApiModel(description = "Request for a brand, category, SKU report")
@JsonTypeName("ConversionProductReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionProductReportRequest   {
  private @Valid List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
  private @Valid List<ObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;
  private @Valid List<ConversionProductReportingColumn> columns = new ArrayList<>();
  public enum ConversionProductAttributionTypeEnum {

    DEFAULT(String.valueOf("DEFAULT")), BRAND_ATTRIBUTION(String.valueOf("BRAND_ATTRIBUTION"));


    private String value;

    ConversionProductAttributionTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionProductAttributionTypeEnum fromString(String s) {
        for (ConversionProductAttributionTypeEnum b : ConversionProductAttributionTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ConversionProductAttributionTypeEnum fromValue(String value) {
        for (ConversionProductAttributionTypeEnum b : ConversionProductAttributionTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ConversionProductAttributionTypeEnum conversionProductAttributionType;
  public enum ConversionProductBreakdownEnum {

    PRODUCT_BRAND(String.valueOf("PRODUCT_BRAND")), PRODUCT_CATEGORY(String.valueOf("PRODUCT_CATEGORY")), PRODUCT_BRAND_AND_CATEGORY(String.valueOf("PRODUCT_BRAND_AND_CATEGORY")), PRODUCT_SKU(String.valueOf("PRODUCT_SKU")), PRODUCT_SKU_GROUP(String.valueOf("PRODUCT_SKU_GROUP"));


    private String value;

    ConversionProductBreakdownEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ConversionProductBreakdownEnum fromString(String s) {
        for (ConversionProductBreakdownEnum b : ConversionProductBreakdownEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static ConversionProductBreakdownEnum fromValue(String value) {
        for (ConversionProductBreakdownEnum b : ConversionProductBreakdownEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private ConversionProductBreakdownEnum conversionProductBreakdown;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private String endDate;
  public enum GranularityEnum {

    WEEK(String.valueOf("WEEK")), MONTH(String.valueOf("MONTH")), TOTAL(String.valueOf("TOTAL"));


    private String value;

    GranularityEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static GranularityEnum fromString(String s) {
        for (GranularityEnum b : GranularityEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static GranularityEnum fromValue(String value) {
        for (GranularityEnum b : GranularityEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private GranularityEnum granularity;
  public enum LevelEnum {

    ADVERTISER(String.valueOf("ADVERTISER")), CAMPAIGN(String.valueOf("CAMPAIGN")), AD_GROUP(String.valueOf("AD_GROUP"));


    private String value;

    LevelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static LevelEnum fromString(String s) {
        for (LevelEnum b : LevelEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static LevelEnum fromValue(String value) {
        for (LevelEnum b : LevelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private LevelEnum level;
  private @Valid List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = new ArrayList<>();
  private String reportName;
  private String startDate;
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30;

  public ConversionProductReportRequest() {
  }

  @JsonCreator
  public ConversionProductReportRequest(
    @JsonProperty(required = true, value = "columns") List<ConversionProductReportingColumn> columns,
    @JsonProperty(required = true, value = "end_date") String endDate,
    @JsonProperty(required = true, value = "granularity") GranularityEnum granularity,
    @JsonProperty(required = true, value = "level") LevelEnum level,
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
   * List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP.
   **/
  public ConversionProductReportRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.")
  @JsonProperty("ad_group_ids")
   @Size(min=1,max=500)public List< @Pattern(regexp="^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  @JsonProperty("ad_group_ids")
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public ConversionProductReportRequest addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }

    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  public ConversionProductReportRequest removeAdGroupIdsItem(String adGroupIdsItem) {
    if (adGroupIdsItem != null && this.adGroupIds != null) {
      this.adGroupIds.remove(adGroupIdsItem);
    }

    return this;
  }
  /**
   * List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN.
   **/
  public ConversionProductReportRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.")
  @JsonProperty("campaign_ids")
   @Size(min=1,max=500)public List< @Pattern(regexp="^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public ConversionProductReportRequest addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }

    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  public ConversionProductReportRequest removeCampaignIdsItem(String campaignIdsItem) {
    if (campaignIdsItem != null && this.campaignIds != null) {
      this.campaignIds.remove(campaignIdsItem);
    }

    return this;
  }
  /**
   * List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;].
   **/
  public ConversionProductReportRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
  @JsonProperty("campaign_objective_types")
   @Size(min=1,max=7)public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  @JsonProperty("campaign_objective_types")
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<>();
    }

    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

  public ConversionProductReportRequest removeCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    if (campaignObjectiveTypesItem != null && this.campaignObjectiveTypes != null) {
      this.campaignObjectiveTypes.remove(campaignObjectiveTypesItem);
    }

    return this;
  }
  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  public ConversionProductReportRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
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
  public ConversionProductReportRequest columns(List<ConversionProductReportingColumn> columns) {
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

  public ConversionProductReportRequest addColumnsItem(ConversionProductReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public ConversionProductReportRequest removeColumnsItem(ConversionProductReportingColumn columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
  }
  /**
   **/
  public ConversionProductReportRequest conversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionTypeEnum getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  @JsonProperty("conversion_product_attribution_type")
  public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  /**
   **/
  public ConversionProductReportRequest conversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductBreakdownEnum getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  @JsonProperty("conversion_product_breakdown")
  public void setConversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   **/
  public ConversionProductReportRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
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
   * Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports.
   **/
  public ConversionProductReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-23", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.")
  @JsonProperty(required = true, value = "end_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getEndDate() {
    return endDate;
  }

  @JsonProperty(required = true, value = "end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly.
   **/
  public ConversionProductReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.")
  @JsonProperty(required = true, value = "granularity")
  @NotNull public GranularityEnum getGranularity() {
    return granularity;
  }

  @JsonProperty(required = true, value = "granularity")
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  public ConversionProductReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Level of the report")
  @JsonProperty(required = true, value = "level")
  @NotNull public LevelEnum getLevel() {
    return level;
  }

  @JsonProperty(required = true, value = "level")
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  /**
   * List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   **/
  public ConversionProductReportRequest productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  
  @ApiModelProperty(example = "[\"WBC45678\",\"WBC45679\"]", value = "List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
  @JsonProperty("product_sku_ids")
   @Size(min=2,max=500)public List< @Pattern(regexp="^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  @JsonProperty("product_sku_ids")
  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  public ConversionProductReportRequest addProductSkuIdsItem(String productSkuIdsItem) {
    if (this.productSkuIds == null) {
      this.productSkuIds = new ArrayList<>();
    }

    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

  public ConversionProductReportRequest removeProductSkuIdsItem(String productSkuIdsItem) {
    if (productSkuIdsItem != null && this.productSkuIds != null) {
      this.productSkuIds.remove(productSkuIdsItem);
    }

    return this;
  }
  /**
   * Name of the conversion product report.
   **/
  public ConversionProductReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Name of the conversion product report.")
  @JsonProperty(required = true, value = "report_name")
  @NotNull public String getReportName() {
    return reportName;
  }

  @JsonProperty(required = true, value = "report_name")
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   **/
  public ConversionProductReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2024-03-17", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
  @JsonProperty(required = true, value = "start_date")
  @NotNull  @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")public String getStartDate() {
    return startDate;
  }

  @JsonProperty(required = true, value = "start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day.
   **/
  public ConversionProductReportRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.")
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

