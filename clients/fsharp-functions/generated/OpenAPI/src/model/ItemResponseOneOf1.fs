namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsItemErrorResponse
open OpenAPI.Model.CatalogsHotelItemErrorResponse
open OpenAPI.Model.CatalogsRetailItemErrorResponse
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module ItemResponseOneOf1 =

  //#region ItemResponseOneOf1

  [<CLIMutable>]
  type ItemResponseOneOf1 = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "item_id")>]
    ItemId : string;
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
  }

  //#endregion
