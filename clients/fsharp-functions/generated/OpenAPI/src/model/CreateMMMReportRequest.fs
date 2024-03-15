namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MMMReportingColumn
open OpenAPI.Model.MMMReportingTargetingType
open OpenAPI.Model.TargetingAdvertiserCountry

module CreateMMMReportRequest =

  //#region CreateMMMReportRequest

  [<CLIMutable>]
  type CreateMMMReportRequest = {
    [<JsonProperty(PropertyName = "report_name")>]
    ReportName : string;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : string;
    [<JsonProperty(PropertyName = "level")>]
    Level : string;
    [<JsonProperty(PropertyName = "targeting_types")>]
    TargetingTypes : MMMReportingTargetingType[];
    [<JsonProperty(PropertyName = "columns")>]
    Columns : MMMReportingColumn[];
    [<JsonProperty(PropertyName = "countries")>]
    Countries : TargetingAdvertiserCountry[];
  }

  //#endregion
