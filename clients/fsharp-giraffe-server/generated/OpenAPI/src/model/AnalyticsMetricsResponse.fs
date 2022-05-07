namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnalyticsMetricsResponseDailyMetrics
open System.Collections.Generic

module AnalyticsMetricsResponse =

  //#region AnalyticsMetricsResponse


  type AnalyticsMetricsResponse = {
    DailyMetrics : AnalyticsMetricsResponseDailyMetrics[];
    SummaryMetrics : IDictionary<string, decimal>;
  }
  //#endregion
