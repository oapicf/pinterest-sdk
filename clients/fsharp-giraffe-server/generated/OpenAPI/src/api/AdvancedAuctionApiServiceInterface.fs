namespace OpenAPI
open AdvancedAuctionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AdvancedAuctionApiServiceInterface =

    //#region Service interface
    type IAdvancedAuctionApiService =
      abstract member AdvancedAuctionItemsGetPost:HttpContext -> AdvancedAuctionItemsGetPostArgs->AdvancedAuctionItemsGetPostResult
      abstract member AdvancedAuctionItemsSubmitPost:HttpContext -> AdvancedAuctionItemsSubmitPostArgs->AdvancedAuctionItemsSubmitPostResult
    //#endregion