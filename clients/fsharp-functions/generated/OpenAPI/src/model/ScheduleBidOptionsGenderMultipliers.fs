namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecGender
open System.Collections.Generic

module ScheduleBidOptionsGenderMultipliers =

  //#region ScheduleBidOptionsGenderMultipliers

  [<CLIMutable>]
  type ScheduleBidOptionsGenderMultipliers = {
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : TargetingSpecGender;
  }

  //#endregion
