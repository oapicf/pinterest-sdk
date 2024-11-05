namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeletedMembersResponse =

  //#region DeletedMembersResponse

  [<CLIMutable>]
  type DeletedMembersResponse = {
    [<JsonProperty(PropertyName = "deleted_members")>]
    DeletedMembers : string[];
  }

  //#endregion
