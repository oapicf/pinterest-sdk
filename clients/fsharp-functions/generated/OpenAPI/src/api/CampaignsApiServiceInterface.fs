namespace OpenAPI
open CampaignsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CampaignsApiServiceInterface =

    //#region Service interface
    type ICampaignsApiService =
      abstract member CampaignTargetingAnalyticsGet : unit -> CampaignTargetingAnalyticsGetResult
      abstract member CampaignsAnalytics : unit -> CampaignsAnalyticsResult
      abstract member CampaignsCreate : CampaignsCreateBodyParams -> CampaignsCreateResult
      abstract member CampaignsGet : unit -> CampaignsGetResult
      abstract member CampaignsList : unit -> CampaignsListResult
      abstract member CampaignsUpdate : CampaignsUpdateBodyParams -> CampaignsUpdateResult
    //#endregion