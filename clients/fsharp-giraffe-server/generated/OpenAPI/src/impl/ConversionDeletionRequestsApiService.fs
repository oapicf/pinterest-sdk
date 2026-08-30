namespace OpenAPI
open OpenAPI.Model.ConversionDeletionRequest
open OpenAPI.Model.ConversionDeletionRequestCreate
open OpenAPI.Model.ConversionDeletionRequestList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open ConversionDeletionRequestsApiHandlerParams
open ConversionDeletionRequestsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ConversionDeletionRequestsApiServiceImplementation =

    //#region Service implementation
    type ConversionDeletionRequestsApiServiceImpl() =
      interface IConversionDeletionRequestsApiService with

        member this.ConversionDeletionRequestCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionDeletionRequest // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> ConversionDeletionRequest // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestCreateDefaultStatusCode { content = content }

        member this.ConversionDeletionRequestDelete ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionDeletionRequest // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode200 { content = content }
          else if true then
            let content = "Resource deleted successfully." 
            ConversionDeletionRequestDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestDeleteDefaultStatusCode { content = content }

        member this.ConversionDeletionRequestGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionDeletionRequest // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestGetDefaultStatusCode { content = content }

        member this.ConversionDeletionRequestList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ConversionDeletionRequestList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ConversionDeletionRequestListDefaultStatusCode { content = content }

      //#endregion

    let ConversionDeletionRequestsApiService = ConversionDeletionRequestsApiServiceImpl() :> IConversionDeletionRequestsApiService