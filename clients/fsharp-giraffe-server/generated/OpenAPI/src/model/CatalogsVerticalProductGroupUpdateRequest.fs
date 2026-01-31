namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupUpdateRequest
open OpenAPI.Model.CatalogsHotelProductGroupUpdateRequest
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsRetailProductGroupUpdateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsVerticalProductGroupUpdateRequest =

  //#region CatalogsVerticalProductGroupUpdateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalProductGroupUpdateRequest = {
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    Locale : CatalogsLocale;
    Name : string;
  }
  //#endregion
