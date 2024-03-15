namespace OpenAPI
open ResourcesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ResourcesApiServiceInterface =

    //#region Service interface
    type IResourcesApiService =
      abstract member AdAccountCountriesGet : unit -> AdAccountCountriesGetResult
      abstract member DeliveryMetricsGet : unit -> DeliveryMetricsGetResult
      abstract member InterestTargetingOptionsGet : unit -> InterestTargetingOptionsGetResult
      abstract member LeadFormQuestionsGet : unit -> LeadFormQuestionsGetResult
      abstract member MetricsReadyStateGet : unit -> MetricsReadyStateGetResult
      abstract member TargetingOptionsGet : unit -> TargetingOptionsGetResult
    //#endregion