namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.UpdateAssetGroupResponseExceptionsInner

module UpdateAssetGroupResponse =

  //#region UpdateAssetGroupResponse

  [<CLIMutable>]
  type UpdateAssetGroupResponse = {
    [<JsonProperty(PropertyName = "updated_asset_groups")>]
    UpdatedAssetGroups : AssetGroupBinding[];
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : UpdateAssetGroupResponseExceptionsInner[];
  }

  //#endregion
