namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetIdPermissions
open OpenAPI.Model.string option

module BusinessMemberAssetsGet200Response =

  //#region BusinessMemberAssetsGet200Response

  [<CLIMutable>]
  type BusinessMemberAssetsGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AssetIdPermissions[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
