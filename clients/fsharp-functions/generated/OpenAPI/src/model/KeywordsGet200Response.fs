namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Keyword
open OpenAPI.Model.string option

module KeywordsGet200Response =

  //#region KeywordsGet200Response

  [<CLIMutable>]
  type KeywordsGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Keyword[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
