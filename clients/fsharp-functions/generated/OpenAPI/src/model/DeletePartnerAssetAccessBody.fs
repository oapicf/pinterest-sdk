namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeletePartnerAssetAccessItem

module DeletePartnerAssetAccessBody =

  //#region DeletePartnerAssetAccessBody

  [<CLIMutable>]
  type DeletePartnerAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : DeletePartnerAssetAccessItem[];
  }

  //#endregion
