namespace OpenAPI

open OpenAPI.Model.AdAccountsAudience
open OpenAPI.Model.AdAccountsAudienceCreate
open OpenAPI.Model.AdAccountsAudienceUpdate
open OpenAPI.Model.AudienceOwnershipType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
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
    type AudiencesCreateBodyParams = AdAccountsAudienceCreate
    //#endregion


    type AudiencesCreateStatusCode200Response = {
      content:AdAccountsAudience;
      
    }

    type AudiencesCreateStatusCode201Response = {
      content:AdAccountsAudience;
      
    }

    type AudiencesCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudiencesCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudiencesCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudiencesCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudiencesCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudiencesCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudiencesCreateResult = AudiencesCreateStatusCode200 of AudiencesCreateStatusCode200Response|AudiencesCreateStatusCode201 of AudiencesCreateStatusCode201Response|AudiencesCreateStatusCode400 of AudiencesCreateStatusCode400Response|AudiencesCreateStatusCode401 of AudiencesCreateStatusCode401Response|AudiencesCreateStatusCode403 of AudiencesCreateStatusCode403Response|AudiencesCreateStatusCode404 of AudiencesCreateStatusCode404Response|AudiencesCreateStatusCode429 of AudiencesCreateStatusCode429Response|AudiencesCreateDefaultStatusCode of AudiencesCreateDefaultStatusCodeResponse

    type AudiencesCreateArgs = {
      pathParams:AudiencesCreatePathParams;
      bodyParams:AudiencesCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesGetPathParams = {
      audienceId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type AudiencesGetStatusCode200Response = {
      content:AdAccountsAudience;
      
    }

    type AudiencesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudiencesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudiencesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudiencesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudiencesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudiencesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudiencesGetResult = AudiencesGetStatusCode200 of AudiencesGetStatusCode200Response|AudiencesGetStatusCode400 of AudiencesGetStatusCode400Response|AudiencesGetStatusCode401 of AudiencesGetStatusCode401Response|AudiencesGetStatusCode403 of AudiencesGetStatusCode403Response|AudiencesGetStatusCode404 of AudiencesGetStatusCode404Response|AudiencesGetStatusCode429 of AudiencesGetStatusCode429Response|AudiencesGetDefaultStatusCode of AudiencesGetDefaultStatusCodeResponse

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


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      ownershipType : AudienceOwnershipType option;


      excludeNca : bool option;

    }
    //#endregion


    type AudiencesListStatusCode200Response = {
      content:AudiencesList200Response;
      
    }

    type AudiencesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudiencesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudiencesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudiencesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudiencesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudiencesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudiencesListResult = AudiencesListStatusCode200 of AudiencesListStatusCode200Response|AudiencesListStatusCode400 of AudiencesListStatusCode400Response|AudiencesListStatusCode401 of AudiencesListStatusCode401Response|AudiencesListStatusCode403 of AudiencesListStatusCode403Response|AudiencesListStatusCode404 of AudiencesListStatusCode404Response|AudiencesListStatusCode429 of AudiencesListStatusCode429Response|AudiencesListDefaultStatusCode of AudiencesListDefaultStatusCodeResponse

    type AudiencesListArgs = {
      pathParams:AudiencesListPathParams;
      queryParams:Result<AudiencesListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AudiencesUpdatePathParams = {
      audienceId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AudiencesUpdateBodyParams = AdAccountsAudienceUpdate
    //#endregion


    type AudiencesUpdateStatusCode200Response = {
      content:AdAccountsAudience;
      
    }

    type AudiencesUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AudiencesUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AudiencesUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AudiencesUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AudiencesUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AudiencesUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AudiencesUpdateResult = AudiencesUpdateStatusCode200 of AudiencesUpdateStatusCode200Response|AudiencesUpdateStatusCode400 of AudiencesUpdateStatusCode400Response|AudiencesUpdateStatusCode401 of AudiencesUpdateStatusCode401Response|AudiencesUpdateStatusCode403 of AudiencesUpdateStatusCode403Response|AudiencesUpdateStatusCode404 of AudiencesUpdateStatusCode404Response|AudiencesUpdateStatusCode429 of AudiencesUpdateStatusCode429Response|AudiencesUpdateDefaultStatusCode of AudiencesUpdateDefaultStatusCodeResponse

    type AudiencesUpdateArgs = {
      pathParams:AudiencesUpdatePathParams;
      bodyParams:AudiencesUpdateBodyParams
    }
