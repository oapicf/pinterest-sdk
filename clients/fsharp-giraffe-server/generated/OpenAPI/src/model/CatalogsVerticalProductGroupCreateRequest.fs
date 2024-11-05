namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupCreateRequest
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroupCreateRequest
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsRetailProductGroupCreateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsVerticalProductGroupCreateRequest =

  //#region CatalogsVerticalProductGroupCreateRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalProductGroupCreateRequest = {
    CatalogType : CatalogTypeEnum;
    Name : string;
    Description : string option;
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    CatalogId : string;
    Country : Country;
    Locale : CatalogsLocale;
  }
  //#endregion
