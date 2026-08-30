namespace OpenAPI

open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module AdvancedAuctionApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type AdvancedAuctionItemsGetPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdvancedAuctionItemsGetPostBodyParams = AdvancedAuctionItemsGetRequest
    //#endregion


    type AdvancedAuctionItemsGetPostStatusCode200Response = {
      content:AdvancedAuctionItems;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode500Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsGetPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvancedAuctionItemsGetPostResult = AdvancedAuctionItemsGetPostStatusCode200 of AdvancedAuctionItemsGetPostStatusCode200Response|AdvancedAuctionItemsGetPostStatusCode400 of AdvancedAuctionItemsGetPostStatusCode400Response|AdvancedAuctionItemsGetPostStatusCode401 of AdvancedAuctionItemsGetPostStatusCode401Response|AdvancedAuctionItemsGetPostStatusCode403 of AdvancedAuctionItemsGetPostStatusCode403Response|AdvancedAuctionItemsGetPostStatusCode404 of AdvancedAuctionItemsGetPostStatusCode404Response|AdvancedAuctionItemsGetPostStatusCode429 of AdvancedAuctionItemsGetPostStatusCode429Response|AdvancedAuctionItemsGetPostStatusCode500 of AdvancedAuctionItemsGetPostStatusCode500Response|AdvancedAuctionItemsGetPostDefaultStatusCode of AdvancedAuctionItemsGetPostDefaultStatusCodeResponse

    type AdvancedAuctionItemsGetPostArgs = {
      queryParams:Result<AdvancedAuctionItemsGetPostQueryParams,string>;
      bodyParams:AdvancedAuctionItemsGetPostBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type AdvancedAuctionItemsSubmitPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdvancedAuctionItemsSubmitPostBodyParams = AdvancedAuctionItemsSubmitRequest
    //#endregion


    type AdvancedAuctionItemsSubmitPostStatusCode200Response = {
      content:AdvancedAuctionProcessedItems;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode206Response = {
      content:AdvancedAuctionProcessedItems;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode500Response = {
      content:PinterestLibError;
      
    }

    type AdvancedAuctionItemsSubmitPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvancedAuctionItemsSubmitPostResult = AdvancedAuctionItemsSubmitPostStatusCode200 of AdvancedAuctionItemsSubmitPostStatusCode200Response|AdvancedAuctionItemsSubmitPostStatusCode206 of AdvancedAuctionItemsSubmitPostStatusCode206Response|AdvancedAuctionItemsSubmitPostStatusCode400 of AdvancedAuctionItemsSubmitPostStatusCode400Response|AdvancedAuctionItemsSubmitPostStatusCode401 of AdvancedAuctionItemsSubmitPostStatusCode401Response|AdvancedAuctionItemsSubmitPostStatusCode403 of AdvancedAuctionItemsSubmitPostStatusCode403Response|AdvancedAuctionItemsSubmitPostStatusCode404 of AdvancedAuctionItemsSubmitPostStatusCode404Response|AdvancedAuctionItemsSubmitPostStatusCode429 of AdvancedAuctionItemsSubmitPostStatusCode429Response|AdvancedAuctionItemsSubmitPostStatusCode500 of AdvancedAuctionItemsSubmitPostStatusCode500Response|AdvancedAuctionItemsSubmitPostDefaultStatusCode of AdvancedAuctionItemsSubmitPostDefaultStatusCodeResponse

    type AdvancedAuctionItemsSubmitPostArgs = {
      queryParams:Result<AdvancedAuctionItemsSubmitPostQueryParams,string>;
      bodyParams:AdvancedAuctionItemsSubmitPostBodyParams
    }
