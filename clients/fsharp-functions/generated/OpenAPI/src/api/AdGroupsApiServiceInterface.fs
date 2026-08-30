namespace OpenAPI
open AdGroupsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AdGroupsApiServiceInterface =

    //#region Service interface
    type IAdGroupsApiService =
      abstract member AdGroupsAnalytics : unit -> AdGroupsAnalyticsResult
      abstract member AdGroupsAudienceSizing : AdGroupsAudienceSizingBodyParams -> AdGroupsAudienceSizingResult
      abstract member AdGroupsBidFloorGet : AdGroupsBidFloorGetBodyParams -> AdGroupsBidFloorGetResult
      abstract member AdGroupsCreate : AdGroupsCreateBodyParams -> AdGroupsCreateResult
      abstract member AdGroupsDynamicTitlesDownloadCsv : unit -> AdGroupsDynamicTitlesDownloadCsvResult
      abstract member AdGroupsDynamicTitlesGetStatus : unit -> AdGroupsDynamicTitlesGetStatusResult
      abstract member AdGroupsDynamicTitlesGetUploadUrl : unit -> AdGroupsDynamicTitlesGetUploadUrlResult
      abstract member AdGroupsDynamicTitlesProcessCsv : AdGroupsDynamicTitlesProcessCsvBodyParams -> AdGroupsDynamicTitlesProcessCsvResult
      abstract member AdGroupsGet : unit -> AdGroupsGetResult
      abstract member AdGroupsList : unit -> AdGroupsListResult
      abstract member AdGroupsTargetingAnalyticsGet : unit -> AdGroupsTargetingAnalyticsGetResult
      abstract member AdGroupsUpdate : AdGroupsUpdateBodyParams -> AdGroupsUpdateResult
      abstract member GetAdGroupsByPromotionIdsList : unit -> GetAdGroupsByPromotionIdsListResult
    //#endregion