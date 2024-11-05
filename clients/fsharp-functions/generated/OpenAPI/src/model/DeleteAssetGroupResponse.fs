namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeleteAssetGroupResponseExceptionsInner

module DeleteAssetGroupResponse =

  //#region DeleteAssetGroupResponse

  [<CLIMutable>]
  type DeleteAssetGroupResponse = {
    [<JsonProperty(PropertyName = "deleted_asset_groups")>]
    DeletedAssetGroups : string[];
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : DeleteAssetGroupResponseExceptionsInner[];
  }

  //#endregion
