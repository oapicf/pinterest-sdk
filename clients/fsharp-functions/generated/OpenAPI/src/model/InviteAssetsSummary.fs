namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteAssetsSummaryAdAccountsInner
open OpenAPI.Model.InviteAssetsSummaryProfilesInner

module InviteAssetsSummary =

  //#region InviteAssetsSummary

  [<CLIMutable>]
  type InviteAssetsSummary = {
    [<JsonProperty(PropertyName = "ad_accounts")>]
    AdAccounts : InviteAssetsSummaryAdAccountsInner[];
    [<JsonProperty(PropertyName = "profiles")>]
    Profiles : InviteAssetsSummaryProfilesInner[];
  }

  //#endregion
