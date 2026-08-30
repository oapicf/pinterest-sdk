namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemValidationEvent

module CatalogsCreativeAssetsItemErrorResponse =

  //#region CatalogsCreativeAssetsItemErrorResponse

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemErrorResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "item_response_kind")>]
    ItemResponseKind : string;
  }

  //#endregion
