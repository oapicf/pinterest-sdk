namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.LeadFormResponse
open OpenAPI.Model.LeadFormTestRequest
open OpenAPI.Model.LeadFormTestResponse
open OpenAPI.Model.LeadFormsList200Response
open System.Collections.Generic
open System

module LeadFormsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type LeadFormGetPathParams = {
      adAccountId : string ;
    //#endregion
      leadFormId : string ;
    }
    //#endregion


    type LeadFormGetStatusCode200Response = {
      content:LeadFormResponse;
      
    }

    type LeadFormGetStatusCode400Response = {
      content:Error;
      
    }

    type LeadFormGetStatusCode404Response = {
      content:Error;
      
    }

    type LeadFormGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadFormGetResult = LeadFormGetStatusCode200 of LeadFormGetStatusCode200Response|LeadFormGetStatusCode400 of LeadFormGetStatusCode400Response|LeadFormGetStatusCode404 of LeadFormGetStatusCode404Response|LeadFormGetDefaultStatusCode of LeadFormGetDefaultStatusCodeResponse

    type LeadFormGetArgs = {
      pathParams:LeadFormGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LeadFormTestCreatePathParams = {
      adAccountId : string ;
    //#endregion
      leadFormId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LeadFormTestCreateBodyParams = LeadFormTestRequest
    //#endregion


    type LeadFormTestCreateStatusCode200Response = {
      content:LeadFormTestResponse;
      
    }

    type LeadFormTestCreateStatusCode400Response = {
      content:Error;
      
    }

    type LeadFormTestCreateStatusCode404Response = {
      content:Error;
      
    }

    type LeadFormTestCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadFormTestCreateResult = LeadFormTestCreateStatusCode200 of LeadFormTestCreateStatusCode200Response|LeadFormTestCreateStatusCode400 of LeadFormTestCreateStatusCode400Response|LeadFormTestCreateStatusCode404 of LeadFormTestCreateStatusCode404Response|LeadFormTestCreateDefaultStatusCode of LeadFormTestCreateDefaultStatusCodeResponse

    type LeadFormTestCreateArgs = {
      pathParams:LeadFormTestCreatePathParams;
      bodyParams:LeadFormTestCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type LeadFormsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type LeadFormsListQueryParams = {
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type LeadFormsListStatusCode200Response = {
      content:LeadFormsList200Response;
      
    }

    type LeadFormsListStatusCode400Response = {
      content:Error;
      
    }

    type LeadFormsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadFormsListResult = LeadFormsListStatusCode200 of LeadFormsListStatusCode200Response|LeadFormsListStatusCode400 of LeadFormsListStatusCode400Response|LeadFormsListDefaultStatusCode of LeadFormsListDefaultStatusCodeResponse

    type LeadFormsListArgs = {
      pathParams:LeadFormsListPathParams;
      queryParams:Result<LeadFormsListQueryParams,string>;
    }
