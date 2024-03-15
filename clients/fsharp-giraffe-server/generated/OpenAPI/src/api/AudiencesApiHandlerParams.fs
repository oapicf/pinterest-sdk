namespace OpenAPI

open OpenAPI.Model.Audience
open OpenAPI.Model.AudienceCreateCustomRequest
open OpenAPI.Model.AudienceCreateRequest
open OpenAPI.Model.AudienceUpdateRequest
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module AudiencesApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AudiencesCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AudiencesCreateBodyParams = AudienceCreateRequest
    //#endregion


    type AudiencesCreateStatusCode200Response = {
      content:Audience;
      
    }

    type AudiencesCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudiencesCreateResult = AudiencesCreateStatusCode200 of AudiencesCreateStatusCode200Response|AudiencesCreateDefaultStatusCode of AudiencesCreateDefaultStatusCodeResponse

    type AudiencesCreateArgs = {
      pathParams:AudiencesCreatePathParams;
      bodyParams:AudiencesCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesCreateCustomPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AudiencesCreateCustomBodyParams = AudienceCreateCustomRequest
    //#endregion


    type AudiencesCreateCustomStatusCode200Response = {
      content:Audience;
      
    }

    type AudiencesCreateCustomDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudiencesCreateCustomResult = AudiencesCreateCustomStatusCode200 of AudiencesCreateCustomStatusCode200Response|AudiencesCreateCustomDefaultStatusCode of AudiencesCreateCustomDefaultStatusCodeResponse

    type AudiencesCreateCustomArgs = {
      pathParams:AudiencesCreateCustomPathParams;
      bodyParams:AudiencesCreateCustomBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesGetPathParams = {
      adAccountId : string ;
    //#endregion
      audienceId : string ;
    }
    //#endregion


    type AudiencesGetStatusCode200Response = {
      content:Audience;
      
    }

    type AudiencesGetStatusCode404Response = {
      content:Error;
      
    }

    type AudiencesGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudiencesGetResult = AudiencesGetStatusCode200 of AudiencesGetStatusCode200Response|AudiencesGetStatusCode404 of AudiencesGetStatusCode404Response|AudiencesGetDefaultStatusCode of AudiencesGetDefaultStatusCodeResponse

    type AudiencesGetArgs = {
      pathParams:AudiencesGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AudiencesListQueryParams = {
      bookmark : string option;


      order : string option;


      pageSize : int option;


      ownershipType : string option;

    }
    //#endregion


    type AudiencesListStatusCode200Response = {
      content:AudiencesList200Response;
      
    }

    type AudiencesListStatusCode400Response = {
      content:Error;
      
    }

    type AudiencesListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudiencesListResult = AudiencesListStatusCode200 of AudiencesListStatusCode200Response|AudiencesListStatusCode400 of AudiencesListStatusCode400Response|AudiencesListDefaultStatusCode of AudiencesListDefaultStatusCodeResponse

    type AudiencesListArgs = {
      pathParams:AudiencesListPathParams;
      queryParams:Result<AudiencesListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesUpdatePathParams = {
      adAccountId : string ;
    //#endregion
      audienceId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AudiencesUpdateBodyParams = AudienceUpdateRequest
    //#endregion


    type AudiencesUpdateStatusCode200Response = {
      content:Audience;
      
    }

    type AudiencesUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AudiencesUpdateResult = AudiencesUpdateStatusCode200 of AudiencesUpdateStatusCode200Response|AudiencesUpdateDefaultStatusCode of AudiencesUpdateDefaultStatusCodeResponse

    type AudiencesUpdateArgs = {
      pathParams:AudiencesUpdatePathParams;
      bodyParams:AudiencesUpdateBodyParams
    }
