namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.Country

module CatalogsRetailListProductsByCatalogBasedFilterRequest =

  //#region CatalogsRetailListProductsByCatalogBasedFilterRequest

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailListProductsByCatalogBasedFilterRequest = {
    CatalogType : CatalogTypeEnum;
    CatalogId : string;
    Filters : CatalogsProductGroupFilters;
    Country : Country;
    Locale : CatalogsLocale;
  }
  //#endregion
