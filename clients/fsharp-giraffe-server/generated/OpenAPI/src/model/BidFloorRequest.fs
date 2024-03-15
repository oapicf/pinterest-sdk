namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BidFloorSpec
open OpenAPI.Model.TargetingSpec

module BidFloorRequest =

  //#region BidFloorRequest


  type BidFloorRequest = {
    BidFloorSpecs : BidFloorSpec[];
    TargetingSpec : TargetingSpec;
  }
  //#endregion
