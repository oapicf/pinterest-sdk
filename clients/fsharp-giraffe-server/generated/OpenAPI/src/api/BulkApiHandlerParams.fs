namespace OpenAPI

open OpenAPI.Model.BulkDownloadRequest
open OpenAPI.Model.BulkDownloadResponse
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.BulkUpsertStatusResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module BulkApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type BulkDownloadCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BulkDownloadCreateBodyParams = BulkDownloadRequest
    //#endregion


    type BulkDownloadCreateStatusCode200Response = {
      content:BulkDownloadResponse;
      
    }

    type BulkDownloadCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BulkDownloadCreateResult = BulkDownloadCreateStatusCode200 of BulkDownloadCreateStatusCode200Response|BulkDownloadCreateDefaultStatusCode of BulkDownloadCreateDefaultStatusCodeResponse

    type BulkDownloadCreateArgs = {
      pathParams:BulkDownloadCreatePathParams;
      bodyParams:BulkDownloadCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type BulkRequestGetPathParams = {
      adAccountId : string ;
    //#endregion
      bulkRequestId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type BulkRequestGetQueryParams = {
      includeDetails : bool option;

    }
    //#endregion


    type BulkRequestGetStatusCode200Response = {
      content:BulkUpsertStatusResponse;
      
    }

    type BulkRequestGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BulkRequestGetResult = BulkRequestGetStatusCode200 of BulkRequestGetStatusCode200Response|BulkRequestGetDefaultStatusCode of BulkRequestGetDefaultStatusCodeResponse

    type BulkRequestGetArgs = {
      pathParams:BulkRequestGetPathParams;
      queryParams:Result<BulkRequestGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type BulkUpsertCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type BulkUpsertCreateBodyParams = BulkUpsertRequest
    //#endregion


    type BulkUpsertCreateStatusCode200Response = {
      content:BulkUpsertResponse;
      
    }

    type BulkUpsertCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type BulkUpsertCreateResult = BulkUpsertCreateStatusCode200 of BulkUpsertCreateStatusCode200Response|BulkUpsertCreateDefaultStatusCode of BulkUpsertCreateDefaultStatusCodeResponse

    type BulkUpsertCreateArgs = {
      pathParams:BulkUpsertCreatePathParams;
      bodyParams:BulkUpsertCreateBodyParams
    }
