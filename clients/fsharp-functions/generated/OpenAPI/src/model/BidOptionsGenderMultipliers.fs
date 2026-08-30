namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidOptionsGenderMultipliers =

  //#region BidOptionsGenderMultipliers

  [<CLIMutable>]
  type BidOptionsGenderMultipliers = {
    [<JsonProperty(PropertyName = "female")>]
    Female : decimal;
    [<JsonProperty(PropertyName = "male")>]
    Male : decimal;
  }

  //#endregion
