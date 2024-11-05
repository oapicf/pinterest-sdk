namespace OpenAPI
open AdvancedAuctionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AdvancedAuctionApiServiceInterface =

    //#region Service interface
    type IAdvancedAuctionApiService =
      abstract member AdvancedAuctionItemsGetPost : AdvancedAuctionItemsGetPostBodyParams -> AdvancedAuctionItemsGetPostResult
      abstract member AdvancedAuctionItemsSubmitPost : AdvancedAuctionItemsSubmitPostBodyParams -> AdvancedAuctionItemsSubmitPostResult
    //#endregion