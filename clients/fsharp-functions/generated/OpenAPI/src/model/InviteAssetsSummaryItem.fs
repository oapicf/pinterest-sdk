namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteAssetsSummaryItem =

  //#region InviteAssetsSummaryItem

  [<CLIMutable>]
  type InviteAssetsSummaryItem = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
