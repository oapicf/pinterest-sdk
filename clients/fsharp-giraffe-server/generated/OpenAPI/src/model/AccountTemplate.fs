namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnyType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.CreationSource
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.Granularity
open OpenAPI.Model.IngestionSource
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.ReportingColumn
open OpenAPI.Model.ReportingTimeZone
open OpenAPI.Model.bool option
open OpenAPI.Model.string option

module AccountTemplate =

  //#region AccountTemplate


  type AccountTemplate = {
    AdAccountId : string;
    AdAccountIds : string[];
    AdeColumns : string[];
    AttributionType : AnyType;
    ClickWindowDays : decimal;
    Columns : ReportingColumn[];
    ConversionReportTimeType : ConversionReportTimeType;
    CreationSource : CreationSource;
    CustomColumnIds : string[];
    DisplayMetadata : string;
    EngagementWindowDays : decimal;
    FiltersJson : string option;
    Granularity : Granularity;
    Id : string;
    IngestionSources : IngestionSource[];
    IsDefault : bool;
    IsDeleted : bool option;
    IsOwnedByUser : bool;
    IsScheduled : bool;
    Name : string option;
    ReportEndRelativeDaysInPast : decimal;
    ReportFormat : DataOutputFormat;
    ReportLevel : MetricsReportingLevel;
    ReportStartRelativeDaysInPast : decimal;
    ReportingTimeZone : ReportingTimeZone;
    SortBy : AnyType;
    Type : string;
    UpdatedTime : decimal;
    UserId : string;
    ViewWindowDays : decimal;
  }
  //#endregion
