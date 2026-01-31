namespace OpenAPI
open MsotEventsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module MsotEventsApiServiceInterface =

    //#region Service interface
    type IMsotEventsApiService =
      abstract member MsotEventsCreate : MsotEventsCreateBodyParams -> MsotEventsCreateResult
    //#endregion