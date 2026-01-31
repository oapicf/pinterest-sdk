namespace OpenAPI
open OpenAPI.Model.ConversionMSOTEvents
open OpenAPI.Model.Error
open MsotEventsApiHandlerParams
open MsotEventsApiServiceInterface
open System.Collections.Generic
open System

module MsotEventsApiServiceImplementation =

    //#region Service implementation
    type MsotEventsApiServiceImpl() =
      interface IMsotEventsApiService with

        member this.MsotEventsCreate (parameters:MsotEventsCreateBodyParams) =
          if true then
            let content = "Success" 
            MsotEventsCreateStatusCode200 { content = content }
          else if true then
            let content = "The request was invalid" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to send MSOT conversion events" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode401 { content = content }
          else if true then
            let content = "Unauthorized access" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode403 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode429 { content = content }
          else
            let content = "Unexpected errors" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateDefaultStatusCode { content = content }

      //#endregion

    let MsotEventsApiService = MsotEventsApiServiceImpl() :> IMsotEventsApiService