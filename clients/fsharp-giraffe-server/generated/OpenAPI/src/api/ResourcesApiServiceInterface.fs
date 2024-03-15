namespace OpenAPI
open ResourcesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ResourcesApiServiceInterface =

    //#region Service interface
    type IResourcesApiService =
      abstract member AdAccountCountriesGet:HttpContext ->AdAccountCountriesGetResult
      abstract member DeliveryMetricsGet:HttpContext -> DeliveryMetricsGetArgs->DeliveryMetricsGetResult
      abstract member InterestTargetingOptionsGet:HttpContext -> InterestTargetingOptionsGetArgs->InterestTargetingOptionsGetResult
      abstract member LeadFormQuestionsGet:HttpContext ->LeadFormQuestionsGetResult
      abstract member MetricsReadyStateGet:HttpContext -> MetricsReadyStateGetArgs->MetricsReadyStateGetResult
      abstract member TargetingOptionsGet:HttpContext -> TargetingOptionsGetArgs->TargetingOptionsGetResult
    //#endregion