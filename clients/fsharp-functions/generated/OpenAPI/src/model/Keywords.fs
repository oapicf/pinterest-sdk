namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Keyword
open OpenAPI.Model.KeywordError

module Keywords =

  //#region Keywords

  [<CLIMutable>]
  type Keywords = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : KeywordError[];
    [<JsonProperty(PropertyName = "keywords")>]
    _Keywords : Keyword[];
  }

  //#endregion
