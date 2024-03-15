namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsHotelItemResponse =

  //#region CatalogsHotelItemResponse

  [<CLIMutable>]
  type CatalogsHotelItemResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsHotelAttributes;
  }

  //#endregion
