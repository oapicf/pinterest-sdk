namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.KeywordMetrics

module KeywordMetricsResponse =

  //#region KeywordMetricsResponse


  type KeywordMetricsResponse = {
    Keyword : string;
    Metrics : KeywordMetrics;
  }
  //#endregion
