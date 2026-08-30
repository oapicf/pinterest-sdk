namespace OpenAPI

open OpenAPI.Model.CatalogsListProductsByFilterRequest
open OpenAPI.Model.CatalogsProductGroupPinsList200Response
open OpenAPI.Model.CatalogsProductGroupProductCountsVertical
open OpenAPI.Model.CatalogsProductGroupsCreateManyRequestItems
open OpenAPI.Model.CatalogsProductGroupsCreateRequestSchema
open OpenAPI.Model.CatalogsProductGroupsList200Response
open OpenAPI.Model.CatalogsProductGroupsUpdateRequestSchema
open OpenAPI.Model.CatalogsVerticalProductGroup
open OpenAPI.Model.PinterestLibError
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
      adAccountId : string option;


      pinMetrics : bool option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type CatalogsProductGroupPinsListStatusCode200Response = {
      content:CatalogsProductGroupPinsList200Response;
      
    }

    type CatalogsProductGroupPinsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupPinsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupPinsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupPinsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupPinsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupPinsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupPinsListResult = CatalogsProductGroupPinsListStatusCode200 of CatalogsProductGroupPinsListStatusCode200Response|CatalogsProductGroupPinsListStatusCode400 of CatalogsProductGroupPinsListStatusCode400Response|CatalogsProductGroupPinsListStatusCode401 of CatalogsProductGroupPinsListStatusCode401Response|CatalogsProductGroupPinsListStatusCode403 of CatalogsProductGroupPinsListStatusCode403Response|CatalogsProductGroupPinsListStatusCode404 of CatalogsProductGroupPinsListStatusCode404Response|CatalogsProductGroupPinsListStatusCode429 of CatalogsProductGroupPinsListStatusCode429Response|CatalogsProductGroupPinsListDefaultStatusCode of CatalogsProductGroupPinsListDefaultStatusCodeResponse

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
    type CatalogsProductGroupsCreateBodyParams = CatalogsProductGroupsCreateRequestSchema
    //#endregion


    type CatalogsProductGroupsCreateStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsCreateStatusCode201Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsCreateResult = CatalogsProductGroupsCreateStatusCode200 of CatalogsProductGroupsCreateStatusCode200Response|CatalogsProductGroupsCreateStatusCode201 of CatalogsProductGroupsCreateStatusCode201Response|CatalogsProductGroupsCreateStatusCode400 of CatalogsProductGroupsCreateStatusCode400Response|CatalogsProductGroupsCreateStatusCode401 of CatalogsProductGroupsCreateStatusCode401Response|CatalogsProductGroupsCreateStatusCode403 of CatalogsProductGroupsCreateStatusCode403Response|CatalogsProductGroupsCreateStatusCode404 of CatalogsProductGroupsCreateStatusCode404Response|CatalogsProductGroupsCreateStatusCode429 of CatalogsProductGroupsCreateStatusCode429Response|CatalogsProductGroupsCreateDefaultStatusCode of CatalogsProductGroupsCreateDefaultStatusCodeResponse

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
    type CatalogsProductGroupsCreateManyBodyParams = CatalogsProductGroupsCreateManyRequestItems[]
    //#endregion


    type CatalogsProductGroupsCreateManyStatusCode201Response = {
      content:string[];
      
    }

    type CatalogsProductGroupsCreateManyStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateManyStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsCreateManyDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsCreateManyResult = CatalogsProductGroupsCreateManyStatusCode201 of CatalogsProductGroupsCreateManyStatusCode201Response|CatalogsProductGroupsCreateManyStatusCode400 of CatalogsProductGroupsCreateManyStatusCode400Response|CatalogsProductGroupsCreateManyStatusCode401 of CatalogsProductGroupsCreateManyStatusCode401Response|CatalogsProductGroupsCreateManyStatusCode403 of CatalogsProductGroupsCreateManyStatusCode403Response|CatalogsProductGroupsCreateManyStatusCode404 of CatalogsProductGroupsCreateManyStatusCode404Response|CatalogsProductGroupsCreateManyStatusCode429 of CatalogsProductGroupsCreateManyStatusCode429Response|CatalogsProductGroupsCreateManyDefaultStatusCode of CatalogsProductGroupsCreateManyDefaultStatusCodeResponse

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


    type CatalogsProductGroupsDeleteStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsDeleteStatusCode204Response = {
      content:string;
      
    }

    type CatalogsProductGroupsDeleteStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsDeleteResult = CatalogsProductGroupsDeleteStatusCode200 of CatalogsProductGroupsDeleteStatusCode200Response|CatalogsProductGroupsDeleteStatusCode204 of CatalogsProductGroupsDeleteStatusCode204Response|CatalogsProductGroupsDeleteStatusCode400 of CatalogsProductGroupsDeleteStatusCode400Response|CatalogsProductGroupsDeleteStatusCode401 of CatalogsProductGroupsDeleteStatusCode401Response|CatalogsProductGroupsDeleteStatusCode403 of CatalogsProductGroupsDeleteStatusCode403Response|CatalogsProductGroupsDeleteStatusCode404 of CatalogsProductGroupsDeleteStatusCode404Response|CatalogsProductGroupsDeleteStatusCode429 of CatalogsProductGroupsDeleteStatusCode429Response|CatalogsProductGroupsDeleteDefaultStatusCode of CatalogsProductGroupsDeleteDefaultStatusCodeResponse

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

    type CatalogsProductGroupsDeleteManyStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteManyStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsDeleteManyResult = CatalogsProductGroupsDeleteManyStatusCode204 of CatalogsProductGroupsDeleteManyStatusCode204Response|CatalogsProductGroupsDeleteManyStatusCode400 of CatalogsProductGroupsDeleteManyStatusCode400Response|CatalogsProductGroupsDeleteManyStatusCode401 of CatalogsProductGroupsDeleteManyStatusCode401Response|CatalogsProductGroupsDeleteManyStatusCode403 of CatalogsProductGroupsDeleteManyStatusCode403Response|CatalogsProductGroupsDeleteManyStatusCode404 of CatalogsProductGroupsDeleteManyStatusCode404Response|CatalogsProductGroupsDeleteManyStatusCode429 of CatalogsProductGroupsDeleteManyStatusCode429Response|CatalogsProductGroupsDeleteManyDefaultStatusCode of CatalogsProductGroupsDeleteManyDefaultStatusCodeResponse

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
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsGetResult = CatalogsProductGroupsGetStatusCode200 of CatalogsProductGroupsGetStatusCode200Response|CatalogsProductGroupsGetStatusCode400 of CatalogsProductGroupsGetStatusCode400Response|CatalogsProductGroupsGetStatusCode401 of CatalogsProductGroupsGetStatusCode401Response|CatalogsProductGroupsGetStatusCode403 of CatalogsProductGroupsGetStatusCode403Response|CatalogsProductGroupsGetStatusCode404 of CatalogsProductGroupsGetStatusCode404Response|CatalogsProductGroupsGetStatusCode429 of CatalogsProductGroupsGetStatusCode429Response|CatalogsProductGroupsGetDefaultStatusCode of CatalogsProductGroupsGetDefaultStatusCodeResponse

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


      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type CatalogsProductGroupsListStatusCode200Response = {
      content:CatalogsProductGroupsList200Response;
      
    }

    type CatalogsProductGroupsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsListResult = CatalogsProductGroupsListStatusCode200 of CatalogsProductGroupsListStatusCode200Response|CatalogsProductGroupsListStatusCode400 of CatalogsProductGroupsListStatusCode400Response|CatalogsProductGroupsListStatusCode401 of CatalogsProductGroupsListStatusCode401Response|CatalogsProductGroupsListStatusCode403 of CatalogsProductGroupsListStatusCode403Response|CatalogsProductGroupsListStatusCode404 of CatalogsProductGroupsListStatusCode404Response|CatalogsProductGroupsListStatusCode429 of CatalogsProductGroupsListStatusCode429Response|CatalogsProductGroupsListDefaultStatusCode of CatalogsProductGroupsListDefaultStatusCodeResponse

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

    type CatalogsProductGroupsProductCountsGetStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsProductCountsGetStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsProductCountsGetResult = CatalogsProductGroupsProductCountsGetStatusCode200 of CatalogsProductGroupsProductCountsGetStatusCode200Response|CatalogsProductGroupsProductCountsGetStatusCode400 of CatalogsProductGroupsProductCountsGetStatusCode400Response|CatalogsProductGroupsProductCountsGetStatusCode401 of CatalogsProductGroupsProductCountsGetStatusCode401Response|CatalogsProductGroupsProductCountsGetStatusCode403 of CatalogsProductGroupsProductCountsGetStatusCode403Response|CatalogsProductGroupsProductCountsGetStatusCode404 of CatalogsProductGroupsProductCountsGetStatusCode404Response|CatalogsProductGroupsProductCountsGetStatusCode429 of CatalogsProductGroupsProductCountsGetStatusCode429Response|CatalogsProductGroupsProductCountsGetDefaultStatusCode of CatalogsProductGroupsProductCountsGetDefaultStatusCodeResponse

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
    type CatalogsProductGroupsUpdateBodyParams = CatalogsProductGroupsUpdateRequestSchema
    //#endregion


    type CatalogsProductGroupsUpdateStatusCode200Response = {
      content:CatalogsVerticalProductGroup;
      
    }

    type CatalogsProductGroupsUpdateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsUpdateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsUpdateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsUpdateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsUpdateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsProductGroupsUpdateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsProductGroupsUpdateResult = CatalogsProductGroupsUpdateStatusCode200 of CatalogsProductGroupsUpdateStatusCode200Response|CatalogsProductGroupsUpdateStatusCode400 of CatalogsProductGroupsUpdateStatusCode400Response|CatalogsProductGroupsUpdateStatusCode401 of CatalogsProductGroupsUpdateStatusCode401Response|CatalogsProductGroupsUpdateStatusCode403 of CatalogsProductGroupsUpdateStatusCode403Response|CatalogsProductGroupsUpdateStatusCode404 of CatalogsProductGroupsUpdateStatusCode404Response|CatalogsProductGroupsUpdateStatusCode429 of CatalogsProductGroupsUpdateStatusCode429Response|CatalogsProductGroupsUpdateDefaultStatusCode of CatalogsProductGroupsUpdateDefaultStatusCodeResponse

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

    type ProductsByProductGroupFilterListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type ProductsByProductGroupFilterListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type ProductsByProductGroupFilterListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type ProductsByProductGroupFilterListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type ProductsByProductGroupFilterListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type ProductsByProductGroupFilterListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type ProductsByProductGroupFilterListResult = ProductsByProductGroupFilterListStatusCode200 of ProductsByProductGroupFilterListStatusCode200Response|ProductsByProductGroupFilterListStatusCode400 of ProductsByProductGroupFilterListStatusCode400Response|ProductsByProductGroupFilterListStatusCode401 of ProductsByProductGroupFilterListStatusCode401Response|ProductsByProductGroupFilterListStatusCode403 of ProductsByProductGroupFilterListStatusCode403Response|ProductsByProductGroupFilterListStatusCode404 of ProductsByProductGroupFilterListStatusCode404Response|ProductsByProductGroupFilterListStatusCode429 of ProductsByProductGroupFilterListStatusCode429Response|ProductsByProductGroupFilterListDefaultStatusCode of ProductsByProductGroupFilterListDefaultStatusCodeResponse

    type ProductsByProductGroupFilterListArgs = {
      queryParams:Result<ProductsByProductGroupFilterListQueryParams,string>;
      bodyParams:ProductsByProductGroupFilterListBodyParams
    }
