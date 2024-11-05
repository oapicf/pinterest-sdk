namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessEmployers200Response =

  //#region GetBusinessEmployers200Response

  [<CLIMutable>]
  type GetBusinessEmployers200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserBusinessRoleBinding[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
