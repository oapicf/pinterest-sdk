namespace OpenAPI
open OpenAPI.Model.AdAccountsCountryResponse
open OpenAPI.Model.BookClosedResponse
open OpenAPI.Model.DeliveryMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SingleInterestTargetingOptionResponse
open ResourcesApiHandlerParams
open ResourcesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ResourcesApiServiceImplementation =

    //#region Service implementation
    type ResourcesApiServiceImpl() =
      interface IResourcesApiService with

        member this.AdAccountCountriesGet ctx  =
          if true then
            let content = "Success" :> obj :?> AdAccountsCountryResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountCountriesGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountCountriesGetDefaultStatusCode { content = content }

        member this.DeliveryMetricsGet ctx args =
          if true then
            let content = "Success" :> obj :?> DeliveryMetricsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeliveryMetricsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            DeliveryMetricsGetDefaultStatusCode { content = content }

        member this.InterestTargetingOptionsGet ctx args =
          if true then
            let content = "Success" :> obj :?> SingleInterestTargetingOptionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            InterestTargetingOptionsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            InterestTargetingOptionsGetDefaultStatusCode { content = content }

        member this.LeadFormQuestionsGet ctx  =
          if true then
            let content = "Success" 
            LeadFormQuestionsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LeadFormQuestionsGetDefaultStatusCode { content = content }

        member this.MetricsReadyStateGet ctx args =
          if true then
            let content = "Success" :> obj :?> BookClosedResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MetricsReadyStateGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MetricsReadyStateGetDefaultStatusCode { content = content }

        member this.TargetingOptionsGet ctx args =
          if true then
            let content = "Success" :> obj :?> obj[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingOptionsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TargetingOptionsGetDefaultStatusCode { content = content }

      //#endregion

    let ResourcesApiService = ResourcesApiServiceImpl() :> IResourcesApiService