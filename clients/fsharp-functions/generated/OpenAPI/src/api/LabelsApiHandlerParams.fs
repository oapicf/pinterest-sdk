namespace OpenAPI

open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.LabelUpdateRequest
open OpenAPI.Model.LabeledEntities
open OpenAPI.Model.LabeledEntitiesCreate
open OpenAPI.Model.LabelsList200Response
open OpenAPI.Model.LabelsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.QueryLabelEntityStatusesItems
open OpenAPI.Model.QueryLabelTypesItems
open System.Collections.Generic
open System

module LabelsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type LabelsApplyPathParams = {
      adAccountId : string ;
    //#endregion
      labelId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LabelsApplyBodyParams = LabeledEntitiesCreate
    //#endregion


    type LabelsApplyStatusCode200Response = {
      content:LabeledEntities;
      
    }

    type LabelsApplyStatusCode201Response = {
      content:LabeledEntities;
      
    }

    type LabelsApplyStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LabelsApplyStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LabelsApplyStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LabelsApplyStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LabelsApplyStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LabelsApplyDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LabelsApplyResult = LabelsApplyStatusCode200 of LabelsApplyStatusCode200Response|LabelsApplyStatusCode201 of LabelsApplyStatusCode201Response|LabelsApplyStatusCode400 of LabelsApplyStatusCode400Response|LabelsApplyStatusCode401 of LabelsApplyStatusCode401Response|LabelsApplyStatusCode403 of LabelsApplyStatusCode403Response|LabelsApplyStatusCode404 of LabelsApplyStatusCode404Response|LabelsApplyStatusCode429 of LabelsApplyStatusCode429Response|LabelsApplyDefaultStatusCode of LabelsApplyDefaultStatusCodeResponse

    type LabelsApplyArgs = {
      pathParams:LabelsApplyPathParams;
      bodyParams:LabelsApplyBodyParams
    }
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

    type LabelsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LabelsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LabelsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LabelsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LabelsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LabelsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LabelsCreateResult = LabelsCreateStatusCode200 of LabelsCreateStatusCode200Response|LabelsCreateStatusCode400 of LabelsCreateStatusCode400Response|LabelsCreateStatusCode401 of LabelsCreateStatusCode401Response|LabelsCreateStatusCode403 of LabelsCreateStatusCode403Response|LabelsCreateStatusCode404 of LabelsCreateStatusCode404Response|LabelsCreateStatusCode429 of LabelsCreateStatusCode429Response|LabelsCreateDefaultStatusCode of LabelsCreateDefaultStatusCodeResponse

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


      entityStatuses : QueryLabelEntityStatusesItems[] option;


      labelTypes : QueryLabelTypesItems[] option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type LabelsListStatusCode200Response = {
      content:LabelsList200Response;
      
    }

    type LabelsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LabelsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LabelsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LabelsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LabelsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LabelsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LabelsListResult = LabelsListStatusCode200 of LabelsListStatusCode200Response|LabelsListStatusCode400 of LabelsListStatusCode400Response|LabelsListStatusCode401 of LabelsListStatusCode401Response|LabelsListStatusCode403 of LabelsListStatusCode403Response|LabelsListStatusCode404 of LabelsListStatusCode404Response|LabelsListStatusCode429 of LabelsListStatusCode429Response|LabelsListDefaultStatusCode of LabelsListDefaultStatusCodeResponse

    type LabelsListArgs = {
      pathParams:LabelsListPathParams;
      queryParams:Result<LabelsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type LabelsRemovePathParams = {
      adAccountId : string ;
    //#endregion
      labelId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type LabelsRemoveBodyParams = LabeledEntitiesCreate
    //#endregion


    type LabelsRemoveStatusCode200Response = {
      content:LabeledEntities;
      
    }

    type LabelsRemoveStatusCode201Response = {
      content:LabeledEntities;
      
    }

    type LabelsRemoveStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LabelsRemoveStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LabelsRemoveStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LabelsRemoveStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LabelsRemoveStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LabelsRemoveDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LabelsRemoveResult = LabelsRemoveStatusCode200 of LabelsRemoveStatusCode200Response|LabelsRemoveStatusCode201 of LabelsRemoveStatusCode201Response|LabelsRemoveStatusCode400 of LabelsRemoveStatusCode400Response|LabelsRemoveStatusCode401 of LabelsRemoveStatusCode401Response|LabelsRemoveStatusCode403 of LabelsRemoveStatusCode403Response|LabelsRemoveStatusCode404 of LabelsRemoveStatusCode404Response|LabelsRemoveStatusCode429 of LabelsRemoveStatusCode429Response|LabelsRemoveDefaultStatusCode of LabelsRemoveDefaultStatusCodeResponse

    type LabelsRemoveArgs = {
      pathParams:LabelsRemovePathParams;
      bodyParams:LabelsRemoveBodyParams
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

    type LabelsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LabelsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LabelsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LabelsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LabelsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LabelsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LabelsUpdateResult = LabelsUpdateStatusCode200 of LabelsUpdateStatusCode200Response|LabelsUpdateStatusCode400 of LabelsUpdateStatusCode400Response|LabelsUpdateStatusCode401 of LabelsUpdateStatusCode401Response|LabelsUpdateStatusCode403 of LabelsUpdateStatusCode403Response|LabelsUpdateStatusCode404 of LabelsUpdateStatusCode404Response|LabelsUpdateStatusCode429 of LabelsUpdateStatusCode429Response|LabelsUpdateDefaultStatusCode of LabelsUpdateDefaultStatusCodeResponse

    type LabelsUpdateArgs = {
      pathParams:LabelsUpdatePathParams;
      bodyParams:LabelsUpdateBodyParams
    }
