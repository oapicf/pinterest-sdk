namespace OpenAPI

open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AnyType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.Paginated
open System.Collections.Generic
open System

module AdAccountsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type AdAccountAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;

    }
    //#endregion


    type AdAccountAnalyticsStatusCode200Response = {
      content:IDictionary<string, obj>[];
      
    }

    type AdAccountAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type AdAccountAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountAnalyticsResult = AdAccountAnalyticsStatusCode200 of AdAccountAnalyticsStatusCode200Response|AdAccountAnalyticsStatusCode400 of AdAccountAnalyticsStatusCode400Response|AdAccountAnalyticsDefaultStatusCode of AdAccountAnalyticsDefaultStatusCodeResponse

    type AdAccountAnalyticsArgs = {
      pathParams:AdAccountAnalyticsPathParams;
      queryParams:Result<AdAccountAnalyticsQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      includeSharedAccounts : bool option;

    }
    //#endregion


    type AdAccountsListStatusCode200Response = {
      content:Paginated;
      
    }

    type AdAccountsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountsListResult = AdAccountsListStatusCode200 of AdAccountsListStatusCode200Response|AdAccountsListDefaultStatusCode of AdAccountsListDefaultStatusCodeResponse

    type AdAccountsListArgs = {
      queryParams:Result<AdAccountsListQueryParams,string>;
    }
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
      content:IDictionary<string, obj>[];
      
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
      content:Paginated;
      
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
      content:IDictionary<string, obj>[];
      
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
      content:Paginated;
      
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
    type AnalyticsCreateReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AnalyticsCreateReportBodyParams = AdsAnalyticsCreateAsyncRequest
    //#endregion


    type AnalyticsCreateReportStatusCode200Response = {
      content:AdsAnalyticsCreateAsyncResponse;
      
    }

    type AnalyticsCreateReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsCreateReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsCreateReportResult = AnalyticsCreateReportStatusCode200 of AnalyticsCreateReportStatusCode200Response|AnalyticsCreateReportStatusCode400 of AnalyticsCreateReportStatusCode400Response|AnalyticsCreateReportDefaultStatusCode of AnalyticsCreateReportDefaultStatusCodeResponse

    type AnalyticsCreateReportArgs = {
      pathParams:AnalyticsCreateReportPathParams;
      bodyParams:AnalyticsCreateReportBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AnalyticsGetReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AnalyticsGetReportQueryParams = {
      token : string ;

    }
    //#endregion


    type AnalyticsGetReportStatusCode200Response = {
      content:AdsAnalyticsGetAsyncResponse;
      
    }

    type AnalyticsGetReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsGetReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsGetReportResult = AnalyticsGetReportStatusCode200 of AnalyticsGetReportStatusCode200Response|AnalyticsGetReportStatusCode400 of AnalyticsGetReportStatusCode400Response|AnalyticsGetReportDefaultStatusCode of AnalyticsGetReportDefaultStatusCodeResponse

    type AnalyticsGetReportArgs = {
      pathParams:AnalyticsGetReportPathParams;
      queryParams:Result<AnalyticsGetReportQueryParams,string>;
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
      content:IDictionary<string, obj>[];
      
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
      content:Paginated;
      
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
    type ProductGroupsAnalyticsPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ProductGroupsAnalyticsQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      productGroupIds : string[] ;


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;

    }
    //#endregion


    type ProductGroupsAnalyticsStatusCode200Response = {
      content:IDictionary<string, obj>[];
      
    }

    type ProductGroupsAnalyticsStatusCode400Response = {
      content:Error;
      
    }

    type ProductGroupsAnalyticsDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductGroupsAnalyticsResult = ProductGroupsAnalyticsStatusCode200 of ProductGroupsAnalyticsStatusCode200Response|ProductGroupsAnalyticsStatusCode400 of ProductGroupsAnalyticsStatusCode400Response|ProductGroupsAnalyticsDefaultStatusCode of ProductGroupsAnalyticsDefaultStatusCodeResponse

    type ProductGroupsAnalyticsArgs = {
      pathParams:ProductGroupsAnalyticsPathParams;
      queryParams:Result<ProductGroupsAnalyticsQueryParams,string>;
    }
