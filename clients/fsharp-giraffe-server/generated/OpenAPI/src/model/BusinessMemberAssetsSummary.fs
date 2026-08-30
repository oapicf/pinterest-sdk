namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetIdWithPermissions

module BusinessMemberAssetsSummary =

  //#region BusinessMemberAssetsSummary


  type BusinessMemberAssetsSummary = {
    AdAccounts : AssetIdWithPermissions[];
    Profiles : AssetIdWithPermissions[];
  }
  //#endregion
