namespace OpenAPI

open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.ProductGroupAnalyticsResponseInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest
open OpenAPI.Model.ProductGroupPromotionResponse
open OpenAPI.Model.ProductGroupPromotionUpdateRequest
open OpenAPI.Model.ProductGroupPromotionsList200Response
open System.Collections.Generic
open System

module ProductGroupPromotionsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type ProductGroupPromotionsCreatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductGroupPromotionsCreateBodyParams = ProductGroupPromotionCreateRequest
    //#endregion


    type ProductGroupPromotionsCreateStatusCode200Response = {
      content:ProductGroupPromotionResponse;
      
    }

    type ProductGroupPromotionsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductGroupPromotionsCreateResult = ProductGroupPromotionsCreateStatusCode200 of ProductGroupPromotionsCreateStatusCode200Response|ProductGroupPromotionsCreateDefaultStatusCode of ProductGroupPromotionsCreateDefaultStatusCodeResponse

    type ProductGroupPromotionsCreateArgs = {
      pathParams:ProductGroupPromotionsCreatePathParams;
      bodyParams:ProductGroupPromotionsCreateBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProductGroupPromotionsGetPathParams = {
      adAccountId : string ;
    //#endregion
      productGroupPromotionId : string ;
    }
    //#endregion


    type ProductGroupPromotionsGetStatusCode200Response = {
      content:ProductGroupPromotionResponse;
      
    }

    type ProductGroupPromotionsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductGroupPromotionsGetResult = ProductGroupPromotionsGetStatusCode200 of ProductGroupPromotionsGetStatusCode200Response|ProductGroupPromotionsGetDefaultStatusCode of ProductGroupPromotionsGetDefaultStatusCodeResponse

    type ProductGroupPromotionsGetArgs = {
      pathParams:ProductGroupPromotionsGetPathParams;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProductGroupPromotionsListPathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type ProductGroupPromotionsListQueryParams = {
      productGroupPromotionIds : string[] option;


      entityStatuses : string[] option;


      adGroupId : string option;


      pageSize : int option;


      order : string option;


      bookmark : string option;

    }
    //#endregion


    type ProductGroupPromotionsListStatusCode200Response = {
      content:ProductGroupPromotionsList200Response;
      
    }

    type ProductGroupPromotionsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductGroupPromotionsListResult = ProductGroupPromotionsListStatusCode200 of ProductGroupPromotionsListStatusCode200Response|ProductGroupPromotionsListDefaultStatusCode of ProductGroupPromotionsListDefaultStatusCodeResponse

    type ProductGroupPromotionsListArgs = {
      pathParams:ProductGroupPromotionsListPathParams;
      queryParams:Result<ProductGroupPromotionsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type ProductGroupPromotionsUpdatePathParams = {
      adAccountId : string ;
    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductGroupPromotionsUpdateBodyParams = ProductGroupPromotionUpdateRequest
    //#endregion


    type ProductGroupPromotionsUpdateStatusCode200Response = {
      content:ProductGroupPromotionResponse;
      
    }

    type ProductGroupPromotionsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductGroupPromotionsUpdateResult = ProductGroupPromotionsUpdateStatusCode200 of ProductGroupPromotionsUpdateStatusCode200Response|ProductGroupPromotionsUpdateDefaultStatusCode of ProductGroupPromotionsUpdateDefaultStatusCodeResponse

    type ProductGroupPromotionsUpdateArgs = {
      pathParams:ProductGroupPromotionsUpdatePathParams;
      bodyParams:ProductGroupPromotionsUpdateBodyParams
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
      content:ProductGroupAnalyticsResponseInner[];
      
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
