namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module UserSummary =

  //#region UserSummary

  [<CLIMutable>]
  type UserSummary = {
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "username")>]
    Username : string;
  }

  //#endregion
