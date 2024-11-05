namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteAssetsSummaryAdAccountsInner =

  //#region InviteAssetsSummaryAdAccountsInner

  [<CLIMutable>]
  type InviteAssetsSummaryAdAccountsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
