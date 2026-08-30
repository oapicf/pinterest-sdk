namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAppType
open System.Collections.Generic

module ScheduleAppTypeMultipliers =

  //#region ScheduleAppTypeMultipliers

  [<CLIMutable>]
  type ScheduleAppTypeMultipliers = {
    [<JsonProperty(PropertyName = "APP_TYPE")>]
    APP_TYPE : TargetingSpecAppType;
  }

  //#endregion
