namespace OpenAPI
open AdAccountsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AdAccountsApiServiceInterface =

    //#region Service interface
    type IAdAccountsApiService =
      abstract member AdAccountAnalytics:HttpContext -> AdAccountAnalyticsArgs->AdAccountAnalyticsResult
      abstract member AdAccountsList:HttpContext -> AdAccountsListArgs->AdAccountsListResult
      abstract member AdGroupsAnalytics:HttpContext -> AdGroupsAnalyticsArgs->AdGroupsAnalyticsResult
      abstract member AdGroupsList:HttpContext -> AdGroupsListArgs->AdGroupsListResult
      abstract member AdsAnalytics:HttpContext -> AdsAnalyticsArgs->AdsAnalyticsResult
      abstract member AdsList:HttpContext -> AdsListArgs->AdsListResult
      abstract member AnalyticsCreateReport:HttpContext -> AnalyticsCreateReportArgs->AnalyticsCreateReportResult
      abstract member AnalyticsGetReport:HttpContext -> AnalyticsGetReportArgs->AnalyticsGetReportResult
      abstract member CampaignsAnalytics:HttpContext -> CampaignsAnalyticsArgs->CampaignsAnalyticsResult
      abstract member CampaignsList:HttpContext -> CampaignsListArgs->CampaignsListResult
      abstract member ProductGroupsAnalytics:HttpContext -> ProductGroupsAnalyticsArgs->ProductGroupsAnalyticsResult
    //#endregion