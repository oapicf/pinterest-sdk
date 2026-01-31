namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.TemplateResponseDateRange
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module TemplateResponse =

  //#region TemplateResponse

  [<CLIMutable>]
  type TemplateResponse = {
    [<JsonProperty(PropertyName = "ad_account_id")>]
    AdAccountId : string;
    [<JsonProperty(PropertyName = "ad_account_ids")>]
    AdAccountIds : string[];
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : decimal;
    [<JsonProperty(PropertyName = "columns")>]
    Columns : string[];
    [<JsonProperty(PropertyName = "conversion_report_time_type")>]
    ConversionReportTimeType : string;
    [<JsonProperty(PropertyName = "creation_source")>]
    CreationSource : string;
    [<JsonProperty(PropertyName = "custom_column_ids")>]
    CustomColumnIds : string[];
    [<JsonProperty(PropertyName = "date_range")>]
    DateRange : TemplateResponseDateRange;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : decimal;
    [<JsonProperty(PropertyName = "filters_json")>]
    FiltersJson : string option;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : Granularity;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "ingestion_sources")>]
    IngestionSources : string[];
    [<JsonProperty(PropertyName = "is_deleted")>]
    IsDeleted : bool option;
    [<JsonProperty(PropertyName = "is_owned_by_user")>]
    IsOwnedByUser : bool;
    [<JsonProperty(PropertyName = "is_scheduled")>]
    IsScheduled : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string option;
    [<JsonProperty(PropertyName = "report_end_relative_days_in_past")>]
    ReportEndRelativeDaysInPast : decimal;
    [<JsonProperty(PropertyName = "report_format")>]
    ReportFormat : DataOutputFormat;
    [<JsonProperty(PropertyName = "report_level")>]
    ReportLevel : MetricsReportingLevel;
    [<JsonProperty(PropertyName = "report_start_relative_days_in_past")>]
    ReportStartRelativeDaysInPast : decimal;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "updated_time")>]
    UpdatedTime : decimal;
    [<JsonProperty(PropertyName = "user_id")>]
    UserId : string;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : decimal;
  }

  //#endregion
