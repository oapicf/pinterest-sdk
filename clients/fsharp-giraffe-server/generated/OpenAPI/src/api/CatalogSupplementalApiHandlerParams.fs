namespace OpenAPI

open OpenAPI.Model.CatalogsLocalStoresCreate200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresDelete200ResponseInner
open OpenAPI.Model.CatalogsLocalStoresList200Response
open OpenAPI.Model.LocalInventoryItemsBatch
open OpenAPI.Model.LocalInventoryItemsBatchCreate
open OpenAPI.Model.LocalInventoryItemsGet
open OpenAPI.Model.LocalInventoryItemsGetCreate
open OpenAPI.Model.LocalStore
open OpenAPI.Model.LocalStoreBatchUpdate
open OpenAPI.Model.LocalStoreCreate
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SupplementalItemsBatchResponse
open System.Collections.Generic
open System

module CatalogSupplementalApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsBatchOperatePathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsBatchOperateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsBatchOperateBodyParams = LocalInventoryItemsBatchCreate
    //#endregion


    type CatalogsLocalInventoryItemsBatchOperateStatusCode200Response = {
      content:SupplementalItemsBatchResponse;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode201Response = {
      content:LocalInventoryItemsBatch;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsBatchOperateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalInventoryItemsBatchOperateResult = CatalogsLocalInventoryItemsBatchOperateStatusCode200 of CatalogsLocalInventoryItemsBatchOperateStatusCode200Response|CatalogsLocalInventoryItemsBatchOperateStatusCode201 of CatalogsLocalInventoryItemsBatchOperateStatusCode201Response|CatalogsLocalInventoryItemsBatchOperateStatusCode400 of CatalogsLocalInventoryItemsBatchOperateStatusCode400Response|CatalogsLocalInventoryItemsBatchOperateStatusCode401 of CatalogsLocalInventoryItemsBatchOperateStatusCode401Response|CatalogsLocalInventoryItemsBatchOperateStatusCode403 of CatalogsLocalInventoryItemsBatchOperateStatusCode403Response|CatalogsLocalInventoryItemsBatchOperateStatusCode404 of CatalogsLocalInventoryItemsBatchOperateStatusCode404Response|CatalogsLocalInventoryItemsBatchOperateStatusCode429 of CatalogsLocalInventoryItemsBatchOperateStatusCode429Response|CatalogsLocalInventoryItemsBatchOperateDefaultStatusCode of CatalogsLocalInventoryItemsBatchOperateDefaultStatusCodeResponse

    type CatalogsLocalInventoryItemsBatchOperateArgs = {
      pathParams:CatalogsLocalInventoryItemsBatchOperatePathParams;
      queryParams:Result<CatalogsLocalInventoryItemsBatchOperateQueryParams,string>;
      bodyParams:CatalogsLocalInventoryItemsBatchOperateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsPostPathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsPostQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsLocalInventoryItemsPostBodyParams = LocalInventoryItemsGetCreate
    //#endregion


    type CatalogsLocalInventoryItemsPostStatusCode200Response = {
      content:LocalInventoryItemsGet;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode201Response = {
      content:LocalInventoryItemsGet;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsPostStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalInventoryItemsPostDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalInventoryItemsPostResult = CatalogsLocalInventoryItemsPostStatusCode200 of CatalogsLocalInventoryItemsPostStatusCode200Response|CatalogsLocalInventoryItemsPostStatusCode201 of CatalogsLocalInventoryItemsPostStatusCode201Response|CatalogsLocalInventoryItemsPostStatusCode400 of CatalogsLocalInventoryItemsPostStatusCode400Response|CatalogsLocalInventoryItemsPostStatusCode401 of CatalogsLocalInventoryItemsPostStatusCode401Response|CatalogsLocalInventoryItemsPostStatusCode403 of CatalogsLocalInventoryItemsPostStatusCode403Response|CatalogsLocalInventoryItemsPostStatusCode404 of CatalogsLocalInventoryItemsPostStatusCode404Response|CatalogsLocalInventoryItemsPostStatusCode429 of CatalogsLocalInventoryItemsPostStatusCode429Response|CatalogsLocalInventoryItemsPostDefaultStatusCode of CatalogsLocalInventoryItemsPostDefaultStatusCodeResponse

    type CatalogsLocalInventoryItemsPostArgs = {
      pathParams:CatalogsLocalInventoryItemsPostPathParams;
      queryParams:Result<CatalogsLocalInventoryItemsPostQueryParams,string>;
      bodyParams:CatalogsLocalInventoryItemsPostBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalStoresCreatePathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalStoresCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsLocalStoresCreateBodyParams = LocalStoreCreate[]
    //#endregion


    type CatalogsLocalStoresCreateStatusCode200Response = {
      content:CatalogsLocalStoresCreate200ResponseInner[];
      
    }

    type CatalogsLocalStoresCreateStatusCode201Response = {
      content:LocalStore[];
      
    }

    type CatalogsLocalStoresCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalStoresCreateResult = CatalogsLocalStoresCreateStatusCode200 of CatalogsLocalStoresCreateStatusCode200Response|CatalogsLocalStoresCreateStatusCode201 of CatalogsLocalStoresCreateStatusCode201Response|CatalogsLocalStoresCreateStatusCode400 of CatalogsLocalStoresCreateStatusCode400Response|CatalogsLocalStoresCreateStatusCode401 of CatalogsLocalStoresCreateStatusCode401Response|CatalogsLocalStoresCreateStatusCode403 of CatalogsLocalStoresCreateStatusCode403Response|CatalogsLocalStoresCreateStatusCode404 of CatalogsLocalStoresCreateStatusCode404Response|CatalogsLocalStoresCreateStatusCode429 of CatalogsLocalStoresCreateStatusCode429Response|CatalogsLocalStoresCreateDefaultStatusCode of CatalogsLocalStoresCreateDefaultStatusCodeResponse

    type CatalogsLocalStoresCreateArgs = {
      pathParams:CatalogsLocalStoresCreatePathParams;
      queryParams:Result<CatalogsLocalStoresCreateQueryParams,string>;
      bodyParams:CatalogsLocalStoresCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalStoresDeletePathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalStoresDeleteQueryParams = {
      ids : string[] ;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsLocalStoresDeleteStatusCode200Response = {
      content:CatalogsLocalStoresDelete200ResponseInner[];
      
    }

    type CatalogsLocalStoresDeleteStatusCode204Response = {
      content:string;
      
    }

    type CatalogsLocalStoresDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalStoresDeleteResult = CatalogsLocalStoresDeleteStatusCode200 of CatalogsLocalStoresDeleteStatusCode200Response|CatalogsLocalStoresDeleteStatusCode204 of CatalogsLocalStoresDeleteStatusCode204Response|CatalogsLocalStoresDeleteStatusCode400 of CatalogsLocalStoresDeleteStatusCode400Response|CatalogsLocalStoresDeleteStatusCode401 of CatalogsLocalStoresDeleteStatusCode401Response|CatalogsLocalStoresDeleteStatusCode403 of CatalogsLocalStoresDeleteStatusCode403Response|CatalogsLocalStoresDeleteStatusCode404 of CatalogsLocalStoresDeleteStatusCode404Response|CatalogsLocalStoresDeleteStatusCode429 of CatalogsLocalStoresDeleteStatusCode429Response|CatalogsLocalStoresDeleteDefaultStatusCode of CatalogsLocalStoresDeleteDefaultStatusCodeResponse

    type CatalogsLocalStoresDeleteArgs = {
      pathParams:CatalogsLocalStoresDeletePathParams;
      queryParams:Result<CatalogsLocalStoresDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalStoresListPathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalStoresListQueryParams = {
      ids : string[] option;


      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type CatalogsLocalStoresListStatusCode200Response = {
      content:CatalogsLocalStoresList200Response;
      
    }

    type CatalogsLocalStoresListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalStoresListResult = CatalogsLocalStoresListStatusCode200 of CatalogsLocalStoresListStatusCode200Response|CatalogsLocalStoresListStatusCode400 of CatalogsLocalStoresListStatusCode400Response|CatalogsLocalStoresListStatusCode401 of CatalogsLocalStoresListStatusCode401Response|CatalogsLocalStoresListStatusCode403 of CatalogsLocalStoresListStatusCode403Response|CatalogsLocalStoresListStatusCode404 of CatalogsLocalStoresListStatusCode404Response|CatalogsLocalStoresListStatusCode429 of CatalogsLocalStoresListStatusCode429Response|CatalogsLocalStoresListDefaultStatusCode of CatalogsLocalStoresListDefaultStatusCodeResponse

    type CatalogsLocalStoresListArgs = {
      pathParams:CatalogsLocalStoresListPathParams;
      queryParams:Result<CatalogsLocalStoresListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsLocalStoresUpdatePathParams = {
      catalogId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsLocalStoresUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsLocalStoresUpdateBodyParams = LocalStoreBatchUpdate[]
    //#endregion


    type CatalogsLocalStoresUpdateStatusCode200Response = {
      content:CatalogsLocalStoresCreate200ResponseInner[];
      
    }

    type CatalogsLocalStoresUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsLocalStoresUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsLocalStoresUpdateResult = CatalogsLocalStoresUpdateStatusCode200 of CatalogsLocalStoresUpdateStatusCode200Response|CatalogsLocalStoresUpdateStatusCode400 of CatalogsLocalStoresUpdateStatusCode400Response|CatalogsLocalStoresUpdateStatusCode401 of CatalogsLocalStoresUpdateStatusCode401Response|CatalogsLocalStoresUpdateStatusCode403 of CatalogsLocalStoresUpdateStatusCode403Response|CatalogsLocalStoresUpdateStatusCode404 of CatalogsLocalStoresUpdateStatusCode404Response|CatalogsLocalStoresUpdateStatusCode429 of CatalogsLocalStoresUpdateStatusCode429Response|CatalogsLocalStoresUpdateDefaultStatusCode of CatalogsLocalStoresUpdateDefaultStatusCodeResponse

    type CatalogsLocalStoresUpdateArgs = {
      pathParams:CatalogsLocalStoresUpdatePathParams;
      queryParams:Result<CatalogsLocalStoresUpdateQueryParams,string>;
      bodyParams:CatalogsLocalStoresUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsSupplementalItemsBatchGetPathParams = {
      catalogId : string ;
    //#endregion
      batchId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsSupplementalItemsBatchGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsSupplementalItemsBatchGetStatusCode200Response = {
      content:SupplementalItemsBatchResponse;
      
    }

    type CatalogsSupplementalItemsBatchGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsSupplementalItemsBatchGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsSupplementalItemsBatchGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsSupplementalItemsBatchGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsSupplementalItemsBatchGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsSupplementalItemsBatchGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsSupplementalItemsBatchGetResult = CatalogsSupplementalItemsBatchGetStatusCode200 of CatalogsSupplementalItemsBatchGetStatusCode200Response|CatalogsSupplementalItemsBatchGetStatusCode400 of CatalogsSupplementalItemsBatchGetStatusCode400Response|CatalogsSupplementalItemsBatchGetStatusCode401 of CatalogsSupplementalItemsBatchGetStatusCode401Response|CatalogsSupplementalItemsBatchGetStatusCode403 of CatalogsSupplementalItemsBatchGetStatusCode403Response|CatalogsSupplementalItemsBatchGetStatusCode404 of CatalogsSupplementalItemsBatchGetStatusCode404Response|CatalogsSupplementalItemsBatchGetStatusCode429 of CatalogsSupplementalItemsBatchGetStatusCode429Response|CatalogsSupplementalItemsBatchGetDefaultStatusCode of CatalogsSupplementalItemsBatchGetDefaultStatusCodeResponse

    type CatalogsSupplementalItemsBatchGetArgs = {
      pathParams:CatalogsSupplementalItemsBatchGetPathParams;
      queryParams:Result<CatalogsSupplementalItemsBatchGetQueryParams,string>;
    }
