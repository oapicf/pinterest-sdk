namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteMemberAssetAccessItem =

  //#region DeleteMemberAssetAccessItem

  [<CLIMutable>]
  type DeleteMemberAssetAccessItem = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
  }

  //#endregion
