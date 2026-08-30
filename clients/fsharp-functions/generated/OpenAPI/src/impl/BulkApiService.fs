namespace OpenAPI
open OpenAPI.Model.BulkDownload
open OpenAPI.Model.BulkDownloadCreate
open OpenAPI.Model.BulkJobData
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.PinterestLibError
open BulkApiHandlerParams
open BulkApiServiceInterface
open System.Collections.Generic
open System

module BulkApiServiceImplementation =

    //#region Service implementation
    type BulkApiServiceImpl() =
      interface IBulkApiService with

        member this.BulkDownloadCreate (parameters:BulkDownloadCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> BulkDownload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> BulkDownload // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkDownloadCreateDefaultStatusCode { content = content }

        member this.BulkRequestGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> BulkJobData // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkRequestGetDefaultStatusCode { content = content }

        member this.BulkUpsertCreate (parameters:BulkUpsertCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> BulkUpsertResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkUpsertCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            BulkUpsertCreateDefaultStatusCode { content = content }

      //#endregion

    let BulkApiService = BulkApiServiceImpl() :> IBulkApiService