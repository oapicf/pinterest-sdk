namespace OpenAPI
open OpenAPI.Model.EventQualityScore
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SourcePlatformOptions
open ConversionEqsApiHandlerParams
open ConversionEqsApiServiceInterface
open System.Collections.Generic
open System

module ConversionEqsApiServiceImplementation =

    //#region Service implementation
    type ConversionEqsApiServiceImpl() =
      interface IConversionEqsApiService with

        member this.ConversionEqsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> EventQualityScore[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionEqsListDefaultStatusCode { content = content }

      //#endregion

    let ConversionEqsApiService = ConversionEqsApiServiceImpl() :> IConversionEqsApiService