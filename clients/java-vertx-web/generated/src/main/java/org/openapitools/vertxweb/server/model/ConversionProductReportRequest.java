package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionProductReportingColumn;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
import org.openapitools.vertxweb.server.model.ObjectiveType;

/**
 * Request for a brand, category, SKU report
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionProductReportRequest () {

  }

  public ConversionProductReportRequest (List<String> adGroupIds, List<String> campaignIds, List<ObjectiveType> campaignObjectiveTypes, ConversionAttributionWindowDays clickWindowDays, List<ConversionProductReportingColumn> columns, ConversionProductAttributionTypeEnum conversionProductAttributionType, ConversionProductBreakdownEnum conversionProductBreakdown, ConversionReportTimeType conversionReportTime, String endDate, GranularityEnum granularity, LevelEnum level, List<String> productSkuIds, String reportName, String startDate, ConversionAttributionWindowDays viewWindowDays) {
    this.adGroupIds = adGroupIds;
    this.campaignIds = campaignIds;
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    this.clickWindowDays = clickWindowDays;
    this.columns = columns;
    this.conversionProductAttributionType = conversionProductAttributionType;
    this.conversionProductBreakdown = conversionProductBreakdown;
    this.conversionReportTime = conversionReportTime;
    this.endDate = endDate;
    this.granularity = granularity;
    this.level = level;
    this.productSkuIds = productSkuIds;
    this.reportName = reportName;
    this.startDate = startDate;
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("ad_group_ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

    
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("campaign_objective_types")
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

    
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("columns")
  public List<ConversionProductReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ConversionProductReportingColumn> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("conversion_product_attribution_type")
  public ConversionProductAttributionTypeEnum getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }
  public void setConversionProductAttributionType(ConversionProductAttributionTypeEnum conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

    
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductBreakdownEnum getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }
  public void setConversionProductBreakdown(ConversionProductBreakdownEnum conversionProductBreakdown) {
    this.conversionProductBreakdown = conversionProductBreakdown;
  }

    
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

    
  @JsonProperty("product_sku_ids")
  public List<String> getProductSkuIds() {
    return productSkuIds;
  }
  public void setProductSkuIds(List<String> productSkuIds) {
    this.productSkuIds = productSkuIds;
  }

    
  @JsonProperty("report_name")
  public String getReportName() {
    return reportName;
  }
  public void setReportName(String reportName) {
    this.reportName = reportName;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
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
