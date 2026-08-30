package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AnyType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CreationSource;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSource;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ReportingColumn;
import org.openapitools.model.ReportingTimeZone;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AccountTemplate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * ID of the Ad Account that owns the template
   */
  @JsonProperty("ad_account_id")
  private String adAccountId;

  /**
   * IDs of the Ad Accounts that have access to this template
   */
  @JsonProperty("ad_account_ids")
  private List<String> adAccountIds = new ArrayList<>();

  /**
   * A list of ADE columns
   */
  @JsonProperty("ade_columns")
  private List<String> adeColumns = new ArrayList<>();

  /**
   * Attribution type for Brand/Category/SKU reports
   */
  @JsonProperty("attribution_type")
  private AnyType attributionType = null;

  /**
   * The length of the sliding window over which click conversions will be attributed
   */
  @JsonProperty("click_window_days")
  private BigDecimal clickWindowDays;

  /**
   * A list of columns to be included in the report
   */
  @JsonProperty("columns")
  private List<ReportingColumn> columns = new ArrayList<>();

  /**
   * Conversion report time type
   */
  @JsonProperty("conversion_report_time_type")
  private ConversionReportTimeType conversionReportTimeType;

  /**
   * The surface used to create this template
   */
  @JsonProperty("creation_source")
  private CreationSource creationSource;

  /**
   * A list of custom column IDs
   */
  @JsonProperty("custom_column_ids")
  private List<String> customColumnIds;

  /**
   * Additional metadata about this reporting template
   */
  @JsonProperty("display_metadata")
  private String displayMetadata;

  /**
   * The length of the sliding window over which engagement conversions will be attributed
   */
  @JsonProperty("engagement_window_days")
  private BigDecimal engagementWindowDays;

  /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values
   */
  @JsonProperty("filters_json")
  private String filtersJson;

  @JsonProperty("granularity")
  private Granularity granularity;

  /**
   * Template ID
   */
  @JsonProperty("id")
  private String id;

  /**
   * The filter on the conversion ingestion source method for conversion metrics
   */
  @JsonProperty("ingestion_sources")
  private List<IngestionSource> ingestionSources;

  /**
   * A boolean representing if this is the default view that loads for this template type
   */
  @JsonProperty("is_default")
  private Boolean isDefault;

  /**
   * A boolean that indicates if the template has been deleted
   */
  @JsonProperty("is_deleted")
  private Boolean isDeleted;

  /**
   * A boolean value that indicates if the user owns the template
   */
  @JsonProperty("is_owned_by_user")
  private Boolean isOwnedByUser;

  /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   */
  @JsonProperty("is_scheduled")
  private Boolean isScheduled;

  /**
   * Template Name
   */
  @JsonProperty("name")
  private String name;

  /**
   * The number of days prior to the day the report will be delivered at which the report will end
   */
  @JsonProperty("report_end_relative_days_in_past")
  private BigDecimal reportEndRelativeDaysInPast;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat;

  @JsonProperty("report_level")
  private MetricsReportingLevel reportLevel;

  /**
   * The number of days prior to the day the report will be delivered at which the report will start
   */
  @JsonProperty("report_start_relative_days_in_past")
  private BigDecimal reportStartRelativeDaysInPast;

  /**
   * Timezone for reporting data
   */
  @JsonProperty("reporting_time_zone")
  private ReportingTimeZone reportingTimeZone;

  /**
   * Unified metric sort configuration
   */
  @JsonProperty("sort_by")
  private AnyType sortBy = null;

  /**
   * Type of the template
   */
  @JsonProperty("type")
  private String type;

  /**
   * Time of last update in seconds since Unix epoch
   */
  @JsonProperty("updated_time")
  private BigDecimal updatedTime;

  /**
   * ID of the user who created the template
   */
  @JsonProperty("user_id")
  private String userId;

  /**
   * The length of the sliding window over which view conversions will be attributed
   */
  @JsonProperty("view_window_days")
  private BigDecimal viewWindowDays;

  /**
   * ID of the Ad Account that owns the template
   * @return adAccountId
   */
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * IDs of the Ad Accounts that have access to this template
   * @return adAccountIds
   */
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }

  public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

  /**
   * A list of ADE columns
   * @return adeColumns
   */
  public List<String> getAdeColumns() {
    return adeColumns;
  }

  public void setAdeColumns(List<String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  /**
   * Attribution type for Brand/Category/SKU reports
   * @return attributionType
   */
  public AnyType getAttributionType() {
    return attributionType;
  }

  public void setAttributionType(AnyType attributionType) {
    this.attributionType = attributionType;
  }

  /**
   * The length of the sliding window over which click conversions will be attributed
   * @return clickWindowDays
   */
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * A list of columns to be included in the report
   * @return columns
   */
  public List<ReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  /**
   * Conversion report time type
   * @return conversionReportTimeType
   */
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }

  public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  /**
   * The surface used to create this template
   * @return creationSource
   */
  public CreationSource getCreationSource() {
    return creationSource;
  }

  public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  /**
   * A list of custom column IDs
   * @return customColumnIds
   */
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  /**
   * Additional metadata about this reporting template
   * @return displayMetadata
   */
  public String getDisplayMetadata() {
    return displayMetadata;
  }

  public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  /**
   * The length of the sliding window over which engagement conversions will be attributed
   * @return engagementWindowDays
   */
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values
   * @return filtersJson
   */
  public String getFiltersJson() {
    return filtersJson;
  }

  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

  /**
   * 
   * @return granularity
   */
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Template ID
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The filter on the conversion ingestion source method for conversion metrics
   * @return ingestionSources
   */
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }

  public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  /**
   * A boolean representing if this is the default view that loads for this template type
   * @return isDefault
   */
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  /**
   * A boolean that indicates if the template has been deleted
   * @return isDeleted
   */
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * A boolean value that indicates if the user owns the template
   * @return isOwnedByUser
   */
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }

  public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   * @return isScheduled
   */
  public Boolean getIsScheduled() {
    return isScheduled;
  }

  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  /**
   * Template Name
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will end
   * @return reportEndRelativeDaysInPast
   */
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }

  public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  /**
   * 
   * @return reportFormat
   */
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * 
   * @return reportLevel
   */
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }

  public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  /**
   * The number of days prior to the day the report will be delivered at which the report will start
   * @return reportStartRelativeDaysInPast
   */
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }

  public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  /**
   * Timezone for reporting data
   * @return reportingTimeZone
   */
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }

  public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  /**
   * Unified metric sort configuration
   * @return sortBy
   */
  public AnyType getSortBy() {
    return sortBy;
  }

  public void setSortBy(AnyType sortBy) {
    this.sortBy = sortBy;
  }

  /**
   * Type of the template
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * Time of last update in seconds since Unix epoch
   * @return updatedTime
   */
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * ID of the user who created the template
   * @return userId
   */
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  /**
   * The length of the sliding window over which view conversions will be attributed
   * @return viewWindowDays
   */
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
    return Objects.equals(this.adAccountId, accountTemplate.adAccountId) &&
        Objects.equals(this.adAccountIds, accountTemplate.adAccountIds) &&
        Objects.equals(this.adeColumns, accountTemplate.adeColumns) &&
        Objects.equals(this.attributionType, accountTemplate.attributionType) &&
        Objects.equals(this.clickWindowDays, accountTemplate.clickWindowDays) &&
        Objects.equals(this.columns, accountTemplate.columns) &&
        Objects.equals(this.conversionReportTimeType, accountTemplate.conversionReportTimeType) &&
        Objects.equals(this.creationSource, accountTemplate.creationSource) &&
        Objects.equals(this.customColumnIds, accountTemplate.customColumnIds) &&
        Objects.equals(this.displayMetadata, accountTemplate.displayMetadata) &&
        Objects.equals(this.engagementWindowDays, accountTemplate.engagementWindowDays) &&
        Objects.equals(this.filtersJson, accountTemplate.filtersJson) &&
        Objects.equals(this.granularity, accountTemplate.granularity) &&
        Objects.equals(this.id, accountTemplate.id) &&
        Objects.equals(this.ingestionSources, accountTemplate.ingestionSources) &&
        Objects.equals(this.isDefault, accountTemplate.isDefault) &&
        Objects.equals(this.isDeleted, accountTemplate.isDeleted) &&
        Objects.equals(this.isOwnedByUser, accountTemplate.isOwnedByUser) &&
        Objects.equals(this.isScheduled, accountTemplate.isScheduled) &&
        Objects.equals(this.name, accountTemplate.name) &&
        Objects.equals(this.reportEndRelativeDaysInPast, accountTemplate.reportEndRelativeDaysInPast) &&
        Objects.equals(this.reportFormat, accountTemplate.reportFormat) &&
        Objects.equals(this.reportLevel, accountTemplate.reportLevel) &&
        Objects.equals(this.reportStartRelativeDaysInPast, accountTemplate.reportStartRelativeDaysInPast) &&
        Objects.equals(this.reportingTimeZone, accountTemplate.reportingTimeZone) &&
        Objects.equals(this.sortBy, accountTemplate.sortBy) &&
        Objects.equals(this.type, accountTemplate.type) &&
        Objects.equals(this.updatedTime, accountTemplate.updatedTime) &&
        Objects.equals(this.userId, accountTemplate.userId) &&
        Objects.equals(this.viewWindowDays, accountTemplate.viewWindowDays);
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
