namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteAssetsSummaryAdAccountsInner
open OpenAPI.Model.InviteAssetsSummaryProfilesInner

module InviteAssetsSummary =

  //#region InviteAssetsSummary


  type InviteAssetsSummary = {
    AdAccounts : InviteAssetsSummaryAdAccountsInner[];
    Profiles : InviteAssetsSummaryProfilesInner[];
  }
  //#endregion
