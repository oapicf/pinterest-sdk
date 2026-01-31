namespace OpenAPI

open OpenAPI.Model.CustomerListUploadCreateRequest
open OpenAPI.Model.CustomerListUploadCreateResponse
open OpenAPI.Model.CustomerListUploadResponse
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module CustomerListUploadsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CustomerListUploadsCreatePathParams = {
      adAccountId : string ;
    //#endregion
      customerListId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CustomerListUploadsCreateBodyParams = CustomerListUploadCreateRequest
    //#endregion


    type CustomerListUploadsCreateStatusCode200Response = {
      content:CustomerListUploadCreateResponse;
      
    }

    type CustomerListUploadsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListUploadsCreateResult = CustomerListUploadsCreateStatusCode200 of CustomerListUploadsCreateStatusCode200Response|CustomerListUploadsCreateDefaultStatusCode of CustomerListUploadsCreateDefaultStatusCodeResponse

    type CustomerListUploadsCreateArgs = {
      pathParams:CustomerListUploadsCreatePathParams;
      bodyParams:CustomerListUploadsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerListUploadsGetPathParams = {
      adAccountId : string ;
    //#endregion
      customerListId : string ;
    //#endregion
      customerListUploadId : string ;
    }
    //#endregion


    type CustomerListUploadsGetStatusCode200Response = {
      content:CustomerListUploadResponse;
      
    }

    type CustomerListUploadsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListUploadsGetResult = CustomerListUploadsGetStatusCode200 of CustomerListUploadsGetStatusCode200Response|CustomerListUploadsGetDefaultStatusCode of CustomerListUploadsGetDefaultStatusCodeResponse

    type CustomerListUploadsGetArgs = {
      pathParams:CustomerListUploadsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CustomerListUploadsRunPathParams = {
      adAccountId : string ;
    //#endregion
      customerListId : string ;
    //#endregion
      customerListUploadId : string ;
    }
    //#endregion


    type CustomerListUploadsRunStatusCode200Response = {
      content:CustomerListUploadResponse;
      
    }

    type CustomerListUploadsRunDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CustomerListUploadsRunResult = CustomerListUploadsRunStatusCode200 of CustomerListUploadsRunStatusCode200Response|CustomerListUploadsRunDefaultStatusCode of CustomerListUploadsRunDefaultStatusCodeResponse

    type CustomerListUploadsRunArgs = {
      pathParams:CustomerListUploadsRunPathParams;
    }
