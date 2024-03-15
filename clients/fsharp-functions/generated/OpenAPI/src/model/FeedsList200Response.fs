namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeed
open OpenAPI.Model.string option

module FeedsList200Response =

  //#region FeedsList200Response

  [<CLIMutable>]
  type FeedsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsFeed[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
