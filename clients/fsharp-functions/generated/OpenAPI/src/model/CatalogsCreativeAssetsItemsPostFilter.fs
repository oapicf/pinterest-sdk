namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsCreativeAssetsItemsPostFilter =

  //#region CatalogsCreativeAssetsItemsPostFilter

  [<CLIMutable>]
  type CatalogsCreativeAssetsItemsPostFilter = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "creative_assets_ids")>]
    CreativeAssetsIds : string[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
