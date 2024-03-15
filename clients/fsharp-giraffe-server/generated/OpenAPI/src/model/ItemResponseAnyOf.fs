namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module ItemResponseAnyOf =

  //#region ItemResponseAnyOf


  type ItemResponse_anyOf = {
    CatalogType : CatalogsType;
    ItemId : string;
    Pins : Pin[];
    Attributes : CatalogsHotelAttributes;
    HotelId : string;
  }
  //#endregion
