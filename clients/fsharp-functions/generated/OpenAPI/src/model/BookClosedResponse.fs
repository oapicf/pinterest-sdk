namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BookClosedResponse =

  //#region BookClosedResponse

  [<CLIMutable>]
  type BookClosedResponse = {
    [<JsonProperty(PropertyName = "conversion_metrics_ready")>]
    ConversionMetricsReady : bool;
    [<JsonProperty(PropertyName = "non_conversion_metrics_ready")>]
    NonConversionMetricsReady : bool;
  }

  //#endregion
