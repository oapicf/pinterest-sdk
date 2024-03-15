namespace OpenAPI

open OpenAPI.Model.AdAccountsCatalogsProductGroupsList200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module ProductGroupsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsCatalogsProductGroupsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountsCatalogsProductGroupsListQueryParams = {
      feedProfileId : string option;

    }
    //#endregion


    type AdAccountsCatalogsProductGroupsListStatusCode200Response = {
      content:AdAccountsCatalogsProductGroupsList200Response;
      
    }

    type AdAccountsCatalogsProductGroupsListStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountsCatalogsProductGroupsListStatusCode401Response = {
      content:Error;
      
    }

    type AdAccountsCatalogsProductGroupsListStatusCode404Response = {
      content:Error;
      
    }

    type AdAccountsCatalogsProductGroupsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsCatalogsProductGroupsListResult = AdAccountsCatalogsProductGroupsListStatusCode200 of AdAccountsCatalogsProductGroupsListStatusCode200Response|AdAccountsCatalogsProductGroupsListStatusCode400 of AdAccountsCatalogsProductGroupsListStatusCode400Response|AdAccountsCatalogsProductGroupsListStatusCode401 of AdAccountsCatalogsProductGroupsListStatusCode401Response|AdAccountsCatalogsProductGroupsListStatusCode404 of AdAccountsCatalogsProductGroupsListStatusCode404Response|AdAccountsCatalogsProductGroupsListDefaultStatusCode of AdAccountsCatalogsProductGroupsListDefaultStatusCodeResponse

    type AdAccountsCatalogsProductGroupsListArgs = {
      pathParams:AdAccountsCatalogsProductGroupsListPathParams;
      queryParams:Result<AdAccountsCatalogsProductGroupsListQueryParams,string>;
    }
