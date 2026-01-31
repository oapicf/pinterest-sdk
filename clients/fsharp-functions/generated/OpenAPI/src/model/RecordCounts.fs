namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module RecordCounts =

  //#region RecordCounts

  [<CLIMutable>]
  type RecordCounts = {
    [<JsonProperty(PropertyName = "invalid")>]
    Invalid : int;
    [<JsonProperty(PropertyName = "processed")>]
    Processed : int;
    [<JsonProperty(PropertyName = "valid")>]
    Valid : int;
  }

  //#endregion
