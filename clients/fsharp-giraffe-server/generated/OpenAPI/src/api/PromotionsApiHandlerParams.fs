namespace OpenAPI

open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.Promotion
open OpenAPI.Model.PromotionBatchUpdate
open OpenAPI.Model.PromotionCreate
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
    type PromotionsCreateBodyParams = PromotionCreate[]
    //#endregion


    type PromotionsCreateStatusCode200Response = {
      content:PromotionsResponse;
      
    }

    type PromotionsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PromotionsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PromotionsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PromotionsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PromotionsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PromotionsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PromotionsCreateResult = PromotionsCreateStatusCode200 of PromotionsCreateStatusCode200Response|PromotionsCreateStatusCode400 of PromotionsCreateStatusCode400Response|PromotionsCreateStatusCode401 of PromotionsCreateStatusCode401Response|PromotionsCreateStatusCode403 of PromotionsCreateStatusCode403Response|PromotionsCreateStatusCode404 of PromotionsCreateStatusCode404Response|PromotionsCreateStatusCode429 of PromotionsCreateStatusCode429Response|PromotionsCreateDefaultStatusCode of PromotionsCreateDefaultStatusCodeResponse

    type PromotionsCreateArgs = {
      pathParams:PromotionsCreatePathParams;
      bodyParams:PromotionsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsDeletePathParams = {
      promotionId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type PromotionsDeleteStatusCode200Response = {
      content:Promotion;
      
    }

    type PromotionsDeleteStatusCode204Response = {
      content:string;
      
    }

    type PromotionsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PromotionsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PromotionsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PromotionsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PromotionsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PromotionsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PromotionsDeleteResult = PromotionsDeleteStatusCode200 of PromotionsDeleteStatusCode200Response|PromotionsDeleteStatusCode204 of PromotionsDeleteStatusCode204Response|PromotionsDeleteStatusCode400 of PromotionsDeleteStatusCode400Response|PromotionsDeleteStatusCode401 of PromotionsDeleteStatusCode401Response|PromotionsDeleteStatusCode403 of PromotionsDeleteStatusCode403Response|PromotionsDeleteStatusCode404 of PromotionsDeleteStatusCode404Response|PromotionsDeleteStatusCode429 of PromotionsDeleteStatusCode429Response|PromotionsDeleteDefaultStatusCode of PromotionsDeleteDefaultStatusCodeResponse

    type PromotionsDeleteArgs = {
      pathParams:PromotionsDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PromotionsGetPathParams = {
      promotionId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type PromotionsGetStatusCode200Response = {
      content:Promotion;
      
    }

    type PromotionsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PromotionsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PromotionsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PromotionsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PromotionsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PromotionsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PromotionsGetResult = PromotionsGetStatusCode200 of PromotionsGetStatusCode200Response|PromotionsGetStatusCode400 of PromotionsGetStatusCode400Response|PromotionsGetStatusCode401 of PromotionsGetStatusCode401Response|PromotionsGetStatusCode403 of PromotionsGetStatusCode403Response|PromotionsGetStatusCode404 of PromotionsGetStatusCode404Response|PromotionsGetStatusCode429 of PromotionsGetStatusCode429Response|PromotionsGetDefaultStatusCode of PromotionsGetDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type PromotionsListStatusCode200Response = {
      content:PromotionsList200Response;
      
    }

    type PromotionsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PromotionsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PromotionsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PromotionsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PromotionsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PromotionsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PromotionsListResult = PromotionsListStatusCode200 of PromotionsListStatusCode200Response|PromotionsListStatusCode400 of PromotionsListStatusCode400Response|PromotionsListStatusCode401 of PromotionsListStatusCode401Response|PromotionsListStatusCode403 of PromotionsListStatusCode403Response|PromotionsListStatusCode404 of PromotionsListStatusCode404Response|PromotionsListStatusCode429 of PromotionsListStatusCode429Response|PromotionsListDefaultStatusCode of PromotionsListDefaultStatusCodeResponse

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
    type PromotionsUpdateBodyParams = PromotionBatchUpdate[]
    //#endregion


    type PromotionsUpdateStatusCode200Response = {
      content:PromotionsResponse;
      
    }

    type PromotionsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PromotionsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PromotionsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PromotionsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PromotionsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PromotionsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PromotionsUpdateResult = PromotionsUpdateStatusCode200 of PromotionsUpdateStatusCode200Response|PromotionsUpdateStatusCode400 of PromotionsUpdateStatusCode400Response|PromotionsUpdateStatusCode401 of PromotionsUpdateStatusCode401Response|PromotionsUpdateStatusCode403 of PromotionsUpdateStatusCode403Response|PromotionsUpdateStatusCode404 of PromotionsUpdateStatusCode404Response|PromotionsUpdateStatusCode429 of PromotionsUpdateStatusCode429Response|PromotionsUpdateDefaultStatusCode of PromotionsUpdateDefaultStatusCodeResponse

    type PromotionsUpdateArgs = {
      pathParams:PromotionsUpdatePathParams;
      bodyParams:PromotionsUpdateBodyParams
    }
