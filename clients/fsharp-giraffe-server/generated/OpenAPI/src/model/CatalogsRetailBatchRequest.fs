namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsRetailBatchRequestItemsInner
open OpenAPI.Model.Country

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest

  //#region enums
  type CatalogTypeEnum = RETAILEnum of string  
  //#endregion

  type CatalogsRetailBatchRequest = {
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Items : CatalogsRetailBatchRequestItemsInner[];
  }
  //#endregion
