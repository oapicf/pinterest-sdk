namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BulkReportingJobStatus
open OpenAPI.Model.decimal option
open OpenAPI.Model.string option

module AdsAnalyticsGetAsyncResponse =

  //#region AdsAnalyticsGetAsyncResponse


  type AdsAnalyticsGetAsyncResponse = {
    ReportStatus : BulkReportingJobStatus;
    Url : string option;
    Size : decimal option;
  }
  //#endregion
