namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdsAnalyticsFilterColumn
open OpenAPI.Model.AdsAnalyticsFilterOperator

module AdsAnalyticsMetricsFilter =

  //#region AdsAnalyticsMetricsFilter

  [<CLIMutable>]
  type AdsAnalyticsMetricsFilter = {
    [<JsonProperty(PropertyName = "field")>]
    Field : AdsAnalyticsFilterColumn;
    [<JsonProperty(PropertyName = "operator")>]
    Operator : AdsAnalyticsFilterOperator;
    [<JsonProperty(PropertyName = "values")>]
    Values : decimal[];
  }

  //#endregion
