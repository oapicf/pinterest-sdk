namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MembersToDeleteBodyMembersInner

module MembersToDeleteBody =

  //#region MembersToDeleteBody

  [<CLIMutable>]
  type MembersToDeleteBody = {
    [<JsonProperty(PropertyName = "members")>]
    Members : MembersToDeleteBodyMembersInner[];
  }

  //#endregion
