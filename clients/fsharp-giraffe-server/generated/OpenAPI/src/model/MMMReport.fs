namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus

module MMMReport =

  //#region MMMReport


  type MMMReport = {
    Message : string;
    ReportStatus : BulkReportingJobStatus;
    Size : decimal;
    Status : string;
    Token : string;
    Url : string;
  }
  //#endregion
