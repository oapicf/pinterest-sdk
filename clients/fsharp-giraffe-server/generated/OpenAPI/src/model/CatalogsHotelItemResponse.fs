namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsHotelItemResponse =

  //#region CatalogsHotelItemResponse


  type CatalogsHotelItemResponse = {
    CatalogType : CatalogsType;
    HotelId : string;
    Pins : Pin[];
    Attributes : CatalogsHotelAttributes;
  }
  //#endregion
