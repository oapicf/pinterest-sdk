namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module TimeSeries =

  //#region TimeSeries

  [<CLIMutable>]
  type TimeSeries = {
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion
