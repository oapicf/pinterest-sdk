namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module PinAnalyticsMetricsResponseDailyMetricsInner =

  //#region PinAnalyticsMetricsResponseDailyMetricsInner


  type PinAnalyticsMetricsResponse_daily_metrics_inner = {
    DataStatus : DataStatus;
    Date : string;
    Metrics : IDictionary<string, decimal>;
  }
  //#endregion
