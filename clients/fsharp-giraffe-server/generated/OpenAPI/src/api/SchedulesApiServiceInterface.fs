namespace OpenAPI
open SchedulesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module SchedulesApiServiceInterface =

    //#region Service interface
    type ISchedulesApiService =
      abstract member SchedulesCreate:HttpContext -> SchedulesCreateArgs->SchedulesCreateResult
      abstract member SchedulesList:HttpContext -> SchedulesListArgs->SchedulesListResult
      abstract member SchedulesUpdate:HttpContext -> SchedulesUpdateArgs->SchedulesUpdateResult
    //#endregion