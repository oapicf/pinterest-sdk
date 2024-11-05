namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeletePartnerAssetAccessBodyAccessesInner

module DeletePartnerAssetAccessBody =

  //#region DeletePartnerAssetAccessBody

  [<CLIMutable>]
  type DeletePartnerAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : DeletePartnerAssetAccessBodyAccessesInner[];
  }

  //#endregion
