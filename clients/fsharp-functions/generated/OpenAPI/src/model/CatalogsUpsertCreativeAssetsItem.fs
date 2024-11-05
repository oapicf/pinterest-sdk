namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsAttributes

module CatalogsUpsertCreativeAssetsItem =

  //#region CatalogsUpsertCreativeAssetsItem

  [<CLIMutable>]
  type CatalogsUpsertCreativeAssetsItem = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsCreativeAssetsAttributes;
  }

  //#endregion
