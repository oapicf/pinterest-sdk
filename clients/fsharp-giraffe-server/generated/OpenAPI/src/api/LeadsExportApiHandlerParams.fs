namespace OpenAPI

open OpenAPI.Model.LeadsExportResponseData
open OpenAPI.Model.LeadsExports
open OpenAPI.Model.LeadsExportsCreate
open OpenAPI.Model.PinterestLibError
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
    type LeadsExportCreateBodyParams = LeadsExportsCreate
    //#endregion


    type LeadsExportCreateStatusCode200Response = {
      content:LeadsExports;
      
    }

    type LeadsExportCreateStatusCode201Response = {
      content:LeadsExports;
      
    }

    type LeadsExportCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadsExportCreateResult = LeadsExportCreateStatusCode200 of LeadsExportCreateStatusCode200Response|LeadsExportCreateStatusCode201 of LeadsExportCreateStatusCode201Response|LeadsExportCreateStatusCode400 of LeadsExportCreateStatusCode400Response|LeadsExportCreateStatusCode401 of LeadsExportCreateStatusCode401Response|LeadsExportCreateStatusCode403 of LeadsExportCreateStatusCode403Response|LeadsExportCreateStatusCode404 of LeadsExportCreateStatusCode404Response|LeadsExportCreateStatusCode429 of LeadsExportCreateStatusCode429Response|LeadsExportCreateDefaultStatusCode of LeadsExportCreateDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type LeadsExportGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadsExportGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadsExportGetResult = LeadsExportGetStatusCode200 of LeadsExportGetStatusCode200Response|LeadsExportGetStatusCode400 of LeadsExportGetStatusCode400Response|LeadsExportGetStatusCode401 of LeadsExportGetStatusCode401Response|LeadsExportGetStatusCode403 of LeadsExportGetStatusCode403Response|LeadsExportGetStatusCode404 of LeadsExportGetStatusCode404Response|LeadsExportGetStatusCode429 of LeadsExportGetStatusCode429Response|LeadsExportGetDefaultStatusCode of LeadsExportGetDefaultStatusCodeResponse

    type LeadsExportGetArgs = {
      pathParams:LeadsExportGetPathParams;
    }
