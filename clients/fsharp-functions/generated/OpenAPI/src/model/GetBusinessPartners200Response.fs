namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserBusinessRoleBinding
open OpenAPI.Model.string option

module GetBusinessPartners200Response =

  //#region GetBusinessPartners200Response

  [<CLIMutable>]
  type GetBusinessPartners200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : UserBusinessRoleBinding[];
  }

  //#endregion
