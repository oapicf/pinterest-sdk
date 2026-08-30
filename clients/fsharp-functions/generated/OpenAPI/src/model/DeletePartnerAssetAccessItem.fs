namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletePartnerAssetAccessItem =

  //#region DeletePartnerAssetAccessItem

  [<CLIMutable>]
  type DeletePartnerAssetAccessItem = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "partner_id")>]
    PartnerId : string;
    [<JsonProperty(PropertyName = "partner_type")>]
    PartnerType : string;
  }

  //#endregion
