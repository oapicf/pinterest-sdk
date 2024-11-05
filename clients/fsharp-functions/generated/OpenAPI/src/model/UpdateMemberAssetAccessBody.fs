namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UpdateMemberAssetAccessBodyAccessesInner

module UpdateMemberAssetAccessBody =

  //#region UpdateMemberAssetAccessBody

  [<CLIMutable>]
  type UpdateMemberAssetAccessBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : UpdateMemberAssetAccessBodyAccessesInner[];
  }

  //#endregion
