namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module CatalogsHotelItemErrorResponse =

  //#region CatalogsHotelItemErrorResponse


  type CatalogsHotelItemErrorResponse = {
    CatalogType : CatalogsType;
    HotelId : string;
    Errors : ItemValidationEvent[];
  }
  //#endregion
