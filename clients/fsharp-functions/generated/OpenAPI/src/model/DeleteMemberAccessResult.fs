namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteMemberAccessResult =

  //#region DeleteMemberAccessResult

  [<CLIMutable>]
  type DeleteMemberAccessResult = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
  }

  //#endregion
