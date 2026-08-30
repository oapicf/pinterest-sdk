namespace OpenAPI
open OpenAPI.Model.ConversionMSOTEventsCreate
open OpenAPI.Model.PinterestLibError
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
            let content = "The request has succeeded." 
            MsotEventsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> obj // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MsotEventsCreateDefaultStatusCode { content = content }

      //#endregion

    let MsotEventsApiService = MsotEventsApiServiceImpl() :> IMsotEventsApiService