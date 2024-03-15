namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module Granularity =

  //#region Granularity

  let TOTALEnum = "TOTAL"
  let DAYEnum = "DAY"
  let HOUREnum = "HOUR"
  let WEEKEnum = "WEEK"
  let MONTHEnum = "MONTH"
  type Granularity = string

  //#endregion
