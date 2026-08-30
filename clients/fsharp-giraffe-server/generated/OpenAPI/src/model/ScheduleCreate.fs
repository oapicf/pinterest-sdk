namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountEntityType
open OpenAPI.Model.ScheduleAction
open OpenAPI.Model.ScheduleDeltaValue
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType

module ScheduleCreate =

  //#region ScheduleCreate


  type ScheduleCreate = {
    DeltaValue : ScheduleDeltaValue;
    EndTimestamp : int;
    EntityId : string;
    EntityType : AdAccountEntityType;
    Name : string;
    ScheduleAction : ScheduleAction;
    ScheduleStatus : ScheduleStatus;
    ScheduleType : ScheduleType;
    StartTimestamp : int;
  }
  //#endregion
