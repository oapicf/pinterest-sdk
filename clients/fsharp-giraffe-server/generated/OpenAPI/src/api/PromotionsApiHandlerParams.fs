namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.PromotionCreateRequest
open OpenAPI.Model.PromotionResponse
open OpenAPI.Model.PromotionUpdateRequest
open OpenAPI.Model.PromotionsList200Response
open OpenAPI.Model.PromotionsResponse
open System.Collections.Generic
open System

module PromotionsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type PromotionsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PromotionsCreateBodyParams = PromotionCreateRequest[]
    //#endregion


    type PromotionsCreateStatusCode200Response = {
      content:PromotionsResponse;
      
    }

    type PromotionsCreateStatusCode400Response = {
      content:Error;
      
    }

    type PromotionsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PromotionsCreateResult = PromotionsCreateStatusCode200 of PromotionsCreateStatusCode200Response|PromotionsCreateStatusCode400 of PromotionsCreateStatusCode400Response|PromotionsCreateDefaultStatusCode of PromotionsCreateDefaultStatusCodeResponse

    type PromotionsCreateArgs = {
      pathParams:PromotionsCreatePathParams;
      bodyParams:PromotionsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsDeletePathParams = {
      adAccountId : string ;
    //#endregion
      promotionId : string ;
    }
    //#endregion


    type PromotionsDeleteStatusCode204Response = {
      content:string;
      
    }

    type PromotionsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PromotionsDeleteResult = PromotionsDeleteStatusCode204 of PromotionsDeleteStatusCode204Response|PromotionsDeleteDefaultStatusCode of PromotionsDeleteDefaultStatusCodeResponse

    type PromotionsDeleteArgs = {
      pathParams:PromotionsDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsGetPathParams = {
      adAccountId : string ;
    //#endregion
      promotionId : string ;
    }
    //#endregion


    type PromotionsGetStatusCode200Response = {
      content:PromotionResponse;
      
    }

    type PromotionsGetStatusCode404Response = {
      content:Error;
      
    }

    type PromotionsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PromotionsGetResult = PromotionsGetStatusCode200 of PromotionsGetStatusCode200Response|PromotionsGetStatusCode404 of PromotionsGetStatusCode404Response|PromotionsGetDefaultStatusCode of PromotionsGetDefaultStatusCodeResponse

    type PromotionsGetArgs = {
      pathParams:PromotionsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PromotionsListQueryParams = {
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type PromotionsListStatusCode200Response = {
      content:PromotionsList200Response;
      
    }

    type PromotionsListStatusCode400Response = {
      content:Error;
      
    }

    type PromotionsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PromotionsListResult = PromotionsListStatusCode200 of PromotionsListStatusCode200Response|PromotionsListStatusCode400 of PromotionsListStatusCode400Response|PromotionsListDefaultStatusCode of PromotionsListDefaultStatusCodeResponse

    type PromotionsListArgs = {
      pathParams:PromotionsListPathParams;
      queryParams:Result<PromotionsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PromotionsUpdateBodyParams = PromotionUpdateRequest[]
    //#endregion


    type PromotionsUpdateStatusCode200Response = {
      content:PromotionsResponse;
      
    }

    type PromotionsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type PromotionsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PromotionsUpdateResult = PromotionsUpdateStatusCode200 of PromotionsUpdateStatusCode200Response|PromotionsUpdateStatusCode400 of PromotionsUpdateStatusCode400Response|PromotionsUpdateDefaultStatusCode of PromotionsUpdateDefaultStatusCodeResponse

    type PromotionsUpdateArgs = {
      pathParams:PromotionsUpdatePathParams;
      bodyParams:PromotionsUpdateBodyParams
    }
