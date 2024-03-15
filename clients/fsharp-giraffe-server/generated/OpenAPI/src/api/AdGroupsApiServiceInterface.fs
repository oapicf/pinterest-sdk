namespace OpenAPI
open AdGroupsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AdGroupsApiServiceInterface =

    //#region Service interface
    type IAdGroupsApiService =
      abstract member AdGroupsAnalytics:HttpContext -> AdGroupsAnalyticsArgs->AdGroupsAnalyticsResult
      abstract member AdGroupsAudienceSizing:HttpContext -> AdGroupsAudienceSizingArgs->AdGroupsAudienceSizingResult
      abstract member AdGroupsBidFloorGet:HttpContext -> AdGroupsBidFloorGetArgs->AdGroupsBidFloorGetResult
      abstract member AdGroupsCreate:HttpContext -> AdGroupsCreateArgs->AdGroupsCreateResult
      abstract member AdGroupsGet:HttpContext -> AdGroupsGetArgs->AdGroupsGetResult
      abstract member AdGroupsList:HttpContext -> AdGroupsListArgs->AdGroupsListResult
      abstract member AdGroupsTargetingAnalyticsGet:HttpContext -> AdGroupsTargetingAnalyticsGetArgs->AdGroupsTargetingAnalyticsGetResult
      abstract member AdGroupsUpdate:HttpContext -> AdGroupsUpdateArgs->AdGroupsUpdateResult
    //#endregion