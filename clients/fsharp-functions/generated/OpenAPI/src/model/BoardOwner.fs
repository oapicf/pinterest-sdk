namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BoardOwner =

  //#region BoardOwner

  [<CLIMutable>]
  type BoardOwner = {
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
