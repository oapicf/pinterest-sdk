namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module MatchTypeResponse =

  //#region MatchTypeResponse

  let BROADEnum = "BROAD"
  let PHRASEEnum = "PHRASE"
  let EXACTEnum = "EXACT"
  let EXACTNEGATIVEEnum = "EXACT_NEGATIVE"
  let PHRASENEGATIVEEnum = "PHRASE_NEGATIVE"
  let NullEnum = "null"
  type MatchTypeResponse = string

  //#endregion
