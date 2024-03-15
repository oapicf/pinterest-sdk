namespace OpenAPI

open OpenAPI.Model.AdAccountsCountryResponse
open OpenAPI.Model.BookClosedResponse
open OpenAPI.Model.DeliveryMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SingleInterestTargetingOptionResponse
open System.Collections.Generic
open System

module ResourcesApiHandlerParams =



    type AdAccountCountriesGetStatusCode200Response = {
      content:AdAccountsCountryResponse;
      
    }

    type AdAccountCountriesGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountCountriesGetResult = AdAccountCountriesGetStatusCode200 of AdAccountCountriesGetStatusCode200Response|AdAccountCountriesGetDefaultStatusCode of AdAccountCountriesGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type DeliveryMetricsGetQueryParams = {
      reportType : string option;

    }
    //#endregion


    type DeliveryMetricsGetStatusCode200Response = {
      content:DeliveryMetricsResponse;
      
    }

    type DeliveryMetricsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type DeliveryMetricsGetResult = DeliveryMetricsGetStatusCode200 of DeliveryMetricsGetStatusCode200Response|DeliveryMetricsGetDefaultStatusCode of DeliveryMetricsGetDefaultStatusCodeResponse

    type DeliveryMetricsGetArgs = {
      queryParams:Result<DeliveryMetricsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type InterestTargetingOptionsGetPathParams = {
      interestId : string ;
    }
    //#endregion


    type InterestTargetingOptionsGetStatusCode200Response = {
      content:SingleInterestTargetingOptionResponse;
      
    }

    type InterestTargetingOptionsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type InterestTargetingOptionsGetResult = InterestTargetingOptionsGetStatusCode200 of InterestTargetingOptionsGetStatusCode200Response|InterestTargetingOptionsGetDefaultStatusCode of InterestTargetingOptionsGetDefaultStatusCodeResponse

    type InterestTargetingOptionsGetArgs = {
      pathParams:InterestTargetingOptionsGetPathParams;
    }


    type LeadFormQuestionsGetStatusCode200Response = {
      content:string;
      
    }

    type LeadFormQuestionsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type LeadFormQuestionsGetResult = LeadFormQuestionsGetStatusCode200 of LeadFormQuestionsGetStatusCode200Response|LeadFormQuestionsGetDefaultStatusCode of LeadFormQuestionsGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type MetricsReadyStateGetQueryParams = {
      date : string ;

    }
    //#endregion


    type MetricsReadyStateGetStatusCode200Response = {
      content:BookClosedResponse;
      
    }

    type MetricsReadyStateGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type MetricsReadyStateGetResult = MetricsReadyStateGetStatusCode200 of MetricsReadyStateGetStatusCode200Response|MetricsReadyStateGetDefaultStatusCode of MetricsReadyStateGetDefaultStatusCodeResponse

    type MetricsReadyStateGetArgs = {
      queryParams:Result<MetricsReadyStateGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TargetingOptionsGetPathParams = {
      targetingType : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TargetingOptionsGetQueryParams = {
      clientId : string option;


      oauthSignature : string option;


      timestamp : string option;

    }
    //#endregion


    type TargetingOptionsGetStatusCode200Response = {
      content:obj[];
      
    }

    type TargetingOptionsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TargetingOptionsGetResult = TargetingOptionsGetStatusCode200 of TargetingOptionsGetStatusCode200Response|TargetingOptionsGetDefaultStatusCode of TargetingOptionsGetDefaultStatusCodeResponse

    type TargetingOptionsGetArgs = {
      pathParams:TargetingOptionsGetPathParams;
      queryParams:Result<TargetingOptionsGetQueryParams,string>;
    }
