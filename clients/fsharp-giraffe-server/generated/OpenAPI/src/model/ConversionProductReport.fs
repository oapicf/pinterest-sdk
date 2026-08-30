namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus

module ConversionProductReport =

  //#region ConversionProductReport


  type ConversionProductReport = {
    Message : string;
    ReportStatus : BulkReportingJobStatus;
    Size : decimal;
    Token : string;
    Url : string;
  }
  //#endregion
