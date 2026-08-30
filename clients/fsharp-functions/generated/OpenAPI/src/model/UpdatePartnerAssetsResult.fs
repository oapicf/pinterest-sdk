namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetTypeResponse

module UpdatePartnerAssetsResult =

  //#region UpdatePartnerAssetsResult

  [<CLIMutable>]
  type UpdatePartnerAssetsResult = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : AssetTypeResponse;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
  }

  //#endregion
