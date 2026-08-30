namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidOptionsPlacementMultipliers =

  //#region BidOptionsPlacementMultipliers

  [<CLIMutable>]
  type BidOptionsPlacementMultipliers = {
    [<JsonProperty(PropertyName = "browse")>]
    Browse : decimal;
    [<JsonProperty(PropertyName = "related_pins")>]
    RelatedPins : decimal;
    [<JsonProperty(PropertyName = "search")>]
    Search : decimal;
  }

  //#endregion
