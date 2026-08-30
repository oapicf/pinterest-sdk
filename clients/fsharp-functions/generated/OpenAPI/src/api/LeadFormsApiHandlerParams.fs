namespace OpenAPI

open OpenAPI.Model.LeadForm
open OpenAPI.Model.LeadFormBatchUpdate
open OpenAPI.Model.LeadFormCreate
open OpenAPI.Model.LeadFormTest
open OpenAPI.Model.LeadFormTestCreate
open OpenAPI.Model.LeadFormsCreate200Response
open OpenAPI.Model.LeadFormsList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open System.Collections.Generic
open System

module LeadFormsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type LeadFormGetPathParams = {
      leadFormId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type LeadFormGetStatusCode200Response = {
      content:LeadForm;
      
    }

    type LeadFormGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadFormGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadFormGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadFormGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormGetResult = LeadFormGetStatusCode200 of LeadFormGetStatusCode200Response|LeadFormGetStatusCode400 of LeadFormGetStatusCode400Response|LeadFormGetStatusCode401 of LeadFormGetStatusCode401Response|LeadFormGetStatusCode403 of LeadFormGetStatusCode403Response|LeadFormGetStatusCode404 of LeadFormGetStatusCode404Response|LeadFormGetStatusCode429 of LeadFormGetStatusCode429Response|LeadFormGetDefaultStatusCode of LeadFormGetDefaultStatusCodeResponse

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
    type LeadFormTestCreateBodyParams = LeadFormTestCreate
    //#endregion


    type LeadFormTestCreateStatusCode200Response = {
      content:LeadFormTest;
      
    }

    type LeadFormTestCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormTestCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormTestCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormTestCreateResult = LeadFormTestCreateStatusCode200 of LeadFormTestCreateStatusCode200Response|LeadFormTestCreateStatusCode400 of LeadFormTestCreateStatusCode400Response|LeadFormTestCreateStatusCode404 of LeadFormTestCreateStatusCode404Response|LeadFormTestCreateDefaultStatusCode of LeadFormTestCreateDefaultStatusCodeResponse

    type LeadFormTestCreateArgs = {
      pathParams:LeadFormTestCreatePathParams;
      bodyParams:LeadFormTestCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type LeadFormsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LeadFormsCreateBodyParams = LeadFormCreate[]
    //#endregion


    type LeadFormsCreateStatusCode200Response = {
      content:LeadFormsCreate200Response;
      
    }

    type LeadFormsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormsCreateResult = LeadFormsCreateStatusCode200 of LeadFormsCreateStatusCode200Response|LeadFormsCreateStatusCode400 of LeadFormsCreateStatusCode400Response|LeadFormsCreateStatusCode401 of LeadFormsCreateStatusCode401Response|LeadFormsCreateStatusCode403 of LeadFormsCreateStatusCode403Response|LeadFormsCreateStatusCode404 of LeadFormsCreateStatusCode404Response|LeadFormsCreateStatusCode429 of LeadFormsCreateStatusCode429Response|LeadFormsCreateDefaultStatusCode of LeadFormsCreateDefaultStatusCodeResponse

    type LeadFormsCreateArgs = {
      pathParams:LeadFormsCreatePathParams;
      bodyParams:LeadFormsCreateBodyParams
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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type LeadFormsListStatusCode200Response = {
      content:LeadFormsList200Response;
      
    }

    type LeadFormsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormsListResult = LeadFormsListStatusCode200 of LeadFormsListStatusCode200Response|LeadFormsListStatusCode400 of LeadFormsListStatusCode400Response|LeadFormsListStatusCode401 of LeadFormsListStatusCode401Response|LeadFormsListStatusCode403 of LeadFormsListStatusCode403Response|LeadFormsListStatusCode404 of LeadFormsListStatusCode404Response|LeadFormsListStatusCode429 of LeadFormsListStatusCode429Response|LeadFormsListDefaultStatusCode of LeadFormsListDefaultStatusCodeResponse

    type LeadFormsListArgs = {
      pathParams:LeadFormsListPathParams;
      queryParams:Result<LeadFormsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LeadFormsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LeadFormsUpdateBodyParams = LeadFormBatchUpdate[]
    //#endregion


    type LeadFormsUpdateStatusCode200Response = {
      content:LeadFormsCreate200Response;
      
    }

    type LeadFormsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadFormsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormsUpdateResult = LeadFormsUpdateStatusCode200 of LeadFormsUpdateStatusCode200Response|LeadFormsUpdateStatusCode400 of LeadFormsUpdateStatusCode400Response|LeadFormsUpdateStatusCode401 of LeadFormsUpdateStatusCode401Response|LeadFormsUpdateStatusCode403 of LeadFormsUpdateStatusCode403Response|LeadFormsUpdateStatusCode404 of LeadFormsUpdateStatusCode404Response|LeadFormsUpdateStatusCode429 of LeadFormsUpdateStatusCode429Response|LeadFormsUpdateDefaultStatusCode of LeadFormsUpdateDefaultStatusCodeResponse

    type LeadFormsUpdateArgs = {
      pathParams:LeadFormsUpdatePathParams;
      bodyParams:LeadFormsUpdateBodyParams
    }
