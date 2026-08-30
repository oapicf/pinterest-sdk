namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecGender
open System.Collections.Generic

module GenderMultipliers =

  //#region GenderMultipliers

  [<CLIMutable>]
  type GenderMultipliers = {
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : TargetingSpecGender;
  }

  //#endregion
