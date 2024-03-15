namespace OpenAPI
open AudienceInsightsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AudienceInsightsApiServiceInterface =

    //#region Service interface
    type IAudienceInsightsApiService =
      abstract member AudienceInsightsGet:HttpContext -> AudienceInsightsGetArgs->AudienceInsightsGetResult
      abstract member AudienceInsightsScopeAndTypeGet:HttpContext -> AudienceInsightsScopeAndTypeGetArgs->AudienceInsightsScopeAndTypeGetResult
    //#endregion