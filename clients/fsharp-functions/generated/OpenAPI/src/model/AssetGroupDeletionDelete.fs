namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AssetGroupDeletionDelete =

  //#region AssetGroupDeletionDelete

  [<CLIMutable>]
  type AssetGroupDeletionDelete = {
    [<JsonProperty(PropertyName = "asset_groups_to_delete")>]
    AssetGroupsToDelete : string[];
  }

  //#endregion
