namespace OpenAPI

open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsRequest
open OpenAPI.Model.Error
open OpenAPI.Model.ItemsBatchPostRequest
open System.Collections.Generic
open System

module CatalogItemsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ItemsBatchGetPathParams = {
      batchId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ItemsBatchGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type ItemsBatchGetStatusCode200Response = {
      content:CatalogsItemsBatch;
      
    }

    type ItemsBatchGetStatusCode401Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode403Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode404Response = {
      content:Error;
      
    }

    type ItemsBatchGetStatusCode405Response = {
      content:Error;
      
    }

    type ItemsBatchGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsBatchGetResult = ItemsBatchGetStatusCode200 of ItemsBatchGetStatusCode200Response|ItemsBatchGetStatusCode401 of ItemsBatchGetStatusCode401Response|ItemsBatchGetStatusCode403 of ItemsBatchGetStatusCode403Response|ItemsBatchGetStatusCode404 of ItemsBatchGetStatusCode404Response|ItemsBatchGetStatusCode405 of ItemsBatchGetStatusCode405Response|ItemsBatchGetDefaultStatusCode of ItemsBatchGetDefaultStatusCodeResponse

    type ItemsBatchGetArgs = {
      pathParams:ItemsBatchGetPathParams;
      queryParams:Result<ItemsBatchGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsBatchPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ItemsBatchPostBodyParams = ItemsBatchPostRequest
    //#endregion


    type ItemsBatchPostStatusCode200Response = {
      content:CatalogsItemsBatch;
      
    }

    type ItemsBatchPostStatusCode400Response = {
      content:Error;
      
    }

    type ItemsBatchPostStatusCode401Response = {
      content:Error;
      
    }

    type ItemsBatchPostStatusCode403Response = {
      content:Error;
      
    }

    type ItemsBatchPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsBatchPostResult = ItemsBatchPostStatusCode200 of ItemsBatchPostStatusCode200Response|ItemsBatchPostStatusCode400 of ItemsBatchPostStatusCode400Response|ItemsBatchPostStatusCode401 of ItemsBatchPostStatusCode401Response|ItemsBatchPostStatusCode403 of ItemsBatchPostStatusCode403Response|ItemsBatchPostDefaultStatusCode of ItemsBatchPostDefaultStatusCodeResponse

    type ItemsBatchPostArgs = {
      queryParams:Result<ItemsBatchPostQueryParams,string>;
      bodyParams:ItemsBatchPostBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ItemsPostBodyParams = CatalogsItemsRequest
    //#endregion


    type ItemsPostStatusCode200Response = {
      content:CatalogsItems;
      
    }

    type ItemsPostStatusCode400Response = {
      content:Error;
      
    }

    type ItemsPostStatusCode401Response = {
      content:Error;
      
    }

    type ItemsPostStatusCode403Response = {
      content:Error;
      
    }

    type ItemsPostDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsPostResult = ItemsPostStatusCode200 of ItemsPostStatusCode200Response|ItemsPostStatusCode400 of ItemsPostStatusCode400Response|ItemsPostStatusCode401 of ItemsPostStatusCode401Response|ItemsPostStatusCode403 of ItemsPostStatusCode403Response|ItemsPostDefaultStatusCode of ItemsPostDefaultStatusCodeResponse

    type ItemsPostArgs = {
      queryParams:Result<ItemsPostQueryParams,string>;
      bodyParams:ItemsPostBodyParams
    }
