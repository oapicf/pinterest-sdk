namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Schedule
open OpenAPI.Model.string option

module SchedulesList200Response =

  //#region SchedulesList200Response


  type schedules_list_200_response = {
    Bookmark : string option;
    Items : Schedule[];
  }
  //#endregion
