namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BusinessMembersAssetAccessDeleteRequestAccessesInner =

  //#region BusinessMembersAssetAccessDeleteRequestAccessesInner

  [<CLIMutable>]
  type BusinessMembersAssetAccessDeleteRequestAccessesInner = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
  }

  //#endregion
