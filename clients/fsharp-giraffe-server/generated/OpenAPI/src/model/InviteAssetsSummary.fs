namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteAssetsSummaryItem

module InviteAssetsSummary =

  //#region InviteAssetsSummary


  type InviteAssetsSummary = {
    AdAccounts : InviteAssetsSummaryItem[];
    Profiles : InviteAssetsSummaryItem[];
  }
  //#endregion
