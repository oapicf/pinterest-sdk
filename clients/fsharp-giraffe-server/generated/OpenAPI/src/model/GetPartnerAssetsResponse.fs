namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding

module GetPartnerAssetsResponse =

  //#region GetPartnerAssetsResponse


  type GetPartnerAssetsResponse = {
    AssetId : string;
    AssetType : string;
    Permissions : string[];
    AssetGroupInfo : AssetGroupBinding;
  }
  //#endregion
