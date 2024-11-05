namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module BusinessAccessUserSummary =

  //#region BusinessAccessUserSummary

  [<CLIMutable>]
  type BusinessAccessUserSummary = {
    [<JsonProperty(PropertyName = "email")>]
    Email : string option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string option;
    [<JsonProperty(PropertyName = "username")>]
    Username : string option;
  }

  //#endregion
