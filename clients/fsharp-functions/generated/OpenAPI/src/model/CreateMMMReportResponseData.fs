namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.string option

module CreateMMMReportResponseData =

  //#region CreateMMMReportResponseData

  [<CLIMutable>]
  type CreateMMMReportResponseData = {
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string option;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
  }

  //#endregion
