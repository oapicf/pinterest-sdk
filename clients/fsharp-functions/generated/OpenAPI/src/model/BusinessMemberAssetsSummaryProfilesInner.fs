namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BusinessMemberAssetsSummaryProfilesInner =

  //#region BusinessMemberAssetsSummaryProfilesInner

  [<CLIMutable>]
  type BusinessMemberAssetsSummaryProfilesInner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
