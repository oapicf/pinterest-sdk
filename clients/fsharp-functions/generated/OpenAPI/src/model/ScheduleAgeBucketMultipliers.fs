namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module ScheduleAgeBucketMultipliers =

  //#region ScheduleAgeBucketMultipliers

  [<CLIMutable>]
  type ScheduleAgeBucketMultipliers = {
    [<JsonProperty(PropertyName = "AGE_BUCKET")>]
    AGE_BUCKET : string;
  }

  //#endregion
