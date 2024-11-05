namespace OpenAPI
open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.Error
open AdvancedAuctionApiHandlerParams
open AdvancedAuctionApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AdvancedAuctionApiServiceImplementation =

    //#region Service implementation
    type AdvancedAuctionApiServiceImpl() =
      interface IAdvancedAuctionApiService with

        member this.AdvancedAuctionItemsGetPost ctx args =
          if true then
            let content = "Response containing the bid option values for the requested retail catalog items. Items that don&#39;t exist or do not have bid options set won&#39;t be present in the response." :> obj :?> AdvancedAuctionItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode400 { content = content }
          else if true then
            let content = "Not authenticated to get item bid options" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to get item bid options" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode403 { content = content }
          else if true then
            let content = "Internal error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostStatusCode500 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsGetPostDefaultStatusCode { content = content }

        member this.AdvancedAuctionItemsSubmitPost ctx args =
          if true then
            let content = "Response containing the results of the item bid options operations" :> obj :?> AdvancedAuctionProcessedItems // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode200 { content = content }
          else if true then
            let content = "Invalid request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode400 { content = content }
          else if true then
            let content = "Not authenticated to post item bid options" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode401 { content = content }
          else if true then
            let content = "Not authorized to post item bid options" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode403 { content = content }
          else if true then
            let content = "Internal error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostStatusCode500 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdvancedAuctionItemsSubmitPostDefaultStatusCode { content = content }

      //#endregion

    let AdvancedAuctionApiService = AdvancedAuctionApiServiceImpl() :> IAdvancedAuctionApiService