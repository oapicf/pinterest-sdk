namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions

module UpdatePartnerAssetAccessBodyAccessesInner =

  //#region UpdatePartnerAssetAccessBodyAccessesInner

  [<CLIMutable>]
  type UpdatePartnerAssetAccessBodyAccessesInner = {
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Permissions[];
  }

  //#endregion
