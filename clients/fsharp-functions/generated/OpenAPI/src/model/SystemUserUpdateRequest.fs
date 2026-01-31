namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module SystemUserUpdateRequest =

  //#region SystemUserUpdateRequest

  [<CLIMutable>]
  type SystemUserUpdateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
