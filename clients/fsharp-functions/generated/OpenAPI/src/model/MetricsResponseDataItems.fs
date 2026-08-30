namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MetricsResponseDataItems =

  //#region MetricsResponseDataItems

  [<CLIMutable>]
  type MetricsResponseDataItems = {
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : obj;
    [<JsonProperty(PropertyName = "targeting_type")>]
    TargetingType : string;
    [<JsonProperty(PropertyName = "targeting_value")>]
    TargetingValue : string;
  }

  //#endregion
