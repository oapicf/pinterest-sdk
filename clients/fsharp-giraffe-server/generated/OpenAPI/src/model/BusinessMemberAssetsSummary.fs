namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BusinessMemberAssetsSummaryAdAccountsInner
open OpenAPI.Model.BusinessMemberAssetsSummaryProfilesInner

module BusinessMemberAssetsSummary =

  //#region BusinessMemberAssetsSummary


  type BusinessMemberAssetsSummary = {
    AdAccounts : BusinessMemberAssetsSummaryAdAccountsInner[];
    Profiles : BusinessMemberAssetsSummaryProfilesInner[];
  }
  //#endregion
