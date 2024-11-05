namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsBatchItem
open OpenAPI.Model.CatalogsCreativeAssetsBatchRequest
open OpenAPI.Model.CatalogsHotelBatchRequest
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsRetailBatchRequest
open OpenAPI.Model.Country

module CatalogsVerticalBatchRequest =

  //#region CatalogsVerticalBatchRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsVerticalBatchRequest = {
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Items : CatalogsCreativeAssetsBatchItem[];
    CatalogId : string;
  }
  //#endregion
