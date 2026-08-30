namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module ScheduleAudienceMultipliers =

  //#region ScheduleAudienceMultipliers

  [<CLIMutable>]
  type ScheduleAudienceMultipliers = {
    [<JsonProperty(PropertyName = "AUDIENCE_ID")>]
    AUDIENCE_ID : string;
  }

  //#endregion
