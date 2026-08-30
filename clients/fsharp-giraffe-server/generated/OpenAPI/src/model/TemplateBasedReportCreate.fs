namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus

module TemplateBasedReportCreate =

  //#region TemplateBasedReportCreate


  type TemplateBasedReportCreate = {
    Message : string;
    ReportStatus : BulkReportingJobStatus;
    Token : string;
  }
  //#endregion
