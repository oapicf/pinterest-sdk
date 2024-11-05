namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsUpdatableCreativeAssetsAttributes

module CatalogsUpdateCreativeAssetsItem =

  //#region CatalogsUpdateCreativeAssetsItem

  [<CLIMutable>]
  type CatalogsUpdateCreativeAssetsItem = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsUpdatableCreativeAssetsAttributes;
  }

  //#endregion
