namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BidStrategyType =

  //#region BidStrategyType

  let AUTOMATICBIDEnum = "AUTOMATIC_BID"
  let MAXBIDEnum = "MAX_BID"
  let TARGETAVGEnum = "TARGET_AVG"
  type BidStrategyType = string

  //#endregion
