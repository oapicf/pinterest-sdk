namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ScheduleUpdateRequestAllOf1 =

  //#region ScheduleUpdateRequestAllOf1

  [<CLIMutable>]
  type ScheduleUpdateRequestAllOf1 = {
    [<JsonProperty(PropertyName = "entity_id")>]
    EntityId : string;
    [<JsonProperty(PropertyName = "entity_type")>]
    EntityType : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
