namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessMemberAssetsSummaryAdAccountsInner
open OpenAPI.Model.BusinessMemberAssetsSummaryProfilesInner

module BusinessMemberAssetsSummary =

  //#region BusinessMemberAssetsSummary

  [<CLIMutable>]
  type BusinessMemberAssetsSummary = {
    [<JsonProperty(PropertyName = "ad_accounts")>]
    AdAccounts : BusinessMemberAssetsSummaryAdAccountsInner[];
    [<JsonProperty(PropertyName = "profiles")>]
    Profiles : BusinessMemberAssetsSummaryProfilesInner[];
  }

  //#endregion
