namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsRetailBatchRequestItemsInner
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module CatalogsRetailBatchRequest =

  //#region CatalogsRetailBatchRequest


  type CatalogsRetailBatchRequest = {
    CatalogType : CatalogsType;
    Country : Country;
    Language : Language;
    Items : CatalogsRetailBatchRequestItemsInner[];
  }
  //#endregion
