namespace OpenAPI

open OpenAPI.Model.Catalog
open OpenAPI.Model.CatalogCreate
open OpenAPI.Model.CatalogsAvailableFilterValues
open OpenAPI.Model.CatalogsList200Response
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.Country
open OpenAPI.Model.PinterestLibError
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
      content:PinterestLibError;
      
    }

    type CatalogsAvailableFilterValuesStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsAvailableFilterValuesStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsAvailableFilterValuesStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsAvailableFilterValuesStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsAvailableFilterValuesDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsAvailableFilterValuesResult = CatalogsAvailableFilterValuesStatusCode200 of CatalogsAvailableFilterValuesStatusCode200Response|CatalogsAvailableFilterValuesStatusCode400 of CatalogsAvailableFilterValuesStatusCode400Response|CatalogsAvailableFilterValuesStatusCode401 of CatalogsAvailableFilterValuesStatusCode401Response|CatalogsAvailableFilterValuesStatusCode403 of CatalogsAvailableFilterValuesStatusCode403Response|CatalogsAvailableFilterValuesStatusCode404 of CatalogsAvailableFilterValuesStatusCode404Response|CatalogsAvailableFilterValuesStatusCode429 of CatalogsAvailableFilterValuesStatusCode429Response|CatalogsAvailableFilterValuesDefaultStatusCode of CatalogsAvailableFilterValuesDefaultStatusCodeResponse

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
    type CatalogsCreateBodyParams = CatalogCreate
    //#endregion


    type CatalogsCreateStatusCode200Response = {
      content:Catalog;
      
    }

    type CatalogsCreateStatusCode201Response = {
      content:Catalog;
      
    }

    type CatalogsCreateStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsCreateStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsCreateStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsCreateStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsCreateStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsCreateDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsCreateResult = CatalogsCreateStatusCode200 of CatalogsCreateStatusCode200Response|CatalogsCreateStatusCode201 of CatalogsCreateStatusCode201Response|CatalogsCreateStatusCode400 of CatalogsCreateStatusCode400Response|CatalogsCreateStatusCode401 of CatalogsCreateStatusCode401Response|CatalogsCreateStatusCode403 of CatalogsCreateStatusCode403Response|CatalogsCreateStatusCode404 of CatalogsCreateStatusCode404Response|CatalogsCreateStatusCode429 of CatalogsCreateStatusCode429Response|CatalogsCreateDefaultStatusCode of CatalogsCreateDefaultStatusCodeResponse

    type CatalogsCreateArgs = {
      queryParams:Result<CatalogsCreateQueryParams,string>;
      bodyParams:CatalogsCreateBodyParams
    }

    //#region Query parameters
    [<CLIMutable>]
    type CatalogsListQueryParams = {
      adAccountId : string option;


      bookmark : string option;


      pageSize : int option;

    }
    //#endregion


    type CatalogsListStatusCode200Response = {
      content:CatalogsList200Response;
      
    }

    type CatalogsListStatusCode400Response = {
      content:PinterestLibError;
      
    }

    type CatalogsListStatusCode401Response = {
      content:PinterestLibError;
      
    }

    type CatalogsListStatusCode403Response = {
      content:PinterestLibError;
      
    }

    type CatalogsListStatusCode404Response = {
      content:PinterestLibError;
      
    }

    type CatalogsListStatusCode429Response = {
      content:PinterestLibError;
      
    }

    type CatalogsListDefaultStatusCodeResponse = {
      content:PinterestLibError;
      
    }
    type CatalogsListResult = CatalogsListStatusCode200 of CatalogsListStatusCode200Response|CatalogsListStatusCode400 of CatalogsListStatusCode400Response|CatalogsListStatusCode401 of CatalogsListStatusCode401Response|CatalogsListStatusCode403 of CatalogsListStatusCode403Response|CatalogsListStatusCode404 of CatalogsListStatusCode404Response|CatalogsListStatusCode429 of CatalogsListStatusCode429Response|CatalogsListDefaultStatusCode of CatalogsListDefaultStatusCodeResponse

    type CatalogsListArgs = {
      queryParams:Result<CatalogsListQueryParams,string>;
    }
