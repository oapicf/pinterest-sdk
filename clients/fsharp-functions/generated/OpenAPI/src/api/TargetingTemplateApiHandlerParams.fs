namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.TargetingTemplateCreate
open OpenAPI.Model.TargetingTemplateGetResponseData
open OpenAPI.Model.TargetingTemplateList200Response
open OpenAPI.Model.TargetingTemplateUpdateRequest
open System.Collections.Generic
open System

module TargetingTemplateApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type TargetingTemplateCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type TargetingTemplateCreateBodyParams = TargetingTemplateCreate
    //#endregion


    type TargetingTemplateCreateStatusCode200Response = {
      content:TargetingTemplateGetResponseData;
      
    }

    type TargetingTemplateCreateStatusCode400Response = {
      content:Error;
      
    }

    type TargetingTemplateCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TargetingTemplateCreateResult = TargetingTemplateCreateStatusCode200 of TargetingTemplateCreateStatusCode200Response|TargetingTemplateCreateStatusCode400 of TargetingTemplateCreateStatusCode400Response|TargetingTemplateCreateDefaultStatusCode of TargetingTemplateCreateDefaultStatusCodeResponse

    type TargetingTemplateCreateArgs = {
      pathParams:TargetingTemplateCreatePathParams;
      bodyParams:TargetingTemplateCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type TargetingTemplateListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TargetingTemplateListQueryParams = {
      order : string option;


      includeSizing : bool option;


      searchQuery : string option;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type TargetingTemplateListStatusCode200Response = {
      content:TargetingTemplateList200Response;
      
    }

    type TargetingTemplateListStatusCode400Response = {
      content:Error;
      
    }

    type TargetingTemplateListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TargetingTemplateListResult = TargetingTemplateListStatusCode200 of TargetingTemplateListStatusCode200Response|TargetingTemplateListStatusCode400 of TargetingTemplateListStatusCode400Response|TargetingTemplateListDefaultStatusCode of TargetingTemplateListDefaultStatusCodeResponse

    type TargetingTemplateListArgs = {
      pathParams:TargetingTemplateListPathParams;
      queryParams:Result<TargetingTemplateListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TargetingTemplateUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type TargetingTemplateUpdateBodyParams = TargetingTemplateUpdateRequest
    //#endregion


    type TargetingTemplateUpdateStatusCode200Response = {
      content:string;
      
    }

    type TargetingTemplateUpdateStatusCode400Response = {
      content:Error;
      
    }

    type TargetingTemplateUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TargetingTemplateUpdateResult = TargetingTemplateUpdateStatusCode200 of TargetingTemplateUpdateStatusCode200Response|TargetingTemplateUpdateStatusCode400 of TargetingTemplateUpdateStatusCode400Response|TargetingTemplateUpdateDefaultStatusCode of TargetingTemplateUpdateDefaultStatusCodeResponse

    type TargetingTemplateUpdateArgs = {
      pathParams:TargetingTemplateUpdatePathParams;
      bodyParams:TargetingTemplateUpdateBodyParams
    }
