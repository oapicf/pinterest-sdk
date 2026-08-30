namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module PinFilter =

  //#region PinFilter

  let ExcludeNativeEnum = "exclude_native"
  let ExcludeRepinsEnum = "exclude_repins"
  let HasBeenPromotedEnum = "has_been_promoted"
  type PinFilter = string

  //#endregion
