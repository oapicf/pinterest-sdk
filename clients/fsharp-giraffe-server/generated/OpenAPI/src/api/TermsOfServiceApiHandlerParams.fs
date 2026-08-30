namespace OpenAPI

open OpenAPI.Model.PinterestLibError
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

    type TermsOfServiceGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TermsOfServiceGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TermsOfServiceGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TermsOfServiceGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TermsOfServiceGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TermsOfServiceGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TermsOfServiceGetResult = TermsOfServiceGetStatusCode200 of TermsOfServiceGetStatusCode200Response|TermsOfServiceGetStatusCode400 of TermsOfServiceGetStatusCode400Response|TermsOfServiceGetStatusCode401 of TermsOfServiceGetStatusCode401Response|TermsOfServiceGetStatusCode403 of TermsOfServiceGetStatusCode403Response|TermsOfServiceGetStatusCode404 of TermsOfServiceGetStatusCode404Response|TermsOfServiceGetStatusCode429 of TermsOfServiceGetStatusCode429Response|TermsOfServiceGetDefaultStatusCode of TermsOfServiceGetDefaultStatusCodeResponse

    type TermsOfServiceGetArgs = {
      pathParams:TermsOfServiceGetPathParams;
      queryParams:Result<TermsOfServiceGetQueryParams,string>;
    }
