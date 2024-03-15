namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelBatchItem
open OpenAPI.Model.CatalogsHotelBatchRequest
open OpenAPI.Model.CatalogsRetailBatchRequest
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module CatalogsVerticalBatchRequest =

  //#region CatalogsVerticalBatchRequest


  type CatalogsVerticalBatchRequest = {
    CatalogType : CatalogsType;
    Country : Country;
    Language : Language;
    Items : CatalogsHotelBatchItem[];
    CatalogId : string;
  }
  //#endregion
