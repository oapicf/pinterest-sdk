namespace OpenAPI
open ConversionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionsApiServiceInterface =

    //#region Service interface
    type IConversionsApiService =
      abstract member AdvertiserDefinedEventsGet : unit -> AdvertiserDefinedEventsGetResult
    //#endregion