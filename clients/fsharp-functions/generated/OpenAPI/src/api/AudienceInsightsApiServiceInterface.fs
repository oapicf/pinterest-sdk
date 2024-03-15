namespace OpenAPI
open AudienceInsightsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AudienceInsightsApiServiceInterface =

    //#region Service interface
    type IAudienceInsightsApiService =
      abstract member AudienceInsightsGet : unit -> AudienceInsightsGetResult
      abstract member AudienceInsightsScopeAndTypeGet : unit -> AudienceInsightsScopeAndTypeGetResult
    //#endregion