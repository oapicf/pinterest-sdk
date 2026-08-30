namespace OpenAPI

open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsBatchPostRequest
open OpenAPI.Model.CatalogsItemsRequest
open OpenAPI.Model.ItemsPost200Response
open OpenAPI.Model.PinterestLibError
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

    type ItemsBatchGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ItemsBatchGetResult = ItemsBatchGetStatusCode200 of ItemsBatchGetStatusCode200Response|ItemsBatchGetStatusCode400 of ItemsBatchGetStatusCode400Response|ItemsBatchGetStatusCode401 of ItemsBatchGetStatusCode401Response|ItemsBatchGetStatusCode403 of ItemsBatchGetStatusCode403Response|ItemsBatchGetStatusCode404 of ItemsBatchGetStatusCode404Response|ItemsBatchGetStatusCode429 of ItemsBatchGetStatusCode429Response|ItemsBatchGetDefaultStatusCode of ItemsBatchGetDefaultStatusCodeResponse

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
    type ItemsBatchPostBodyParams = CatalogsItemsBatchPostRequest
    //#endregion


    type ItemsBatchPostStatusCode200Response = {
      content:CatalogsItemsBatch;
      
    }

    type ItemsBatchPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ItemsBatchPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ItemsBatchPostResult = ItemsBatchPostStatusCode200 of ItemsBatchPostStatusCode200Response|ItemsBatchPostStatusCode400 of ItemsBatchPostStatusCode400Response|ItemsBatchPostStatusCode401 of ItemsBatchPostStatusCode401Response|ItemsBatchPostStatusCode403 of ItemsBatchPostStatusCode403Response|ItemsBatchPostStatusCode404 of ItemsBatchPostStatusCode404Response|ItemsBatchPostStatusCode429 of ItemsBatchPostStatusCode429Response|ItemsBatchPostDefaultStatusCode of ItemsBatchPostDefaultStatusCodeResponse

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
      content:ItemsPost200Response;
      
    }

    type ItemsPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ItemsPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ItemsPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ItemsPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ItemsPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ItemsPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ItemsPostResult = ItemsPostStatusCode200 of ItemsPostStatusCode200Response|ItemsPostStatusCode400 of ItemsPostStatusCode400Response|ItemsPostStatusCode401 of ItemsPostStatusCode401Response|ItemsPostStatusCode403 of ItemsPostStatusCode403Response|ItemsPostStatusCode404 of ItemsPostStatusCode404Response|ItemsPostStatusCode429 of ItemsPostStatusCode429Response|ItemsPostDefaultStatusCode of ItemsPostDefaultStatusCodeResponse

    type ItemsPostArgs = {
      queryParams:Result<ItemsPostQueryParams,string>;
      bodyParams:ItemsPostBodyParams
    }
