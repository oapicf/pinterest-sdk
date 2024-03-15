namespace OpenAPI
open CampaignsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CampaignsApiServiceInterface =

    //#region Service interface
    type ICampaignsApiService =
      abstract member CampaignTargetingAnalyticsGet:HttpContext -> CampaignTargetingAnalyticsGetArgs->CampaignTargetingAnalyticsGetResult
      abstract member CampaignsAnalytics:HttpContext -> CampaignsAnalyticsArgs->CampaignsAnalyticsResult
      abstract member CampaignsCreate:HttpContext -> CampaignsCreateArgs->CampaignsCreateResult
      abstract member CampaignsGet:HttpContext -> CampaignsGetArgs->CampaignsGetResult
      abstract member CampaignsList:HttpContext -> CampaignsListArgs->CampaignsListResult
      abstract member CampaignsUpdate:HttpContext -> CampaignsUpdateArgs->CampaignsUpdateResult
    //#endregion