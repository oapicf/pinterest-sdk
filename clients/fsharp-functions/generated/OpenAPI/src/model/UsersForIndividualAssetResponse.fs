namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UsersForIndividualAssetResponse =

  //#region UsersForIndividualAssetResponse

  [<CLIMutable>]
  type UsersForIndividualAssetResponse = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
