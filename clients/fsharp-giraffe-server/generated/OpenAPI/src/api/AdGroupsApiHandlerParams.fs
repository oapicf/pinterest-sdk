namespace OpenAPI

open OpenAPI.Model.AdGroupArrayResponse
open OpenAPI.Model.AdGroupAudienceSizingRequest
open OpenAPI.Model.AdGroupAudienceSizingResponse
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdGroupsAnalyticsResponseInner
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
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


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;

    }
    //#endregion


    type AdGroupsAnalyticsStatusCode200Response = {
      content:AdGroupsAnalyticsResponseInner[];
      
    }

    type AdGroupsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type AdGroupsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsAnalyticsResult = AdGroupsAnalyticsStatusCode200 of AdGroupsAnalyticsStatusCode200Response|AdGroupsAnalyticsStatusCode400 of AdGroupsAnalyticsStatusCode400Response|AdGroupsAnalyticsDefaultStatusCode of AdGroupsAnalyticsDefaultStatusCodeResponse

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
    type AdGroupsAudienceSizingBodyParams = AdGroupAudienceSizingRequest
    //#endregion


    type AdGroupsAudienceSizingStatusCode200Response = {
      content:AdGroupAudienceSizingResponse;
      
    }

    type AdGroupsAudienceSizingStatusCode400Response = {
      content:Error;
      
    }

    type AdGroupsAudienceSizingStatusCode403Response = {
      content:Error;
      
    }

    type AdGroupsAudienceSizingDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsAudienceSizingResult = AdGroupsAudienceSizingStatusCode200 of AdGroupsAudienceSizingStatusCode200Response|AdGroupsAudienceSizingStatusCode400 of AdGroupsAudienceSizingStatusCode400Response|AdGroupsAudienceSizingStatusCode403 of AdGroupsAudienceSizingStatusCode403Response|AdGroupsAudienceSizingDefaultStatusCode of AdGroupsAudienceSizingDefaultStatusCodeResponse

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
    type AdGroupsBidFloorGetBodyParams = BidFloorRequest
    //#endregion


    type AdGroupsBidFloorGetStatusCode200Response = {
      content:BidFloor;
      
    }

    type AdGroupsBidFloorGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsBidFloorGetResult = AdGroupsBidFloorGetStatusCode200 of AdGroupsBidFloorGetStatusCode200Response|AdGroupsBidFloorGetDefaultStatusCode of AdGroupsBidFloorGetDefaultStatusCodeResponse

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
    type AdGroupsCreateBodyParams = AdGroupCreateRequest[]
    //#endregion


    type AdGroupsCreateStatusCode200Response = {
      content:AdGroupArrayResponse;
      
    }

    type AdGroupsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsCreateResult = AdGroupsCreateStatusCode200 of AdGroupsCreateStatusCode200Response|AdGroupsCreateDefaultStatusCode of AdGroupsCreateDefaultStatusCodeResponse

    type AdGroupsCreateArgs = {
      pathParams:AdGroupsCreatePathParams;
      bodyParams:AdGroupsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdGroupsGetPathParams = {
      adAccountId : string ;
    //#endregion
      adGroupId : string ;
    }
    //#endregion


    type AdGroupsGetStatusCode200Response = {
      content:AdGroupResponse;
      
    }

    type AdGroupsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsGetResult = AdGroupsGetStatusCode200 of AdGroupsGetStatusCode200Response|AdGroupsGetDefaultStatusCode of AdGroupsGetDefaultStatusCodeResponse

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
      campaignIds : string[] option;


      adGroupIds : string[] option;


      entityStatuses : string[] option;


      pageSize : int option;


      order : string option;


      bookmark : string option;


      translateInterestsToNames : bool option;

    }
    //#endregion


    type AdGroupsListStatusCode200Response = {
      content:AdGroupsList200Response;
      
    }

    type AdGroupsListStatusCode400Response = {
      content:Error;
      
    }

    type AdGroupsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsListResult = AdGroupsListStatusCode200 of AdGroupsListStatusCode200Response|AdGroupsListStatusCode400 of AdGroupsListStatusCode400Response|AdGroupsListDefaultStatusCode of AdGroupsListDefaultStatusCodeResponse

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


    type AdGroupsTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdGroupsTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsTargetingAnalyticsGetResult = AdGroupsTargetingAnalyticsGetStatusCode200 of AdGroupsTargetingAnalyticsGetStatusCode200Response|AdGroupsTargetingAnalyticsGetDefaultStatusCode of AdGroupsTargetingAnalyticsGetDefaultStatusCodeResponse

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
    type AdGroupsUpdateBodyParams = AdGroupUpdateRequest[]
    //#endregion


    type AdGroupsUpdateStatusCode200Response = {
      content:AdGroupArrayResponse;
      
    }

    type AdGroupsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdGroupsUpdateResult = AdGroupsUpdateStatusCode200 of AdGroupsUpdateStatusCode200Response|AdGroupsUpdateDefaultStatusCode of AdGroupsUpdateDefaultStatusCodeResponse

    type AdGroupsUpdateArgs = {
      pathParams:AdGroupsUpdatePathParams;
      bodyParams:AdGroupsUpdateBodyParams
    }
