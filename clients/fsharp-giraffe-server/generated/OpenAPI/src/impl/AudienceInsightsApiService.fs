namespace OpenAPI
open OpenAPI.Model.AudienceDefinitionResponse
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.AudienceInsightsResponse
open OpenAPI.Model.Error
open AudienceInsightsApiHandlerParams
open AudienceInsightsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AudienceInsightsApiServiceImplementation =

    //#region Service implementation
    type AudienceInsightsApiServiceImpl() =
      interface IAudienceInsightsApiService with

        member this.AudienceInsightsGet ctx args =
          if true then
            let content = "Success" :> obj :?> AudienceInsightsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsGetDefaultStatusCode { content = content }

        member this.AudienceInsightsScopeAndTypeGet ctx args =
          if true then
            let content = "Success" :> obj :?> AudienceDefinitionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AudienceInsightsScopeAndTypeGetDefaultStatusCode { content = content }

      //#endregion

    let AudienceInsightsApiService = AudienceInsightsApiServiceImpl() :> IAudienceInsightsApiService