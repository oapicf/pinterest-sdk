namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetIdWithPermissions

module BusinessMemberAssetsSummary =

  //#region BusinessMemberAssetsSummary

  [<CLIMutable>]
  type BusinessMemberAssetsSummary = {
    [<JsonProperty(PropertyName = "ad_accounts")>]
    AdAccounts : AssetIdWithPermissions[];
    [<JsonProperty(PropertyName = "profiles")>]
    Profiles : AssetIdWithPermissions[];
  }

  //#endregion
