namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupDeleteError

module AssetGroupDeletion =

  //#region AssetGroupDeletion

  [<CLIMutable>]
  type AssetGroupDeletion = {
    [<JsonProperty(PropertyName = "deleted_asset_groups")>]
    DeletedAssetGroups : string[];
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : AssetGroupDeleteError[];
  }

  //#endregion
