namespace OpenAPI
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.AudienceInsights
open OpenAPI.Model.AudienceInsightsScopeAndTypeGet200Response
open OpenAPI.Model.PinterestLibError
open AudienceInsightsApiHandlerParams
open AudienceInsightsApiServiceInterface
open System.Collections.Generic
open System

module AudienceInsightsApiServiceImplementation =

    //#region Service implementation
    type AudienceInsightsApiServiceImpl() =
      interface IAudienceInsightsApiService with

        member this.AudienceInsightsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> AudienceInsights // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetDefaultStatusCode { content = content }

        member this.AudienceInsightsScopeAndTypeGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> AudienceInsightsScopeAndTypeGet200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetDefaultStatusCode { content = content }

      //#endregion

    let AudienceInsightsApiService = AudienceInsightsApiServiceImpl() :> IAudienceInsightsApiService