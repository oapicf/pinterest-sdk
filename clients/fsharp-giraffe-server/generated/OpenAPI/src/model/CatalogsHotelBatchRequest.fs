namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelBatchItem
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country

module CatalogsHotelBatchRequest =

  //#region CatalogsHotelBatchRequest

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion

  type CatalogsHotelBatchRequest = {
    CatalogType : CatalogTypeEnum;
    Country : Country;
    Language : CatalogsItemsRequestLanguage;
    Items : CatalogsHotelBatchItem[];
    CatalogId : string;
  }
  //#endregion
