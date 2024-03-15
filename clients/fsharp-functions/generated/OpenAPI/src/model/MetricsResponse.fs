namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MetricsResponse =

  //#region MetricsResponse

  [<CLIMutable>]
  type MetricsResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : obj[];
  }

  //#endregion
