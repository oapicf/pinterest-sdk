namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelItemErrorResponse
open OpenAPI.Model.CatalogsRetailItemErrorResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module ItemResponseAnyOf1 =

  //#region ItemResponseAnyOf1


  type ItemResponse_anyOf_1 = {
    CatalogType : CatalogsType;
    ItemId : string;
    Errors : ItemValidationEvent[];
    HotelId : string;
  }
  //#endregion
