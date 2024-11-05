namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.UpdateAssetGroupResponseExceptionsInner

module UpdateAssetGroupResponse =

  //#region UpdateAssetGroupResponse


  type UpdateAssetGroupResponse = {
    UpdatedAssetGroups : AssetGroupBinding[];
    Exceptions : UpdateAssetGroupResponseExceptionsInner[];
  }
  //#endregion
