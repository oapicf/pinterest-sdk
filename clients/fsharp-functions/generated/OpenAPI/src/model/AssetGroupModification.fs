namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupUpdateError

module AssetGroupModification =

  //#region AssetGroupModification

  [<CLIMutable>]
  type AssetGroupModification = {
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : AssetGroupUpdateError[];
    [<JsonProperty(PropertyName = "updated_asset_groups")>]
    UpdatedAssetGroups : AssetGroupBinding[];
  }

  //#endregion
