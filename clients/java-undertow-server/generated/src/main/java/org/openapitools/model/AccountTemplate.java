/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CreationSource;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSource;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumn;
import org.openapitools.model.ReportingTimeZone;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AccountTemplate   {
  
  private String adAccountId;
  private List<String> adAccountIds = new ArrayList<>();
  private List<String> adeColumns = new ArrayList<>();
  private Object attributionType = null;
  private BigDecimal clickWindowDays;
  private List<ReportingColumn> columns = new ArrayList<>();
  private ConversionReportTimeType conversionReportTimeType;
  private CreationSource creationSource;
  private List<String> customColumnIds;
  private String displayMetadata;
  private BigDecimal engagementWindowDays;
  private String filtersJson;
  private Granularity granularity;
  private String id;
  private List<IngestionSource> ingestionSources;
  private Boolean isDefault;
  private Boolean isDeleted;
  private Boolean isOwnedByUser;
  private Boolean isScheduled;
  private String name;
  private BigDecimal reportEndRelativeDaysInPast;
  private DataOutputFormat reportFormat;
  private MetricsReportingLevel reportLevel;
  private BigDecimal reportStartRelativeDaysInPast;
  private ReportingTimeZone reportingTimeZone;
  private Object sortBy = null;
  private String type;
  private BigDecimal updatedTime;
  private String userId;
  private BigDecimal viewWindowDays;

  /**
   * ID of the Ad Account that owns the template
   */
  public AccountTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the Ad Account that owns the template")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * IDs of the Ad Accounts that have access to this template
   */
  public AccountTemplate adAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
    return this;
  }

  
  @ApiModelProperty(value = "IDs of the Ad Accounts that have access to this template")
  @JsonProperty("ad_account_ids")
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }
  public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

  /**
   * A list of ADE columns
   */
  public AccountTemplate adeColumns(List<String> adeColumns) {
    this.adeColumns = adeColumns;
    return this;
  }

  
  @ApiModelProperty(example = "[\"ADE_COST_PER_ACTION-download_picture\"]", value = "A list of ADE columns")
  @JsonProperty("ade_columns")
  public List<String> getAdeColumns() {
    return adeColumns;
  }
  public void setAdeColumns(List<String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  /**
   * Attribution type for Brand/Category/SKU reports
   */
  public AccountTemplate attributionType(Object attributionType) {
    this.attributionType = attributionType;
    return this;
  }

  
  @ApiModelProperty(example = "ADVERTISER_LEVEL", value = "Attribution type for Brand/Category/SKU reports")
  @JsonProperty("attribution_type")
  public Object getAttributionType() {
    return attributionType;
  }
  public void setAttributionType(Object attributionType) {
    this.attributionType = attributionType;
  }

  /**
   * The length of the sliding window over which click conversions will be attributed
   */
  public AccountTemplate clickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "The length of the sliding window over which click conversions will be attributed")
  @JsonProperty("click_window_days")
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * A list of columns to be included in the report
   */
  public AccountTemplate columns(List<ReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  
  @ApiModelProperty(value = "A list of columns to be included in the report")
  @JsonProperty("columns")
  public List<ReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * Conversion report time type
   */
  public AccountTemplate conversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
    return this;
  }

  
  @ApiModelProperty(value = "Conversion report time type")
  @JsonProperty("conversion_report_time_type")
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }
  public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  /**
   * The surface used to create this template
   */
  public AccountTemplate creationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
    return this;
  }

  
  @ApiModelProperty(value = "The surface used to create this template")
  @JsonProperty("creation_source")
  public CreationSource getCreationSource() {
    return creationSource;
  }
  public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  /**
   * A list of custom column IDs
   */
  public AccountTemplate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of custom column IDs")
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Additional metadata about this reporting template
   */
  public AccountTemplate displayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

  
  @ApiModelProperty(value = "Additional metadata about this reporting template")
  @JsonProperty("display_metadata")
  public String getDisplayMetadata() {
    return displayMetadata;
  }
  public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  /**
   * The length of the sliding window over which engagement conversions will be attributed
   */
  public AccountTemplate engagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "The length of the sliding window over which engagement conversions will be attributed")
  @JsonProperty("engagement_window_days")
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
   */
  public AccountTemplate filtersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

  
  @ApiModelProperty(value = "A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values")
  @JsonProperty("filters_json")
  public String getFiltersJson() {
    return filtersJson;
  }
  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

  /**
   */
  public AccountTemplate granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Template ID
   */
  public AccountTemplate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Template ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The filter on the conversion ingestion source method for conversion metrics
   */
  public AccountTemplate ingestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
    return this;
  }

  
  @ApiModelProperty(value = "The filter on the conversion ingestion source method for conversion metrics")
  @JsonProperty("ingestion_sources")
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }
  public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  /**
   * A boolean representing if this is the default view that loads for this template type
   */
  public AccountTemplate isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "A boolean representing if this is the default view that loads for this template type")
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * A boolean that indicates if the template has been deleted
   */
  public AccountTemplate isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean that indicates if the template has been deleted")
  @JsonProperty("is_deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * A boolean value that indicates if the user owns the template
   */
  public AccountTemplate isOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean value that indicates if the user owns the template")
  @JsonProperty("is_owned_by_user")
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }
  public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   */
  public AccountTemplate isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

  
  @ApiModelProperty(value = "A boolean value that indicates if this template has been used to create a scheduled report")
  @JsonProperty("is_scheduled")
  public Boolean getIsScheduled() {
    return isScheduled;
  }
  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  /**
   * Template Name
   */
  public AccountTemplate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Template Name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will end
   */
  public AccountTemplate reportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    return this;
  }

  
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will end")
  @JsonProperty("report_end_relative_days_in_past")
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }
  public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  /**
   */
  public AccountTemplate reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   */
  public AccountTemplate reportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("report_level")
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }
  public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will start
   */
  public AccountTemplate reportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    return this;
  }

  
  @ApiModelProperty(value = "The number of days prior to the day the report will be delivered at which the report will start")
  @JsonProperty("report_start_relative_days_in_past")
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }
  public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  /**
   * Timezone for reporting data
   */
  public AccountTemplate reportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
    return this;
  }

  
  @ApiModelProperty(value = "Timezone for reporting data")
  @JsonProperty("reporting_time_zone")
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }
  public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  /**
   * Unified metric sort configuration
   */
  public AccountTemplate sortBy(Object sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  
  @ApiModelProperty(value = "Unified metric sort configuration")
  @JsonProperty("sort_by")
  public Object getSortBy() {
    return sortBy;
  }
  public void setSortBy(Object sortBy) {
    this.sortBy = sortBy;
  }

  /**
   * Type of the template
   */
  public AccountTemplate type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the template")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Time of last update in seconds since Unix epoch
   */
  public AccountTemplate updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Time of last update in seconds since Unix epoch")
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * ID of the user who created the template
   */
  public AccountTemplate userId(String userId) {
    this.userId = userId;
    return this;
  }

  
  @ApiModelProperty(value = "ID of the user who created the template")
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The length of the sliding window over which view conversions will be attributed
   */
  public AccountTemplate viewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "The length of the sliding window over which view conversions will be attributed")
  @JsonProperty("view_window_days")
  public BigDecimal getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(BigDecimal viewWindowDays) {
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
    AccountTemplate accountTemplate = (AccountTemplate) o;
    return Objects.equals(adAccountId, accountTemplate.adAccountId) &&
        Objects.equals(adAccountIds, accountTemplate.adAccountIds) &&
        Objects.equals(adeColumns, accountTemplate.adeColumns) &&
        Objects.equals(attributionType, accountTemplate.attributionType) &&
        Objects.equals(clickWindowDays, accountTemplate.clickWindowDays) &&
        Objects.equals(columns, accountTemplate.columns) &&
        Objects.equals(conversionReportTimeType, accountTemplate.conversionReportTimeType) &&
        Objects.equals(creationSource, accountTemplate.creationSource) &&
        Objects.equals(customColumnIds, accountTemplate.customColumnIds) &&
        Objects.equals(displayMetadata, accountTemplate.displayMetadata) &&
        Objects.equals(engagementWindowDays, accountTemplate.engagementWindowDays) &&
        Objects.equals(filtersJson, accountTemplate.filtersJson) &&
        Objects.equals(granularity, accountTemplate.granularity) &&
        Objects.equals(id, accountTemplate.id) &&
        Objects.equals(ingestionSources, accountTemplate.ingestionSources) &&
        Objects.equals(isDefault, accountTemplate.isDefault) &&
        Objects.equals(isDeleted, accountTemplate.isDeleted) &&
        Objects.equals(isOwnedByUser, accountTemplate.isOwnedByUser) &&
        Objects.equals(isScheduled, accountTemplate.isScheduled) &&
        Objects.equals(name, accountTemplate.name) &&
        Objects.equals(reportEndRelativeDaysInPast, accountTemplate.reportEndRelativeDaysInPast) &&
        Objects.equals(reportFormat, accountTemplate.reportFormat) &&
        Objects.equals(reportLevel, accountTemplate.reportLevel) &&
        Objects.equals(reportStartRelativeDaysInPast, accountTemplate.reportStartRelativeDaysInPast) &&
        Objects.equals(reportingTimeZone, accountTemplate.reportingTimeZone) &&
        Objects.equals(sortBy, accountTemplate.sortBy) &&
        Objects.equals(type, accountTemplate.type) &&
        Objects.equals(updatedTime, accountTemplate.updatedTime) &&
        Objects.equals(userId, accountTemplate.userId) &&
        Objects.equals(viewWindowDays, accountTemplate.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, adAccountIds, adeColumns, attributionType, clickWindowDays, columns, conversionReportTimeType, creationSource, customColumnIds, displayMetadata, engagementWindowDays, filtersJson, granularity, id, ingestionSources, isDefault, isDeleted, isOwnedByUser, isScheduled, name, reportEndRelativeDaysInPast, reportFormat, reportLevel, reportStartRelativeDaysInPast, reportingTimeZone, sortBy, type, updatedTime, userId, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTemplate {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    adAccountIds: ").append(toIndentedString(adAccountIds)).append("\n");
    sb.append("    adeColumns: ").append(toIndentedString(adeColumns)).append("\n");
    sb.append("    attributionType: ").append(toIndentedString(attributionType)).append("\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    conversionReportTimeType: ").append(toIndentedString(conversionReportTimeType)).append("\n");
    sb.append("    creationSource: ").append(toIndentedString(creationSource)).append("\n");
    sb.append("    customColumnIds: ").append(toIndentedString(customColumnIds)).append("\n");
    sb.append("    displayMetadata: ").append(toIndentedString(displayMetadata)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    filtersJson: ").append(toIndentedString(filtersJson)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestionSources: ").append(toIndentedString(ingestionSources)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isOwnedByUser: ").append(toIndentedString(isOwnedByUser)).append("\n");
    sb.append("    isScheduled: ").append(toIndentedString(isScheduled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reportEndRelativeDaysInPast: ").append(toIndentedString(reportEndRelativeDaysInPast)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    reportLevel: ").append(toIndentedString(reportLevel)).append("\n");
    sb.append("    reportStartRelativeDaysInPast: ").append(toIndentedString(reportStartRelativeDaysInPast)).append("\n");
    sb.append("    reportingTimeZone: ").append(toIndentedString(reportingTimeZone)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

