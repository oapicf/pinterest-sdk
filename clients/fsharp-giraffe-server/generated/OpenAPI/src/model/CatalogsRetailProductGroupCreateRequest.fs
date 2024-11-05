namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsRetailProductGroupCreateRequest =

  //#region CatalogsRetailProductGroupCreateRequest

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailProductGroupCreateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFiltersRequest;
    CatalogId : string;
    Country : Country;
    Locale : CatalogsLocale;
  }
  //#endregion
