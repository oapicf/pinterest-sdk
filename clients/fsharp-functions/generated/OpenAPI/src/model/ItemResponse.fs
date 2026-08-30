namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsCreativeAssetsItemErrorResponse
open OpenAPI.Model.CatalogsCreativeAssetsItemResponse
open OpenAPI.Model.CatalogsHotelItemErrorResponse
open OpenAPI.Model.CatalogsHotelItemResponse
open OpenAPI.Model.CatalogsRetailItemErrorResponse
open OpenAPI.Model.CatalogsRetailItemResponse
open OpenAPI.Model.ItemValidationEvent
open OpenAPI.Model.Pin

module ItemResponse =

  //#region ItemResponse

  [<CLIMutable>]
  type ItemResponse = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsCreativeAssetsAttributes;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
  }

  //#endregion
