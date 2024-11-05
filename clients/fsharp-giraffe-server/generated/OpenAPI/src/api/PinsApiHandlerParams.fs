namespace OpenAPI

open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.Pin
open OpenAPI.Model.PinAnalyticsMetricsResponse
open OpenAPI.Model.PinCreate
open OpenAPI.Model.PinUpdate
open OpenAPI.Model.PinsAnalyticsMetricTypesParameterInner
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.PinsSaveRequest
open System.Collections.Generic
open System

module PinsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type MultiPinsAnalyticsQueryParams = {
      pinIds : string[] ;


      startDate : DateTime ;


      endDate : DateTime ;


      appTypes : string option;


      metricTypes : PinsAnalyticsMetricTypesParameterInner[] ;


      adAccountId : string option;

    }
    //#endregion


    type MultiPinsAnalyticsStatusCode200Response = {
      content:IDictionary<string, IDictionary>;
      
    }

    type MultiPinsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type MultiPinsAnalyticsStatusCode401Response = {
      content:Error;
      
    }

    type MultiPinsAnalyticsStatusCode404Response = {
      content:Error;
      
    }

    type MultiPinsAnalyticsStatusCode429Response = {
      content:Error;
      
    }

    type MultiPinsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MultiPinsAnalyticsResult = MultiPinsAnalyticsStatusCode200 of MultiPinsAnalyticsStatusCode200Response|MultiPinsAnalyticsStatusCode400 of MultiPinsAnalyticsStatusCode400Response|MultiPinsAnalyticsStatusCode401 of MultiPinsAnalyticsStatusCode401Response|MultiPinsAnalyticsStatusCode404 of MultiPinsAnalyticsStatusCode404Response|MultiPinsAnalyticsStatusCode429 of MultiPinsAnalyticsStatusCode429Response|MultiPinsAnalyticsDefaultStatusCode of MultiPinsAnalyticsDefaultStatusCodeResponse

    type MultiPinsAnalyticsArgs = {
      queryParams:Result<MultiPinsAnalyticsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsAnalyticsPathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PinsAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      appTypes : string option;


      metricTypes : PinsAnalyticsMetricTypesParameterInner[] ;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type PinsAnalyticsStatusCode200Response = {
      content:IDictionary<string, PinAnalyticsMetricsResponse>;
      
    }

    type PinsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type PinsAnalyticsStatusCode403Response = {
      content:Error;
      
    }

    type PinsAnalyticsStatusCode404Response = {
      content:Error;
      
    }

    type PinsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsAnalyticsResult = PinsAnalyticsStatusCode200 of PinsAnalyticsStatusCode200Response|PinsAnalyticsStatusCode400 of PinsAnalyticsStatusCode400Response|PinsAnalyticsStatusCode403 of PinsAnalyticsStatusCode403Response|PinsAnalyticsStatusCode404 of PinsAnalyticsStatusCode404Response|PinsAnalyticsDefaultStatusCode of PinsAnalyticsDefaultStatusCodeResponse

    type PinsAnalyticsArgs = {
      pathParams:PinsAnalyticsPathParams;
      queryParams:Result<PinsAnalyticsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PinsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PinsCreateBodyParams = PinCreate
    //#endregion


    type PinsCreateStatusCode201Response = {
      content:Pin;
      
    }

    type PinsCreateStatusCode400Response = {
      content:Error;
      
    }

    type PinsCreateStatusCode403Response = {
      content:Error;
      
    }

    type PinsCreateStatusCode404Response = {
      content:Error;
      
    }

    type PinsCreateStatusCode429Response = {
      content:Error;
      
    }

    type PinsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsCreateResult = PinsCreateStatusCode201 of PinsCreateStatusCode201Response|PinsCreateStatusCode400 of PinsCreateStatusCode400Response|PinsCreateStatusCode403 of PinsCreateStatusCode403Response|PinsCreateStatusCode404 of PinsCreateStatusCode404Response|PinsCreateStatusCode429 of PinsCreateStatusCode429Response|PinsCreateDefaultStatusCode of PinsCreateDefaultStatusCodeResponse

    type PinsCreateArgs = {
      queryParams:Result<PinsCreateQueryParams,string>;
      bodyParams:PinsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsDeletePathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PinsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type PinsDeleteStatusCode204Response = {
      content:string;
      
    }

    type PinsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type PinsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type PinsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsDeleteResult = PinsDeleteStatusCode204 of PinsDeleteStatusCode204Response|PinsDeleteStatusCode403 of PinsDeleteStatusCode403Response|PinsDeleteStatusCode404 of PinsDeleteStatusCode404Response|PinsDeleteDefaultStatusCode of PinsDeleteDefaultStatusCodeResponse

    type PinsDeleteArgs = {
      pathParams:PinsDeletePathParams;
      queryParams:Result<PinsDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsGetPathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PinsGetQueryParams = {
      pinMetrics : bool option;


      adAccountId : string option;

    }
    //#endregion


    type PinsGetStatusCode200Response = {
      content:Pin;
      
    }

    type PinsGetStatusCode403Response = {
      content:Error;
      
    }

    type PinsGetStatusCode404Response = {
      content:Error;
      
    }

    type PinsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsGetResult = PinsGetStatusCode200 of PinsGetStatusCode200Response|PinsGetStatusCode403 of PinsGetStatusCode403Response|PinsGetStatusCode404 of PinsGetStatusCode404Response|PinsGetDefaultStatusCode of PinsGetDefaultStatusCodeResponse

    type PinsGetArgs = {
      pathParams:PinsGetPathParams;
      queryParams:Result<PinsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PinsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      pinFilter : string option;


      includeProtectedPins : bool option;


      pinType : string option;


      creativeTypes : string[] option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion


    type PinsListStatusCode200Response = {
      content:PinsList200Response;
      
    }

    type PinsListStatusCode400Response = {
      content:Error;
      
    }

    type PinsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsListResult = PinsListStatusCode200 of PinsListStatusCode200Response|PinsListStatusCode400 of PinsListStatusCode400Response|PinsListDefaultStatusCode of PinsListDefaultStatusCodeResponse

    type PinsListArgs = {
      queryParams:Result<PinsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsSavePathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PinsSaveQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PinsSaveBodyParams = PinsSaveRequest
    //#endregion


    type PinsSaveStatusCode201Response = {
      content:Pin;
      
    }

    type PinsSaveStatusCode403Response = {
      content:Error;
      
    }

    type PinsSaveStatusCode404Response = {
      content:Error;
      
    }

    type PinsSaveDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsSaveResult = PinsSaveStatusCode201 of PinsSaveStatusCode201Response|PinsSaveStatusCode403 of PinsSaveStatusCode403Response|PinsSaveStatusCode404 of PinsSaveStatusCode404Response|PinsSaveDefaultStatusCode of PinsSaveDefaultStatusCodeResponse

    type PinsSaveArgs = {
      pathParams:PinsSavePathParams;
      queryParams:Result<PinsSaveQueryParams,string>;
      bodyParams:PinsSaveBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsUpdatePathParams = {
      pinId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type PinsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type PinsUpdateBodyParams = PinUpdate
    //#endregion


    type PinsUpdateStatusCode200Response = {
      content:Pin;
      
    }

    type PinsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type PinsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type PinsUpdateStatusCode429Response = {
      content:Error;
      
    }

    type PinsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type PinsUpdateResult = PinsUpdateStatusCode200 of PinsUpdateStatusCode200Response|PinsUpdateStatusCode403 of PinsUpdateStatusCode403Response|PinsUpdateStatusCode404 of PinsUpdateStatusCode404Response|PinsUpdateStatusCode429 of PinsUpdateStatusCode429Response|PinsUpdateDefaultStatusCode of PinsUpdateDefaultStatusCodeResponse

    type PinsUpdateArgs = {
      pathParams:PinsUpdatePathParams;
      queryParams:Result<PinsUpdateQueryParams,string>;
      bodyParams:PinsUpdateBodyParams
    }
