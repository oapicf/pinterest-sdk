namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MMMReportGranularity
open OpenAPI.Model.MMMReportLevel
open OpenAPI.Model.MMMReportingColumn
open OpenAPI.Model.MMMReportingTargetingType
open OpenAPI.Model.TargetingAdvertiserCountry

module MMMReportCreate =

  //#region MMMReportCreate

  [<CLIMutable>]
  type MMMReportCreate = {
    [<JsonProperty(PropertyName = "advertiser_ids")>]
    AdvertiserIds : string[];
    [<JsonProperty(PropertyName = "columns")>]
    Columns : MMMReportingColumn[];
    [<JsonProperty(PropertyName = "countries")>]
    Countries : TargetingAdvertiserCountry[];
    [<JsonProperty(PropertyName = "custom_column_ids")>]
    CustomColumnIds : string[];
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : MMMReportGranularity;
    [<JsonProperty(PropertyName = "level")>]
    Level : MMMReportLevel;
    [<JsonProperty(PropertyName = "report_name")>]
    ReportName : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "targeting_types")>]
    TargetingTypes : MMMReportingTargetingType[];
  }

  //#endregion
