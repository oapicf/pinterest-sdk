namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetTypeResponse

module BaseBusinessAssets =

  //#region BaseBusinessAssets


  type BaseBusinessAssets = {
    AssetGroupInfo : AssetGroupBinding;
    AssetId : string;
    AssetType : AssetTypeResponse;
    Permissions : string[];
  }
  //#endregion
