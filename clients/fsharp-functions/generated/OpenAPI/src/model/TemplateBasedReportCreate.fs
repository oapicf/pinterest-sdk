namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus

module TemplateBasedReportCreate =

  //#region TemplateBasedReportCreate

  [<CLIMutable>]
  type TemplateBasedReportCreate = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
  }

  //#endregion
