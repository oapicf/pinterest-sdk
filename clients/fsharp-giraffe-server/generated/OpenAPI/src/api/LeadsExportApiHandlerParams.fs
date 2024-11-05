namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.LeadsExportCreateRequest
open OpenAPI.Model.LeadsExportCreateResponse
open OpenAPI.Model.LeadsExportResponseData
open System.Collections.Generic
open System

module LeadsExportApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type LeadsExportCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LeadsExportCreateBodyParams = LeadsExportCreateRequest
    //#endregion


    type LeadsExportCreateStatusCode200Response = {
      content:LeadsExportCreateResponse;
      
    }

    type LeadsExportCreateStatusCode400Response = {
      content:Error;
      
    }

    type LeadsExportCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadsExportCreateResult = LeadsExportCreateStatusCode200 of LeadsExportCreateStatusCode200Response|LeadsExportCreateStatusCode400 of LeadsExportCreateStatusCode400Response|LeadsExportCreateDefaultStatusCode of LeadsExportCreateDefaultStatusCodeResponse

    type LeadsExportCreateArgs = {
      pathParams:LeadsExportCreatePathParams;
      bodyParams:LeadsExportCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type LeadsExportGetPathParams = {
      adAccountId : string ;
    //#endregion
      leadsExportId : string ;
    }
    //#endregion


    type LeadsExportGetStatusCode200Response = {
      content:LeadsExportResponseData;
      
    }

    type LeadsExportGetStatusCode400Response = {
      content:Error;
      
    }

    type LeadsExportGetStatusCode404Response = {
      content:Error;
      
    }

    type LeadsExportGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadsExportGetResult = LeadsExportGetStatusCode200 of LeadsExportGetStatusCode200Response|LeadsExportGetStatusCode400 of LeadsExportGetStatusCode400Response|LeadsExportGetStatusCode404 of LeadsExportGetStatusCode404Response|LeadsExportGetDefaultStatusCode of LeadsExportGetDefaultStatusCodeResponse

    type LeadsExportGetArgs = {
      pathParams:LeadsExportGetPathParams;
    }
