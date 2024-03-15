namespace OpenAPI

open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.CampaignCreateResponse
open OpenAPI.Model.CampaignResponse
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.CampaignUpdateResponse
open OpenAPI.Model.CampaignsAnalyticsResponseInner
open OpenAPI.Model.CampaignsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open System.Collections.Generic
open System

module CampaignsApiHandlerParams =

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


    type CampaignTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type CampaignTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignTargetingAnalyticsGetResult = CampaignTargetingAnalyticsGetStatusCode200 of CampaignTargetingAnalyticsGetStatusCode200Response|CampaignTargetingAnalyticsGetDefaultStatusCode of CampaignTargetingAnalyticsGetDefaultStatusCodeResponse

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


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;

    }
    //#endregion


    type CampaignsAnalyticsStatusCode200Response = {
      content:CampaignsAnalyticsResponseInner[];
      
    }

    type CampaignsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type CampaignsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignsAnalyticsResult = CampaignsAnalyticsStatusCode200 of CampaignsAnalyticsStatusCode200Response|CampaignsAnalyticsStatusCode400 of CampaignsAnalyticsStatusCode400Response|CampaignsAnalyticsDefaultStatusCode of CampaignsAnalyticsDefaultStatusCodeResponse

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
    type CampaignsCreateBodyParams = CampaignCreateRequest[]
    //#endregion


    type CampaignsCreateStatusCode200Response = {
      content:CampaignCreateResponse;
      
    }

    type CampaignsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignsCreateResult = CampaignsCreateStatusCode200 of CampaignsCreateStatusCode200Response|CampaignsCreateDefaultStatusCode of CampaignsCreateDefaultStatusCodeResponse

    type CampaignsCreateArgs = {
      pathParams:CampaignsCreatePathParams;
      bodyParams:CampaignsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CampaignsGetPathParams = {
      adAccountId : string ;
    //#endregion
      campaignId : string ;
    }
    //#endregion


    type CampaignsGetStatusCode200Response = {
      content:CampaignResponse;
      
    }

    type CampaignsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignsGetResult = CampaignsGetStatusCode200 of CampaignsGetStatusCode200Response|CampaignsGetDefaultStatusCode of CampaignsGetDefaultStatusCodeResponse

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
      campaignIds : string[] option;


      entityStatuses : string[] option;


      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type CampaignsListStatusCode200Response = {
      content:CampaignsList200Response;
      
    }

    type CampaignsListStatusCode400Response = {
      content:Error;
      
    }

    type CampaignsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignsListResult = CampaignsListStatusCode200 of CampaignsListStatusCode200Response|CampaignsListStatusCode400 of CampaignsListStatusCode400Response|CampaignsListDefaultStatusCode of CampaignsListDefaultStatusCodeResponse

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
    type CampaignsUpdateBodyParams = CampaignUpdateRequest[]
    //#endregion


    type CampaignsUpdateStatusCode200Response = {
      content:CampaignUpdateResponse;
      
    }

    type CampaignsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CampaignsUpdateResult = CampaignsUpdateStatusCode200 of CampaignsUpdateStatusCode200Response|CampaignsUpdateDefaultStatusCode of CampaignsUpdateDefaultStatusCodeResponse

    type CampaignsUpdateArgs = {
      pathParams:CampaignsUpdatePathParams;
      bodyParams:CampaignsUpdateBodyParams
    }
