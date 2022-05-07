namespace OpenAPI

open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.CatalogsFeedsCreateRequest
open OpenAPI.Model.CatalogsFeedsUpdateRequest
open OpenAPI.Model.CatalogsItems
open OpenAPI.Model.CatalogsItemsBatch
open OpenAPI.Model.CatalogsItemsBatchRequest
open OpenAPI.Model.CatalogsProductGroup
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.Error
open OpenAPI.Model.Paginated
open System.Collections.Generic
open System

module CatalogsApiHandlerParams =


    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateBodyParams = CatalogsProductGroupCreateRequest
    //#endregion


    type CatalogsProductGroupsCreateStatusCode201Response = {
      content:obj;
      
    }

    type CatalogsProductGroupsCreateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsCreateResult = CatalogsProductGroupsCreateStatusCode201 of CatalogsProductGroupsCreateStatusCode201Response|CatalogsProductGroupsCreateStatusCode400 of CatalogsProductGroupsCreateStatusCode400Response|CatalogsProductGroupsCreateStatusCode401 of CatalogsProductGroupsCreateStatusCode401Response|CatalogsProductGroupsCreateStatusCode403 of CatalogsProductGroupsCreateStatusCode403Response|CatalogsProductGroupsCreateStatusCode409 of CatalogsProductGroupsCreateStatusCode409Response|CatalogsProductGroupsCreateDefaultStatusCode of CatalogsProductGroupsCreateDefaultStatusCodeResponse

    type CatalogsProductGroupsCreateArgs = {
      bodyParams:CatalogsProductGroupsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeletePathParams = {
      productGroupId : string ;
    }
    //#endregion


    type CatalogsProductGroupsDeleteStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsDeleteResult = CatalogsProductGroupsDeleteStatusCode204 of CatalogsProductGroupsDeleteStatusCode204Response|CatalogsProductGroupsDeleteStatusCode400 of CatalogsProductGroupsDeleteStatusCode400Response|CatalogsProductGroupsDeleteStatusCode401 of CatalogsProductGroupsDeleteStatusCode401Response|CatalogsProductGroupsDeleteStatusCode403 of CatalogsProductGroupsDeleteStatusCode403Response|CatalogsProductGroupsDeleteStatusCode404 of CatalogsProductGroupsDeleteStatusCode404Response|CatalogsProductGroupsDeleteStatusCode409 of CatalogsProductGroupsDeleteStatusCode409Response|CatalogsProductGroupsDeleteDefaultStatusCode of CatalogsProductGroupsDeleteDefaultStatusCodeResponse

    type CatalogsProductGroupsDeleteArgs = {
      pathParams:CatalogsProductGroupsDeletePathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsListQueryParams = {
      feedId : string ;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type CatalogsProductGroupsListStatusCode200Response = {
      content:Paginated;
      
    }

    type CatalogsProductGroupsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsListResult = CatalogsProductGroupsListStatusCode200 of CatalogsProductGroupsListStatusCode200Response|CatalogsProductGroupsListStatusCode400 of CatalogsProductGroupsListStatusCode400Response|CatalogsProductGroupsListStatusCode401 of CatalogsProductGroupsListStatusCode401Response|CatalogsProductGroupsListStatusCode403 of CatalogsProductGroupsListStatusCode403Response|CatalogsProductGroupsListStatusCode404 of CatalogsProductGroupsListStatusCode404Response|CatalogsProductGroupsListStatusCode409 of CatalogsProductGroupsListStatusCode409Response|CatalogsProductGroupsListDefaultStatusCode of CatalogsProductGroupsListDefaultStatusCodeResponse

    type CatalogsProductGroupsListArgs = {
      queryParams:Result<CatalogsProductGroupsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdatePathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdateBodyParams = CatalogsProductGroupUpdateRequest
    //#endregion


    type CatalogsProductGroupsUpdateStatusCode200Response = {
      content:CatalogsProductGroup;
      
    }

    type CatalogsProductGroupsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsUpdateResult = CatalogsProductGroupsUpdateStatusCode200 of CatalogsProductGroupsUpdateStatusCode200Response|CatalogsProductGroupsUpdateStatusCode400 of CatalogsProductGroupsUpdateStatusCode400Response|CatalogsProductGroupsUpdateStatusCode401 of CatalogsProductGroupsUpdateStatusCode401Response|CatalogsProductGroupsUpdateStatusCode404 of CatalogsProductGroupsUpdateStatusCode404Response|CatalogsProductGroupsUpdateStatusCode409 of CatalogsProductGroupsUpdateStatusCode409Response|CatalogsProductGroupsUpdateDefaultStatusCode of CatalogsProductGroupsUpdateDefaultStatusCodeResponse

    type CatalogsProductGroupsUpdateArgs = {
      pathParams:CatalogsProductGroupsUpdatePathParams;
      bodyParams:CatalogsProductGroupsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedProcessingResultsListPathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type FeedProcessingResultsListQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type FeedProcessingResultsListStatusCode200Response = {
      content:Paginated;
      
    }

    type FeedProcessingResultsListStatusCode400Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListStatusCode401Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListStatusCode404Response = {
      content:Error;
      
    }

    type FeedProcessingResultsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedProcessingResultsListResult = FeedProcessingResultsListStatusCode200 of FeedProcessingResultsListStatusCode200Response|FeedProcessingResultsListStatusCode400 of FeedProcessingResultsListStatusCode400Response|FeedProcessingResultsListStatusCode401 of FeedProcessingResultsListStatusCode401Response|FeedProcessingResultsListStatusCode404 of FeedProcessingResultsListStatusCode404Response|FeedProcessingResultsListDefaultStatusCode of FeedProcessingResultsListDefaultStatusCodeResponse

    type FeedProcessingResultsListArgs = {
      pathParams:FeedProcessingResultsListPathParams;
      queryParams:Result<FeedProcessingResultsListQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type FeedsCreateBodyParams = CatalogsFeedsCreateRequest
    //#endregion


    type FeedsCreateStatusCode201Response = {
      content:CatalogsFeed;
      
    }

    type FeedsCreateStatusCode400Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode401Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode403Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode409Response = {
      content:Error;
      
    }

    type FeedsCreateStatusCode422Response = {
      content:Error;
      
    }

    type FeedsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsCreateResult = FeedsCreateStatusCode201 of FeedsCreateStatusCode201Response|FeedsCreateStatusCode400 of FeedsCreateStatusCode400Response|FeedsCreateStatusCode401 of FeedsCreateStatusCode401Response|FeedsCreateStatusCode403 of FeedsCreateStatusCode403Response|FeedsCreateStatusCode409 of FeedsCreateStatusCode409Response|FeedsCreateStatusCode422 of FeedsCreateStatusCode422Response|FeedsCreateDefaultStatusCode of FeedsCreateDefaultStatusCodeResponse

    type FeedsCreateArgs = {
      bodyParams:FeedsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsDeletePathParams = {
      feedId : string ;
    }
    //#endregion


    type FeedsDeleteStatusCode204Response = {
      content:string;
      
    }

    type FeedsDeleteStatusCode400Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type FeedsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type FeedsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsDeleteResult = FeedsDeleteStatusCode204 of FeedsDeleteStatusCode204Response|FeedsDeleteStatusCode400 of FeedsDeleteStatusCode400Response|FeedsDeleteStatusCode403 of FeedsDeleteStatusCode403Response|FeedsDeleteStatusCode404 of FeedsDeleteStatusCode404Response|FeedsDeleteStatusCode409 of FeedsDeleteStatusCode409Response|FeedsDeleteDefaultStatusCode of FeedsDeleteDefaultStatusCodeResponse

    type FeedsDeleteArgs = {
      pathParams:FeedsDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsGetPathParams = {
      feedId : string ;
    }
    //#endregion


    type FeedsGetStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsGetStatusCode400Response = {
      content:Error;
      
    }

    type FeedsGetStatusCode401Response = {
      content:Error;
      
    }

    type FeedsGetStatusCode404Response = {
      content:Error;
      
    }

    type FeedsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsGetResult = FeedsGetStatusCode200 of FeedsGetStatusCode200Response|FeedsGetStatusCode400 of FeedsGetStatusCode400Response|FeedsGetStatusCode401 of FeedsGetStatusCode401Response|FeedsGetStatusCode404 of FeedsGetStatusCode404Response|FeedsGetDefaultStatusCode of FeedsGetDefaultStatusCodeResponse

    type FeedsGetArgs = {
      pathParams:FeedsGetPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type FeedsListQueryParams = {
      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type FeedsListStatusCode200Response = {
      content:Paginated;
      
    }

    type FeedsListStatusCode400Response = {
      content:Error;
      
    }

    type FeedsListStatusCode401Response = {
      content:Error;
      
    }

    type FeedsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsListResult = FeedsListStatusCode200 of FeedsListStatusCode200Response|FeedsListStatusCode400 of FeedsListStatusCode400Response|FeedsListStatusCode401 of FeedsListStatusCode401Response|FeedsListDefaultStatusCode of FeedsListDefaultStatusCodeResponse

    type FeedsListArgs = {
      queryParams:Result<FeedsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type FeedsUpdatePathParams = {
      feedId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type FeedsUpdateBodyParams = CatalogsFeedsUpdateRequest
    //#endregion


    type FeedsUpdateStatusCode200Response = {
      content:CatalogsFeed;
      
    }

    type FeedsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type FeedsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type FeedsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type FeedsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type FeedsUpdateResult = FeedsUpdateStatusCode200 of FeedsUpdateStatusCode200Response|FeedsUpdateStatusCode400 of FeedsUpdateStatusCode400Response|FeedsUpdateStatusCode403 of FeedsUpdateStatusCode403Response|FeedsUpdateStatusCode404 of FeedsUpdateStatusCode404Response|FeedsUpdateDefaultStatusCode of FeedsUpdateDefaultStatusCodeResponse

    type FeedsUpdateArgs = {
      pathParams:FeedsUpdatePathParams;
      bodyParams:FeedsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ItemsBatchGetPathParams = {
      batchId : string ;
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

    type ItemsBatchGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsBatchGetResult = ItemsBatchGetStatusCode200 of ItemsBatchGetStatusCode200Response|ItemsBatchGetStatusCode401 of ItemsBatchGetStatusCode401Response|ItemsBatchGetStatusCode403 of ItemsBatchGetStatusCode403Response|ItemsBatchGetStatusCode404 of ItemsBatchGetStatusCode404Response|ItemsBatchGetDefaultStatusCode of ItemsBatchGetDefaultStatusCodeResponse

    type ItemsBatchGetArgs = {
      pathParams:ItemsBatchGetPathParams;
    }

    //#region Body parameters
    [<CLIMutable>]
    type ItemsBatchPostBodyParams = CatalogsItemsBatchRequest
    //#endregion


    type ItemsBatchPostStatusCode200Response = {
      content:CatalogsItemsBatch;
      
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
    type ItemsBatchPostResult = ItemsBatchPostStatusCode200 of ItemsBatchPostStatusCode200Response|ItemsBatchPostStatusCode401 of ItemsBatchPostStatusCode401Response|ItemsBatchPostStatusCode403 of ItemsBatchPostStatusCode403Response|ItemsBatchPostDefaultStatusCode of ItemsBatchPostDefaultStatusCodeResponse

    type ItemsBatchPostArgs = {
      bodyParams:ItemsBatchPostBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ItemsGetQueryParams = {
      country : string ;


      itemIds : string[] ;


      language : string ;

    }
    //#endregion


    type ItemsGetStatusCode200Response = {
      content:CatalogsItems;
      
    }

    type ItemsGetStatusCode401Response = {
      content:Error;
      
    }

    type ItemsGetStatusCode403Response = {
      content:Error;
      
    }

    type ItemsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ItemsGetResult = ItemsGetStatusCode200 of ItemsGetStatusCode200Response|ItemsGetStatusCode401 of ItemsGetStatusCode401Response|ItemsGetStatusCode403 of ItemsGetStatusCode403Response|ItemsGetDefaultStatusCode of ItemsGetDefaultStatusCodeResponse

    type ItemsGetArgs = {
      queryParams:Result<ItemsGetQueryParams,string>;
    }
