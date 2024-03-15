namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelBatchItem
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Country
open OpenAPI.Model.Language

module CatalogsHotelBatchRequest =

  //#region CatalogsHotelBatchRequest


  type CatalogsHotelBatchRequest = {
    CatalogType : CatalogsType;
    Country : Country;
    Language : Language;
    Items : CatalogsHotelBatchItem[];
    CatalogId : string;
  }
  //#endregion
