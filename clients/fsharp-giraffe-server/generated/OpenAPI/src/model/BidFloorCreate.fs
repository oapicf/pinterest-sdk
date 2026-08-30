namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BidFloorSpec
open OpenAPI.Model.TargetingSpecOptimal

module BidFloorCreate =

  //#region BidFloorCreate


  type BidFloorCreate = {
    BidFloorSpecs : BidFloorSpec[];
    TargetingSpec : TargetingSpecOptimal;
  }
  //#endregion
