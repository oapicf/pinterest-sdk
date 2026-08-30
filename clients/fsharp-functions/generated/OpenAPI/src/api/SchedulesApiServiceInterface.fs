namespace OpenAPI
open SchedulesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module SchedulesApiServiceInterface =

    //#region Service interface
    type ISchedulesApiService =
      abstract member SchedulesCreate : SchedulesCreateBodyParams -> SchedulesCreateResult
      abstract member SchedulesList : unit -> SchedulesListResult
      abstract member SchedulesUpdate : SchedulesUpdateBodyParams -> SchedulesUpdateResult
    //#endregion