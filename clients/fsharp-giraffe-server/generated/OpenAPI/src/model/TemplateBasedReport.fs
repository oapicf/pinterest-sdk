namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus

module TemplateBasedReport =

  //#region TemplateBasedReport


  type TemplateBasedReport = {
    Message : string;
    ReportStatus : BulkReportingJobStatus;
    TemplateId : string;
    Token : string;
  }
  //#endregion
