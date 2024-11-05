namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BusinessMemberAssetsSummaryAdAccountsInner =

  //#region BusinessMemberAssetsSummaryAdAccountsInner

  [<CLIMutable>]
  type BusinessMemberAssetsSummaryAdAccountsInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
