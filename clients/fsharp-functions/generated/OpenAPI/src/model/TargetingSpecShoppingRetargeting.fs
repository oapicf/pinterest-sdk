namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingSpecShoppingRetargeting =

  //#region TargetingSpecShoppingRetargeting

  [<CLIMutable>]
  type TargetingSpecShoppingRetargeting = {
    [<JsonProperty(PropertyName = "exclusion_window")>]
    ExclusionWindow : int;
    [<JsonProperty(PropertyName = "lookback_window")>]
    LookbackWindow : int;
    [<JsonProperty(PropertyName = "tag_types")>]
    TagTypes : int[];
  }

  //#endregion
