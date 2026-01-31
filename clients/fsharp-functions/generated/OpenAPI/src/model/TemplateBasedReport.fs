namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BulkReportingJobStatus

module TemplateBasedReport =

  //#region TemplateBasedReport

  [<CLIMutable>]
  type TemplateBasedReport = {
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
    [<JsonProperty(PropertyName = "report_status")>]
    ReportStatus : BulkReportingJobStatus;
    [<JsonProperty(PropertyName = "template_id")>]
    TemplateId : string;
    [<JsonProperty(PropertyName = "token")>]
    Token : string;
  }

  //#endregion
