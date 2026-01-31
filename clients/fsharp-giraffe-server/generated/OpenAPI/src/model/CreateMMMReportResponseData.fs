namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.string option

module CreateMMMReportResponseData =

  //#region CreateMMMReportResponseData


  type CreateMMMReportResponseData = {
    Message : string option;
    ReportStatus : BulkReportingJobStatus;
    Status : string;
    Token : string;
  }
  //#endregion
