package apimodels;

import apimodels.ConversionReportTimeType;
import apimodels.CreationSource;
import apimodels.DataOutputFormat;
import apimodels.Granularity;
import apimodels.IngestionSource;
import apimodels.MetricsReportingLevel;
import apimodels.ReportingColumn;
import apimodels.ReportingTimeZone;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AccountTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AccountTemplate   {
  @JsonProperty("ad_account_id")
  
  private String adAccountId;

  @JsonProperty("ad_account_ids")
  
  private List<String> adAccountIds = null;

  @JsonProperty("ade_columns")
  
  private List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns = null;

  @JsonProperty("attribution_type")
  
  private Object attributionType = null;

  @JsonProperty("click_window_days")
  @Valid

  private BigDecimal clickWindowDays;

  @JsonProperty("columns")
  @Valid

  private List<ReportingColumn> columns = null;

  @JsonProperty("conversion_report_time_type")
  @Valid

  private ConversionReportTimeType conversionReportTimeType;

  @JsonProperty("creation_source")
  @Valid

  private CreationSource creationSource;

  @JsonProperty("custom_column_ids")
  
  private List<String> customColumnIds = null;

  @JsonProperty("display_metadata")
  
  private String displayMetadata;

  @JsonProperty("engagement_window_days")
  @Valid

  private BigDecimal engagementWindowDays;

  @JsonProperty("filters_json")
  
  private String filtersJson;

  @JsonProperty("granularity")
  @Valid

  private Granularity granularity;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("ingestion_sources")
  @Valid

  private List<IngestionSource> ingestionSources = null;

  @JsonProperty("is_default")
  
  private Boolean isDefault;

  @JsonProperty("is_deleted")
  
  private Boolean isDeleted;

  @JsonProperty("is_owned_by_user")
  
  private Boolean isOwnedByUser;

  @JsonProperty("is_scheduled")
  
  private Boolean isScheduled;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("report_end_relative_days_in_past")
  @Valid

  private BigDecimal reportEndRelativeDaysInPast;

  @JsonProperty("report_format")
  @Valid

  private DataOutputFormat reportFormat;

  @JsonProperty("report_level")
  @Valid

  private MetricsReportingLevel reportLevel;

  @JsonProperty("report_start_relative_days_in_past")
  @Valid

  private BigDecimal reportStartRelativeDaysInPast;

  @JsonProperty("reporting_time_zone")
  @Valid

  private ReportingTimeZone reportingTimeZone;

  @JsonProperty("sort_by")
  
  private Object sortBy = null;

  @JsonProperty("type")
  
  private String type;

  @JsonProperty("updated_time")
  @Valid

  private BigDecimal updatedTime;

  @JsonProperty("user_id")
  
  private String userId;

  @JsonProperty("view_window_days")
  @Valid

  private BigDecimal viewWindowDays;

  public AccountTemplate adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

   /**
   * ID of the Ad Account that owns the template
   * @return adAccountId
  **/
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public AccountTemplate adAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
    return this;
  }

  public AccountTemplate addAdAccountIdsItem(String adAccountIdsItem) {
    if (this.adAccountIds == null) {
      this.adAccountIds = new ArrayList<>();
    }
    this.adAccountIds.add(adAccountIdsItem);
    return this;
  }

   /**
   * IDs of the Ad Accounts that have access to this template
   * @return adAccountIds
  **/
  public List<String> getAdAccountIds() {
    return adAccountIds;
  }

  public void setAdAccountIds(List<String> adAccountIds) {
    this.adAccountIds = adAccountIds;
  }

  public AccountTemplate adeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
    return this;
  }

  public AccountTemplate addAdeColumnsItem(String adeColumnsItem) {
    if (this.adeColumns == null) {
      this.adeColumns = new ArrayList<>();
    }
    this.adeColumns.add(adeColumnsItem);
    return this;
  }

   /**
   * A list of ADE columns
   * @return adeColumns
  **/
  public List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> getAdeColumns() {
    return adeColumns;
  }

  public void setAdeColumns(List<@Pattern(regexp = "^ADE_[A-Z_]+-[a-zA-Z0-9 _-]*$")String> adeColumns) {
    this.adeColumns = adeColumns;
  }

  public AccountTemplate attributionType(Object attributionType) {
    this.attributionType = attributionType;
    return this;
  }

   /**
   * Attribution type for Brand/Category/SKU reports
   * @return attributionType
  **/
  public Object getAttributionType() {
    return attributionType;
  }

  public void setAttributionType(Object attributionType) {
    this.attributionType = attributionType;
  }

  public AccountTemplate clickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which click conversions will be attributed
   * @return clickWindowDays
  **/
  public BigDecimal getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(BigDecimal clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AccountTemplate columns(List<ReportingColumn> columns) {
    this.columns = columns;
    return this;
  }

  public AccountTemplate addColumnsItem(ReportingColumn columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * A list of columns to be included in the report
   * @return columns
  **/
  public List<ReportingColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumn> columns) {
    this.columns = columns;
  }

  public AccountTemplate conversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
    return this;
  }

   /**
   * Conversion report time type
   * @return conversionReportTimeType
  **/
  public ConversionReportTimeType getConversionReportTimeType() {
    return conversionReportTimeType;
  }

  public void setConversionReportTimeType(ConversionReportTimeType conversionReportTimeType) {
    this.conversionReportTimeType = conversionReportTimeType;
  }

  public AccountTemplate creationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
    return this;
  }

   /**
   * The surface used to create this template
   * @return creationSource
  **/
  public CreationSource getCreationSource() {
    return creationSource;
  }

  public void setCreationSource(CreationSource creationSource) {
    this.creationSource = creationSource;
  }

  public AccountTemplate customColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
    return this;
  }

  public AccountTemplate addCustomColumnIdsItem(String customColumnIdsItem) {
    if (this.customColumnIds == null) {
      this.customColumnIds = new ArrayList<>();
    }
    this.customColumnIds.add(customColumnIdsItem);
    return this;
  }

   /**
   * A list of custom column IDs
   * @return customColumnIds
  **/
  public List<String> getCustomColumnIds() {
    return customColumnIds;
  }

  public void setCustomColumnIds(List<String> customColumnIds) {
    this.customColumnIds = customColumnIds;
  }

  public AccountTemplate displayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
    return this;
  }

   /**
   * Additional metadata about this reporting template
   * @return displayMetadata
  **/
  public String getDisplayMetadata() {
    return displayMetadata;
  }

  public void setDisplayMetadata(String displayMetadata) {
    this.displayMetadata = displayMetadata;
  }

  public AccountTemplate engagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which engagement conversions will be attributed
   * @return engagementWindowDays
  **/
  public BigDecimal getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(BigDecimal engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AccountTemplate filtersJson(String filtersJson) {
    this.filtersJson = filtersJson;
    return this;
  }

   /**
   * A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
   * @return filtersJson
  **/
  public String getFiltersJson() {
    return filtersJson;
  }

  public void setFiltersJson(String filtersJson) {
    this.filtersJson = filtersJson;
  }

  public AccountTemplate granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * Get granularity
   * @return granularity
  **/
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AccountTemplate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Template ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccountTemplate ingestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
    return this;
  }

  public AccountTemplate addIngestionSourcesItem(IngestionSource ingestionSourcesItem) {
    if (this.ingestionSources == null) {
      this.ingestionSources = new ArrayList<>();
    }
    this.ingestionSources.add(ingestionSourcesItem);
    return this;
  }

   /**
   * The filter on the conversion ingestion source method for conversion metrics
   * @return ingestionSources
  **/
  public List<IngestionSource> getIngestionSources() {
    return ingestionSources;
  }

  public void setIngestionSources(List<IngestionSource> ingestionSources) {
    this.ingestionSources = ingestionSources;
  }

  public AccountTemplate isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * A boolean representing if this is the default view that loads for this template type
   * @return isDefault
  **/
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public AccountTemplate isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

   /**
   * A boolean that indicates if the template has been deleted
   * @return isDeleted
  **/
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public AccountTemplate isOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
    return this;
  }

   /**
   * A boolean value that indicates if the user owns the template
   * @return isOwnedByUser
  **/
  public Boolean getIsOwnedByUser() {
    return isOwnedByUser;
  }

  public void setIsOwnedByUser(Boolean isOwnedByUser) {
    this.isOwnedByUser = isOwnedByUser;
  }

  public AccountTemplate isScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
    return this;
  }

   /**
   * A boolean value that indicates if this template has been used to create a scheduled report
   * @return isScheduled
  **/
  public Boolean getIsScheduled() {
    return isScheduled;
  }

  public void setIsScheduled(Boolean isScheduled) {
    this.isScheduled = isScheduled;
  }

  public AccountTemplate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Template Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountTemplate reportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
    return this;
  }

   /**
   * The number of days prior to the day the report will be delivered at which the report will end
   * @return reportEndRelativeDaysInPast
  **/
  public BigDecimal getReportEndRelativeDaysInPast() {
    return reportEndRelativeDaysInPast;
  }

  public void setReportEndRelativeDaysInPast(BigDecimal reportEndRelativeDaysInPast) {
    this.reportEndRelativeDaysInPast = reportEndRelativeDaysInPast;
  }

  public AccountTemplate reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

   /**
   * Get reportFormat
   * @return reportFormat
  **/
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AccountTemplate reportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
    return this;
  }

   /**
   * Get reportLevel
   * @return reportLevel
  **/
  public MetricsReportingLevel getReportLevel() {
    return reportLevel;
  }

  public void setReportLevel(MetricsReportingLevel reportLevel) {
    this.reportLevel = reportLevel;
  }

  public AccountTemplate reportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
    return this;
  }

   /**
   * The number of days prior to the day the report will be delivered at which the report will start
   * @return reportStartRelativeDaysInPast
  **/
  public BigDecimal getReportStartRelativeDaysInPast() {
    return reportStartRelativeDaysInPast;
  }

  public void setReportStartRelativeDaysInPast(BigDecimal reportStartRelativeDaysInPast) {
    this.reportStartRelativeDaysInPast = reportStartRelativeDaysInPast;
  }

  public AccountTemplate reportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
    return this;
  }

   /**
   * Timezone for reporting data
   * @return reportingTimeZone
  **/
  public ReportingTimeZone getReportingTimeZone() {
    return reportingTimeZone;
  }

  public void setReportingTimeZone(ReportingTimeZone reportingTimeZone) {
    this.reportingTimeZone = reportingTimeZone;
  }

  public AccountTemplate sortBy(Object sortBy) {
    this.sortBy = sortBy;
    return this;
  }

   /**
   * Unified metric sort configuration
   * @return sortBy
  **/
  public Object getSortBy() {
    return sortBy;
  }

  public void setSortBy(Object sortBy) {
    this.sortBy = sortBy;
  }

  public AccountTemplate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the template
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccountTemplate updatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Time of last update in seconds since Unix epoch
   * @return updatedTime
  **/
  public BigDecimal getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(BigDecimal updatedTime) {
    this.updatedTime = updatedTime;
  }

  public AccountTemplate userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * ID of the user who created the template
   * @return userId
  **/
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public AccountTemplate viewWindowDays(BigDecimal viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * The length of the sliding window over which view conversions will be attributed
   * @return viewWindowDays
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

