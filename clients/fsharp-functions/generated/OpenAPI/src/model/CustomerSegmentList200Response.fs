namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CustomerSegment
open OpenAPI.Model.string option

module CustomerSegmentList200Response =

  //#region CustomerSegmentList200Response

  [<CLIMutable>]
  type CustomerSegmentList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : CustomerSegment[];
  }

  //#endregion
