namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PinAnalyticsMetricsResponseDailyMetricsInner
open System.Collections.Generic

module PinAnalyticsMetricsResponse =

  //#region PinAnalyticsMetricsResponse


  type PinAnalyticsMetricsResponse = {
    DailyMetrics : PinAnalyticsMetricsResponseDailyMetricsInner[];
    LifetimeMetrics : IDictionary<string, int>;
    SummaryMetrics : IDictionary<string, decimal>;
  }
  //#endregion
