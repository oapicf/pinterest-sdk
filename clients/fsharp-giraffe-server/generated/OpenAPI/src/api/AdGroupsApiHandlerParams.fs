namespace OpenAPI

open OpenAPI.Model.AdGroup
open OpenAPI.Model.AdGroupAudienceSizing
open OpenAPI.Model.AdGroupAudienceSizingCreate
open OpenAPI.Model.AdGroupCreateCreate
open OpenAPI.Model.AdGroupUpdateBatchUpdate
open OpenAPI.Model.AdGroupsAnalyticsMetrics
open OpenAPI.Model.AdGroupsCreate200Response
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsAdGroupTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorCreate
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.DynamicTitlesDownloadCSV
open OpenAPI.Model.DynamicTitlesGetStatus
open OpenAPI.Model.DynamicTitlesProcessCSV
open OpenAPI.Model.DynamicTitlesProcessCSVCreate
open OpenAPI.Model.DynamicTitlesUploadURL
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone
open System.Collections.Generic
open System

module AdGroupsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdGroupsAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      adGroupIds : string[] ;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      aggregateReportRows : bool option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type AdGroupsAnalyticsStatusCode200Response = {
      content:AdGroupsAnalyticsMetrics[];
      
    }

    type AdGroupsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsAnalyticsResult = AdGroupsAnalyticsStatusCode200 of AdGroupsAnalyticsStatusCode200Response|AdGroupsAnalyticsStatusCode400 of AdGroupsAnalyticsStatusCode400Response|AdGroupsAnalyticsStatusCode401 of AdGroupsAnalyticsStatusCode401Response|AdGroupsAnalyticsStatusCode403 of AdGroupsAnalyticsStatusCode403Response|AdGroupsAnalyticsStatusCode404 of AdGroupsAnalyticsStatusCode404Response|AdGroupsAnalyticsStatusCode429 of AdGroupsAnalyticsStatusCode429Response|AdGroupsAnalyticsDefaultStatusCode of AdGroupsAnalyticsDefaultStatusCodeResponse

    type AdGroupsAnalyticsArgs = {
      pathParams:AdGroupsAnalyticsPathParams;
      queryParams:Result<AdGroupsAnalyticsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsAudienceSizingPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdGroupsAudienceSizingBodyParams = AdGroupAudienceSizingCreate
    //#endregion


    type AdGroupsAudienceSizingStatusCode200Response = {
      content:AdGroupAudienceSizing;
      
    }

    type AdGroupsAudienceSizingStatusCode201Response = {
      content:AdGroupAudienceSizing;
      
    }

    type AdGroupsAudienceSizingStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAudienceSizingStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAudienceSizingStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAudienceSizingStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAudienceSizingStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsAudienceSizingDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsAudienceSizingResult = AdGroupsAudienceSizingStatusCode200 of AdGroupsAudienceSizingStatusCode200Response|AdGroupsAudienceSizingStatusCode201 of AdGroupsAudienceSizingStatusCode201Response|AdGroupsAudienceSizingStatusCode400 of AdGroupsAudienceSizingStatusCode400Response|AdGroupsAudienceSizingStatusCode401 of AdGroupsAudienceSizingStatusCode401Response|AdGroupsAudienceSizingStatusCode403 of AdGroupsAudienceSizingStatusCode403Response|AdGroupsAudienceSizingStatusCode404 of AdGroupsAudienceSizingStatusCode404Response|AdGroupsAudienceSizingStatusCode429 of AdGroupsAudienceSizingStatusCode429Response|AdGroupsAudienceSizingDefaultStatusCode of AdGroupsAudienceSizingDefaultStatusCodeResponse

    type AdGroupsAudienceSizingArgs = {
      pathParams:AdGroupsAudienceSizingPathParams;
      bodyParams:AdGroupsAudienceSizingBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsBidFloorGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdGroupsBidFloorGetBodyParams = BidFloorCreate
    //#endregion


    type AdGroupsBidFloorGetStatusCode200Response = {
      content:BidFloor;
      
    }

    type AdGroupsBidFloorGetStatusCode201Response = {
      content:BidFloor;
      
    }

    type AdGroupsBidFloorGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsBidFloorGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsBidFloorGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsBidFloorGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsBidFloorGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsBidFloorGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsBidFloorGetResult = AdGroupsBidFloorGetStatusCode200 of AdGroupsBidFloorGetStatusCode200Response|AdGroupsBidFloorGetStatusCode201 of AdGroupsBidFloorGetStatusCode201Response|AdGroupsBidFloorGetStatusCode400 of AdGroupsBidFloorGetStatusCode400Response|AdGroupsBidFloorGetStatusCode401 of AdGroupsBidFloorGetStatusCode401Response|AdGroupsBidFloorGetStatusCode403 of AdGroupsBidFloorGetStatusCode403Response|AdGroupsBidFloorGetStatusCode404 of AdGroupsBidFloorGetStatusCode404Response|AdGroupsBidFloorGetStatusCode429 of AdGroupsBidFloorGetStatusCode429Response|AdGroupsBidFloorGetDefaultStatusCode of AdGroupsBidFloorGetDefaultStatusCodeResponse

    type AdGroupsBidFloorGetArgs = {
      pathParams:AdGroupsBidFloorGetPathParams;
      bodyParams:AdGroupsBidFloorGetBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdGroupsCreateBodyParams = AdGroupCreateCreate[]
    //#endregion


    type AdGroupsCreateStatusCode200Response = {
      content:AdGroupsCreate200Response;
      
    }

    type AdGroupsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsCreateResult = AdGroupsCreateStatusCode200 of AdGroupsCreateStatusCode200Response|AdGroupsCreateStatusCode400 of AdGroupsCreateStatusCode400Response|AdGroupsCreateStatusCode401 of AdGroupsCreateStatusCode401Response|AdGroupsCreateStatusCode403 of AdGroupsCreateStatusCode403Response|AdGroupsCreateStatusCode404 of AdGroupsCreateStatusCode404Response|AdGroupsCreateStatusCode429 of AdGroupsCreateStatusCode429Response|AdGroupsCreateDefaultStatusCode of AdGroupsCreateDefaultStatusCodeResponse

    type AdGroupsCreateArgs = {
      pathParams:AdGroupsCreatePathParams;
      bodyParams:AdGroupsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsDynamicTitlesDownloadCsvPathParams = {
      adAccountId : string ;
    //#endregion
      adGroupId : string ;
    }
    //#endregion


    type AdGroupsDynamicTitlesDownloadCsvStatusCode200Response = {
      content:DynamicTitlesDownloadCSV;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesDownloadCsvDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsDynamicTitlesDownloadCsvResult = AdGroupsDynamicTitlesDownloadCsvStatusCode200 of AdGroupsDynamicTitlesDownloadCsvStatusCode200Response|AdGroupsDynamicTitlesDownloadCsvStatusCode400 of AdGroupsDynamicTitlesDownloadCsvStatusCode400Response|AdGroupsDynamicTitlesDownloadCsvStatusCode401 of AdGroupsDynamicTitlesDownloadCsvStatusCode401Response|AdGroupsDynamicTitlesDownloadCsvStatusCode403 of AdGroupsDynamicTitlesDownloadCsvStatusCode403Response|AdGroupsDynamicTitlesDownloadCsvStatusCode404 of AdGroupsDynamicTitlesDownloadCsvStatusCode404Response|AdGroupsDynamicTitlesDownloadCsvStatusCode429 of AdGroupsDynamicTitlesDownloadCsvStatusCode429Response|AdGroupsDynamicTitlesDownloadCsvDefaultStatusCode of AdGroupsDynamicTitlesDownloadCsvDefaultStatusCodeResponse

    type AdGroupsDynamicTitlesDownloadCsvArgs = {
      pathParams:AdGroupsDynamicTitlesDownloadCsvPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsDynamicTitlesGetStatusPathParams = {
      adAccountId : string ;
    //#endregion
      adGroupId : string ;
    }
    //#endregion


    type AdGroupsDynamicTitlesGetStatusStatusCode200Response = {
      content:DynamicTitlesGetStatus;
      
    }

    type AdGroupsDynamicTitlesGetStatusStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetStatusStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetStatusStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetStatusStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetStatusStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetStatusDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsDynamicTitlesGetStatusResult = AdGroupsDynamicTitlesGetStatusStatusCode200 of AdGroupsDynamicTitlesGetStatusStatusCode200Response|AdGroupsDynamicTitlesGetStatusStatusCode400 of AdGroupsDynamicTitlesGetStatusStatusCode400Response|AdGroupsDynamicTitlesGetStatusStatusCode401 of AdGroupsDynamicTitlesGetStatusStatusCode401Response|AdGroupsDynamicTitlesGetStatusStatusCode403 of AdGroupsDynamicTitlesGetStatusStatusCode403Response|AdGroupsDynamicTitlesGetStatusStatusCode404 of AdGroupsDynamicTitlesGetStatusStatusCode404Response|AdGroupsDynamicTitlesGetStatusStatusCode429 of AdGroupsDynamicTitlesGetStatusStatusCode429Response|AdGroupsDynamicTitlesGetStatusDefaultStatusCode of AdGroupsDynamicTitlesGetStatusDefaultStatusCodeResponse

    type AdGroupsDynamicTitlesGetStatusArgs = {
      pathParams:AdGroupsDynamicTitlesGetStatusPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsDynamicTitlesGetUploadUrlPathParams = {
      adAccountId : string ;
    //#endregion
      adGroupId : string ;
    }
    //#endregion


    type AdGroupsDynamicTitlesGetUploadUrlStatusCode200Response = {
      content:DynamicTitlesUploadURL;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesGetUploadUrlDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsDynamicTitlesGetUploadUrlResult = AdGroupsDynamicTitlesGetUploadUrlStatusCode200 of AdGroupsDynamicTitlesGetUploadUrlStatusCode200Response|AdGroupsDynamicTitlesGetUploadUrlStatusCode400 of AdGroupsDynamicTitlesGetUploadUrlStatusCode400Response|AdGroupsDynamicTitlesGetUploadUrlStatusCode401 of AdGroupsDynamicTitlesGetUploadUrlStatusCode401Response|AdGroupsDynamicTitlesGetUploadUrlStatusCode403 of AdGroupsDynamicTitlesGetUploadUrlStatusCode403Response|AdGroupsDynamicTitlesGetUploadUrlStatusCode404 of AdGroupsDynamicTitlesGetUploadUrlStatusCode404Response|AdGroupsDynamicTitlesGetUploadUrlStatusCode429 of AdGroupsDynamicTitlesGetUploadUrlStatusCode429Response|AdGroupsDynamicTitlesGetUploadUrlDefaultStatusCode of AdGroupsDynamicTitlesGetUploadUrlDefaultStatusCodeResponse

    type AdGroupsDynamicTitlesGetUploadUrlArgs = {
      pathParams:AdGroupsDynamicTitlesGetUploadUrlPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsDynamicTitlesProcessCsvPathParams = {
      adAccountId : string ;
    //#endregion
      adGroupId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdGroupsDynamicTitlesProcessCsvBodyParams = DynamicTitlesProcessCSVCreate
    //#endregion


    type AdGroupsDynamicTitlesProcessCsvStatusCode200Response = {
      content:DynamicTitlesProcessCSV;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode201Response = {
      content:DynamicTitlesProcessCSV;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesProcessCsvStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsDynamicTitlesProcessCsvDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsDynamicTitlesProcessCsvResult = AdGroupsDynamicTitlesProcessCsvStatusCode200 of AdGroupsDynamicTitlesProcessCsvStatusCode200Response|AdGroupsDynamicTitlesProcessCsvStatusCode201 of AdGroupsDynamicTitlesProcessCsvStatusCode201Response|AdGroupsDynamicTitlesProcessCsvStatusCode400 of AdGroupsDynamicTitlesProcessCsvStatusCode400Response|AdGroupsDynamicTitlesProcessCsvStatusCode401 of AdGroupsDynamicTitlesProcessCsvStatusCode401Response|AdGroupsDynamicTitlesProcessCsvStatusCode403 of AdGroupsDynamicTitlesProcessCsvStatusCode403Response|AdGroupsDynamicTitlesProcessCsvStatusCode404 of AdGroupsDynamicTitlesProcessCsvStatusCode404Response|AdGroupsDynamicTitlesProcessCsvStatusCode429 of AdGroupsDynamicTitlesProcessCsvStatusCode429Response|AdGroupsDynamicTitlesProcessCsvDefaultStatusCode of AdGroupsDynamicTitlesProcessCsvDefaultStatusCodeResponse

    type AdGroupsDynamicTitlesProcessCsvArgs = {
      pathParams:AdGroupsDynamicTitlesProcessCsvPathParams;
      bodyParams:AdGroupsDynamicTitlesProcessCsvBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsGetPathParams = {
      adGroupId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type AdGroupsGetStatusCode200Response = {
      content:AdGroup;
      
    }

    type AdGroupsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsGetResult = AdGroupsGetStatusCode200 of AdGroupsGetStatusCode200Response|AdGroupsGetStatusCode400 of AdGroupsGetStatusCode400Response|AdGroupsGetStatusCode401 of AdGroupsGetStatusCode401Response|AdGroupsGetStatusCode403 of AdGroupsGetStatusCode403Response|AdGroupsGetStatusCode404 of AdGroupsGetStatusCode404Response|AdGroupsGetStatusCode429 of AdGroupsGetStatusCode429Response|AdGroupsGetDefaultStatusCode of AdGroupsGetDefaultStatusCodeResponse

    type AdGroupsGetArgs = {
      pathParams:AdGroupsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdGroupsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      campaignIds : string[] option;


      adGroupIds : string[] option;


      entityStatuses : EntityStatus[] option;


      translateInterestsToNames : bool option;

    }
    //#endregion


    type AdGroupsListStatusCode200Response = {
      content:AdGroupsList200Response;
      
    }

    type AdGroupsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsListResult = AdGroupsListStatusCode200 of AdGroupsListStatusCode200Response|AdGroupsListStatusCode400 of AdGroupsListStatusCode400Response|AdGroupsListStatusCode401 of AdGroupsListStatusCode401Response|AdGroupsListStatusCode403 of AdGroupsListStatusCode403Response|AdGroupsListStatusCode404 of AdGroupsListStatusCode404Response|AdGroupsListStatusCode429 of AdGroupsListStatusCode429Response|AdGroupsListDefaultStatusCode of AdGroupsListDefaultStatusCodeResponse

    type AdGroupsListArgs = {
      pathParams:AdGroupsListPathParams;
      queryParams:Result<AdGroupsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsTargetingAnalyticsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdGroupsTargetingAnalyticsGetQueryParams = {
      adGroupIds : string[] ;


      startDate : DateTime ;


      endDate : DateTime ;


      targetingTypes : AdsAnalyticsAdGroupTargetingType[] ;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      attributionTypes : ConversionReportAttributionType[] option;


      reportingTimezone : ReportingTimeZone option;


      sortColumns : string[] option;


      sortAscending : bool option;

    }
    //#endregion


    type AdGroupsTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdGroupsTargetingAnalyticsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsTargetingAnalyticsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsTargetingAnalyticsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsTargetingAnalyticsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsTargetingAnalyticsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsTargetingAnalyticsGetResult = AdGroupsTargetingAnalyticsGetStatusCode200 of AdGroupsTargetingAnalyticsGetStatusCode200Response|AdGroupsTargetingAnalyticsGetStatusCode400 of AdGroupsTargetingAnalyticsGetStatusCode400Response|AdGroupsTargetingAnalyticsGetStatusCode401 of AdGroupsTargetingAnalyticsGetStatusCode401Response|AdGroupsTargetingAnalyticsGetStatusCode403 of AdGroupsTargetingAnalyticsGetStatusCode403Response|AdGroupsTargetingAnalyticsGetStatusCode404 of AdGroupsTargetingAnalyticsGetStatusCode404Response|AdGroupsTargetingAnalyticsGetStatusCode429 of AdGroupsTargetingAnalyticsGetStatusCode429Response|AdGroupsTargetingAnalyticsGetDefaultStatusCode of AdGroupsTargetingAnalyticsGetDefaultStatusCodeResponse

    type AdGroupsTargetingAnalyticsGetArgs = {
      pathParams:AdGroupsTargetingAnalyticsGetPathParams;
      queryParams:Result<AdGroupsTargetingAnalyticsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdGroupsUpdateBodyParams = AdGroupUpdateBatchUpdate[]
    //#endregion


    type AdGroupsUpdateStatusCode200Response = {
      content:AdGroupsCreate200Response;
      
    }

    type AdGroupsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdGroupsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdGroupsUpdateResult = AdGroupsUpdateStatusCode200 of AdGroupsUpdateStatusCode200Response|AdGroupsUpdateStatusCode400 of AdGroupsUpdateStatusCode400Response|AdGroupsUpdateStatusCode401 of AdGroupsUpdateStatusCode401Response|AdGroupsUpdateStatusCode403 of AdGroupsUpdateStatusCode403Response|AdGroupsUpdateStatusCode404 of AdGroupsUpdateStatusCode404Response|AdGroupsUpdateStatusCode429 of AdGroupsUpdateStatusCode429Response|AdGroupsUpdateDefaultStatusCode of AdGroupsUpdateDefaultStatusCodeResponse

    type AdGroupsUpdateArgs = {
      pathParams:AdGroupsUpdatePathParams;
      bodyParams:AdGroupsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetAdGroupsByPromotionIdsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type GetAdGroupsByPromotionIdsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      promotionIds : string[] ;

    }
    //#endregion


    type GetAdGroupsByPromotionIdsListStatusCode200Response = {
      content:AdGroupsList200Response;
      
    }

    type GetAdGroupsByPromotionIdsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetAdGroupsByPromotionIdsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetAdGroupsByPromotionIdsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetAdGroupsByPromotionIdsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetAdGroupsByPromotionIdsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetAdGroupsByPromotionIdsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetAdGroupsByPromotionIdsListResult = GetAdGroupsByPromotionIdsListStatusCode200 of GetAdGroupsByPromotionIdsListStatusCode200Response|GetAdGroupsByPromotionIdsListStatusCode400 of GetAdGroupsByPromotionIdsListStatusCode400Response|GetAdGroupsByPromotionIdsListStatusCode401 of GetAdGroupsByPromotionIdsListStatusCode401Response|GetAdGroupsByPromotionIdsListStatusCode403 of GetAdGroupsByPromotionIdsListStatusCode403Response|GetAdGroupsByPromotionIdsListStatusCode404 of GetAdGroupsByPromotionIdsListStatusCode404Response|GetAdGroupsByPromotionIdsListStatusCode429 of GetAdGroupsByPromotionIdsListStatusCode429Response|GetAdGroupsByPromotionIdsListDefaultStatusCode of GetAdGroupsByPromotionIdsListDefaultStatusCodeResponse

    type GetAdGroupsByPromotionIdsListArgs = {
      pathParams:GetAdGroupsByPromotionIdsListPathParams;
      queryParams:Result<GetAdGroupsByPromotionIdsListQueryParams,string>;
    }
