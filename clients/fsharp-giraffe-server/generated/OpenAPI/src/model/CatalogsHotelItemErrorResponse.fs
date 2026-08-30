namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemValidationEvent

module CatalogsHotelItemErrorResponse =

  //#region CatalogsHotelItemErrorResponse

  //#region enums
  type CatalogTypeEnum = HOTELEnum of string  
  //#endregion
  //#region enums
  type ItemResponseKindEnum = HotelItemErrorEnum of string  
  //#endregion

  type CatalogsHotelItemErrorResponse = {
    CatalogType : CatalogTypeEnum;
    Errors : ItemValidationEvent[];
    HotelId : string;
    ItemResponseKind : ItemResponseKindEnum;
  }
  //#endregion
