namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FollowUserRequest =

  //#region FollowUserRequest

  [<CLIMutable>]
  type FollowUserRequest = {
    [<JsonProperty(PropertyName = "auto_follow")>]
    AutoFollow : bool;
  }

  //#endregion
