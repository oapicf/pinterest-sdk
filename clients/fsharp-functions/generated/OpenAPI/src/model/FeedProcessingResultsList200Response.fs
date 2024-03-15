namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsFeedProcessingResult
open OpenAPI.Model.string option

module FeedProcessingResultsList200Response =

  //#region FeedProcessingResultsList200Response

  [<CLIMutable>]
  type FeedProcessingResultsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsFeedProcessingResult[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
