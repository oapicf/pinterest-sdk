namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Keyword
open OpenAPI.Model.KeywordError

module KeywordsResponse =

  //#region KeywordsResponse

  [<CLIMutable>]
  type KeywordsResponse = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : KeywordError[];
    [<JsonProperty(PropertyName = "keywords")>]
    Keywords : Keyword[];
  }

  //#endregion
