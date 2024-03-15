namespace OpenAPI
open OpenAPI.Model.ConversionApiResponse
open OpenAPI.Model.ConversionEvents
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error
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
            let content = "Success" :> obj :?> ConversionApiResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode200 { content = content }
          else if true then
            let content = "The request was invalid." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to send conversion events" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode401 { content = content }
          else if true then
            let content = "Unauthorized access." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode403 { content = content }
          else if true then
            let content = "Not all events were successfully processed." :> obj :?> DetailedError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode422 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode429 { content = content }
          else if true then
            let content = "The endpoint has been ramped down and is currently not accepting any traffic." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateStatusCode503 { content = content }
          else
            let content = "Unexpected errors" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            EventsCreateDefaultStatusCode { content = content }

      //#endregion

    let ConversionEventsApiService = ConversionEventsApiServiceImpl() :> IConversionEventsApiService