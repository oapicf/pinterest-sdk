namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BidFloorSpec
open OpenAPI.Model.TargetingSpec

module BidFloorRequest =

  //#region BidFloorRequest

  [<CLIMutable>]
  type BidFloorRequest = {
    [<JsonProperty(PropertyName = "bid_floor_specs")>]
    BidFloorSpecs : BidFloorSpec[];
    [<JsonProperty(PropertyName = "targeting_spec")>]
    TargetingSpec : TargetingSpec;
  }

  //#endregion
