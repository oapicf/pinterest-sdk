namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatePartnerAssetAccessItem

module UpdatePartnerAssetAccessBody =

  //#region UpdatePartnerAssetAccessBody

  [<CLIMutable>]
  type UpdatePartnerAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : UpdatePartnerAssetAccessItem[];
  }

  //#endregion
