namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding

module AssetIdPermissions =

  //#region AssetIdPermissions


  type AssetIdPermissions = {
    AssetId : string;
    AssetType : string;
    Permissions : string[];
    AssetGroupInfo : AssetGroupBinding;
  }
  //#endregion
