namespace OpenAPI
open MsotEventsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MsotEventsApiServiceInterface =

    //#region Service interface
    type IMsotEventsApiService =
      abstract member MsotEventsCreate:HttpContext -> MsotEventsCreateArgs->MsotEventsCreateResult
    //#endregion