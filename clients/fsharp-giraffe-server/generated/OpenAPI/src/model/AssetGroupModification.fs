namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetGroupUpdateError

module AssetGroupModification =

  //#region AssetGroupModification


  type AssetGroupModification = {
    Exceptions : AssetGroupUpdateError[];
    UpdatedAssetGroups : AssetGroupBinding[];
  }
  //#endregion
