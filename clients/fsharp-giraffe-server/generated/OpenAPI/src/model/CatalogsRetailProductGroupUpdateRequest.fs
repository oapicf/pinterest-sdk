namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsRetailProductGroupUpdateRequest =

  //#region CatalogsRetailProductGroupUpdateRequest

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailProductGroupUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFiltersRequest;
    Country : Country;
    Locale : CatalogsLocale;
  }
  //#endregion
