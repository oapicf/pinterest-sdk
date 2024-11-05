namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module PlacementMultipliers =

  //#region PlacementMultipliers

  [<CLIMutable>]
  type PlacementMultipliers = {
    [<JsonProperty(PropertyName = "PLACEMENT")>]
    PLACEMENT : string;
  }

  //#endregion
