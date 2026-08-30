namespace OpenAPI
open ConversionsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionsApiServiceInterface =

    //#region Service interface
    type IConversionsApiService =
      abstract member AdvertiserDefinedEventsCreate : AdvertiserDefinedEventsCreateBodyParams -> AdvertiserDefinedEventsCreateResult
      abstract member AdvertiserDefinedEventsDelete : unit -> AdvertiserDefinedEventsDeleteResult
      abstract member AdvertiserDefinedEventsGet : unit -> AdvertiserDefinedEventsGetResult
      abstract member AdvertiserDefinedEventsUpdate : AdvertiserDefinedEventsUpdateBodyParams -> AdvertiserDefinedEventsUpdateResult
    //#endregion