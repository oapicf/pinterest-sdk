namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module BoardSection =

  //#region BoardSection

  [<CLIMutable>]
  type BoardSection = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
