namespace OpenAPI

open OpenAPI.Model.BulkDownload
open OpenAPI.Model.BulkDownloadCreate
open OpenAPI.Model.BulkJobData
open OpenAPI.Model.BulkUpsertRequest
open OpenAPI.Model.BulkUpsertResponse
open OpenAPI.Model.PinterestLibError
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
    type BulkDownloadCreateBodyParams = BulkDownloadCreate
    //#endregion


    type BulkDownloadCreateStatusCode200Response = {
      content:BulkDownload;
      
    }

    type BulkDownloadCreateStatusCode201Response = {
      content:BulkDownload;
      
    }

    type BulkDownloadCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BulkDownloadCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BulkDownloadCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BulkDownloadCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BulkDownloadCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BulkDownloadCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BulkDownloadCreateResult = BulkDownloadCreateStatusCode200 of BulkDownloadCreateStatusCode200Response|BulkDownloadCreateStatusCode201 of BulkDownloadCreateStatusCode201Response|BulkDownloadCreateStatusCode400 of BulkDownloadCreateStatusCode400Response|BulkDownloadCreateStatusCode401 of BulkDownloadCreateStatusCode401Response|BulkDownloadCreateStatusCode403 of BulkDownloadCreateStatusCode403Response|BulkDownloadCreateStatusCode404 of BulkDownloadCreateStatusCode404Response|BulkDownloadCreateStatusCode429 of BulkDownloadCreateStatusCode429Response|BulkDownloadCreateDefaultStatusCode of BulkDownloadCreateDefaultStatusCodeResponse

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
      content:BulkJobData;
      
    }

    type BulkRequestGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type BulkRequestGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type BulkRequestGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type BulkRequestGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type BulkRequestGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type BulkRequestGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type BulkRequestGetResult = BulkRequestGetStatusCode200 of BulkRequestGetStatusCode200Response|BulkRequestGetStatusCode400 of BulkRequestGetStatusCode400Response|BulkRequestGetStatusCode401 of BulkRequestGetStatusCode401Response|BulkRequestGetStatusCode403 of BulkRequestGetStatusCode403Response|BulkRequestGetStatusCode404 of BulkRequestGetStatusCode404Response|BulkRequestGetStatusCode429 of BulkRequestGetStatusCode429Response|BulkRequestGetDefaultStatusCode of BulkRequestGetDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }
    type BulkUpsertCreateResult = BulkUpsertCreateStatusCode200 of BulkUpsertCreateStatusCode200Response|BulkUpsertCreateDefaultStatusCode of BulkUpsertCreateDefaultStatusCodeResponse

    type BulkUpsertCreateArgs = {
      pathParams:BulkUpsertCreatePathParams;
      bodyParams:BulkUpsertCreateBodyParams
    }
