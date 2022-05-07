namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module Paginated =

  //#region Paginated

  [<CLIMutable>]
  type Paginated = {
    [<JsonProperty(PropertyName = "items")>]
    Items : obj[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
