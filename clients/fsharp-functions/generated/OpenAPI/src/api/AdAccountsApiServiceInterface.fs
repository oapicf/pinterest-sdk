namespace OpenAPI
open AdAccountsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AdAccountsApiServiceInterface =

    //#region Service interface
    type IAdAccountsApiService =
      abstract member AdAccountAnalytics : unit -> AdAccountAnalyticsResult
      abstract member AdAccountsList : unit -> AdAccountsListResult
      abstract member AdGroupsAnalytics : unit -> AdGroupsAnalyticsResult
      abstract member AdGroupsList : unit -> AdGroupsListResult
      abstract member AdsAnalytics : unit -> AdsAnalyticsResult
      abstract member AdsList : unit -> AdsListResult
      abstract member AnalyticsCreateReport : AnalyticsCreateReportBodyParams -> AnalyticsCreateReportResult
      abstract member AnalyticsGetReport : unit -> AnalyticsGetReportResult
      abstract member CampaignsAnalytics : unit -> CampaignsAnalyticsResult
      abstract member CampaignsList : unit -> CampaignsListResult
      abstract member ProductGroupsAnalytics : unit -> ProductGroupsAnalyticsResult
    //#endregion