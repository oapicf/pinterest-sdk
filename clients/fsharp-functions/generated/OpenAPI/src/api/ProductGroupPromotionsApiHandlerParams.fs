namespace OpenAPI

open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ProductGroupAnalyticsItems
open OpenAPI.Model.ProductGroupPromotion
open OpenAPI.Model.ProductGroupPromotions
open OpenAPI.Model.ProductGroupPromotionsCreate
open OpenAPI.Model.ProductGroupPromotionsList200Response
open OpenAPI.Model.ProductGroupPromotionsUpdateWithRequiredBody
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone
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
    type ProductGroupPromotionsCreateBodyParams = ProductGroupPromotionsCreate
    //#endregion


    type ProductGroupPromotionsCreateStatusCode200Response = {
      content:ProductGroupPromotions;
      
    }

    type ProductGroupPromotionsCreateStatusCode201Response = {
      content:ProductGroupPromotions;
      
    }

    type ProductGroupPromotionsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductGroupPromotionsCreateResult = ProductGroupPromotionsCreateStatusCode200 of ProductGroupPromotionsCreateStatusCode200Response|ProductGroupPromotionsCreateStatusCode201 of ProductGroupPromotionsCreateStatusCode201Response|ProductGroupPromotionsCreateStatusCode400 of ProductGroupPromotionsCreateStatusCode400Response|ProductGroupPromotionsCreateStatusCode401 of ProductGroupPromotionsCreateStatusCode401Response|ProductGroupPromotionsCreateStatusCode403 of ProductGroupPromotionsCreateStatusCode403Response|ProductGroupPromotionsCreateStatusCode404 of ProductGroupPromotionsCreateStatusCode404Response|ProductGroupPromotionsCreateStatusCode429 of ProductGroupPromotionsCreateStatusCode429Response|ProductGroupPromotionsCreateDefaultStatusCode of ProductGroupPromotionsCreateDefaultStatusCodeResponse

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
      content:ProductGroupPromotion;
      
    }

    type ProductGroupPromotionsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductGroupPromotionsGetResult = ProductGroupPromotionsGetStatusCode200 of ProductGroupPromotionsGetStatusCode200Response|ProductGroupPromotionsGetStatusCode400 of ProductGroupPromotionsGetStatusCode400Response|ProductGroupPromotionsGetStatusCode401 of ProductGroupPromotionsGetStatusCode401Response|ProductGroupPromotionsGetStatusCode403 of ProductGroupPromotionsGetStatusCode403Response|ProductGroupPromotionsGetStatusCode404 of ProductGroupPromotionsGetStatusCode404Response|ProductGroupPromotionsGetStatusCode429 of ProductGroupPromotionsGetStatusCode429Response|ProductGroupPromotionsGetDefaultStatusCode of ProductGroupPromotionsGetDefaultStatusCodeResponse

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
      bookmark : string option;


      pageSize : int option;


      order : PinterestLibPaginationOrder option;


      productGroupPromotionIds : string[] option;


      entityStatuses : EntityStatus[] option;


      adGroupId : string option;

    }
    //#endregion


    type ProductGroupPromotionsListStatusCode200Response = {
      content:ProductGroupPromotionsList200Response;
      
    }

    type ProductGroupPromotionsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductGroupPromotionsListResult = ProductGroupPromotionsListStatusCode200 of ProductGroupPromotionsListStatusCode200Response|ProductGroupPromotionsListStatusCode400 of ProductGroupPromotionsListStatusCode400Response|ProductGroupPromotionsListStatusCode401 of ProductGroupPromotionsListStatusCode401Response|ProductGroupPromotionsListStatusCode403 of ProductGroupPromotionsListStatusCode403Response|ProductGroupPromotionsListStatusCode404 of ProductGroupPromotionsListStatusCode404Response|ProductGroupPromotionsListStatusCode429 of ProductGroupPromotionsListStatusCode429Response|ProductGroupPromotionsListDefaultStatusCode of ProductGroupPromotionsListDefaultStatusCodeResponse

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
    type ProductGroupPromotionsUpdateBodyParams = ProductGroupPromotionsUpdateWithRequiredBody
    //#endregion


    type ProductGroupPromotionsUpdateStatusCode200Response = {
      content:ProductGroupPromotions;
      
    }

    type ProductGroupPromotionsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupPromotionsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductGroupPromotionsUpdateResult = ProductGroupPromotionsUpdateStatusCode200 of ProductGroupPromotionsUpdateStatusCode200Response|ProductGroupPromotionsUpdateStatusCode400 of ProductGroupPromotionsUpdateStatusCode400Response|ProductGroupPromotionsUpdateStatusCode401 of ProductGroupPromotionsUpdateStatusCode401Response|ProductGroupPromotionsUpdateStatusCode403 of ProductGroupPromotionsUpdateStatusCode403Response|ProductGroupPromotionsUpdateStatusCode404 of ProductGroupPromotionsUpdateStatusCode404Response|ProductGroupPromotionsUpdateStatusCode429 of ProductGroupPromotionsUpdateStatusCode429Response|ProductGroupPromotionsUpdateDefaultStatusCode of ProductGroupPromotionsUpdateDefaultStatusCodeResponse

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


      columns : ReportingColumnSync[] ;


      granularity : Granularity ;


      clickWindowDays : decimal option;


      engagementWindowDays : decimal option;


      viewWindowDays : decimal option;


      conversionReportTime : string option;


      reportingTimezone : ReportingTimeZone option;

    }
    //#endregion


    type ProductGroupsAnalyticsStatusCode200Response = {
      content:ProductGroupAnalyticsItems[];
      
    }

    type ProductGroupsAnalyticsStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupsAnalyticsStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupsAnalyticsStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupsAnalyticsStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupsAnalyticsStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductGroupsAnalyticsDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductGroupsAnalyticsResult = ProductGroupsAnalyticsStatusCode200 of ProductGroupsAnalyticsStatusCode200Response|ProductGroupsAnalyticsStatusCode400 of ProductGroupsAnalyticsStatusCode400Response|ProductGroupsAnalyticsStatusCode401 of ProductGroupsAnalyticsStatusCode401Response|ProductGroupsAnalyticsStatusCode403 of ProductGroupsAnalyticsStatusCode403Response|ProductGroupsAnalyticsStatusCode404 of ProductGroupsAnalyticsStatusCode404Response|ProductGroupsAnalyticsStatusCode429 of ProductGroupsAnalyticsStatusCode429Response|ProductGroupsAnalyticsDefaultStatusCode of ProductGroupsAnalyticsDefaultStatusCodeResponse

    type ProductGroupsAnalyticsArgs = {
      pathParams:ProductGroupsAnalyticsPathParams;
      queryParams:Result<ProductGroupsAnalyticsQueryParams,string>;
    }
