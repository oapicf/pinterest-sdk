namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemResponseAnyOf
open OpenAPI.Model.ItemResponseAnyOf1
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse

  [<CLIMutable>]
  type ItemResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
  }

  //#endregion
