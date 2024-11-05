namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateAssetGroupBodyAssetGroupsToUpdateInner

module UpdateAssetGroupBody =

  //#region UpdateAssetGroupBody

  [<CLIMutable>]
  type UpdateAssetGroupBody = {
    [<JsonProperty(PropertyName = "asset_groups_to_update")>]
    AssetGroupsToUpdate : UpdateAssetGroupBodyAssetGroupsToUpdateInner[];
  }

  //#endregion
