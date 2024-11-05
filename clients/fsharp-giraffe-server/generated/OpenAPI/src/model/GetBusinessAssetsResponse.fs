namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding

module GetBusinessAssetsResponse =

  //#region GetBusinessAssetsResponse


  type GetBusinessAssetsResponse = {
    AssetId : string;
    AssetType : string;
    AssetGroupInfo : AssetGroupBinding;
  }
  //#endregion
