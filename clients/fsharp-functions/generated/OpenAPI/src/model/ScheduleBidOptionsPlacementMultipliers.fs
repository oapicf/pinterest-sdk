namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ScheduleBidOptionsPlacementMultipliers =

  //#region ScheduleBidOptionsPlacementMultipliers

  [<CLIMutable>]
  type ScheduleBidOptionsPlacementMultipliers = {
    [<JsonProperty(PropertyName = "browse")>]
    Browse : double;
    [<JsonProperty(PropertyName = "related_pins")>]
    RelatedPins : double;
    [<JsonProperty(PropertyName = "search")>]
    Search : double;
  }

  //#endregion
