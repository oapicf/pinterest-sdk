namespace OpenAPI

open OpenAPI.Model.AdvancedAuctionItems
open OpenAPI.Model.AdvancedAuctionItemsGetRequest
open OpenAPI.Model.AdvancedAuctionItemsSubmitRequest
open OpenAPI.Model.AdvancedAuctionProcessedItems
open OpenAPI.Model.Error
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
      content:Error;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode401Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode403Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsGetPostStatusCode500Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsGetPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdvancedAuctionItemsGetPostResult = AdvancedAuctionItemsGetPostStatusCode200 of AdvancedAuctionItemsGetPostStatusCode200Response|AdvancedAuctionItemsGetPostStatusCode400 of AdvancedAuctionItemsGetPostStatusCode400Response|AdvancedAuctionItemsGetPostStatusCode401 of AdvancedAuctionItemsGetPostStatusCode401Response|AdvancedAuctionItemsGetPostStatusCode403 of AdvancedAuctionItemsGetPostStatusCode403Response|AdvancedAuctionItemsGetPostStatusCode500 of AdvancedAuctionItemsGetPostStatusCode500Response|AdvancedAuctionItemsGetPostDefaultStatusCode of AdvancedAuctionItemsGetPostDefaultStatusCodeResponse

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

    type AdvancedAuctionItemsSubmitPostStatusCode400Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode401Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode403Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsSubmitPostStatusCode500Response = {
      content:Error;
      
    }

    type AdvancedAuctionItemsSubmitPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdvancedAuctionItemsSubmitPostResult = AdvancedAuctionItemsSubmitPostStatusCode200 of AdvancedAuctionItemsSubmitPostStatusCode200Response|AdvancedAuctionItemsSubmitPostStatusCode400 of AdvancedAuctionItemsSubmitPostStatusCode400Response|AdvancedAuctionItemsSubmitPostStatusCode401 of AdvancedAuctionItemsSubmitPostStatusCode401Response|AdvancedAuctionItemsSubmitPostStatusCode403 of AdvancedAuctionItemsSubmitPostStatusCode403Response|AdvancedAuctionItemsSubmitPostStatusCode500 of AdvancedAuctionItemsSubmitPostStatusCode500Response|AdvancedAuctionItemsSubmitPostDefaultStatusCode of AdvancedAuctionItemsSubmitPostDefaultStatusCodeResponse

    type AdvancedAuctionItemsSubmitPostArgs = {
      queryParams:Result<AdvancedAuctionItemsSubmitPostQueryParams,string>;
      bodyParams:AdvancedAuctionItemsSubmitPostBodyParams
    }
