namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletePartnerAssetAccessBodyAccessesInner =

  //#region DeletePartnerAssetAccessBodyAccessesInner

  [<CLIMutable>]
  type DeletePartnerAssetAccessBodyAccessesInner = {
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "partner_type")>]
    PartnerType : string;
  }

  //#endregion
