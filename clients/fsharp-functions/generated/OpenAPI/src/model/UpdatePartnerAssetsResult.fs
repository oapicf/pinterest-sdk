namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UpdatePartnerAssetsResult =

  //#region UpdatePartnerAssetsResult

  [<CLIMutable>]
  type UpdatePartnerAssetsResult = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : string;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
