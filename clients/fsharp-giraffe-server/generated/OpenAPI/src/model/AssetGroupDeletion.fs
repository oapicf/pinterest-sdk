namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupDeleteError

module AssetGroupDeletion =

  //#region AssetGroupDeletion


  type AssetGroupDeletion = {
    DeletedAssetGroups : string[];
    Exceptions : AssetGroupDeleteError[];
  }
  //#endregion
