namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetTypeResponse

module AssetIdPermissions =

  //#region AssetIdPermissions


  type AssetIdPermissions = {
    AssetGroupInfo : AssetGroupBinding;
    AssetId : string;
    AssetType : AssetTypeResponse;
    Permissions : string[];
  }
  //#endregion
