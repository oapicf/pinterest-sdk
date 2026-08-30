namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DynamicTitlesGetStatus =

  //#region DynamicTitlesGetStatus

  [<CLIMutable>]
  type DynamicTitlesGetStatus = {
    [<JsonProperty(PropertyName = "generated_count")>]
    GeneratedCount : int;
    [<JsonProperty(PropertyName = "is_ready")>]
    IsReady : bool;
    [<JsonProperty(PropertyName = "reviewed_count")>]
    ReviewedCount : int;
  }

  //#endregion
