namespace OpenAPI
open AdAccountsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AdAccountsApiServiceInterface =

    //#region Service interface
    type IAdAccountsApiService =
      abstract member AdAccountAnalytics:HttpContext -> AdAccountAnalyticsArgs->AdAccountAnalyticsResult
      abstract member AdAccountTargetingAnalyticsGet:HttpContext -> AdAccountTargetingAnalyticsGetArgs->AdAccountTargetingAnalyticsGetResult
      abstract member AdAccountsCreate:HttpContext -> AdAccountsCreateArgs->AdAccountsCreateResult
      abstract member AdAccountsGet:HttpContext -> AdAccountsGetArgs->AdAccountsGetResult
      abstract member AdAccountsList:HttpContext -> AdAccountsListArgs->AdAccountsListResult
      abstract member AnalyticsCreateMmmReport:HttpContext -> AnalyticsCreateMmmReportArgs->AnalyticsCreateMmmReportResult
      abstract member AnalyticsCreateReport:HttpContext -> AnalyticsCreateReportArgs->AnalyticsCreateReportResult
      abstract member AnalyticsCreateTemplateReport:HttpContext -> AnalyticsCreateTemplateReportArgs->AnalyticsCreateTemplateReportResult
      abstract member AnalyticsGetMmmReport:HttpContext -> AnalyticsGetMmmReportArgs->AnalyticsGetMmmReportResult
      abstract member AnalyticsGetReport:HttpContext -> AnalyticsGetReportArgs->AnalyticsGetReportResult
      abstract member SandboxDelete:HttpContext -> SandboxDeleteArgs->SandboxDeleteResult
      abstract member TemplatesList:HttpContext -> TemplatesListArgs->TemplatesListResult
    //#endregion