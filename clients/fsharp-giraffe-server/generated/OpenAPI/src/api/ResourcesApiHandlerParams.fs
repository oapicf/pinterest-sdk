namespace OpenAPI

open OpenAPI.Model.AdAccountCountriesGet200Response
open OpenAPI.Model.BookClosed
open OpenAPI.Model.DeliveryMetricsGet200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PublicTargetingType
open OpenAPI.Model.ReportType
open OpenAPI.Model.SingleInterestTargetingOption
open System.Collections.Generic
open System

module ResourcesApiHandlerParams =



    type AdAccountCountriesGetStatusCode200Response = {
      content:AdAccountCountriesGet200Response;
      
    }

    type AdAccountCountriesGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountCountriesGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountCountriesGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountCountriesGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountCountriesGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountCountriesGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountCountriesGetResult = AdAccountCountriesGetStatusCode200 of AdAccountCountriesGetStatusCode200Response|AdAccountCountriesGetStatusCode400 of AdAccountCountriesGetStatusCode400Response|AdAccountCountriesGetStatusCode401 of AdAccountCountriesGetStatusCode401Response|AdAccountCountriesGetStatusCode403 of AdAccountCountriesGetStatusCode403Response|AdAccountCountriesGetStatusCode404 of AdAccountCountriesGetStatusCode404Response|AdAccountCountriesGetStatusCode429 of AdAccountCountriesGetStatusCode429Response|AdAccountCountriesGetDefaultStatusCode of AdAccountCountriesGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type DeliveryMetricsGetQueryParams = {
      reportType : ReportType option;

    }
    //#endregion


    type DeliveryMetricsGetStatusCode200Response = {
      content:DeliveryMetricsGet200Response;
      
    }

    type DeliveryMetricsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type DeliveryMetricsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type DeliveryMetricsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type DeliveryMetricsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type DeliveryMetricsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type DeliveryMetricsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type DeliveryMetricsGetResult = DeliveryMetricsGetStatusCode200 of DeliveryMetricsGetStatusCode200Response|DeliveryMetricsGetStatusCode400 of DeliveryMetricsGetStatusCode400Response|DeliveryMetricsGetStatusCode401 of DeliveryMetricsGetStatusCode401Response|DeliveryMetricsGetStatusCode403 of DeliveryMetricsGetStatusCode403Response|DeliveryMetricsGetStatusCode404 of DeliveryMetricsGetStatusCode404Response|DeliveryMetricsGetStatusCode429 of DeliveryMetricsGetStatusCode429Response|DeliveryMetricsGetDefaultStatusCode of DeliveryMetricsGetDefaultStatusCodeResponse

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
      content:SingleInterestTargetingOption;
      
    }

    type InterestTargetingOptionsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type InterestTargetingOptionsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type InterestTargetingOptionsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type InterestTargetingOptionsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type InterestTargetingOptionsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type InterestTargetingOptionsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type InterestTargetingOptionsGetResult = InterestTargetingOptionsGetStatusCode200 of InterestTargetingOptionsGetStatusCode200Response|InterestTargetingOptionsGetStatusCode400 of InterestTargetingOptionsGetStatusCode400Response|InterestTargetingOptionsGetStatusCode401 of InterestTargetingOptionsGetStatusCode401Response|InterestTargetingOptionsGetStatusCode403 of InterestTargetingOptionsGetStatusCode403Response|InterestTargetingOptionsGetStatusCode404 of InterestTargetingOptionsGetStatusCode404Response|InterestTargetingOptionsGetStatusCode429 of InterestTargetingOptionsGetStatusCode429Response|InterestTargetingOptionsGetDefaultStatusCode of InterestTargetingOptionsGetDefaultStatusCodeResponse

    type InterestTargetingOptionsGetArgs = {
      pathParams:InterestTargetingOptionsGetPathParams;
    }


    type LeadFormQuestionsGetStatusCode200Response = {
      content:string;
      
    }

    type LeadFormQuestionsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type LeadFormQuestionsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type LeadFormQuestionsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type LeadFormQuestionsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type LeadFormQuestionsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type LeadFormQuestionsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type LeadFormQuestionsGetResult = LeadFormQuestionsGetStatusCode200 of LeadFormQuestionsGetStatusCode200Response|LeadFormQuestionsGetStatusCode400 of LeadFormQuestionsGetStatusCode400Response|LeadFormQuestionsGetStatusCode401 of LeadFormQuestionsGetStatusCode401Response|LeadFormQuestionsGetStatusCode403 of LeadFormQuestionsGetStatusCode403Response|LeadFormQuestionsGetStatusCode404 of LeadFormQuestionsGetStatusCode404Response|LeadFormQuestionsGetStatusCode429 of LeadFormQuestionsGetStatusCode429Response|LeadFormQuestionsGetDefaultStatusCode of LeadFormQuestionsGetDefaultStatusCodeResponse


    //#region Query parameters
    [<CLIMutable>]
    type MetricsReadyStateGetQueryParams = {
      date : string ;

    }
    //#endregion


    type MetricsReadyStateGetStatusCode200Response = {
      content:BookClosed;
      
    }

    type MetricsReadyStateGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type MetricsReadyStateGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type MetricsReadyStateGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type MetricsReadyStateGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type MetricsReadyStateGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type MetricsReadyStateGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type MetricsReadyStateGetResult = MetricsReadyStateGetStatusCode200 of MetricsReadyStateGetStatusCode200Response|MetricsReadyStateGetStatusCode400 of MetricsReadyStateGetStatusCode400Response|MetricsReadyStateGetStatusCode401 of MetricsReadyStateGetStatusCode401Response|MetricsReadyStateGetStatusCode403 of MetricsReadyStateGetStatusCode403Response|MetricsReadyStateGetStatusCode404 of MetricsReadyStateGetStatusCode404Response|MetricsReadyStateGetStatusCode429 of MetricsReadyStateGetStatusCode429Response|MetricsReadyStateGetDefaultStatusCode of MetricsReadyStateGetDefaultStatusCodeResponse

    type MetricsReadyStateGetArgs = {
      queryParams:Result<MetricsReadyStateGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TargetingOptionsGetPathParams = {
      targetingType : PublicTargetingType ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TargetingOptionsGetQueryParams = {
      adAccountId : string option;


      clientId : string option;


      oauthSignature : string option;


      timestamp : string option;

    }
    //#endregion


    type TargetingOptionsGetStatusCode200Response = {
      content:obj[];
      
    }

    type TargetingOptionsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TargetingOptionsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TargetingOptionsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TargetingOptionsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TargetingOptionsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TargetingOptionsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TargetingOptionsGetResult = TargetingOptionsGetStatusCode200 of TargetingOptionsGetStatusCode200Response|TargetingOptionsGetStatusCode400 of TargetingOptionsGetStatusCode400Response|TargetingOptionsGetStatusCode401 of TargetingOptionsGetStatusCode401Response|TargetingOptionsGetStatusCode403 of TargetingOptionsGetStatusCode403Response|TargetingOptionsGetStatusCode404 of TargetingOptionsGetStatusCode404Response|TargetingOptionsGetStatusCode429 of TargetingOptionsGetStatusCode429Response|TargetingOptionsGetDefaultStatusCode of TargetingOptionsGetDefaultStatusCodeResponse

    type TargetingOptionsGetArgs = {
      pathParams:TargetingOptionsGetPathParams;
      queryParams:Result<TargetingOptionsGetQueryParams,string>;
    }
