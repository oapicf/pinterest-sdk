namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsAnalyticsGetAsyncResponse =

  //#region AdsAnalyticsGetAsyncResponse

  [<CLIMutable>]
  type AdsAnalyticsGetAsyncResponse = {
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "url")>]
    Url : string option;
    [<JsonProperty(PropertyName = "size")>]
    Size : decimal option;
  }

  //#endregion
