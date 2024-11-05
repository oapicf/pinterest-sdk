namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsAttributes
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.Pin

module CatalogsCreativeAssetsItemResponse =

  //#region CatalogsCreativeAssetsItemResponse

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : Pin[];
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsCreativeAssetsAttributes;
  }

  //#endregion
