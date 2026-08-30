namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DeleteMemberAssetAccessItem

module BusinessMembersAssetAccessDeleteBody =

  //#region BusinessMembersAssetAccessDeleteBody

  [<CLIMutable>]
  type BusinessMembersAssetAccessDeleteBody = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : DeleteMemberAssetAccessItem[];
  }

  //#endregion
