namespace OpenAPI

open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.TargetingTemplate
open OpenAPI.Model.TargetingTemplateCreate
open OpenAPI.Model.TargetingTemplateList200Response
open OpenAPI.Model.TargetingTemplateUpdateRequestReadOrUpdate
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
      content:TargetingTemplate;
      
    }

    type TargetingTemplateCreateStatusCode201Response = {
      content:TargetingTemplate;
      
    }

    type TargetingTemplateCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TargetingTemplateCreateResult = TargetingTemplateCreateStatusCode200 of TargetingTemplateCreateStatusCode200Response|TargetingTemplateCreateStatusCode201 of TargetingTemplateCreateStatusCode201Response|TargetingTemplateCreateStatusCode400 of TargetingTemplateCreateStatusCode400Response|TargetingTemplateCreateStatusCode401 of TargetingTemplateCreateStatusCode401Response|TargetingTemplateCreateStatusCode403 of TargetingTemplateCreateStatusCode403Response|TargetingTemplateCreateStatusCode404 of TargetingTemplateCreateStatusCode404Response|TargetingTemplateCreateStatusCode429 of TargetingTemplateCreateStatusCode429Response|TargetingTemplateCreateDefaultStatusCode of TargetingTemplateCreateDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      includeSizing : bool option;


      searchQuery : string option;

    }
    //#endregion


    type TargetingTemplateListStatusCode200Response = {
      content:TargetingTemplateList200Response;
      
    }

    type TargetingTemplateListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TargetingTemplateListResult = TargetingTemplateListStatusCode200 of TargetingTemplateListStatusCode200Response|TargetingTemplateListStatusCode400 of TargetingTemplateListStatusCode400Response|TargetingTemplateListStatusCode401 of TargetingTemplateListStatusCode401Response|TargetingTemplateListStatusCode403 of TargetingTemplateListStatusCode403Response|TargetingTemplateListStatusCode404 of TargetingTemplateListStatusCode404Response|TargetingTemplateListStatusCode429 of TargetingTemplateListStatusCode429Response|TargetingTemplateListDefaultStatusCode of TargetingTemplateListDefaultStatusCodeResponse

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
    type TargetingTemplateUpdateBodyParams = TargetingTemplateUpdateRequestReadOrUpdate
    //#endregion


    type TargetingTemplateUpdateStatusCode200Response = {
      content:string;
      
    }

    type TargetingTemplateUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TargetingTemplateUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TargetingTemplateUpdateResult = TargetingTemplateUpdateStatusCode200 of TargetingTemplateUpdateStatusCode200Response|TargetingTemplateUpdateStatusCode400 of TargetingTemplateUpdateStatusCode400Response|TargetingTemplateUpdateStatusCode401 of TargetingTemplateUpdateStatusCode401Response|TargetingTemplateUpdateStatusCode403 of TargetingTemplateUpdateStatusCode403Response|TargetingTemplateUpdateStatusCode404 of TargetingTemplateUpdateStatusCode404Response|TargetingTemplateUpdateStatusCode429 of TargetingTemplateUpdateStatusCode429Response|TargetingTemplateUpdateDefaultStatusCode of TargetingTemplateUpdateDefaultStatusCodeResponse

    type TargetingTemplateUpdateArgs = {
      pathParams:TargetingTemplateUpdatePathParams;
      bodyParams:TargetingTemplateUpdateBodyParams
    }
