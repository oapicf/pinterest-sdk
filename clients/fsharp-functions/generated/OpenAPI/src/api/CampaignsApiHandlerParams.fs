namespace OpenAPI

open OpenAPI.Model.AdPinAnalytics
open OpenAPI.Model.AdsAnalyticsCampaignTargetingType
open OpenAPI.Model.Campaign
open OpenAPI.Model.CampaignBatchUpdateItem
open OpenAPI.Model.CampaignBatchWriteResponseModel
open OpenAPI.Model.CampaignCreateItem
open OpenAPI.Model.CampaignDeliveryEstimatesCampaign
open OpenAPI.Model.CampaignDeliveryEstimatesResponse
open OpenAPI.Model.CampaignsAnalyticsMetrics
open OpenAPI.Model.CampaignsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone
open System.Collections.Generic
open System

module CampaignsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdPinsAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdPinsAnalyticsQueryParams = {
      campaignId : string ;


      pinIds : string[] ;


      startDate : DateTime ;


      endDate : DateTime ;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;

    }
    //#endregion


    type AdPinsAnalyticsStatusCode200Response = {
      content:AdPinAnalytics[];
      
    }

    type AdPinsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdPinsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdPinsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdPinsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdPinsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdPinsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdPinsAnalyticsResult = AdPinsAnalyticsStatusCode200 of AdPinsAnalyticsStatusCode200Response|AdPinsAnalyticsStatusCode400 of AdPinsAnalyticsStatusCode400Response|AdPinsAnalyticsStatusCode401 of AdPinsAnalyticsStatusCode401Response|AdPinsAnalyticsStatusCode403 of AdPinsAnalyticsStatusCode403Response|AdPinsAnalyticsStatusCode404 of AdPinsAnalyticsStatusCode404Response|AdPinsAnalyticsStatusCode429 of AdPinsAnalyticsStatusCode429Response|AdPinsAnalyticsDefaultStatusCode of AdPinsAnalyticsDefaultStatusCodeResponse

    type AdPinsAnalyticsArgs = {
      pathParams:AdPinsAnalyticsPathParams;
      queryParams:Result<AdPinsAnalyticsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignTargetingAnalyticsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CampaignTargetingAnalyticsGetQueryParams = {
      campaignIds : string[] ;


      startDate : DateTime ;


      endDate : DateTime ;


      targetingTypes : AdsAnalyticsCampaignTargetingType[] ;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      attributionTypes : ConversionReportAttributionType[] option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type CampaignTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type CampaignTargetingAnalyticsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignTargetingAnalyticsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignTargetingAnalyticsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignTargetingAnalyticsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignTargetingAnalyticsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignTargetingAnalyticsGetResult = CampaignTargetingAnalyticsGetStatusCode200 of CampaignTargetingAnalyticsGetStatusCode200Response|CampaignTargetingAnalyticsGetStatusCode400 of CampaignTargetingAnalyticsGetStatusCode400Response|CampaignTargetingAnalyticsGetStatusCode401 of CampaignTargetingAnalyticsGetStatusCode401Response|CampaignTargetingAnalyticsGetStatusCode403 of CampaignTargetingAnalyticsGetStatusCode403Response|CampaignTargetingAnalyticsGetStatusCode404 of CampaignTargetingAnalyticsGetStatusCode404Response|CampaignTargetingAnalyticsGetStatusCode429 of CampaignTargetingAnalyticsGetStatusCode429Response|CampaignTargetingAnalyticsGetDefaultStatusCode of CampaignTargetingAnalyticsGetDefaultStatusCodeResponse

    type CampaignTargetingAnalyticsGetArgs = {
      pathParams:CampaignTargetingAnalyticsGetPathParams;
      queryParams:Result<CampaignTargetingAnalyticsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CampaignsAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      campaignIds : string[] ;


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


    type CampaignsAnalyticsStatusCode200Response = {
      content:CampaignsAnalyticsMetrics[];
      
    }

    type CampaignsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignsAnalyticsResult = CampaignsAnalyticsStatusCode200 of CampaignsAnalyticsStatusCode200Response|CampaignsAnalyticsStatusCode400 of CampaignsAnalyticsStatusCode400Response|CampaignsAnalyticsStatusCode401 of CampaignsAnalyticsStatusCode401Response|CampaignsAnalyticsStatusCode403 of CampaignsAnalyticsStatusCode403Response|CampaignsAnalyticsStatusCode404 of CampaignsAnalyticsStatusCode404Response|CampaignsAnalyticsStatusCode429 of CampaignsAnalyticsStatusCode429Response|CampaignsAnalyticsDefaultStatusCode of CampaignsAnalyticsDefaultStatusCodeResponse

    type CampaignsAnalyticsArgs = {
      pathParams:CampaignsAnalyticsPathParams;
      queryParams:Result<CampaignsAnalyticsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CampaignsCreateBodyParams = CampaignCreateItem[]
    //#endregion


    type CampaignsCreateStatusCode200Response = {
      content:CampaignBatchWriteResponseModel;
      
    }

    type CampaignsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignsCreateResult = CampaignsCreateStatusCode200 of CampaignsCreateStatusCode200Response|CampaignsCreateStatusCode400 of CampaignsCreateStatusCode400Response|CampaignsCreateStatusCode401 of CampaignsCreateStatusCode401Response|CampaignsCreateStatusCode403 of CampaignsCreateStatusCode403Response|CampaignsCreateStatusCode404 of CampaignsCreateStatusCode404Response|CampaignsCreateStatusCode429 of CampaignsCreateStatusCode429Response|CampaignsCreateDefaultStatusCode of CampaignsCreateDefaultStatusCodeResponse

    type CampaignsCreateArgs = {
      pathParams:CampaignsCreatePathParams;
      bodyParams:CampaignsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsGetPathParams = {
      campaignId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type CampaignsGetStatusCode200Response = {
      content:Campaign;
      
    }

    type CampaignsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignsGetResult = CampaignsGetStatusCode200 of CampaignsGetStatusCode200Response|CampaignsGetStatusCode400 of CampaignsGetStatusCode400Response|CampaignsGetStatusCode401 of CampaignsGetStatusCode401Response|CampaignsGetStatusCode403 of CampaignsGetStatusCode403Response|CampaignsGetStatusCode404 of CampaignsGetStatusCode404Response|CampaignsGetStatusCode429 of CampaignsGetStatusCode429Response|CampaignsGetDefaultStatusCode of CampaignsGetDefaultStatusCodeResponse

    type CampaignsGetArgs = {
      pathParams:CampaignsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CampaignsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      campaignIds : string[] option;


      entityStatuses : EntityStatus[] option;

    }
    //#endregion


    type CampaignsListStatusCode200Response = {
      content:CampaignsList200Response;
      
    }

    type CampaignsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignsListResult = CampaignsListStatusCode200 of CampaignsListStatusCode200Response|CampaignsListStatusCode400 of CampaignsListStatusCode400Response|CampaignsListStatusCode401 of CampaignsListStatusCode401Response|CampaignsListStatusCode403 of CampaignsListStatusCode403Response|CampaignsListStatusCode404 of CampaignsListStatusCode404Response|CampaignsListStatusCode429 of CampaignsListStatusCode429Response|CampaignsListDefaultStatusCode of CampaignsListDefaultStatusCodeResponse

    type CampaignsListArgs = {
      pathParams:CampaignsListPathParams;
      queryParams:Result<CampaignsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CampaignsUpdateBodyParams = CampaignBatchUpdateItem[]
    //#endregion


    type CampaignsUpdateStatusCode200Response = {
      content:CampaignBatchWriteResponseModel;
      
    }

    type CampaignsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignsUpdateResult = CampaignsUpdateStatusCode200 of CampaignsUpdateStatusCode200Response|CampaignsUpdateStatusCode400 of CampaignsUpdateStatusCode400Response|CampaignsUpdateStatusCode401 of CampaignsUpdateStatusCode401Response|CampaignsUpdateStatusCode403 of CampaignsUpdateStatusCode403Response|CampaignsUpdateStatusCode404 of CampaignsUpdateStatusCode404Response|CampaignsUpdateStatusCode429 of CampaignsUpdateStatusCode429Response|CampaignsUpdateDefaultStatusCode of CampaignsUpdateDefaultStatusCodeResponse

    type CampaignsUpdateArgs = {
      pathParams:CampaignsUpdatePathParams;
      bodyParams:CampaignsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type GetCampaignDeliveryEstimatesPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type GetCampaignDeliveryEstimatesBodyParams = CampaignDeliveryEstimatesCampaign[]
    //#endregion


    type GetCampaignDeliveryEstimatesStatusCode200Response = {
      content:CampaignDeliveryEstimatesResponse;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesStatusCode503Response = {
      content:PinterestLibError;
      
    }

    type GetCampaignDeliveryEstimatesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type GetCampaignDeliveryEstimatesResult = GetCampaignDeliveryEstimatesStatusCode200 of GetCampaignDeliveryEstimatesStatusCode200Response|GetCampaignDeliveryEstimatesStatusCode400 of GetCampaignDeliveryEstimatesStatusCode400Response|GetCampaignDeliveryEstimatesStatusCode401 of GetCampaignDeliveryEstimatesStatusCode401Response|GetCampaignDeliveryEstimatesStatusCode403 of GetCampaignDeliveryEstimatesStatusCode403Response|GetCampaignDeliveryEstimatesStatusCode404 of GetCampaignDeliveryEstimatesStatusCode404Response|GetCampaignDeliveryEstimatesStatusCode429 of GetCampaignDeliveryEstimatesStatusCode429Response|GetCampaignDeliveryEstimatesStatusCode503 of GetCampaignDeliveryEstimatesStatusCode503Response|GetCampaignDeliveryEstimatesDefaultStatusCode of GetCampaignDeliveryEstimatesDefaultStatusCodeResponse

    type GetCampaignDeliveryEstimatesArgs = {
      pathParams:GetCampaignDeliveryEstimatesPathParams;
      bodyParams:GetCampaignDeliveryEstimatesBodyParams
    }
