namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module KeywordMetrics =

  //#region KeywordMetrics

  [<CLIMutable>]
  type KeywordMetrics = {
    [<JsonProperty(PropertyName = "avg_cpc_in_micro_currency")>]
    AvgCpcInMicroCurrency : decimal;
    [<JsonProperty(PropertyName = "keyword_query_volume")>]
    KeywordQueryVolume : string;
  }

  //#endregion
