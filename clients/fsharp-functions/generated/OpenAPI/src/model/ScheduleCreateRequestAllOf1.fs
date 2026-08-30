namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ScheduleCreateRequestAllOf1 =

  //#region ScheduleCreateRequestAllOf1

  [<CLIMutable>]
  type ScheduleCreateRequestAllOf1 = {
    [<JsonProperty(PropertyName = "entity_id")>]
    EntityId : string;
    [<JsonProperty(PropertyName = "entity_type")>]
    EntityType : string;
  }

  //#endregion
