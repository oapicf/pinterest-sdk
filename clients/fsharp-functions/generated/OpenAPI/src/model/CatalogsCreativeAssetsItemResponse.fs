namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsItemResponse =

  //#region CatalogsCreativeAssetsItemResponse

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemResponse = {
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsCreativeAssetsAttributes;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
  }

  //#endregion
