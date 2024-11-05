namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletePartnerAssetsResult =

  //#region DeletePartnerAssetsResult

  [<CLIMutable>]
  type DeletePartnerAssetsResult = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
    [<JsonProperty(PropertyName = "is_shared_partner")>]
    IsSharedPartner : bool;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
  }

  //#endregion
