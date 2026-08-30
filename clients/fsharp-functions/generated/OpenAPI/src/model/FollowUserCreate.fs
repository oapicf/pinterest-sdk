namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module FollowUserCreate =

  //#region FollowUserCreate

  [<CLIMutable>]
  type FollowUserCreate = {
    [<JsonProperty(PropertyName = "auto_follow")>]
    AutoFollow : bool;
  }

  //#endregion
