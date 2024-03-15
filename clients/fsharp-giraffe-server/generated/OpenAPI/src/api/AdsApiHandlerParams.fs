namespace OpenAPI

open OpenAPI.Model.AdArrayResponse
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdResponse
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.AdsAnalyticsResponseInner
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
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

    type AdPreviewsCreateStatusCode400Response = {
      content:Error;
      
    }

    type AdPreviewsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdPreviewsCreateResult = AdPreviewsCreateStatusCode200 of AdPreviewsCreateStatusCode200Response|AdPreviewsCreateStatusCode400 of AdPreviewsCreateStatusCode400Response|AdPreviewsCreateDefaultStatusCode of AdPreviewsCreateDefaultStatusCodeResponse

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


      targetingTypes : AdsAnalyticsTargetingType[] ;


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;


      attributionTypes : ConversionReportAttributionType option;

    }
    //#endregion


    type AdTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdTargetingAnalyticsGetResult = AdTargetingAnalyticsGetStatusCode200 of AdTargetingAnalyticsGetStatusCode200Response|AdTargetingAnalyticsGetDefaultStatusCode of AdTargetingAnalyticsGetDefaultStatusCodeResponse

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
      startDate : DateTime ;


      endDate : DateTime ;


      adIds : string[] ;


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;

    }
    //#endregion


    type AdsAnalyticsStatusCode200Response = {
      content:AdsAnalyticsResponseInner[];
      
    }

    type AdsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type AdsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsAnalyticsResult = AdsAnalyticsStatusCode200 of AdsAnalyticsStatusCode200Response|AdsAnalyticsStatusCode400 of AdsAnalyticsStatusCode400Response|AdsAnalyticsDefaultStatusCode of AdsAnalyticsDefaultStatusCodeResponse

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
    type AdsCreateBodyParams = AdCreateRequest[]
    //#endregion


    type AdsCreateStatusCode200Response = {
      content:AdArrayResponse;
      
    }

    type AdsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsCreateResult = AdsCreateStatusCode200 of AdsCreateStatusCode200Response|AdsCreateDefaultStatusCode of AdsCreateDefaultStatusCodeResponse

    type AdsCreateArgs = {
      pathParams:AdsCreatePathParams;
      bodyParams:AdsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdsGetPathParams = {
      adAccountId : string ;
    //#endregion
      adId : string ;
    }
    //#endregion


    type AdsGetStatusCode200Response = {
      content:AdResponse;
      
    }

    type AdsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsGetResult = AdsGetStatusCode200 of AdsGetStatusCode200Response|AdsGetDefaultStatusCode of AdsGetDefaultStatusCodeResponse

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
      campaignIds : string[] option;


      adGroupIds : string[] option;


      adIds : string[] option;


      entityStatuses : string[] option;


      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type AdsListStatusCode200Response = {
      content:AdsList200Response;
      
    }

    type AdsListStatusCode400Response = {
      content:Error;
      
    }

    type AdsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsListResult = AdsListStatusCode200 of AdsListStatusCode200Response|AdsListStatusCode400 of AdsListStatusCode400Response|AdsListDefaultStatusCode of AdsListDefaultStatusCodeResponse

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
    type AdsUpdateBodyParams = AdUpdateRequest[]
    //#endregion


    type AdsUpdateStatusCode200Response = {
      content:AdArrayResponse;
      
    }

    type AdsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdsUpdateResult = AdsUpdateStatusCode200 of AdsUpdateStatusCode200Response|AdsUpdateDefaultStatusCode of AdsUpdateDefaultStatusCodeResponse

    type AdsUpdateArgs = {
      pathParams:AdsUpdatePathParams;
      bodyParams:AdsUpdateBodyParams
    }
