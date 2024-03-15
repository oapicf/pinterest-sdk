namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.string option

module CreateMMMReportResponseData =

  //#region CreateMMMReportResponseData


  type CreateMMMReportResponseData = {
    ReportStatus : BulkReportingJobStatus;
    Token : string;
    Message : string option;
    Status : string;
  }
  //#endregion
