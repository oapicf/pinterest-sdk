namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module ItemResponseAnyOf =

  //#region ItemResponseAnyOf

  [<CLIMutable>]
  type ItemResponseAnyOf = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsHotelAttributes;
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
  }

  //#endregion
