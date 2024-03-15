namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module AnalyticsDailyMetrics =

  //#region AnalyticsDailyMetrics


  type AnalyticsDailyMetrics = {
    DataStatus : DataStatus;
    Date : string;
    Metrics : IDictionary<string, decimal>;
  }
  //#endregion
