namespace OpenAPI

open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.Pin
open System.Collections.Generic
open System

module PinsApiHandlerParams =

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


      metricTypes : string[] ;


      splitField : string option;


      adAccountId : string option;

    }
    //#endregion


    type PinsAnalyticsStatusCode200Response = {
      content:IDictionary<string, AnalyticsMetricsResponse>;
      
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
    type PinsAnalyticsResult = PinsAnalyticsStatusCode200 of PinsAnalyticsStatusCode200Response|PinsAnalyticsStatusCode403 of PinsAnalyticsStatusCode403Response|PinsAnalyticsStatusCode404 of PinsAnalyticsStatusCode404Response|PinsAnalyticsDefaultStatusCode of PinsAnalyticsDefaultStatusCodeResponse

    type PinsAnalyticsArgs = {
      pathParams:PinsAnalyticsPathParams;
      queryParams:Result<PinsAnalyticsQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type PinsCreateBodyParams = Pin
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
      bodyParams:PinsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type PinsDeletePathParams = {
      pinId : string ;
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
