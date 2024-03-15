namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.string option

module AdsAnalyticsCreateAsyncResponse =

  //#region AdsAnalyticsCreateAsyncResponse


  type AdsAnalyticsCreateAsyncResponse = {
    ReportStatus : BulkReportingJobStatus;
    Token : string;
    Message : string option;
  }
  //#endregion
