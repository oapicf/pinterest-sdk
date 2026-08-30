namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module DeleteBusinessMembership200Response =

  //#region DeleteBusinessMembership200Response

  [<CLIMutable>]
  type DeleteBusinessMembership200Response = {
    [<JsonProperty(PropertyName = "deleted_members")>]
    DeletedMembers : string[];
  }

  //#endregion
