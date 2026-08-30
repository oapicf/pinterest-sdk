namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus

module ConversionProductReport =

  //#region ConversionProductReport

  [<CLIMutable>]
  type ConversionProductReport = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "size")>]
    Size : decimal;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "url")>]
    Url : string;
  }

  //#endregion
