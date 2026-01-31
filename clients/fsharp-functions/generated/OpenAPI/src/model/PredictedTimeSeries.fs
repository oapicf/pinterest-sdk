namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module PredictedTimeSeries =

  //#region PredictedTimeSeries

  [<CLIMutable>]
  type PredictedTimeSeries = {
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion
