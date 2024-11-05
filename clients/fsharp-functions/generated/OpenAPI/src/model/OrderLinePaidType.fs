namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module OrderLinePaidType =

  //#region OrderLinePaidType

  let PAIDEnum = "PAID"
  let BONUSEnum = "BONUS"
  let MAKEGOODEnum = "MAKE_GOOD"
  let TESTEnum = "TEST"
  type OrderLinePaidType = string

  //#endregion
