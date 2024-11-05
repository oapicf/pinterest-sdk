namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsType
open OpenAPI.Model.ItemValidationEvent

module CatalogsCreativeAssetsItemErrorResponse =

  //#region CatalogsCreativeAssetsItemErrorResponse

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemErrorResponse = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : CatalogsType;
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
  }

  //#endregion
