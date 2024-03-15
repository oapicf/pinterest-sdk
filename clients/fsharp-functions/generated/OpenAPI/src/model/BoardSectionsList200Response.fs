namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.BoardSection
open OpenAPI.Model.string option

module BoardSectionsList200Response =

  //#region BoardSectionsList200Response

  [<CLIMutable>]
  type BoardSectionsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : BoardSection[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
