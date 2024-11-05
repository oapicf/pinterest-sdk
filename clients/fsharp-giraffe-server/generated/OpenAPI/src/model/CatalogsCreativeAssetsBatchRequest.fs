namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsBatchItem
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country

module CatalogsCreativeAssetsBatchRequest =

  //#region CatalogsCreativeAssetsBatchRequest

  //#region enums
  type CatalogTypeEnum = CREATIVEASSETSEnum of string  
  //#endregion

  type CatalogsCreativeAssetsBatchRequest = {
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Items : CatalogsCreativeAssetsBatchItem[];
    CatalogId : string;
  }
  //#endregion
