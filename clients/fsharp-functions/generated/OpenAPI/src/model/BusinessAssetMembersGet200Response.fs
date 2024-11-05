namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserSingleAssetBinding
open OpenAPI.Model.string option

module BusinessAssetMembersGet200Response =

  //#region BusinessAssetMembersGet200Response

  [<CLIMutable>]
  type BusinessAssetMembersGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserSingleAssetBinding[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
