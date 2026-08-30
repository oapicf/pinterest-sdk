namespace OpenAPI

open OpenAPI.Model.AdAccount
open OpenAPI.Model.AdAccountAnalyticsItems
open OpenAPI.Model.AdAccountCreate
open OpenAPI.Model.AdAccountsList200Response
open OpenAPI.Model.AdsAnalyticsAccountTargetingType
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.ConversionProductReport
open OpenAPI.Model.ConversionProductReportCreate
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Granularity
open OpenAPI.Model.MMMReport
open OpenAPI.Model.MMMReportCreate
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ReportingColumnSync
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


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type AdAccountAnalyticsStatusCode200Response = {
      content:AdAccountAnalyticsItems[];
      
    }

    type AdAccountAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountAnalyticsResult = AdAccountAnalyticsStatusCode200 of AdAccountAnalyticsStatusCode200Response|AdAccountAnalyticsStatusCode400 of AdAccountAnalyticsStatusCode400Response|AdAccountAnalyticsStatusCode401 of AdAccountAnalyticsStatusCode401Response|AdAccountAnalyticsStatusCode403 of AdAccountAnalyticsStatusCode403Response|AdAccountAnalyticsStatusCode404 of AdAccountAnalyticsStatusCode404Response|AdAccountAnalyticsStatusCode429 of AdAccountAnalyticsStatusCode429Response|AdAccountAnalyticsDefaultStatusCode of AdAccountAnalyticsDefaultStatusCodeResponse

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


      targetingTypes : AdsAnalyticsAccountTargetingType[] ;


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


    type AdAccountTargetingAnalyticsGetStatusCode200Response = {
      content:MetricsResponse;
      
    }

    type AdAccountTargetingAnalyticsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AdAccountTargetingAnalyticsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AdAccountTargetingAnalyticsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AdAccountTargetingAnalyticsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AdAccountTargetingAnalyticsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AdAccountTargetingAnalyticsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AdAccountTargetingAnalyticsGetResult = AdAccountTargetingAnalyticsGetStatusCode200 of AdAccountTargetingAnalyticsGetStatusCode200Response|AdAccountTargetingAnalyticsGetStatusCode400 of AdAccountTargetingAnalyticsGetStatusCode400Response|AdAccountTargetingAnalyticsGetStatusCode401 of AdAccountTargetingAnalyticsGetStatusCode401Response|AdAccountTargetingAnalyticsGetStatusCode403 of AdAccountTargetingAnalyticsGetStatusCode403Response|AdAccountTargetingAnalyticsGetStatusCode404 of AdAccountTargetingAnalyticsGetStatusCode404Response|AdAccountTargetingAnalyticsGetStatusCode429 of AdAccountTargetingAnalyticsGetStatusCode429Response|AdAccountTargetingAnalyticsGetDefaultStatusCode of AdAccountTargetingAnalyticsGetDefaultStatusCodeResponse

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
    type AnalyticsCreateConversionProductReportBodyParams = ConversionProductReportCreate
    //#endregion


    type AnalyticsCreateConversionProductReportStatusCode200Response = {
      content:ConversionProductReport;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode201Response = {
      content:ConversionProductReport;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateConversionProductReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateConversionProductReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsCreateConversionProductReportResult = AnalyticsCreateConversionProductReportStatusCode200 of AnalyticsCreateConversionProductReportStatusCode200Response|AnalyticsCreateConversionProductReportStatusCode201 of AnalyticsCreateConversionProductReportStatusCode201Response|AnalyticsCreateConversionProductReportStatusCode400 of AnalyticsCreateConversionProductReportStatusCode400Response|AnalyticsCreateConversionProductReportStatusCode401 of AnalyticsCreateConversionProductReportStatusCode401Response|AnalyticsCreateConversionProductReportStatusCode403 of AnalyticsCreateConversionProductReportStatusCode403Response|AnalyticsCreateConversionProductReportStatusCode404 of AnalyticsCreateConversionProductReportStatusCode404Response|AnalyticsCreateConversionProductReportStatusCode429 of AnalyticsCreateConversionProductReportStatusCode429Response|AnalyticsCreateConversionProductReportDefaultStatusCode of AnalyticsCreateConversionProductReportDefaultStatusCodeResponse

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
    type AnalyticsCreateMmmReportBodyParams = MMMReportCreate
    //#endregion


    type AnalyticsCreateMmmReportStatusCode200Response = {
      content:MMMReport;
      
    }

    type AnalyticsCreateMmmReportStatusCode201Response = {
      content:MMMReport;
      
    }

    type AnalyticsCreateMmmReportStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateMmmReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateMmmReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateMmmReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateMmmReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateMmmReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsCreateMmmReportResult = AnalyticsCreateMmmReportStatusCode200 of AnalyticsCreateMmmReportStatusCode200Response|AnalyticsCreateMmmReportStatusCode201 of AnalyticsCreateMmmReportStatusCode201Response|AnalyticsCreateMmmReportStatusCode400 of AnalyticsCreateMmmReportStatusCode400Response|AnalyticsCreateMmmReportStatusCode401 of AnalyticsCreateMmmReportStatusCode401Response|AnalyticsCreateMmmReportStatusCode403 of AnalyticsCreateMmmReportStatusCode403Response|AnalyticsCreateMmmReportStatusCode404 of AnalyticsCreateMmmReportStatusCode404Response|AnalyticsCreateMmmReportStatusCode429 of AnalyticsCreateMmmReportStatusCode429Response|AnalyticsCreateMmmReportDefaultStatusCode of AnalyticsCreateMmmReportDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type AnalyticsCreateReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsCreateReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsCreateReportResult = AnalyticsCreateReportStatusCode200 of AnalyticsCreateReportStatusCode200Response|AnalyticsCreateReportStatusCode400 of AnalyticsCreateReportStatusCode400Response|AnalyticsCreateReportStatusCode401 of AnalyticsCreateReportStatusCode401Response|AnalyticsCreateReportStatusCode403 of AnalyticsCreateReportStatusCode403Response|AnalyticsCreateReportStatusCode404 of AnalyticsCreateReportStatusCode404Response|AnalyticsCreateReportStatusCode429 of AnalyticsCreateReportStatusCode429Response|AnalyticsCreateReportDefaultStatusCode of AnalyticsCreateReportDefaultStatusCodeResponse

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
      content:ConversionProductReport;
      
    }

    type AnalyticsGetConversionProductReportStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetConversionProductReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetConversionProductReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetConversionProductReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetConversionProductReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetConversionProductReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsGetConversionProductReportResult = AnalyticsGetConversionProductReportStatusCode200 of AnalyticsGetConversionProductReportStatusCode200Response|AnalyticsGetConversionProductReportStatusCode400 of AnalyticsGetConversionProductReportStatusCode400Response|AnalyticsGetConversionProductReportStatusCode401 of AnalyticsGetConversionProductReportStatusCode401Response|AnalyticsGetConversionProductReportStatusCode403 of AnalyticsGetConversionProductReportStatusCode403Response|AnalyticsGetConversionProductReportStatusCode404 of AnalyticsGetConversionProductReportStatusCode404Response|AnalyticsGetConversionProductReportStatusCode429 of AnalyticsGetConversionProductReportStatusCode429Response|AnalyticsGetConversionProductReportDefaultStatusCode of AnalyticsGetConversionProductReportDefaultStatusCodeResponse

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
      content:MMMReport;
      
    }

    type AnalyticsGetMmmReportStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetMmmReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetMmmReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetMmmReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetMmmReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetMmmReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsGetMmmReportResult = AnalyticsGetMmmReportStatusCode200 of AnalyticsGetMmmReportStatusCode200Response|AnalyticsGetMmmReportStatusCode400 of AnalyticsGetMmmReportStatusCode400Response|AnalyticsGetMmmReportStatusCode401 of AnalyticsGetMmmReportStatusCode401Response|AnalyticsGetMmmReportStatusCode403 of AnalyticsGetMmmReportStatusCode403Response|AnalyticsGetMmmReportStatusCode404 of AnalyticsGetMmmReportStatusCode404Response|AnalyticsGetMmmReportStatusCode429 of AnalyticsGetMmmReportStatusCode429Response|AnalyticsGetMmmReportDefaultStatusCode of AnalyticsGetMmmReportDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type AnalyticsGetReportStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetReportStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetReportStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetReportStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type AnalyticsGetReportDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type AnalyticsGetReportResult = AnalyticsGetReportStatusCode200 of AnalyticsGetReportStatusCode200Response|AnalyticsGetReportStatusCode400 of AnalyticsGetReportStatusCode400Response|AnalyticsGetReportStatusCode401 of AnalyticsGetReportStatusCode401Response|AnalyticsGetReportStatusCode403 of AnalyticsGetReportStatusCode403Response|AnalyticsGetReportStatusCode404 of AnalyticsGetReportStatusCode404Response|AnalyticsGetReportStatusCode429 of AnalyticsGetReportStatusCode429Response|AnalyticsGetReportDefaultStatusCode of AnalyticsGetReportDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type SandboxDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type SandboxDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type SandboxDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type SandboxDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type SandboxDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type SandboxDeleteResult = SandboxDeleteStatusCode200 of SandboxDeleteStatusCode200Response|SandboxDeleteStatusCode400 of SandboxDeleteStatusCode400Response|SandboxDeleteStatusCode401 of SandboxDeleteStatusCode401Response|SandboxDeleteStatusCode403 of SandboxDeleteStatusCode403Response|SandboxDeleteStatusCode404 of SandboxDeleteStatusCode404Response|SandboxDeleteStatusCode429 of SandboxDeleteStatusCode429Response|SandboxDeleteDefaultStatusCode of SandboxDeleteDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;

    }
    //#endregion


    type TemplatesListStatusCode200Response = {
      content:TemplatesList200Response;
      
    }

    type TemplatesListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type TemplatesListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type TemplatesListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type TemplatesListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type TemplatesListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type TemplatesListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type TemplatesListResult = TemplatesListStatusCode200 of TemplatesListStatusCode200Response|TemplatesListStatusCode400 of TemplatesListStatusCode400Response|TemplatesListStatusCode401 of TemplatesListStatusCode401Response|TemplatesListStatusCode403 of TemplatesListStatusCode403Response|TemplatesListStatusCode404 of TemplatesListStatusCode404Response|TemplatesListStatusCode429 of TemplatesListStatusCode429Response|TemplatesListDefaultStatusCode of TemplatesListDefaultStatusCodeResponse

    type TemplatesListArgs = {
      pathParams:TemplatesListPathParams;
      queryParams:Result<TemplatesListQueryParams,string>;
    }
