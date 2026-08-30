namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module NullalbleMatchType =

  //#region NullalbleMatchType

  let BROADEnum = "BROAD"
  let PHRASEEnum = "PHRASE"
  let EXACTEnum = "EXACT"
  let EXACTNEGATIVEEnum = "EXACT_NEGATIVE"
  let PHRASENEGATIVEEnum = "PHRASE_NEGATIVE"
  type NullalbleMatchType = string

  //#endregion
