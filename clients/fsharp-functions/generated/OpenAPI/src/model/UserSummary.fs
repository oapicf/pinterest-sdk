namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserSummary =

  //#region UserSummary

  [<CLIMutable>]
  type UserSummary = {
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
  }

  //#endregion
