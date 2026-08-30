package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
import org.openapitools.vertxweb.server.model.CreationSource;
import org.openapitools.vertxweb.server.model.DataOutputFormat;
import org.openapitools.vertxweb.server.model.Granularity;
import org.openapitools.vertxweb.server.model.IngestionSource;
import org.openapitools.vertxweb.server.model.MetricsReportingLevel;
import org.openapitools.vertxweb.server.model.ReportingColumn;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public AccountTemplate () {

  }

  public AccountTemplate (String adAccountId, List<String> adAccountIds, List<String> adeColumns, Object attributionType, BigDecimal clickWindowDays, List<ReportingColumn> columns, ConversionReportTimeType conversionReportTimeType, CreationSource creationSource, List<String> customColumnIds, String displayMetadata, BigDecimal engagementWindowDays, String filtersJson, Granularity granularity, String id, List<IngestionSource> ingestionSources, Boolean isDefault, Boolean isDeleted, Boolean isOwnedByUser, Boolean isScheduled, String name, BigDecimal reportEndRelativeDaysInPast, DataOutputFormat reportFormat, MetricsReportingLevel reportLevel, BigDecimal reportStartRelativeDaysInPast, ReportingTimeZone reportingTimeZone, Object sortBy, String type, BigDecimal updatedTime, String userId, BigDecimal viewWindowDays) {
    this.adAccountId = adAccountId;
    this.adAccountIds = adAccountIds;
    this.adeColumns = adeColumns;
    this.attributionType = attributionType;
    this.clickWindowDays = clickWindowDays;
    this.columns = columns;
    this.conversionReportTimeType = conversionReportTimeType;
    this.creationSource = creationSource;
    this.customColumnIds = customColumnIds;
    this.displayMetadata = displayMetadata;
    this.engagementWindowDays = engagementWindowDays;
    this.filtersJson = filtersJson;
    this.granularity = granularity;
    this.id = id;
    this.ingestionSources = ingestionSources;
    this.isDefault = isDefault;
    this.isDeleted = isDeleted;
    this.isOwnedByUser = isOwnedByUser;
    this.isScheduled = isScheduled;
    this.name = name;
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    this.reportFormat = reportFormat;
    this.reportLevel = reportLevel;
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    this.reportingTimeZone = reportingTimeZone;
    this.sortBy = sortBy;
    this.type = type;
    this.updatedTime = updatedTime;
    this.userId = userId;
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("ad_account_ids")
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }
  public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

    
  @JsonProperty("ade_columns")
  public List<String> getAdeColumns() {
    return adeColumns;
  }
  public void setAdeColumns(List<String> adeColumns) {
    this.adeColumns = adeColumns;
  }

    
  @JsonProperty("attribution_type")
  public Object getAttributionType() {
    return attributionType;
  }
  public void setAttributionType(Object attributionType) {
    this.attributionType = attributionType;
  }

    
  @JsonProperty("click_window_days")
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("columns")
  public List<ReportingColumn> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("conversion_report_time_type")
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }
  public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

    
  @JsonProperty("creation_source")
  public CreationSource getCreationSource() {
    return creationSource;
  }
  public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

    
  @JsonProperty("custom_column_ids")
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }
  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

    
  @JsonProperty("display_metadata")
  public String getDisplayMetadata() {
    return displayMetadata;
  }
  public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

    
  @JsonProperty("engagement_window_days")
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

    
  @JsonProperty("filters_json")
  public String getFiltersJson() {
    return filtersJson;
  }
  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

    
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("ingestion_sources")
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }
  public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

    
  @JsonProperty("is_default")
  public Boolean getIsDefault() {
    return isDefault;
  }
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

    
  @JsonProperty("is_deleted")
  public Boolean getIsDeleted() {
    return isDeleted;
  }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

    
  @JsonProperty("is_owned_by_user")
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }
  public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

    
  @JsonProperty("is_scheduled")
  public Boolean getIsScheduled() {
    return isScheduled;
  }
  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("report_end_relative_days_in_past")
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }
  public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

    
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

    
  @JsonProperty("report_level")
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }
  public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

    
  @JsonProperty("report_start_relative_days_in_past")
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }
  public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

    
  @JsonProperty("reporting_time_zone")
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }
  public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

    
  @JsonProperty("sort_by")
  public Object getSortBy() {
    return sortBy;
  }
  public void setSortBy(Object sortBy) {
    this.sortBy = sortBy;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("updated_time")
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

    
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
