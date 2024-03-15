namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MatchType =

  //#region MatchType

  let BROADEnum = "BROAD"
  let PHRASEEnum = "PHRASE"
  let EXACTEnum = "EXACT"
  let EXACTNEGATIVEEnum = "EXACT_NEGATIVE"
  let PHRASENEGATIVEEnum = "PHRASE_NEGATIVE"
  type MatchType = string

  //#endregion
