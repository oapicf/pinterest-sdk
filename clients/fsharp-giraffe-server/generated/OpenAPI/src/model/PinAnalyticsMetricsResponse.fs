namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinAnalyticsDailyMetrics
open System.Collections.Generic

module PinAnalyticsMetricsResponse =

  //#region PinAnalyticsMetricsResponse


  type PinAnalyticsMetricsResponse = {
    DailyMetrics : PinAnalyticsDailyMetrics[];
    LifetimeMetrics : IDictionary<string, int>;
    SummaryMetrics : IDictionary<string, decimal>;
  }
  //#endregion
