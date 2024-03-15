namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemResponseAnyOf
open OpenAPI.Model.ItemResponseAnyOf1
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse


  type ItemResponse = {
    CatalogType : CatalogsType;
    ItemId : string;
    Errors : ItemValidationEvent[];
    HotelId : string;
  }
  //#endregion
