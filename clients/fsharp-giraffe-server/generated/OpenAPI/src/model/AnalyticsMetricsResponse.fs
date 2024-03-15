namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AnalyticsDailyMetrics
open System.Collections.Generic

module AnalyticsMetricsResponse =

  //#region AnalyticsMetricsResponse


  type AnalyticsMetricsResponse = {
    SummaryMetrics : IDictionary<string, decimal>;
    DailyMetrics : AnalyticsDailyMetrics[];
  }
  //#endregion
