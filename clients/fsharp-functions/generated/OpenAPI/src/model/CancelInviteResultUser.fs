namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CancelInviteResultUser =

  //#region CancelInviteResultUser

  [<CLIMutable>]
  type CancelInviteResultUser = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
