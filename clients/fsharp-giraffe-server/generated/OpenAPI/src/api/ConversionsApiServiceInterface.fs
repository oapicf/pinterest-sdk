namespace OpenAPI
open ConversionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionsApiServiceInterface =

    //#region Service interface
    type IConversionsApiService =
      abstract member AdvertiserDefinedEventsGet:HttpContext -> AdvertiserDefinedEventsGetArgs->AdvertiserDefinedEventsGetResult
    //#endregion