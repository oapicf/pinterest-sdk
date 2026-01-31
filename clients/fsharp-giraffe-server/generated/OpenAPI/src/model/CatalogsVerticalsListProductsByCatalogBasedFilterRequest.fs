namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsRetailListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.Country

module CatalogsVerticalsListProductsByCatalogBasedFilterRequest =

  //#region CatalogsVerticalsListProductsByCatalogBasedFilterRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalsListProductsByCatalogBasedFilterRequest = {
    CatalogId : string;
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    Locale : CatalogsLocale;
  }
  //#endregion
