namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.ReportingColumnAsync

module AdsAnalyticsCreateAsyncRequestAllOf1 =

  //#region AdsAnalyticsCreateAsyncRequestAllOf1


  type AdsAnalyticsCreateAsyncRequest_allOf_1 = {
    Columns : ReportingColumnAsync[];
    Level : MetricsReportingLevel;
    ReportFormat : DataOutputFormat;
  }
  //#endregion
