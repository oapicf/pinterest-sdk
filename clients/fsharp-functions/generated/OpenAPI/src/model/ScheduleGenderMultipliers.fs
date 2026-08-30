namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecGender
open System.Collections.Generic

module ScheduleGenderMultipliers =

  //#region ScheduleGenderMultipliers

  [<CLIMutable>]
  type ScheduleGenderMultipliers = {
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : TargetingSpecGender;
  }

  //#endregion
