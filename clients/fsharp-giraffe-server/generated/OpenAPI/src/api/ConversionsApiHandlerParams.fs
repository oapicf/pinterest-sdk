namespace OpenAPI

open OpenAPI.Model.AdvertiserDefinedEventsCreate200Response
open OpenAPI.Model.AdvertiserDefinedEventsCreateRequest
open OpenAPI.Model.AdvertiserDefinedEventsGet200Response
open OpenAPI.Model.PinterestLibError
open System.Collections.Generic
open System

module ConversionsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsCreateBodyParams = AdvertiserDefinedEventsCreateRequest
    //#endregion


    type AdvertiserDefinedEventsCreateStatusCode200Response = {
      content:AdvertiserDefinedEventsCreate200Response;
      
    }

    type AdvertiserDefinedEventsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvertiserDefinedEventsCreateResult = AdvertiserDefinedEventsCreateStatusCode200 of AdvertiserDefinedEventsCreateStatusCode200Response|AdvertiserDefinedEventsCreateStatusCode400 of AdvertiserDefinedEventsCreateStatusCode400Response|AdvertiserDefinedEventsCreateStatusCode401 of AdvertiserDefinedEventsCreateStatusCode401Response|AdvertiserDefinedEventsCreateStatusCode403 of AdvertiserDefinedEventsCreateStatusCode403Response|AdvertiserDefinedEventsCreateStatusCode404 of AdvertiserDefinedEventsCreateStatusCode404Response|AdvertiserDefinedEventsCreateStatusCode429 of AdvertiserDefinedEventsCreateStatusCode429Response|AdvertiserDefinedEventsCreateDefaultStatusCode of AdvertiserDefinedEventsCreateDefaultStatusCodeResponse

    type AdvertiserDefinedEventsCreateArgs = {
      pathParams:AdvertiserDefinedEventsCreatePathParams;
      bodyParams:AdvertiserDefinedEventsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsDeletePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsDeleteQueryParams = {
      eventNames : string[] ;

    }
    //#endregion


    type AdvertiserDefinedEventsDeleteStatusCode200Response = {
      content:AdvertiserDefinedEventsCreate200Response;
      
    }

    type AdvertiserDefinedEventsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvertiserDefinedEventsDeleteResult = AdvertiserDefinedEventsDeleteStatusCode200 of AdvertiserDefinedEventsDeleteStatusCode200Response|AdvertiserDefinedEventsDeleteStatusCode400 of AdvertiserDefinedEventsDeleteStatusCode400Response|AdvertiserDefinedEventsDeleteStatusCode401 of AdvertiserDefinedEventsDeleteStatusCode401Response|AdvertiserDefinedEventsDeleteStatusCode403 of AdvertiserDefinedEventsDeleteStatusCode403Response|AdvertiserDefinedEventsDeleteStatusCode404 of AdvertiserDefinedEventsDeleteStatusCode404Response|AdvertiserDefinedEventsDeleteStatusCode429 of AdvertiserDefinedEventsDeleteStatusCode429Response|AdvertiserDefinedEventsDeleteDefaultStatusCode of AdvertiserDefinedEventsDeleteDefaultStatusCodeResponse

    type AdvertiserDefinedEventsDeleteArgs = {
      pathParams:AdvertiserDefinedEventsDeletePathParams;
      queryParams:Result<AdvertiserDefinedEventsDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type AdvertiserDefinedEventsGetStatusCode200Response = {
      content:AdvertiserDefinedEventsGet200Response;
      
    }

    type AdvertiserDefinedEventsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvertiserDefinedEventsGetResult = AdvertiserDefinedEventsGetStatusCode200 of AdvertiserDefinedEventsGetStatusCode200Response|AdvertiserDefinedEventsGetStatusCode400 of AdvertiserDefinedEventsGetStatusCode400Response|AdvertiserDefinedEventsGetStatusCode401 of AdvertiserDefinedEventsGetStatusCode401Response|AdvertiserDefinedEventsGetStatusCode403 of AdvertiserDefinedEventsGetStatusCode403Response|AdvertiserDefinedEventsGetStatusCode404 of AdvertiserDefinedEventsGetStatusCode404Response|AdvertiserDefinedEventsGetStatusCode429 of AdvertiserDefinedEventsGetStatusCode429Response|AdvertiserDefinedEventsGetDefaultStatusCode of AdvertiserDefinedEventsGetDefaultStatusCodeResponse

    type AdvertiserDefinedEventsGetArgs = {
      pathParams:AdvertiserDefinedEventsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdvertiserDefinedEventsUpdateBodyParams = AdvertiserDefinedEventsCreateRequest
    //#endregion


    type AdvertiserDefinedEventsUpdateStatusCode200Response = {
      content:AdvertiserDefinedEventsCreate200Response;
      
    }

    type AdvertiserDefinedEventsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdvertiserDefinedEventsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdvertiserDefinedEventsUpdateResult = AdvertiserDefinedEventsUpdateStatusCode200 of AdvertiserDefinedEventsUpdateStatusCode200Response|AdvertiserDefinedEventsUpdateStatusCode400 of AdvertiserDefinedEventsUpdateStatusCode400Response|AdvertiserDefinedEventsUpdateStatusCode401 of AdvertiserDefinedEventsUpdateStatusCode401Response|AdvertiserDefinedEventsUpdateStatusCode403 of AdvertiserDefinedEventsUpdateStatusCode403Response|AdvertiserDefinedEventsUpdateStatusCode404 of AdvertiserDefinedEventsUpdateStatusCode404Response|AdvertiserDefinedEventsUpdateStatusCode429 of AdvertiserDefinedEventsUpdateStatusCode429Response|AdvertiserDefinedEventsUpdateDefaultStatusCode of AdvertiserDefinedEventsUpdateDefaultStatusCodeResponse

    type AdvertiserDefinedEventsUpdateArgs = {
      pathParams:AdvertiserDefinedEventsUpdatePathParams;
      bodyParams:AdvertiserDefinedEventsUpdateBodyParams
    }
