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
            let content = "response" :> obj :?> IDictionary<string, PinAnalyticsMetricsResponse> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid pins analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsAnalyticsStatusCode400 { content = content }
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

        member this.PinsList () =
          if true then
            let content = "Success" :> obj :?> PinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid pin filter value" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListDefaultStatusCode { content = content }

        member this.PinsSave (parameters:PinsSaveBodyParams) =
          if true then
            let content = "Successfully saved pin." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsSaveStatusCode201 { content = content }
          else if true then
            let content = "Not authorized to access Board or Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsSaveStatusCode403 { content = content }
          else if true then
            let content = "Board or Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsSaveStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsSaveDefaultStatusCode { content = content }

        member this.PinsUpdate (parameters:PinsUpdateBodyParams) =
          if true then
            let content = "response" :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to update Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode403 { content = content }
          else if true then
            let content = "Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode404 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateDefaultStatusCode { content = content }

      //#endregion

    let PinsApiService = PinsApiServiceImpl() :> IPinsApiService