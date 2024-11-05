namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessMembers200Response =

  //#region GetBusinessMembers200Response

  [<CLIMutable>]
  type GetBusinessMembers200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserBusinessRoleBinding[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
