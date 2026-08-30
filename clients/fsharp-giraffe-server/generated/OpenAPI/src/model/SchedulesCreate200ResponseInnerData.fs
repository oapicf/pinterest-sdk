namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAccountEntityType
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.Schedule
open OpenAPI.Model.ScheduleAction
open OpenAPI.Model.ScheduleDeltaValue
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType
open OpenAPI.Model.SchedulesCreate200ResponseInnerDataOneOf

module SchedulesCreate200ResponseInnerData =

  //#region SchedulesCreate200ResponseInnerData


  type schedules_create_200_response_inner_data = {
    DeltaValue : ScheduleDeltaValue;
    EndTimestamp : int;
    EntityId : string;
    EntityType : AdAccountEntityType;
    Name : string;
    ScheduleAction : ScheduleAction;
    ScheduleId : string;
    ScheduleStatus : ScheduleStatus;
    ScheduleType : ScheduleType;
    StartTimestamp : int;
    Id : string;
    Exceptions : PinterestLibError;
  }
  //#endregion
