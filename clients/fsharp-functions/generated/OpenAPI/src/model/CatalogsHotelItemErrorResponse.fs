namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemValidationEvent

module CatalogsHotelItemErrorResponse =

  //#region CatalogsHotelItemErrorResponse

  [<CLIMutable>]
  type CatalogsHotelItemErrorResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
  }

  //#endregion
