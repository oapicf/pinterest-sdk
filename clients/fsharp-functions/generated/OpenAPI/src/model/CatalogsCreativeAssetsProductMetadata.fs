namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CreativeAssetsVisibilityType

module CatalogsCreativeAssetsProductMetadata =

  //#region CatalogsCreativeAssetsProductMetadata

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductMetadata = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "visibility")>]
    Visibility : CreativeAssetsVisibilityType;
  }

  //#endregion
