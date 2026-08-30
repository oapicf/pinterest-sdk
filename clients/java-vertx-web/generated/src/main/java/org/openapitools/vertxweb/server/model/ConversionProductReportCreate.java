package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionObjectiveType;
import org.openapitools.vertxweb.server.model.ConversionProductAttributionType;
import org.openapitools.vertxweb.server.model.ConversionProductReportBreakdownType;
import org.openapitools.vertxweb.server.model.ConversionProductReportGranularity;
import org.openapitools.vertxweb.server.model.ConversionProductReportLevel;
import org.openapitools.vertxweb.server.model.ConversionProductReportingColumn;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionProductReportCreate   {
  
  private List<String> adGroupIds = new ArrayList<>();
  private List<String> campaignIds = new ArrayList<>();
  private List<ConversionObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays;
  private List<ConversionProductReportingColumn> columns = new ArrayList<>();
  private ConversionProductAttributionType conversionProductAttributionType;
  private ConversionProductReportBreakdownType conversionProductBreakdown;
  private ConversionReportTimeType conversionReportTime;
  private String endDate;
  private ConversionProductReportGranularity granularity;
  private ConversionProductReportLevel level;
  private List<String> productSkuIds = new ArrayList<>();
  private String reportName;
  private String startDate;
  private ConversionAttributionWindowDays viewWindowDays;

  public ConversionProductReportCreate () {

  }

  public ConversionProductReportCreate (List<String> adGroupIds, List<String> campaignIds, List<ConversionObjectiveType> campaignObjectiveTypes, ConversionAttributionWindowDays clickWindowDays, List<ConversionProductReportingColumn> columns, ConversionProductAttributionType conversionProductAttributionType, ConversionProductReportBreakdownType conversionProductBreakdown, ConversionReportTimeType conversionReportTime, String endDate, ConversionProductReportGranularity granularity, ConversionProductReportLevel level, List<String> productSkuIds, String reportName, String startDate, ConversionAttributionWindowDays viewWindowDays) {
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
  public List<ConversionObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ConversionObjectiveType> campaignObjectiveTypes) {
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
  public ConversionProductAttributionType getConversionProductAttributionType() {
    return conversionProductAttributionType;
  }
  public void setConversionProductAttributionType(ConversionProductAttributionType conversionProductAttributionType) {
    this.conversionProductAttributionType = conversionProductAttributionType;
  }

    
  @JsonProperty("conversion_product_breakdown")
  public ConversionProductReportBreakdownType getConversionProductBreakdown() {
    return conversionProductBreakdown;
  }
  public void setConversionProductBreakdown(ConversionProductReportBreakdownType conversionProductBreakdown) {
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
  public ConversionProductReportGranularity getGranularity() {
    return granularity;
  }
  public void setGranularity(ConversionProductReportGranularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("level")
  public ConversionProductReportLevel getLevel() {
    return level;
  }
  public void setLevel(ConversionProductReportLevel level) {
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
