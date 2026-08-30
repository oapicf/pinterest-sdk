namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module PinAnalyticsDailyMetrics =

  //#region PinAnalyticsDailyMetrics


  type PinAnalyticsDailyMetrics = {
    DataStatus : DataStatus;
    Date : string;
    Metrics : IDictionary<string, decimal>;
  }
  //#endregion
