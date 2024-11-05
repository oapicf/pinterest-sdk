namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdatePartnerAssetAccessBodyAccessesInner

module UpdatePartnerAssetAccessBody =

  //#region UpdatePartnerAssetAccessBody

  [<CLIMutable>]
  type UpdatePartnerAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : UpdatePartnerAssetAccessBodyAccessesInner[];
  }

  //#endregion
