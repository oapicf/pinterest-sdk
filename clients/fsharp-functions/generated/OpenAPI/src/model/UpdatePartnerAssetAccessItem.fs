namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions

module UpdatePartnerAssetAccessItem =

  //#region UpdatePartnerAssetAccessItem

  [<CLIMutable>]
  type UpdatePartnerAssetAccessItem = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Permissions[];
  }

  //#endregion
