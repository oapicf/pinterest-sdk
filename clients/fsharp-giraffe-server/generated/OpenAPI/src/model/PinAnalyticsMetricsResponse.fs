namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinAnalyticsMetricsResponseDailyMetricsInner
open System.Collections.Generic

module PinAnalyticsMetricsResponse =

  //#region PinAnalyticsMetricsResponse


  type PinAnalyticsMetricsResponse = {
    LifetimeMetrics : IDictionary<string, int>;
    DailyMetrics : PinAnalyticsMetricsResponseDailyMetricsInner[];
    SummaryMetrics : IDictionary<string, decimal>;
  }
  //#endregion
