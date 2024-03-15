namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.string option

module AdsAnalyticsCreateAsyncResponse =

  //#region AdsAnalyticsCreateAsyncResponse

  [<CLIMutable>]
  type AdsAnalyticsCreateAsyncResponse = {
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string option;
  }

  //#endregion
