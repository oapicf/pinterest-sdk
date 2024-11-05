namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TargetingSpecAppType
open System.Collections.Generic

module AppTypeMultipliers =

  //#region AppTypeMultipliers

  [<CLIMutable>]
  type AppTypeMultipliers = {
    [<JsonProperty(PropertyName = "APP_TYPE")>]
    APP_TYPE : TargetingSpecAppType;
  }

  //#endregion
