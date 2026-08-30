namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.Pin

module CatalogsHotelItemResponse =

  //#region CatalogsHotelItemResponse

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = HotelItemEnum of string  
  //#endregion

  type CatalogsHotelItemResponse = {
    Attributes : CatalogsHotelAttributes;
    CatalogType : CatalogTypeEnum;
    HotelId : string;
    ItemResponseKind : ItemResponseKindEnum;
    Pins : Pin[];
  }
  //#endregion
