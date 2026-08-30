namespace OpenAPI
open OpenAPI.Model.ConversionEvents
open OpenAPI.Model.ConversionEventsCreate
open OpenAPI.Model.DetailedError
open OpenAPI.Model.PinterestLibError
open ConversionEventsApiHandlerParams
open ConversionEventsApiServiceInterface
open System.Collections.Generic
open System

module ConversionEventsApiServiceImplementation =

    //#region Service implementation
    type ConversionEventsApiServiceImpl() =
      interface IConversionEventsApiService with

        member this.EventsCreate (parameters:EventsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionEvents // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode404 { content = content }
          else if true then
            let content = "The request was well-formed but was unable to be followed due to semantic errors." :> obj :?> DetailedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode422 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode429 { content = content }
          else if true then
            let content = "The server is currently unable to handle the request due to a temporary overload or scheduled maintenance." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode503 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateDefaultStatusCode { content = content }

      //#endregion

    let ConversionEventsApiService = ConversionEventsApiServiceImpl() :> IConversionEventsApiService