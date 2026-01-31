namespace OpenAPI

open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.Error
open OpenAPI.Model.MultipleProductGroupsInner
open System.Collections.Generic
open System

module CatalogProductGroupsApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupPinsListPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupPinsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion


    type CatalogsProductGroupPinsListStatusCode200Response = {
      content:CatalogsProductGroupPinsList200Response;
      
    }

    type CatalogsProductGroupPinsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupPinsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupPinsListResult = CatalogsProductGroupPinsListStatusCode200 of CatalogsProductGroupPinsListStatusCode200Response|CatalogsProductGroupPinsListStatusCode400 of CatalogsProductGroupPinsListStatusCode400Response|CatalogsProductGroupPinsListStatusCode401 of CatalogsProductGroupPinsListStatusCode401Response|CatalogsProductGroupPinsListStatusCode404 of CatalogsProductGroupPinsListStatusCode404Response|CatalogsProductGroupPinsListDefaultStatusCode of CatalogsProductGroupPinsListDefaultStatusCodeResponse

    type CatalogsProductGroupPinsListArgs = {
      pathParams:CatalogsProductGroupPinsListPathParams;
      queryParams:Result<CatalogsProductGroupPinsListQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateBodyParams = MultipleProductGroupsInner
    //#endregion


    type CatalogsProductGroupsCreateStatusCode201Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsCreateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsCreateResult = CatalogsProductGroupsCreateStatusCode201 of CatalogsProductGroupsCreateStatusCode201Response|CatalogsProductGroupsCreateStatusCode400 of CatalogsProductGroupsCreateStatusCode400Response|CatalogsProductGroupsCreateStatusCode401 of CatalogsProductGroupsCreateStatusCode401Response|CatalogsProductGroupsCreateStatusCode403 of CatalogsProductGroupsCreateStatusCode403Response|CatalogsProductGroupsCreateStatusCode409 of CatalogsProductGroupsCreateStatusCode409Response|CatalogsProductGroupsCreateDefaultStatusCode of CatalogsProductGroupsCreateDefaultStatusCodeResponse

    type CatalogsProductGroupsCreateArgs = {
      queryParams:Result<CatalogsProductGroupsCreateQueryParams,string>;
      bodyParams:CatalogsProductGroupsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateManyQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsCreateManyBodyParams = MultipleProductGroupsInner[]
    //#endregion


    type CatalogsProductGroupsCreateManyStatusCode201Response = {
      content:string[];
      
    }

    type CatalogsProductGroupsCreateManyStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsCreateManyDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsCreateManyResult = CatalogsProductGroupsCreateManyStatusCode201 of CatalogsProductGroupsCreateManyStatusCode201Response|CatalogsProductGroupsCreateManyStatusCode400 of CatalogsProductGroupsCreateManyStatusCode400Response|CatalogsProductGroupsCreateManyStatusCode401 of CatalogsProductGroupsCreateManyStatusCode401Response|CatalogsProductGroupsCreateManyStatusCode403 of CatalogsProductGroupsCreateManyStatusCode403Response|CatalogsProductGroupsCreateManyStatusCode409 of CatalogsProductGroupsCreateManyStatusCode409Response|CatalogsProductGroupsCreateManyDefaultStatusCode of CatalogsProductGroupsCreateManyDefaultStatusCodeResponse

    type CatalogsProductGroupsCreateManyArgs = {
      queryParams:Result<CatalogsProductGroupsCreateManyQueryParams,string>;
      bodyParams:CatalogsProductGroupsCreateManyBodyParams
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeletePathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeleteQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsDeleteStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsDeleteResult = CatalogsProductGroupsDeleteStatusCode204 of CatalogsProductGroupsDeleteStatusCode204Response|CatalogsProductGroupsDeleteStatusCode400 of CatalogsProductGroupsDeleteStatusCode400Response|CatalogsProductGroupsDeleteStatusCode401 of CatalogsProductGroupsDeleteStatusCode401Response|CatalogsProductGroupsDeleteStatusCode403 of CatalogsProductGroupsDeleteStatusCode403Response|CatalogsProductGroupsDeleteStatusCode404 of CatalogsProductGroupsDeleteStatusCode404Response|CatalogsProductGroupsDeleteStatusCode409 of CatalogsProductGroupsDeleteStatusCode409Response|CatalogsProductGroupsDeleteDefaultStatusCode of CatalogsProductGroupsDeleteDefaultStatusCodeResponse

    type CatalogsProductGroupsDeleteArgs = {
      pathParams:CatalogsProductGroupsDeletePathParams;
      queryParams:Result<CatalogsProductGroupsDeleteQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsDeleteManyQueryParams = {
      id : int[] ;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsDeleteManyStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsDeleteManyResult = CatalogsProductGroupsDeleteManyStatusCode204 of CatalogsProductGroupsDeleteManyStatusCode204Response|CatalogsProductGroupsDeleteManyStatusCode401 of CatalogsProductGroupsDeleteManyStatusCode401Response|CatalogsProductGroupsDeleteManyStatusCode403 of CatalogsProductGroupsDeleteManyStatusCode403Response|CatalogsProductGroupsDeleteManyStatusCode404 of CatalogsProductGroupsDeleteManyStatusCode404Response|CatalogsProductGroupsDeleteManyStatusCode409 of CatalogsProductGroupsDeleteManyStatusCode409Response|CatalogsProductGroupsDeleteManyDefaultStatusCode of CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse

    type CatalogsProductGroupsDeleteManyArgs = {
      queryParams:Result<CatalogsProductGroupsDeleteManyQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsGetPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsGetStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsGetStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsGetResult = CatalogsProductGroupsGetStatusCode200 of CatalogsProductGroupsGetStatusCode200Response|CatalogsProductGroupsGetStatusCode400 of CatalogsProductGroupsGetStatusCode400Response|CatalogsProductGroupsGetStatusCode401 of CatalogsProductGroupsGetStatusCode401Response|CatalogsProductGroupsGetStatusCode403 of CatalogsProductGroupsGetStatusCode403Response|CatalogsProductGroupsGetStatusCode404 of CatalogsProductGroupsGetStatusCode404Response|CatalogsProductGroupsGetStatusCode409 of CatalogsProductGroupsGetStatusCode409Response|CatalogsProductGroupsGetDefaultStatusCode of CatalogsProductGroupsGetDefaultStatusCodeResponse

    type CatalogsProductGroupsGetArgs = {
      pathParams:CatalogsProductGroupsGetPathParams;
      queryParams:Result<CatalogsProductGroupsGetQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsListQueryParams = {
      id : int[] option;


      feedId : string option;


      catalogId : string option;


      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsListStatusCode200Response = {
      content:CatalogsProductGroupsList200Response;
      
    }

    type CatalogsProductGroupsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsListResult = CatalogsProductGroupsListStatusCode200 of CatalogsProductGroupsListStatusCode200Response|CatalogsProductGroupsListStatusCode400 of CatalogsProductGroupsListStatusCode400Response|CatalogsProductGroupsListStatusCode401 of CatalogsProductGroupsListStatusCode401Response|CatalogsProductGroupsListStatusCode403 of CatalogsProductGroupsListStatusCode403Response|CatalogsProductGroupsListStatusCode404 of CatalogsProductGroupsListStatusCode404Response|CatalogsProductGroupsListStatusCode409 of CatalogsProductGroupsListStatusCode409Response|CatalogsProductGroupsListDefaultStatusCode of CatalogsProductGroupsListDefaultStatusCodeResponse

    type CatalogsProductGroupsListArgs = {
      queryParams:Result<CatalogsProductGroupsListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsProductCountsGetPathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsProductCountsGetQueryParams = {
      adAccountId : string option;

    }
    //#endregion


    type CatalogsProductGroupsProductCountsGetStatusCode200Response = {
      content:CatalogsProductGroupProductCountsVertical;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsProductCountsGetResult = CatalogsProductGroupsProductCountsGetStatusCode200 of CatalogsProductGroupsProductCountsGetStatusCode200Response|CatalogsProductGroupsProductCountsGetStatusCode404 of CatalogsProductGroupsProductCountsGetStatusCode404Response|CatalogsProductGroupsProductCountsGetStatusCode409 of CatalogsProductGroupsProductCountsGetStatusCode409Response|CatalogsProductGroupsProductCountsGetDefaultStatusCode of CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse

    type CatalogsProductGroupsProductCountsGetArgs = {
      pathParams:CatalogsProductGroupsProductCountsGetPathParams;
      queryParams:Result<CatalogsProductGroupsProductCountsGetQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdatePathParams = {
      productGroupId : string ;
    }
    //#endregion

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsProductGroupsUpdateBodyParams = CatalogsProductGroupsUpdateRequest
    //#endregion


    type CatalogsProductGroupsUpdateStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsUpdateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsProductGroupsUpdateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsProductGroupsUpdateResult = CatalogsProductGroupsUpdateStatusCode200 of CatalogsProductGroupsUpdateStatusCode200Response|CatalogsProductGroupsUpdateStatusCode400 of CatalogsProductGroupsUpdateStatusCode400Response|CatalogsProductGroupsUpdateStatusCode401 of CatalogsProductGroupsUpdateStatusCode401Response|CatalogsProductGroupsUpdateStatusCode403 of CatalogsProductGroupsUpdateStatusCode403Response|CatalogsProductGroupsUpdateStatusCode404 of CatalogsProductGroupsUpdateStatusCode404Response|CatalogsProductGroupsUpdateStatusCode409 of CatalogsProductGroupsUpdateStatusCode409Response|CatalogsProductGroupsUpdateDefaultStatusCode of CatalogsProductGroupsUpdateDefaultStatusCodeResponse

    type CatalogsProductGroupsUpdateArgs = {
      pathParams:CatalogsProductGroupsUpdatePathParams;
      queryParams:Result<CatalogsProductGroupsUpdateQueryParams,string>;
      bodyParams:CatalogsProductGroupsUpdateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type ProductsByProductGroupFilterListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;


      pinMetrics : bool option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type ProductsByProductGroupFilterListBodyParams = CatalogsListProductsByFilterRequest
    //#endregion


    type ProductsByProductGroupFilterListStatusCode200Response = {
      content:CatalogsProductGroupPinsList200Response;
      
    }

    type ProductsByProductGroupFilterListStatusCode401Response = {
      content:Error;
      
    }

    type ProductsByProductGroupFilterListStatusCode409Response = {
      content:Error;
      
    }

    type ProductsByProductGroupFilterListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type ProductsByProductGroupFilterListResult = ProductsByProductGroupFilterListStatusCode200 of ProductsByProductGroupFilterListStatusCode200Response|ProductsByProductGroupFilterListStatusCode401 of ProductsByProductGroupFilterListStatusCode401Response|ProductsByProductGroupFilterListStatusCode409 of ProductsByProductGroupFilterListStatusCode409Response|ProductsByProductGroupFilterListDefaultStatusCode of ProductsByProductGroupFilterListDefaultStatusCodeResponse

    type ProductsByProductGroupFilterListArgs = {
      queryParams:Result<ProductsByProductGroupFilterListQueryParams,string>;
      bodyParams:ProductsByProductGroupFilterListBodyParams
    }
