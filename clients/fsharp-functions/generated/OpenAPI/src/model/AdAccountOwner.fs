namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdAccountOwner =

  //#region AdAccountOwner

  [<CLIMutable>]
  type AdAccountOwner = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
