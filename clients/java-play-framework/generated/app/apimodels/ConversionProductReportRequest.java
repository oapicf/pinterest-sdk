package apimodels;

import apimodels.ConversionAttributionWindowDays;
import apimodels.ConversionProductReportingColumn;
import apimodels.ConversionReportTimeType;
import apimodels.ObjectiveType;
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
 * Request for a brand, category, SKU report
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionProductReportRequest   {
  @JsonProperty("ad_group_ids")
  @Size(min=1,max=500)

  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = null;

  @JsonProperty("campaign_ids")
  @Size(min=1,max=500)

  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = null;

  @JsonProperty("campaign_objective_types")
  @Size(min=1,max=7)
@Valid

  private List<ObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("click_window_days")
  @Valid

  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;

  @JsonProperty("columns")
  @NotNull
@Valid

  private List<ConversionProductReportingColumn> columns = new ArrayList<>();

  /**
   * Gets or Sets conversionProductAttributionType
   */
  public enum ConversionProductAttributionTypeEnum {
    DEFAULT("DEFAULT"),
    
    BRAND_ATTRIBUTION("BRAND_ATTRIBUTION");

    private final String value;

    ConversionProductAttributionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("conversion_product_attribution_type")
  
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

    private final String value;

    ConversionProductBreakdownEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("conversion_product_breakdown")
  
  private ConversionProductBreakdownEnum conversionProductBreakdown;

  @JsonProperty("conversion_report_time")
  @Valid

  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String endDate;

  /**
   * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
   */
  public enum GranularityEnum {
    WEEK("WEEK"),
    
    MONTH("MONTH"),
    
    TOTAL("TOTAL");

    private final String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("granularity")
  @NotNull

  private GranularityEnum granularity;

  /**
   * Level of the report
   */
  public enum LevelEnum {
    ADVERTISER("ADVERTISER"),
    
    CAMPAIGN("CAMPAIGN"),
    
    AD_GROUP("AD_GROUP");

    private final String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("level")
  @NotNull

  private LevelEnum level;

  @JsonProperty("product_sku_ids")
  @Size(min=2,max=500)

  private List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds = null;

  @JsonProperty("report_name")
  @NotNull

  private String reportName;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String startDate;

  @JsonProperty("view_window_days")
  @Valid

  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_30;

  public ConversionProductReportRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public ConversionProductReportRequest addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

   /**
   * List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
   * @return adGroupIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public ConversionProductReportRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public ConversionProductReportRequest addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
   * @return campaignIds
  **/
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public ConversionProductReportRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public ConversionProductReportRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
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
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public ConversionProductReportRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
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

  public ConversionProductReportRequest columns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public ConversionProductReportRequest addColumnsItem(ConversionProductReportingColumn columnsItem) {
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

  public ConversionProductReportRequest conversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
    return this;
  }

   /**
   * Get conversionProductAttributionType
   * @return conversionProductAttributionType
  **/
  public ConversionProductAttributionTypeEnum getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }

  public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

  public ConversionProductReportRequest conversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
    return this;
  }

   /**
   * Get conversionProductBreakdown
   * @return conversionProductBreakdown
  **/
  public ConversionProductBreakdownEnum getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }

  public void setConversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

  public ConversionProductReportRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
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

  public ConversionProductReportRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public ConversionProductReportRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
   * @return granularity
  **/
  public GranularityEnum getGranularity() {
    return granularity;
  }

  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

  public ConversionProductReportRequest level(LevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Level of the report
   * @return level
  **/
  public LevelEnum getLevel() {
    return level;
  }

  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  public ConversionProductReportRequest productSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
    return this;
  }

  public ConversionProductReportRequest addProductSkuIdsItem(String productSkuIdsItem) {
    if (this.productSkuIds == null) {
      this.productSkuIds = new ArrayList<>();
    }
    this.productSkuIds.add(productSkuIdsItem);
    return this;
  }

   /**
   * List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
   * @return productSkuIds
  **/
  public List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> getProductSkuIds() {
    return productSkuIds;
  }

  public void setProductSkuIds(List<@Pattern(regexp = "^[a-zA-Z0-9]+$")String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

  public ConversionProductReportRequest reportName(String reportName) {
    this.reportName = reportName;
    return this;
  }

   /**
   * Name of the conversion product report.
   * @return reportName
  **/
  public String getReportName() {
    return reportName;
  }

  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

  public ConversionProductReportRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ConversionProductReportRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

