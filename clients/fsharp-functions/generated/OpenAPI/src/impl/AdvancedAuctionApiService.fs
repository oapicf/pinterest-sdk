namespace OpenAPI
open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.PinterestLibError
open AdvancedAuctionApiHandlerParams
open AdvancedAuctionApiServiceInterface
open System.Collections.Generic
open System

module AdvancedAuctionApiServiceImplementation =

    //#region Service implementation
    type AdvancedAuctionApiServiceImpl() =
      interface IAdvancedAuctionApiService with

        member this.AdvancedAuctionItemsGetPost (parameters:AdvancedAuctionItemsGetPostBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> AdvancedAuctionItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode429 { content = content }
          else if true then
            let content = "The server encountered an unexpected condition that prevented it from fulfilling the request." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode500 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostDefaultStatusCode { content = content }

        member this.AdvancedAuctionItemsSubmitPost (parameters:AdvancedAuctionItemsSubmitPostBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> AdvancedAuctionProcessedItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode200 { content = content }
          else if true then
            let content = "Successful" :> obj :?> AdvancedAuctionProcessedItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode206 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode429 { content = content }
          else if true then
            let content = "The server encountered an unexpected condition that prevented it from fulfilling the request." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode500 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostDefaultStatusCode { content = content }

      //#endregion

    let AdvancedAuctionApiService = AdvancedAuctionApiServiceImpl() :> IAdvancedAuctionApiService