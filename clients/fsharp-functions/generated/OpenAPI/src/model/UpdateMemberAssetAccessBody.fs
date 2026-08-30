namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateMemberAssetAccessItem

module UpdateMemberAssetAccessBody =

  //#region UpdateMemberAssetAccessBody

  [<CLIMutable>]
  type UpdateMemberAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : UpdateMemberAssetAccessItem[];
  }

  //#endregion
