namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.LabelUpdateRequest
open OpenAPI.Model.LabelsList200Response
open OpenAPI.Model.LabelsResponse
open System.Collections.Generic
open System

module LabelsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type LabelsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LabelsCreateBodyParams = LabelCreateRequest
    //#endregion


    type LabelsCreateStatusCode200Response = {
      content:LabelsResponse;
      
    }

    type LabelsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LabelsCreateResult = LabelsCreateStatusCode200 of LabelsCreateStatusCode200Response|LabelsCreateDefaultStatusCode of LabelsCreateDefaultStatusCodeResponse

    type LabelsCreateArgs = {
      pathParams:LabelsCreatePathParams;
      bodyParams:LabelsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type LabelsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type LabelsListQueryParams = {
      campaignIds : string[] option;


      labelIds : string[] option;


      entityStatuses : string[] option;


      labelTypes : string[] option;


      pageSize : int option;


      bookmark : string option;

    }
    //#endregion


    type LabelsListStatusCode200Response = {
      content:LabelsList200Response;
      
    }

    type LabelsListStatusCode400Response = {
      content:Error;
      
    }

    type LabelsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LabelsListResult = LabelsListStatusCode200 of LabelsListStatusCode200Response|LabelsListStatusCode400 of LabelsListStatusCode400Response|LabelsListDefaultStatusCode of LabelsListDefaultStatusCodeResponse

    type LabelsListArgs = {
      pathParams:LabelsListPathParams;
      queryParams:Result<LabelsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LabelsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LabelsUpdateBodyParams = LabelUpdateRequest
    //#endregion


    type LabelsUpdateStatusCode200Response = {
      content:LabelsResponse;
      
    }

    type LabelsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LabelsUpdateResult = LabelsUpdateStatusCode200 of LabelsUpdateStatusCode200Response|LabelsUpdateDefaultStatusCode of LabelsUpdateDefaultStatusCodeResponse

    type LabelsUpdateArgs = {
      pathParams:LabelsUpdatePathParams;
      bodyParams:LabelsUpdateBodyParams
    }
