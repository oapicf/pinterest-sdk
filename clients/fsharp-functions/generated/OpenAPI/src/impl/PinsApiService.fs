namespace OpenAPI
open OpenAPI.Model.CreativeType
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.Pin
open OpenAPI.Model.PinAnalyticsMetricsResponse
open OpenAPI.Model.PinCreate
open OpenAPI.Model.PinUpdate
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.PinsSaveRequest
open OpenAPI.Model.PinterestLibError
open PinsApiHandlerParams
open PinsApiServiceInterface
open System.Collections.Generic
open System

module PinsApiServiceImplementation =

    //#region Service implementation
    type PinsApiServiceImpl() =
      interface IPinsApiService with

        member this.MultiPinsAnalytics () =
          if true then
            let content = "response" :> obj :?> IDictionary<string, IDictionary> // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid pins analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsStatusCode400 { content = content }
          else if true then
            let content = "Not authorized to access board or Pin." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsStatusCode401 { content = content }
          else if true then
            let content = "Pin not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsStatusCode404 { content = content }
          else if true then
            let content = "This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsStatusCode429 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MultiPinsAnalyticsDefaultStatusCode { content = content }

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
            let content = "The request has succeeded." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsCreateDefaultStatusCode { content = content }

        member this.PinsDelete () =
          if true then
            let content = "Resource deleted successfully." 
            PinsDeleteStatusCode204 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsDeleteDefaultStatusCode { content = content }

        member this.PinsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsGetDefaultStatusCode { content = content }

        member this.PinsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> PinsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
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
            let content = "The request has succeeded." :> obj :?> Pin // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PinsUpdateDefaultStatusCode { content = content }

      //#endregion

    let PinsApiService = PinsApiServiceImpl() :> IPinsApiService