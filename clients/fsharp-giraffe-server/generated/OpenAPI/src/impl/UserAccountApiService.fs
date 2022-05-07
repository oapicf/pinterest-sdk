namespace OpenAPI
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open UserAccountApiHandlerParams
open UserAccountApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module UserAccountApiServiceImplementation =

    //#region Service implementation
    type UserAccountApiServiceImpl() =
      interface IUserAccountApiService with

        member this.UserAccountAnalytics ctx args =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, AnalyticsMetricsResponse> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user account analytics." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountAnalyticsDefaultStatusCode { content = content }

        member this.UserAccountGet ctx args =
          if true then
            let content = "response" :> obj :?> Account // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access the user account." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetStatusCode403 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            UserAccountGetDefaultStatusCode { content = content }

      //#endregion

    let UserAccountApiService = UserAccountApiServiceImpl() :> IUserAccountApiService