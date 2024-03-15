namespace OpenAPI
open AdAccountsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AdAccountsApiServiceInterface =

    //#region Service interface
    type IAdAccountsApiService =
      abstract member AdAccountAnalytics : unit -> AdAccountAnalyticsResult
      abstract member AdAccountTargetingAnalyticsGet : unit -> AdAccountTargetingAnalyticsGetResult
      abstract member AdAccountsCreate : AdAccountsCreateBodyParams -> AdAccountsCreateResult
      abstract member AdAccountsGet : unit -> AdAccountsGetResult
      abstract member AdAccountsList : unit -> AdAccountsListResult
      abstract member AnalyticsCreateMmmReport : AnalyticsCreateMmmReportBodyParams -> AnalyticsCreateMmmReportResult
      abstract member AnalyticsCreateReport : AnalyticsCreateReportBodyParams -> AnalyticsCreateReportResult
      abstract member AnalyticsCreateTemplateReport : unit -> AnalyticsCreateTemplateReportResult
      abstract member AnalyticsGetMmmReport : unit -> AnalyticsGetMmmReportResult
      abstract member AnalyticsGetReport : unit -> AnalyticsGetReportResult
      abstract member SandboxDelete : unit -> SandboxDeleteResult
      abstract member TemplatesList : unit -> TemplatesListResult
    //#endregion