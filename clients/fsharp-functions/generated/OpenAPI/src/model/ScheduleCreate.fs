namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdAccountEntityType
open OpenAPI.Model.ScheduleAction
open OpenAPI.Model.ScheduleDeltaValue
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType

module ScheduleCreate =

  //#region ScheduleCreate

  [<CLIMutable>]
  type ScheduleCreate = {
    [<JsonProperty(PropertyName = "delta_value")>]
    DeltaValue : ScheduleDeltaValue;
    [<JsonProperty(PropertyName = "end_timestamp")>]
    EndTimestamp : int;
    [<JsonProperty(PropertyName = "entity_id")>]
    EntityId : string;
    [<JsonProperty(PropertyName = "entity_type")>]
    EntityType : AdAccountEntityType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "schedule_action")>]
    ScheduleAction : ScheduleAction;
    [<JsonProperty(PropertyName = "schedule_status")>]
    ScheduleStatus : ScheduleStatus;
    [<JsonProperty(PropertyName = "schedule_type")>]
    ScheduleType : ScheduleType;
    [<JsonProperty(PropertyName = "start_timestamp")>]
    StartTimestamp : int;
  }

  //#endregion
