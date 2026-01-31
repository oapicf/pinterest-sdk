namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.GetBusinessAssetsResponse
open OpenAPI.Model.string option

module BusinessAssetsGet200Response =

  //#region BusinessAssetsGet200Response

  [<CLIMutable>]
  type BusinessAssetsGet200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : GetBusinessAssetsResponse[];
  }

  //#endregion
