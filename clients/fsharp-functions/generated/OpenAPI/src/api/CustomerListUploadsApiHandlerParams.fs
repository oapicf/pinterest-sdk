namespace OpenAPI

open OpenAPI.Model.CustomerListUpload
open OpenAPI.Model.CustomerListUploadCreateRequest
open OpenAPI.Model.CustomerListUploadCreateResponse
open OpenAPI.Model.PinterestLibError
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

    type CustomerListUploadsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListUploadsCreateResult = CustomerListUploadsCreateStatusCode200 of CustomerListUploadsCreateStatusCode200Response|CustomerListUploadsCreateStatusCode400 of CustomerListUploadsCreateStatusCode400Response|CustomerListUploadsCreateStatusCode401 of CustomerListUploadsCreateStatusCode401Response|CustomerListUploadsCreateStatusCode403 of CustomerListUploadsCreateStatusCode403Response|CustomerListUploadsCreateStatusCode404 of CustomerListUploadsCreateStatusCode404Response|CustomerListUploadsCreateStatusCode429 of CustomerListUploadsCreateStatusCode429Response|CustomerListUploadsCreateDefaultStatusCode of CustomerListUploadsCreateDefaultStatusCodeResponse

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
      content:CustomerListUpload;
      
    }

    type CustomerListUploadsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListUploadsGetResult = CustomerListUploadsGetStatusCode200 of CustomerListUploadsGetStatusCode200Response|CustomerListUploadsGetStatusCode400 of CustomerListUploadsGetStatusCode400Response|CustomerListUploadsGetStatusCode401 of CustomerListUploadsGetStatusCode401Response|CustomerListUploadsGetStatusCode403 of CustomerListUploadsGetStatusCode403Response|CustomerListUploadsGetStatusCode404 of CustomerListUploadsGetStatusCode404Response|CustomerListUploadsGetStatusCode429 of CustomerListUploadsGetStatusCode429Response|CustomerListUploadsGetDefaultStatusCode of CustomerListUploadsGetDefaultStatusCodeResponse

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
      content:CustomerListUpload;
      
    }

    type CustomerListUploadsRunStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsRunStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsRunStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsRunStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsRunStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CustomerListUploadsRunDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CustomerListUploadsRunResult = CustomerListUploadsRunStatusCode200 of CustomerListUploadsRunStatusCode200Response|CustomerListUploadsRunStatusCode400 of CustomerListUploadsRunStatusCode400Response|CustomerListUploadsRunStatusCode401 of CustomerListUploadsRunStatusCode401Response|CustomerListUploadsRunStatusCode403 of CustomerListUploadsRunStatusCode403Response|CustomerListUploadsRunStatusCode404 of CustomerListUploadsRunStatusCode404Response|CustomerListUploadsRunStatusCode429 of CustomerListUploadsRunStatusCode429Response|CustomerListUploadsRunDefaultStatusCode of CustomerListUploadsRunDefaultStatusCodeResponse

    type CustomerListUploadsRunArgs = {
      pathParams:CustomerListUploadsRunPathParams;
    }
