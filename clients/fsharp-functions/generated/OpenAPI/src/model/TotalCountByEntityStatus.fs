namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TotalCountByEntityStatus =

  //#region TotalCountByEntityStatus

  [<CLIMutable>]
  type TotalCountByEntityStatus = {
    [<JsonProperty(PropertyName = "ACTIVE")>]
    ACTIVE : int;
    [<JsonProperty(PropertyName = "ARCHIVED")>]
    ARCHIVED : int;
    [<JsonProperty(PropertyName = "PAUSED")>]
    PAUSED : int;
  }

  //#endregion
