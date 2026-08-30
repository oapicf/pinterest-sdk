namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.Pin

module CatalogsHotelItemResponse =

  //#region CatalogsHotelItemResponse

  [<CLIMutable>]
  type CatalogsHotelItemResponse = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsHotelAttributes;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
  }

  //#endregion
