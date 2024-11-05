namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteAssetGroupBody =

  //#region DeleteAssetGroupBody

  [<CLIMutable>]
  type DeleteAssetGroupBody = {
    [<JsonProperty(PropertyName = "asset_groups_to_delete")>]
    AssetGroupsToDelete : string[];
  }

  //#endregion
