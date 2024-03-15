namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdsAnalyticsFilterColumn
open OpenAPI.Model.AdsAnalyticsFilterOperator

module AdsAnalyticsMetricsFilter =

  //#region AdsAnalyticsMetricsFilter


  type AdsAnalyticsMetricsFilter = {
    Field : AdsAnalyticsFilterColumn;
    Operator : AdsAnalyticsFilterOperator;
    Values : decimal[];
  }
  //#endregion
