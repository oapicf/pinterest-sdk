namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module InviteAssetsSummaryProfilesInner =

  //#region InviteAssetsSummaryProfilesInner

  [<CLIMutable>]
  type InviteAssetsSummaryProfilesInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
