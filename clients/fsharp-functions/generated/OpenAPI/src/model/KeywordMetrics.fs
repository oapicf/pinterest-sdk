namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module KeywordMetrics =

  //#region KeywordMetrics

  [<CLIMutable>]
  type KeywordMetrics = {
    [<JsonProperty(PropertyName = "keyword_query_volume")>]
    KeywordQueryVolume : string;
  }

  //#endregion
