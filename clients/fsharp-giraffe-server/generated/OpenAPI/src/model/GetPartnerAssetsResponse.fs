namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding

module GetPartnerAssetsResponse =

  //#region GetPartnerAssetsResponse


  type GetPartnerAssetsResponse = {
    AssetGroupInfo : AssetGroupBinding;
    AssetId : string;
    AssetType : string;
    Permissions : string[];
  }
  //#endregion
