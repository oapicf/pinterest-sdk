namespace OpenAPI

open OpenAPI.Model.CreativeType
open System.Collections.Generic
open OpenAPI.Model.MultiPinsAnalyticsMetricTypesItem
open OpenAPI.Model.Pin
open OpenAPI.Model.PinAnalyticsMetricsResponse
open OpenAPI.Model.PinCreate
open OpenAPI.Model.PinFilter
open OpenAPI.Model.PinType
open OpenAPI.Model.PinUpdate
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.PinsSaveRequestCreate
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.QuerypinanalyticsmetrictypesItems
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


      metricTypes : MultiPinsAnalyticsMetricTypesItem[] ;


      adAccountId : string option;

    }
    //#endregion


    type MultiPinsAnalyticsStatusCode200Response = {
      content:IDictionary<string, IDictionary>;
      
    }

    type MultiPinsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MultiPinsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MultiPinsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MultiPinsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MultiPinsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MultiPinsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MultiPinsAnalyticsResult = MultiPinsAnalyticsStatusCode200 of MultiPinsAnalyticsStatusCode200Response|MultiPinsAnalyticsStatusCode400 of MultiPinsAnalyticsStatusCode400Response|MultiPinsAnalyticsStatusCode401 of MultiPinsAnalyticsStatusCode401Response|MultiPinsAnalyticsStatusCode403 of MultiPinsAnalyticsStatusCode403Response|MultiPinsAnalyticsStatusCode404 of MultiPinsAnalyticsStatusCode404Response|MultiPinsAnalyticsStatusCode429 of MultiPinsAnalyticsStatusCode429Response|MultiPinsAnalyticsDefaultStatusCode of MultiPinsAnalyticsDefaultStatusCodeResponse

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


      metricTypes : QuerypinanalyticsmetrictypesItems[] ;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type PinsAnalyticsStatusCode200Response = {
      content:IDictionary<string, PinAnalyticsMetricsResponse>;
      
    }

    type PinsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsAnalyticsResult = PinsAnalyticsStatusCode200 of PinsAnalyticsStatusCode200Response|PinsAnalyticsStatusCode400 of PinsAnalyticsStatusCode400Response|PinsAnalyticsStatusCode401 of PinsAnalyticsStatusCode401Response|PinsAnalyticsStatusCode403 of PinsAnalyticsStatusCode403Response|PinsAnalyticsStatusCode404 of PinsAnalyticsStatusCode404Response|PinsAnalyticsStatusCode429 of PinsAnalyticsStatusCode429Response|PinsAnalyticsDefaultStatusCode of PinsAnalyticsDefaultStatusCodeResponse

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


    type PinsCreateStatusCode200Response = {
      content:Pin;
      
    }

    type PinsCreateStatusCode201Response = {
      content:Pin;
      
    }

    type PinsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsCreateResult = PinsCreateStatusCode200 of PinsCreateStatusCode200Response|PinsCreateStatusCode201 of PinsCreateStatusCode201Response|PinsCreateStatusCode400 of PinsCreateStatusCode400Response|PinsCreateStatusCode401 of PinsCreateStatusCode401Response|PinsCreateStatusCode403 of PinsCreateStatusCode403Response|PinsCreateStatusCode404 of PinsCreateStatusCode404Response|PinsCreateStatusCode429 of PinsCreateStatusCode429Response|PinsCreateDefaultStatusCode of PinsCreateDefaultStatusCodeResponse

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


    type PinsDeleteStatusCode200Response = {
      content:Pin;
      
    }

    type PinsDeleteStatusCode204Response = {
      content:string;
      
    }

    type PinsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsDeleteResult = PinsDeleteStatusCode200 of PinsDeleteStatusCode200Response|PinsDeleteStatusCode204 of PinsDeleteStatusCode204Response|PinsDeleteStatusCode400 of PinsDeleteStatusCode400Response|PinsDeleteStatusCode401 of PinsDeleteStatusCode401Response|PinsDeleteStatusCode403 of PinsDeleteStatusCode403Response|PinsDeleteStatusCode404 of PinsDeleteStatusCode404Response|PinsDeleteStatusCode429 of PinsDeleteStatusCode429Response|PinsDeleteDefaultStatusCode of PinsDeleteDefaultStatusCodeResponse

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
      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion


    type PinsGetStatusCode200Response = {
      content:Pin;
      
    }

    type PinsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsGetResult = PinsGetStatusCode200 of PinsGetStatusCode200Response|PinsGetStatusCode400 of PinsGetStatusCode400Response|PinsGetStatusCode401 of PinsGetStatusCode401Response|PinsGetStatusCode403 of PinsGetStatusCode403Response|PinsGetStatusCode404 of PinsGetStatusCode404Response|PinsGetStatusCode429 of PinsGetStatusCode429Response|PinsGetDefaultStatusCode of PinsGetDefaultStatusCodeResponse

    type PinsGetArgs = {
      pathParams:PinsGetPathParams;
      queryParams:Result<PinsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type PinsListQueryParams = {
      pinFilter : PinFilter option;


      pinMetrics : bool option;


      includeProtectedPins : bool option;


      pinType : PinType option;


      creativeTypes : CreativeType[] option;


      adAccountId : string option;


      domain : string option;


      domains : string[] option;


      includeProductTagObj : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type PinsListStatusCode200Response = {
      content:PinsList200Response;
      
    }

    type PinsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsListResult = PinsListStatusCode200 of PinsListStatusCode200Response|PinsListStatusCode400 of PinsListStatusCode400Response|PinsListStatusCode401 of PinsListStatusCode401Response|PinsListStatusCode403 of PinsListStatusCode403Response|PinsListStatusCode404 of PinsListStatusCode404Response|PinsListStatusCode429 of PinsListStatusCode429Response|PinsListDefaultStatusCode of PinsListDefaultStatusCodeResponse

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
    type PinsSaveBodyParams = PinsSaveRequestCreate
    //#endregion


    type PinsSaveStatusCode201Response = {
      content:Pin;
      
    }

    type PinsSaveStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsSaveStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsSaveStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsSaveStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsSaveStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsSaveDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsSaveResult = PinsSaveStatusCode201 of PinsSaveStatusCode201Response|PinsSaveStatusCode400 of PinsSaveStatusCode400Response|PinsSaveStatusCode401 of PinsSaveStatusCode401Response|PinsSaveStatusCode403 of PinsSaveStatusCode403Response|PinsSaveStatusCode404 of PinsSaveStatusCode404Response|PinsSaveStatusCode429 of PinsSaveStatusCode429Response|PinsSaveDefaultStatusCode of PinsSaveDefaultStatusCodeResponse

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

    type PinsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type PinsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type PinsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type PinsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type PinsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type PinsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type PinsUpdateResult = PinsUpdateStatusCode200 of PinsUpdateStatusCode200Response|PinsUpdateStatusCode400 of PinsUpdateStatusCode400Response|PinsUpdateStatusCode401 of PinsUpdateStatusCode401Response|PinsUpdateStatusCode403 of PinsUpdateStatusCode403Response|PinsUpdateStatusCode404 of PinsUpdateStatusCode404Response|PinsUpdateStatusCode429 of PinsUpdateStatusCode429Response|PinsUpdateDefaultStatusCode of PinsUpdateDefaultStatusCodeResponse

    type PinsUpdateArgs = {
      pathParams:PinsUpdatePathParams;
      queryParams:Result<PinsUpdateQueryParams,string>;
      bodyParams:PinsUpdateBodyParams
    }
