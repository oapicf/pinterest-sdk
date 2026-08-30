namespace OpenAPI
open ConversionsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionsApiServiceInterface =

    //#region Service interface
    type IConversionsApiService =
      abstract member AdvertiserDefinedEventsCreate:HttpContext -> AdvertiserDefinedEventsCreateArgs->AdvertiserDefinedEventsCreateResult
      abstract member AdvertiserDefinedEventsDelete:HttpContext -> AdvertiserDefinedEventsDeleteArgs->AdvertiserDefinedEventsDeleteResult
      abstract member AdvertiserDefinedEventsGet:HttpContext -> AdvertiserDefinedEventsGetArgs->AdvertiserDefinedEventsGetResult
      abstract member AdvertiserDefinedEventsUpdate:HttpContext -> AdvertiserDefinedEventsUpdateArgs->AdvertiserDefinedEventsUpdateResult
    //#endregion