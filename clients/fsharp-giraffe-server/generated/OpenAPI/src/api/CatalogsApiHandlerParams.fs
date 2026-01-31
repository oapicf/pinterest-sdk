namespace OpenAPI

open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogsAvailableFilterValues
open OpenAPI.Model.CatalogsCreateRequest
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.Country
open OpenAPI.Model.Error
open System.Collections.Generic
open System

module CatalogsApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type CatalogsAvailableFilterValuesQueryParams = {
      catalogId : string ;


      feedId : string option;


      country : Country option;


      language : CatalogsLocale option;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsAvailableFilterValuesStatusCode200Response = {
      content:CatalogsAvailableFilterValues;
      
    }

    type CatalogsAvailableFilterValuesStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsAvailableFilterValuesStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsAvailableFilterValuesStatusCode403Response = {
      content:Error;
      
    }

    type CatalogsAvailableFilterValuesStatusCode404Response = {
      content:Error;
      
    }

    type CatalogsAvailableFilterValuesStatusCode409Response = {
      content:Error;
      
    }

    type CatalogsAvailableFilterValuesDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsAvailableFilterValuesResult = CatalogsAvailableFilterValuesStatusCode200 of CatalogsAvailableFilterValuesStatusCode200Response|CatalogsAvailableFilterValuesStatusCode400 of CatalogsAvailableFilterValuesStatusCode400Response|CatalogsAvailableFilterValuesStatusCode401 of CatalogsAvailableFilterValuesStatusCode401Response|CatalogsAvailableFilterValuesStatusCode403 of CatalogsAvailableFilterValuesStatusCode403Response|CatalogsAvailableFilterValuesStatusCode404 of CatalogsAvailableFilterValuesStatusCode404Response|CatalogsAvailableFilterValuesStatusCode409 of CatalogsAvailableFilterValuesStatusCode409Response|CatalogsAvailableFilterValuesDefaultStatusCode of CatalogsAvailableFilterValuesDefaultStatusCodeResponse

    type CatalogsAvailableFilterValuesArgs = {
      queryParams:Result<CatalogsAvailableFilterValuesQueryParams,string>;
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsCreateQueryParams = {
      adAccountId : string option;

    }
    //#endregion

    //#region Body parameters
    [<CLIMutable>]
    type CatalogsCreateBodyParams = CatalogsCreateRequest
    //#endregion


    type CatalogsCreateStatusCode200Response = {
      content:Catalog;
      
    }

    type CatalogsCreateStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsCreateStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsCreateDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsCreateResult = CatalogsCreateStatusCode200 of CatalogsCreateStatusCode200Response|CatalogsCreateStatusCode400 of CatalogsCreateStatusCode400Response|CatalogsCreateStatusCode401 of CatalogsCreateStatusCode401Response|CatalogsCreateDefaultStatusCode of CatalogsCreateDefaultStatusCodeResponse

    type CatalogsCreateArgs = {
      queryParams:Result<CatalogsCreateQueryParams,string>;
      bodyParams:CatalogsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsListQueryParams = {
      bookmark : string option;


      pageSize : int option;


      adAccountId : string option;

    }
    //#endregion


    type CatalogsListStatusCode200Response = {
      content:CatalogsList200Response;
      
    }

    type CatalogsListStatusCode400Response = {
      content:Error;
      
    }

    type CatalogsListStatusCode401Response = {
      content:Error;
      
    }

    type CatalogsListDefaultStatusCodeResponse = {
      content:Error;
      
    }
    type CatalogsListResult = CatalogsListStatusCode200 of CatalogsListStatusCode200Response|CatalogsListStatusCode400 of CatalogsListStatusCode400Response|CatalogsListStatusCode401 of CatalogsListStatusCode401Response|CatalogsListDefaultStatusCode of CatalogsListDefaultStatusCodeResponse

    type CatalogsListArgs = {
      queryParams:Result<CatalogsListQueryParams,string>;
    }
