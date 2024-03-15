namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.TermsOfService
open System.Collections.Generic
open System

module TermsOfServiceApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type TermsOfServiceGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TermsOfServiceGetQueryParams = {
      includeHtml : bool option;


      tosType : string option;

    }
    //#endregion


    type TermsOfServiceGetStatusCode200Response = {
      content:TermsOfService;
      
    }

    type TermsOfServiceGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TermsOfServiceGetResult = TermsOfServiceGetStatusCode200 of TermsOfServiceGetStatusCode200Response|TermsOfServiceGetDefaultStatusCode of TermsOfServiceGetDefaultStatusCodeResponse

    type TermsOfServiceGetArgs = {
      pathParams:TermsOfServiceGetPathParams;
      queryParams:Result<TermsOfServiceGetQueryParams,string>;
    }
