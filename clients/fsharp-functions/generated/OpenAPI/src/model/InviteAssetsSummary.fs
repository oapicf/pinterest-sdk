namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteAssetsSummaryItem

module InviteAssetsSummary =

  //#region InviteAssetsSummary

  [<CLIMutable>]
  type InviteAssetsSummary = {
    [<JsonProperty(PropertyName = "ad_accounts")>]
    AdAccounts : InviteAssetsSummaryItem[];
    [<JsonProperty(PropertyName = "profiles")>]
    Profiles : InviteAssetsSummaryItem[];
  }

  //#endregion
