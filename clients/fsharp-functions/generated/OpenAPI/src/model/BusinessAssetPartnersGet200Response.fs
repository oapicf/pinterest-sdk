namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserSingleAssetBinding
open OpenAPI.Model.string option

module BusinessAssetPartnersGet200Response =

  //#region BusinessAssetPartnersGet200Response

  [<CLIMutable>]
  type BusinessAssetPartnersGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserSingleAssetBinding[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
