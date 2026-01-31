namespace OpenAPI

open OpenAPI.Model.AdAccount
open OpenAPI.Model.AdAccountAnalyticsResponseInner
open OpenAPI.Model.AdAccountCreate
open OpenAPI.Model.AdAccountsList200Response
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.ConversionProductReportRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.CreateMMMReportRequest
open OpenAPI.Model.CreateMMMReportResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetMMMReportResponse
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ReportingTimeZone
open OpenAPI.Model.TemplateBasedReport
open OpenAPI.Model.TemplatesList200Response
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


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type AdAccountAnalyticsStatusCode200Response = {
      content:AdAccountAnalyticsResponseInner[];
      
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
    //#region Path parameters
    [<CLIMutable>]
    type AdAccountTargetingAnalyticsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountTargetingAnalyticsGetQueryParams = {
      startDate : DateTime ;


      endDate : DateTime ;


      targetingTypes : AdsAnalyticsTargetingType[] ;


      columns : string[] ;


      granularity : Granularity ;


      clickWindowDays : int option;


      engagementWindowDays : int option;


      viewWindowDays : int option;


      conversionReportTime : string option;


      attributionTypes : ConversionReportAttributionType[] option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type AdAccountTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdAccountTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AdAccountTargetingAnalyticsGetResult = AdAccountTargetingAnalyticsGetStatusCode200 of AdAccountTargetingAnalyticsGetStatusCode200Response|AdAccountTargetingAnalyticsGetDefaultStatusCode of AdAccountTargetingAnalyticsGetDefaultStatusCodeResponse

    type AdAccountTargetingAnalyticsGetArgs = {
      pathParams:AdAccountTargetingAnalyticsGetPathParams;
      queryParams:Result<AdAccountTargetingAnalyticsGetQueryParams,string>;
    }

    //#region Body parameters
    [<CLIMutable>]
    type AdAccountsCreateBodyParams = AdAccountCreate
    //#endregion


    type AdAccountsCreateStatusCode200Response = {
      content:AdAccount;
      
    }

    type AdAccountsCreateStatusCode201Response = {
      content:AdAccount;
      
    }

    type AdAccountsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsCreateResult = AdAccountsCreateStatusCode200 of AdAccountsCreateStatusCode200Response|AdAccountsCreateStatusCode201 of AdAccountsCreateStatusCode201Response|AdAccountsCreateStatusCode400 of AdAccountsCreateStatusCode400Response|AdAccountsCreateStatusCode401 of AdAccountsCreateStatusCode401Response|AdAccountsCreateStatusCode403 of AdAccountsCreateStatusCode403Response|AdAccountsCreateStatusCode404 of AdAccountsCreateStatusCode404Response|AdAccountsCreateStatusCode429 of AdAccountsCreateStatusCode429Response|AdAccountsCreateDefaultStatusCode of AdAccountsCreateDefaultStatusCodeResponse

    type AdAccountsCreateArgs = {
      bodyParams:AdAccountsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AdAccountsGetPathParams = {
      adAccountId : string ;
    }
    //#endregion


    type AdAccountsGetStatusCode200Response = {
      content:AdAccount;
      
    }

    type AdAccountsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsGetResult = AdAccountsGetStatusCode200 of AdAccountsGetStatusCode200Response|AdAccountsGetStatusCode400 of AdAccountsGetStatusCode400Response|AdAccountsGetStatusCode401 of AdAccountsGetStatusCode401Response|AdAccountsGetStatusCode403 of AdAccountsGetStatusCode403Response|AdAccountsGetStatusCode404 of AdAccountsGetStatusCode404Response|AdAccountsGetStatusCode429 of AdAccountsGetStatusCode429Response|AdAccountsGetDefaultStatusCode of AdAccountsGetDefaultStatusCodeResponse

    type AdAccountsGetArgs = {
      pathParams:AdAccountsGetPathParams;
    }

    //#region Query parameters
    [<CLIMutable>]
    type AdAccountsListQueryParams = {
      includeSharedAccounts : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type AdAccountsListStatusCode200Response = {
      content:AdAccountsList200Response;
      
    }

    type AdAccountsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountsListResult = AdAccountsListStatusCode200 of AdAccountsListStatusCode200Response|AdAccountsListStatusCode400 of AdAccountsListStatusCode400Response|AdAccountsListStatusCode401 of AdAccountsListStatusCode401Response|AdAccountsListStatusCode403 of AdAccountsListStatusCode403Response|AdAccountsListStatusCode404 of AdAccountsListStatusCode404Response|AdAccountsListStatusCode429 of AdAccountsListStatusCode429Response|AdAccountsListDefaultStatusCode of AdAccountsListDefaultStatusCodeResponse

    type AdAccountsListArgs = {
      queryParams:Result<AdAccountsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AnalyticsCreateConversionProductReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AnalyticsCreateConversionProductReportBodyParams = ConversionProductReportRequest
    //#endregion


    type AnalyticsCreateConversionProductReportStatusCode200Response = {
      content:AdsAnalyticsCreateAsyncResponse;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsCreateConversionProductReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsCreateConversionProductReportResult = AnalyticsCreateConversionProductReportStatusCode200 of AnalyticsCreateConversionProductReportStatusCode200Response|AnalyticsCreateConversionProductReportStatusCode400 of AnalyticsCreateConversionProductReportStatusCode400Response|AnalyticsCreateConversionProductReportDefaultStatusCode of AnalyticsCreateConversionProductReportDefaultStatusCodeResponse

    type AnalyticsCreateConversionProductReportArgs = {
      pathParams:AnalyticsCreateConversionProductReportPathParams;
      bodyParams:AnalyticsCreateConversionProductReportBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type AnalyticsCreateMmmReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type AnalyticsCreateMmmReportBodyParams = CreateMMMReportRequest
    //#endregion


    type AnalyticsCreateMmmReportStatusCode200Response = {
      content:CreateMMMReportResponse;
      
    }

    type AnalyticsCreateMmmReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsCreateMmmReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsCreateMmmReportResult = AnalyticsCreateMmmReportStatusCode200 of AnalyticsCreateMmmReportStatusCode200Response|AnalyticsCreateMmmReportStatusCode400 of AnalyticsCreateMmmReportStatusCode400Response|AnalyticsCreateMmmReportDefaultStatusCode of AnalyticsCreateMmmReportDefaultStatusCodeResponse

    type AnalyticsCreateMmmReportArgs = {
      pathParams:AnalyticsCreateMmmReportPathParams;
      bodyParams:AnalyticsCreateMmmReportBodyParams
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
    type AnalyticsCreateTemplateReportPathParams = {
      adAccountId : string ;
    //#endregion
      templateId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AnalyticsCreateTemplateReportQueryParams = {
      startDate : DateTime option;


      endDate : DateTime option;


      granularity : Granularity option;

    }
    //#endregion


    type AnalyticsCreateTemplateReportStatusCode200Response = {
      content:TemplateBasedReport;
      
    }

    type AnalyticsCreateTemplateReportStatusCode201Response = {
      content:TemplateBasedReport;
      
    }

    type AnalyticsCreateTemplateReportStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateTemplateReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateTemplateReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateTemplateReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateTemplateReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateTemplateReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsCreateTemplateReportResult = AnalyticsCreateTemplateReportStatusCode200 of AnalyticsCreateTemplateReportStatusCode200Response|AnalyticsCreateTemplateReportStatusCode201 of AnalyticsCreateTemplateReportStatusCode201Response|AnalyticsCreateTemplateReportStatusCode400 of AnalyticsCreateTemplateReportStatusCode400Response|AnalyticsCreateTemplateReportStatusCode401 of AnalyticsCreateTemplateReportStatusCode401Response|AnalyticsCreateTemplateReportStatusCode403 of AnalyticsCreateTemplateReportStatusCode403Response|AnalyticsCreateTemplateReportStatusCode404 of AnalyticsCreateTemplateReportStatusCode404Response|AnalyticsCreateTemplateReportStatusCode429 of AnalyticsCreateTemplateReportStatusCode429Response|AnalyticsCreateTemplateReportDefaultStatusCode of AnalyticsCreateTemplateReportDefaultStatusCodeResponse

    type AnalyticsCreateTemplateReportArgs = {
      pathParams:AnalyticsCreateTemplateReportPathParams;
      queryParams:Result<AnalyticsCreateTemplateReportQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AnalyticsGetConversionProductReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AnalyticsGetConversionProductReportQueryParams = {
      token : string ;

    }
    //#endregion


    type AnalyticsGetConversionProductReportStatusCode200Response = {
      content:AdsAnalyticsGetAsyncResponse;
      
    }

    type AnalyticsGetConversionProductReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsGetConversionProductReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsGetConversionProductReportResult = AnalyticsGetConversionProductReportStatusCode200 of AnalyticsGetConversionProductReportStatusCode200Response|AnalyticsGetConversionProductReportStatusCode400 of AnalyticsGetConversionProductReportStatusCode400Response|AnalyticsGetConversionProductReportDefaultStatusCode of AnalyticsGetConversionProductReportDefaultStatusCodeResponse

    type AnalyticsGetConversionProductReportArgs = {
      pathParams:AnalyticsGetConversionProductReportPathParams;
      queryParams:Result<AnalyticsGetConversionProductReportQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type AnalyticsGetMmmReportPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type AnalyticsGetMmmReportQueryParams = {
      token : string ;

    }
    //#endregion


    type AnalyticsGetMmmReportStatusCode200Response = {
      content:GetMMMReportResponse;
      
    }

    type AnalyticsGetMmmReportStatusCode400Response = {
      content:Error;
      
    }

    type AnalyticsGetMmmReportDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type AnalyticsGetMmmReportResult = AnalyticsGetMmmReportStatusCode200 of AnalyticsGetMmmReportStatusCode200Response|AnalyticsGetMmmReportStatusCode400 of AnalyticsGetMmmReportStatusCode400Response|AnalyticsGetMmmReportDefaultStatusCode of AnalyticsGetMmmReportDefaultStatusCodeResponse

    type AnalyticsGetMmmReportArgs = {
      pathParams:AnalyticsGetMmmReportPathParams;
      queryParams:Result<AnalyticsGetMmmReportQueryParams,string>;
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
    type SandboxDeletePathParams = {
      adAccountId : string ;
    }
    //#endregion


    type SandboxDeleteStatusCode200Response = {
      content:string;
      
    }

    type SandboxDeleteStatusCode400Response = {
      content:Error;
      
    }

    type SandboxDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type SandboxDeleteResult = SandboxDeleteStatusCode200 of SandboxDeleteStatusCode200Response|SandboxDeleteStatusCode400 of SandboxDeleteStatusCode400Response|SandboxDeleteDefaultStatusCode of SandboxDeleteDefaultStatusCodeResponse

    type SandboxDeleteArgs = {
      pathParams:SandboxDeletePathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type TemplatesListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type TemplatesListQueryParams = {
      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type TemplatesListStatusCode200Response = {
      content:TemplatesList200Response;
      
    }

    type TemplatesListStatusCode400Response = {
      content:Error;
      
    }

    type TemplatesListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type TemplatesListResult = TemplatesListStatusCode200 of TemplatesListStatusCode200Response|TemplatesListStatusCode400 of TemplatesListStatusCode400Response|TemplatesListDefaultStatusCode of TemplatesListDefaultStatusCodeResponse

    type TemplatesListArgs = {
      pathParams:TemplatesListPathParams;
      queryParams:Result<TemplatesListQueryParams,string>;
    }
