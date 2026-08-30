namespace OpenAPI

open OpenAPI.Model.Ad
open OpenAPI.Model.AdBatchUpdate
open OpenAPI.Model.AdBatchWriteResponseModel
open OpenAPI.Model.AdCreate
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdsAnalytics
open OpenAPI.Model.AdsAnalyticsAdTargetingType
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.CampaignAdPreview
open OpenAPI.Model.CampaignAdPreviewCreate
open OpenAPI.Model.CampaignAdPreviewCreate200ResponseInner
open OpenAPI.Model.CampaignAdPreviewDelete200ResponseInner
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone
open System.Collections.Generic
open System

module AdsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdPreviewsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdPreviewsCreateBodyParams = AdPreviewRequest
    //#endregion


    type AdPreviewsCreateStatusCode200Response = {
      content:AdPreviewURLResponse;
      
    }

    type AdPreviewsCreateStatusCode201Response = {
      content:AdPreviewURLResponse;
      
    }

    type AdPreviewsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdPreviewsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdPreviewsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdPreviewsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdPreviewsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdPreviewsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdPreviewsCreateResult = AdPreviewsCreateStatusCode200 of AdPreviewsCreateStatusCode200Response|AdPreviewsCreateStatusCode201 of AdPreviewsCreateStatusCode201Response|AdPreviewsCreateStatusCode400 of AdPreviewsCreateStatusCode400Response|AdPreviewsCreateStatusCode401 of AdPreviewsCreateStatusCode401Response|AdPreviewsCreateStatusCode403 of AdPreviewsCreateStatusCode403Response|AdPreviewsCreateStatusCode404 of AdPreviewsCreateStatusCode404Response|AdPreviewsCreateStatusCode429 of AdPreviewsCreateStatusCode429Response|AdPreviewsCreateDefaultStatusCode of AdPreviewsCreateDefaultStatusCodeResponse

    type AdPreviewsCreateArgs = {
      pathParams:AdPreviewsCreatePathParams;
      bodyParams:AdPreviewsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdTargetingAnalyticsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdTargetingAnalyticsGetQueryParams = {
      adIds : string[] ;


      startDate : DateTime ;


      endDate : DateTime ;


      targetingTypes : AdsAnalyticsAdTargetingType[] ;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : ConversionAttributionWindowDays option;


      engagementWindowDays : ConversionAttributionWindowDays option;


      viewWindowDays : ConversionAttributionWindowDays option;


      conversionReportTime : ConversionReportTimeType option;


      attributionTypes : ConversionReportAttributionType[] option;


      reportingTimezone : ReportingTimeZone option;


      sortColumns : string[] option;


      sortAscending : bool option;

    }
    //#endregion


    type AdTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdTargetingAnalyticsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdTargetingAnalyticsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdTargetingAnalyticsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdTargetingAnalyticsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdTargetingAnalyticsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdTargetingAnalyticsGetResult = AdTargetingAnalyticsGetStatusCode200 of AdTargetingAnalyticsGetStatusCode200Response|AdTargetingAnalyticsGetStatusCode400 of AdTargetingAnalyticsGetStatusCode400Response|AdTargetingAnalyticsGetStatusCode401 of AdTargetingAnalyticsGetStatusCode401Response|AdTargetingAnalyticsGetStatusCode403 of AdTargetingAnalyticsGetStatusCode403Response|AdTargetingAnalyticsGetStatusCode404 of AdTargetingAnalyticsGetStatusCode404Response|AdTargetingAnalyticsGetStatusCode429 of AdTargetingAnalyticsGetStatusCode429Response|AdTargetingAnalyticsGetDefaultStatusCode of AdTargetingAnalyticsGetDefaultStatusCodeResponse

    type AdTargetingAnalyticsGetArgs = {
      pathParams:AdTargetingAnalyticsGetPathParams;
      queryParams:Result<AdTargetingAnalyticsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdsAnalyticsQueryParams = {
      pinIds : string[] option;


      startDate : DateTime ;


      endDate : DateTime ;


      adIds : string[] option;


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      campaignIds : string[] option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type AdsAnalyticsStatusCode200Response = {
      content:AdsAnalytics[];
      
    }

    type AdsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsAnalyticsResult = AdsAnalyticsStatusCode200 of AdsAnalyticsStatusCode200Response|AdsAnalyticsStatusCode400 of AdsAnalyticsStatusCode400Response|AdsAnalyticsStatusCode401 of AdsAnalyticsStatusCode401Response|AdsAnalyticsStatusCode403 of AdsAnalyticsStatusCode403Response|AdsAnalyticsStatusCode404 of AdsAnalyticsStatusCode404Response|AdsAnalyticsStatusCode429 of AdsAnalyticsStatusCode429Response|AdsAnalyticsDefaultStatusCode of AdsAnalyticsDefaultStatusCodeResponse

    type AdsAnalyticsArgs = {
      pathParams:AdsAnalyticsPathParams;
      queryParams:Result<AdsAnalyticsQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdsCreateBodyParams = AdCreate[]
    //#endregion


    type AdsCreateStatusCode200Response = {
      content:AdBatchWriteResponseModel;
      
    }

    type AdsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsCreateResult = AdsCreateStatusCode200 of AdsCreateStatusCode200Response|AdsCreateStatusCode400 of AdsCreateStatusCode400Response|AdsCreateStatusCode401 of AdsCreateStatusCode401Response|AdsCreateStatusCode403 of AdsCreateStatusCode403Response|AdsCreateStatusCode404 of AdsCreateStatusCode404Response|AdsCreateStatusCode429 of AdsCreateStatusCode429Response|AdsCreateDefaultStatusCode of AdsCreateDefaultStatusCodeResponse

    type AdsCreateArgs = {
      pathParams:AdsCreatePathParams;
      bodyParams:AdsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsGetPathParams = {
      adId : string ;
    //#endregion
      adAccountId : string ;
    }
    //#endregion


    type AdsGetStatusCode200Response = {
      content:Ad;
      
    }

    type AdsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsGetResult = AdsGetStatusCode200 of AdsGetStatusCode200Response|AdsGetStatusCode400 of AdsGetStatusCode400Response|AdsGetStatusCode401 of AdsGetStatusCode401Response|AdsGetStatusCode403 of AdsGetStatusCode403Response|AdsGetStatusCode404 of AdsGetStatusCode404Response|AdsGetStatusCode429 of AdsGetStatusCode429Response|AdsGetDefaultStatusCode of AdsGetDefaultStatusCodeResponse

    type AdsGetArgs = {
      pathParams:AdsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      campaignIds : string[] option;


      adGroupIds : string[] option;


      adIds : string[] option;


      entityStatuses : EntityStatus[] option;

    }
    //#endregion


    type AdsListStatusCode200Response = {
      content:AdsList200Response;
      
    }

    type AdsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsListResult = AdsListStatusCode200 of AdsListStatusCode200Response|AdsListStatusCode400 of AdsListStatusCode400Response|AdsListStatusCode401 of AdsListStatusCode401Response|AdsListStatusCode403 of AdsListStatusCode403Response|AdsListStatusCode404 of AdsListStatusCode404Response|AdsListStatusCode429 of AdsListStatusCode429Response|AdsListDefaultStatusCode of AdsListDefaultStatusCodeResponse

    type AdsListArgs = {
      pathParams:AdsListPathParams;
      queryParams:Result<AdsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AdsUpdateBodyParams = AdBatchUpdate[]
    //#endregion


    type AdsUpdateStatusCode200Response = {
      content:AdBatchWriteResponseModel;
      
    }

    type AdsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdsUpdateResult = AdsUpdateStatusCode200 of AdsUpdateStatusCode200Response|AdsUpdateStatusCode400 of AdsUpdateStatusCode400Response|AdsUpdateStatusCode401 of AdsUpdateStatusCode401Response|AdsUpdateStatusCode403 of AdsUpdateStatusCode403Response|AdsUpdateStatusCode404 of AdsUpdateStatusCode404Response|AdsUpdateStatusCode429 of AdsUpdateStatusCode429Response|AdsUpdateDefaultStatusCode of AdsUpdateDefaultStatusCodeResponse

    type AdsUpdateArgs = {
      pathParams:AdsUpdatePathParams;
      bodyParams:AdsUpdateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignAdPreviewCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CampaignAdPreviewCreateBodyParams = CampaignAdPreviewCreate[]
    //#endregion


    type CampaignAdPreviewCreateStatusCode200Response = {
      content:CampaignAdPreviewCreate200ResponseInner[];
      
    }

    type CampaignAdPreviewCreateStatusCode201Response = {
      content:CampaignAdPreview[];
      
    }

    type CampaignAdPreviewCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignAdPreviewCreateResult = CampaignAdPreviewCreateStatusCode200 of CampaignAdPreviewCreateStatusCode200Response|CampaignAdPreviewCreateStatusCode201 of CampaignAdPreviewCreateStatusCode201Response|CampaignAdPreviewCreateStatusCode400 of CampaignAdPreviewCreateStatusCode400Response|CampaignAdPreviewCreateStatusCode401 of CampaignAdPreviewCreateStatusCode401Response|CampaignAdPreviewCreateStatusCode403 of CampaignAdPreviewCreateStatusCode403Response|CampaignAdPreviewCreateStatusCode404 of CampaignAdPreviewCreateStatusCode404Response|CampaignAdPreviewCreateStatusCode429 of CampaignAdPreviewCreateStatusCode429Response|CampaignAdPreviewCreateDefaultStatusCode of CampaignAdPreviewCreateDefaultStatusCodeResponse

    type CampaignAdPreviewCreateArgs = {
      pathParams:CampaignAdPreviewCreatePathParams;
      bodyParams:CampaignAdPreviewCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignAdPreviewDeletePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CampaignAdPreviewDeleteQueryParams = {
      adGroupIds : string[] ;

    }
    //#endregion


    type CampaignAdPreviewDeleteStatusCode200Response = {
      content:CampaignAdPreviewDelete200ResponseInner[];
      
    }

    type CampaignAdPreviewDeleteStatusCode204Response = {
      content:string;
      
    }

    type CampaignAdPreviewDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignAdPreviewDeleteResult = CampaignAdPreviewDeleteStatusCode200 of CampaignAdPreviewDeleteStatusCode200Response|CampaignAdPreviewDeleteStatusCode204 of CampaignAdPreviewDeleteStatusCode204Response|CampaignAdPreviewDeleteStatusCode400 of CampaignAdPreviewDeleteStatusCode400Response|CampaignAdPreviewDeleteStatusCode401 of CampaignAdPreviewDeleteStatusCode401Response|CampaignAdPreviewDeleteStatusCode403 of CampaignAdPreviewDeleteStatusCode403Response|CampaignAdPreviewDeleteStatusCode404 of CampaignAdPreviewDeleteStatusCode404Response|CampaignAdPreviewDeleteStatusCode429 of CampaignAdPreviewDeleteStatusCode429Response|CampaignAdPreviewDeleteDefaultStatusCode of CampaignAdPreviewDeleteDefaultStatusCodeResponse

    type CampaignAdPreviewDeleteArgs = {
      pathParams:CampaignAdPreviewDeletePathParams;
      queryParams:Result<CampaignAdPreviewDeleteQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignAdPreviewReadPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CampaignAdPreviewReadQueryParams = {
      adGroupIds : string[] ;

    }
    //#endregion


    type CampaignAdPreviewReadStatusCode200Response = {
      content:CampaignAdPreview[];
      
    }

    type CampaignAdPreviewReadStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewReadStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewReadStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewReadStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewReadStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CampaignAdPreviewReadDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CampaignAdPreviewReadResult = CampaignAdPreviewReadStatusCode200 of CampaignAdPreviewReadStatusCode200Response|CampaignAdPreviewReadStatusCode400 of CampaignAdPreviewReadStatusCode400Response|CampaignAdPreviewReadStatusCode401 of CampaignAdPreviewReadStatusCode401Response|CampaignAdPreviewReadStatusCode403 of CampaignAdPreviewReadStatusCode403Response|CampaignAdPreviewReadStatusCode404 of CampaignAdPreviewReadStatusCode404Response|CampaignAdPreviewReadStatusCode429 of CampaignAdPreviewReadStatusCode429Response|CampaignAdPreviewReadDefaultStatusCode of CampaignAdPreviewReadDefaultStatusCodeResponse

    type CampaignAdPreviewReadArgs = {
      pathParams:CampaignAdPreviewReadPathParams;
      queryParams:Result<CampaignAdPreviewReadQueryParams,string>;
    }
