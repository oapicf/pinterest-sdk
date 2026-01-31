namespace OpenAPI
open OpenAPI.Model.AdvertiserDefinedEventsResponse
open OpenAPI.Model.Error
open ConversionsApiHandlerParams
open ConversionsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ConversionsApiServiceImplementation =

    //#region Service implementation
    type ConversionsApiServiceImpl() =
      interface IConversionsApiService with

        member this.AdvertiserDefinedEventsGet ctx args =
          if true then
            let content = "Success" :> obj :?> AdvertiserDefinedEventsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvertiserDefinedEventsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvertiserDefinedEventsGetDefaultStatusCode { content = content }

      //#endregion

    let ConversionsApiService = ConversionsApiServiceImpl() :> IConversionsApiService