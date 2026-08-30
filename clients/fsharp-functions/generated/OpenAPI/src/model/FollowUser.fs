namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FollowUser =

  //#region FollowUser

  [<CLIMutable>]
  type FollowUser = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
