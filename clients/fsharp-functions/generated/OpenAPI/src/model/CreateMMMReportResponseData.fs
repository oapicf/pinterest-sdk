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
    [<JsonProperty(PropertyName = "message")>]
    Message : string option;
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
  }

  //#endregion
