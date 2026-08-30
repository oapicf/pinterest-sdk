namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ScheduleAction
open OpenAPI.Model.ScheduleCommonDeltaValue
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType

module ScheduleCreateRequest =

  //#region ScheduleCreateRequest


  type ScheduleCreateRequest = {
    EntityId : string;
    EntityType : string;
    DeltaValue : ScheduleCommonDeltaValue;
    EndTimestamp : int;
    Name : string;
    ScheduleAction : ScheduleAction;
    ScheduleStatus : ScheduleStatus;
    ScheduleType : ScheduleType;
    StartTimestamp : int;
  }
  //#endregion
