namespace OpenAPI
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.Pin
open PinsApiHandlerParams
open PinsApiServiceInterface
open System.Collections.Generic
open System

module PinsApiServiceImplementation =

    //#region Service implementation
    type PinsApiServiceImpl() =
      interface IPinsApiService with

        member this.PinsAnalytics () =
          if true then
            let content = "response" :> obj :?> IDictionary<string, AnalyticsMetricsResponse> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access board or Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsStatusCode403 { content = content }
          else if true then
            let content = "Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsDefaultStatusCode { content = content }

        member this.PinsCreate (parameters:PinsCreateBodyParams) =
          if true then
            let content = "Successful pin creation." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode201 { content = content }
          else if true then
            let content = "Invalid Pin parameters response" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode400 { content = content }
          else if true then
            let content = "The Pin&#39;s image is too small, too large or is broken" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode403 { content = content }
          else if true then
            let content = "Board or section not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode404 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateDefaultStatusCode { content = content }

        member this.PinsDelete () =
          if true then
            let content = "Successfully deleted Pin" 
            PinsDeleteStatusCode204 { content = content }
          else if true then
            let content = "Not authorized to access board or Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode403 { content = content }
          else if true then
            let content = "Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteDefaultStatusCode { content = content }

        member this.PinsGet () =
          if true then
            let content = "response" :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access board or Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode403 { content = content }
          else if true then
            let content = "Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetDefaultStatusCode { content = content }

      //#endregion

    let PinsApiService = PinsApiServiceImpl() :> IPinsApiService