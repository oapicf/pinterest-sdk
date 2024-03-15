namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module TargetingSpecSHOPPINGRETARGETING =

  //#region TargetingSpecSHOPPINGRETARGETING

  [<CLIMutable>]
  type TargetingSpecSHOPPINGRETARGETING = {
    [<JsonProperty(PropertyName = "lookback_window")>]
    LookbackWindow : int;
    [<JsonProperty(PropertyName = "tag_types")>]
    TagTypes : int[];
    [<JsonProperty(PropertyName = "exclusion_window")>]
    ExclusionWindow : int;
  }

  //#endregion
