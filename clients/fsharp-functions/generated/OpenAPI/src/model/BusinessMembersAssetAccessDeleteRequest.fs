namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BusinessMembersAssetAccessDeleteRequestAccessesInner

module BusinessMembersAssetAccessDeleteRequest =

  //#region BusinessMembersAssetAccessDeleteRequest

  [<CLIMutable>]
  type BusinessMembersAssetAccessDeleteRequest = {
    [<JsonProperty(PropertyName = "accesses")>]
    Accesses : BusinessMembersAssetAccessDeleteRequestAccessesInner[];
  }

  //#endregion
