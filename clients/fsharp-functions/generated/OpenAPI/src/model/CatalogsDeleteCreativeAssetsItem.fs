namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsDeleteCreativeAssetsItem =

  //#region CatalogsDeleteCreativeAssetsItem

  [<CLIMutable>]
  type CatalogsDeleteCreativeAssetsItem = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
  }

  //#endregion
